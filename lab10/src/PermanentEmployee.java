public class PermanentEmployee extends EmployeeSalarySystem {
    public PermanentEmployee(String name, char category) {
        this.name = name;
        this.type = "Permanent Employee";
        if(category=='A')
            this.salary = 4000;
        else if(category=='B')
            this.salary = 3000;
        else // C
            this.salary = 2000;
    }
}
