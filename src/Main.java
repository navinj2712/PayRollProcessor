// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Arun");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Balu");

        salariedEmployee.setSalary(10000);
        salariedEmployee.calculatePay();

        hourlyEmployee.setHourlyRate(1000);
        hourlyEmployee.setHoursWorked(8);
        hourlyEmployee.calculatePay();
    }
}