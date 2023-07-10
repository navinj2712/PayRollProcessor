class SalariedEmployee{
    String name;
    private double salary;

    public SalariedEmployee(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculatePay(){
        System.out.println("Salary of " + name + " is " + (salary+2000));
    }
}
