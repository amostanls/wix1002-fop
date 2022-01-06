public class PersonProfile {
    private String name, gender, dob;
    // Exercise: Calendar for dob

    public PersonProfile(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public void display() {
        System.out.println("Name: \t\t\t" + name);
        System.out.println("Gender: \t\t" + gender);
        System.out.println("Date of Birth: \t" + dob);
    }
}
