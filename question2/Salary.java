// Salary class extending Employee
class Salary extends Employee {
    private double annualSalary;

    public Salary(String firstName, String lastName, double annualSalary) {
        super(firstName, lastName);
        this.annualSalary = annualSalary;
    }

    public double weeklyPay() {
        return annualSalary / 52.0;
    }

    @Override
    public String toString() {
        return super.toString() + " (Salary)";
    }
}
