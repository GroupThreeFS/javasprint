// Abstract Employee class implementing IPayable interface
abstract class Employee implements IPayable {
    protected String firstName;
    protected String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double weeklyPay();

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee otherEmployee = (Employee) obj;
        return firstName.equals(otherEmployee.firstName) && lastName.equals(otherEmployee.lastName);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAmount() {
        return weeklyPay();
    }

    @Override
    public String toString() {
        return getName();
    }
}