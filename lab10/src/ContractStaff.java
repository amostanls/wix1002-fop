public class ContractStaff extends EmployeeSalarySystem{
    public ContractStaff(String name, double totalSales) {
        this.name = name;
        this.type = "Contract Staff";
        this.salary = 500 + totalSales * 0.5;
    }
}
