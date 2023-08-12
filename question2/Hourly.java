// Hourly class extending Employee
class Hourly extends Employee {
    private double hours;
    private double rate;

    public Hourly(String firstName, String lastName, double hours, double rate) {
        super(firstName, lastName);
        this.hours = hours;
        this.rate = rate;
    }

    public double weeklyPay() {
        double pay;
        if (hours <= 40.0) {
            pay = rate * hours;
        } else {
            pay = (hours - 40.0) * 1.5 * rate + 40.0 * rate;
        }
        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + " (Hourly)";
    }
}