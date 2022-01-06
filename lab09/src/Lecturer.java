import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfile{
    //The Student class has a list of course name and course code, semester, session, mark and a file name.
    private String[] coursenames, coursecodes;
    private int[] semesters, sessions, numStudents;
    private double[] credithours;
    private int n; // number of courses

    public Lecturer(String name, String gender, String dob, String filename) {
        super(name, gender, dob);
        try {
            Scanner in = new Scanner(new FileInputStream(filename));
            // need to know number of courses
            int cnt = 0;
            while (in.hasNextLine()) {
                in.nextLine();
                cnt++;
            }
            in.close();

            n = cnt/6;
            // n = number of courses
            coursecodes = new String[n];
            coursenames = new String[n];
            semesters = new int[n];
            sessions = new int[n];
            credithours = new double[n];
            numStudents = new int[n];

            in = new Scanner(new FileInputStream(filename));

            for(int i=0; i<n; i++) {
                String coursecode = in.nextLine();
                String coursename = in.nextLine();
                int semester = Integer.parseInt(in.nextLine());
                int session = Integer.parseInt(in.nextLine());
                double credithour = Double.parseDouble(in.nextLine());
                int num = Integer.parseInt(in.nextLine());

                coursecodes[i] = coursecode;
                coursenames[i] = coursename;
                semesters[i] = semester;
                sessions[i] = session;
                credithours[i] = credithour;
                numStudents[i] = num;
            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double getCreditHour(double credithour, int numofStudents) {
        if(numofStudents>=150)return credithour*3;
        if(numofStudents>=100)return credithour*2;
        if(numofStudents>=50) return credithour*1.5;
        return credithour;
    }

    @Override
    public void display() {
        super.display();
        for(int i = 0; i < n; i++) {
            System.out.println("---------------------------------------------------");
            System.out.println("Course Code: \t" + coursecodes[i]);
            System.out.println("Course Name: \t" + coursenames[i]);
            System.out.println("Semester: \t\t" + semesters[i]);
            System.out.println("Session: \t\t" + sessions[i]);
            credithours[i] = getCreditHour(credithours[i], numStudents[i]);
            System.out.println("Credit Hour: \t" + credithours[i]);
            System.out.println("Number of Stud: " + numStudents[i]);
        }
    }
}
