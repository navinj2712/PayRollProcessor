public class HourlyEmployee {
    String name;
    private double hourlyRate;
    private double hoursWorked;

    private double salary;

    public HourlyEmployee(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void calculatePay() {
        salary = hoursWorked * hourlyRate;
        System.out.println("Salary of " + name + " is " + salary);
    }
}
