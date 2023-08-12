// Contract class extending Employee
class Contract extends Employee {
    private int weeks;
    private double amount;

    public Contract(String firstName, String lastName, int weeks, double amount) {
        super(firstName, lastName);
        this.weeks = weeks;
        this.amount = amount;
    }

    public double weeklyPay() {
        return amount / weeks;
    }

    @Override
    public String toString() {
        return super.toString() + " (Contract)";
    }
}
