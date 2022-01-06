public class Student {
    private String contactNumber;

    public Student() {
        contactNumber=null;
    }

    public Student(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void output() {
        System.out.println("Contact Number: " + contactNumber);
    }
}
