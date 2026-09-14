package constructorsandencapsulation.assignment_problems;

public class CompanyEmployee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyEmployee e1 = new CompanyEmployee("Alice", 40000);
        CompanyEmployee e2 = new CompanyEmployee("Bob", 45000);
        CompanyEmployee e3 = new CompanyEmployee("Charlie", 50000);

        System.out.println("3 Employee objects created");
        CompanyEmployee.printCompanyInfo();
    }
}