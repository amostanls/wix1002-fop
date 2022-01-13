public class TemporaryStaff extends EmployeeSalarySystem{
    public TemporaryStaff(String name, int numberOfHours) {
        this.name = name;
        this.type = "Temporary Staff";
        this.salary = numberOfHours * 15;
    }
}
