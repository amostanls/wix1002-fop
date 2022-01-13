import java.text.DecimalFormat;

public abstract class EmployeeSalarySystem {
    public static DecimalFormat dfRM = new DecimalFormat("RM #.00");
    protected String name, type;
    protected double salary;

    public void displayInfo() {
        System.out.println("Name:\t\t " + this.name
                    + "\nType:\t\t " + this.type
                    + "\nSalary:\t\t " + dfRM.format(this.salary)
        );
    }
}
