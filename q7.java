public class Employee {
    private int empId;
    private String name;
    private double basicSalary;
    private int daysWorked;

    public Employee() {
        this.empId = 0;
        this.name = "Unknown";
        this.basicSalary = 0.0;
        this.daysWorked = 0;
    }

    public Employee(int empId, String name, double basicSalary, int daysWorked) {
        this.empId = empId;
        this.name = name;
        this.setBasicSalary(basicSalary);
        this.setDaysWorked(daysWorked);
    }

    public Employee(Employee other) {
        this.empId = other.empId;
        this.name = other.name;
        this.basicSalary = other.basicSalary;
        this.daysWorked = other.daysWorked;
    }

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double salary) {
        if (salary >= 0) this.basicSalary = salary;
    }

    public int getDaysWorked() { return daysWorked; }
    public void setDaysWorked(int days) {
        if (days >= 0 && days <= 31) this.daysWorked = days;
    }

    public double calculateSalary() {
        return (this.basicSalary / 30) * this.daysWorked;
    }

    public void terminateRecord() {
        System.out.println("System Log: Employee record for ID " + empId + " is being removed.");
    }

    public void display() {
        System.out.printf("ID: %d | Name: %-10s | Days: %d | Monthly Pay: $%.2f%n", 
                          empId, name, daysWorked, calculateSalary());
    }
}
