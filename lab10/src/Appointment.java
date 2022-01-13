import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Appointment implements Searchable{
    private int year;
    private int month;
    private int day;
    private int startHour;
    private int endHour;
    LocalDateTime start;
    LocalDateTime end;
    static String filePath = "appointments.txt";
    static LocalDateTime[] startAppointmentArr;
    static LocalDateTime[] endAppointmentArr;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH");

    public Appointment(int year, int month, int day, int startHour, int endHour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;

        start = LocalDateTime.of(this.year, this.month, this.day, this.startHour, 0);
        end = LocalDateTime.of(this.year, this.month, this.day, this.endHour, 0);
    }

    public static void readAppointmentFile() {
        try {
            Scanner in = new Scanner(new FileInputStream(filePath));
            String tmp;
            String[] tmparr;
            int n = in.nextInt();

            startAppointmentArr = new LocalDateTime[n];
            endAppointmentArr = new LocalDateTime[n];

            if(n == 0) {
                in.close();
                return;
            }
            in.nextLine();


            for(int i = 0; i < n; i++) {
                // Start
                tmp = in.nextLine();
                tmparr = tmp.split("-", 2);
                // "Start", "datetime"
                // "142-213van-12j" -> "142", "213van-12j"
                startAppointmentArr[i] = LocalDateTime.parse(tmparr[1], dtf); // Integer.parseInt(String)

                // End
                tmp = in.nextLine();
                tmparr = tmp.split("-", 2);
                endAppointmentArr[i] = LocalDateTime.parse(tmparr[1], dtf);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {

        }
    }

    public void makeAppointment() {
        readAppointmentFile();

        // reserve one space for our appointment -> no clashes
        if(startAppointmentArr == null && endAppointmentArr == null) {
            System.out.println("Success");
            startAppointmentArr = new LocalDateTime[1];
            endAppointmentArr = new LocalDateTime[1];
        }else if(search(start,end)) {
            int n = startAppointmentArr.length;
            LocalDateTime[] tmpstart = startAppointmentArr;
            LocalDateTime[] tmpend = endAppointmentArr;

            startAppointmentArr = new LocalDateTime[n+1];
            endAppointmentArr = new LocalDateTime[n+1];

            for(int i=0; i<n; i++) {
                startAppointmentArr[i]=tmpstart[i];
                endAppointmentArr[i]=tmpend[i];
            }
        }else {
            return;
        }

        int n = startAppointmentArr.length;
        startAppointmentArr[n-1]=start;
        endAppointmentArr[n-1]=end;

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(filePath));
            out.println(n);
            for(int i = 0; i < n; i++) {
                out.println("Start-" + startAppointmentArr[i].format(dtf));
                out.println("End-" + endAppointmentArr[i].format(dtf));
            }
            out.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



        @Override
    public boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime) {
        for(int i = 0; i < startAppointmentArr.length; i++) {
            //        end
            //    st       end <- current
            if(endAppointmentArr[i].isAfter(dateStartTime) &&
                    (endAppointmentArr[i].isBefore(dateEndTime) || endAppointmentArr[i].equals(dateEndTime))) {
                System.out.println("An appointment hasn't ended yet");
                return false;
            }

            //      st
            // st     end   <- current
            if((startAppointmentArr[i].isAfter(dateStartTime) || startAppointmentArr[i].equals(dateStartTime)) &&
                    startAppointmentArr[i].isBefore(dateEndTime)) {
                System.out.println("An appointment will start soon");
                return false;
            }

            //  st            end
            //      st    end       <- current
            if((startAppointmentArr[i].isBefore(dateStartTime) || startAppointmentArr[i].equals(dateStartTime)) &&
                    (endAppointmentArr[i].isAfter(dateEndTime) || endAppointmentArr[i].equals(dateEndTime))) {
                System.out.println("An appointment hasn't end yet");
                return false;
            }
        }
        System.out.println("Success");
        return true;
    }

}
