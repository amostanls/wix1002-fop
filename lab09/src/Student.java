import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student extends PersonProfile{
    //The Student class has a list of course name and course code, semester, session, mark and a file name.
    private String[] coursenames, coursecodes;
    private int[] semesters, sessions, marks;
    private String filename;
    private int n; // number of courses

    public Student(String name, String gender, String dob, String filename) {
        super(name, gender, dob);
        this.filename = filename;
        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            // need to know number of courses
            int cnt = 0; // number of lines in the txt file
            while (in.hasNextLine()) {
                in.nextLine();
                cnt++;
            }
            in.close();

            n = cnt/5;
            // n = number of courses
            coursecodes = new String[n];
            coursenames = new String[n];
            semesters = new int[n];
            sessions = new int[n];
            marks = new int[n];

            in = new Scanner(new FileInputStream(filename));

            for(int i=0; i<n; i++) {
                String coursecode = in.nextLine();
                String coursename = in.nextLine();
                int semester = Integer.parseInt(in.nextLine());
                int session = Integer.parseInt(in.nextLine());
                int mark = Integer.parseInt(in.nextLine());

                coursecodes[i] = coursecode;
                coursenames[i] = coursename;
                semesters[i] = semester;
                sessions[i] = session;
                marks[i] = mark;
            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int[] cutoffs = {85, 75, 70, 65, 60, 55, 50, 45, 35};
    private String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "D", "E"};

    public String getGrade(int mark) {
        // method 1
//        if(mark>=85)return "A";
//        // mark < 85
//        if(mark>=75)return "A-";
//        // mark < 75
//        if(mark>=70)return "B+";
//        if(mark>=65)return "B";
//        if(mark>=60)return "B-";
//        if(mark>=55)return "C+";
//        if(mark>=50)return "C";
//        if(mark>=45)return "D";
//        if(mark>=35)return "E";
//        // mark < 35
//        return "F";

        // method 2
        for(int i=0; i<grades.length; i++) {
            if(mark>=cutoffs[i])return grades[i];
        }
        return "F";
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
            System.out.println("Grade: \t\t\t" + getGrade(marks[i]));
        }
    }
}
