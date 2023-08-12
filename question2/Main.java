public class Main {
    public static void main(String[] args) {
        Hourly hourlyEmployee = new Hourly("John", "Doe", 45.0, 20.0);
        Salary salaryEmployee = new Salary("Jane", "Smith", 60000.0);
        Contract contractEmployee = new Contract("Alice", "Johnson", 10, 1500.0);

        Employee[] employees = {hourlyEmployee, salaryEmployee, contractEmployee};

        for (Employee employee : employees) {
            System.out.println("Employee: " + employee);
            System.out.println("Weekly Pay: $" + employee.weeklyPay());
            System.out.println();
        }
    }
}