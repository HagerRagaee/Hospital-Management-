public class Admin extends Employee {
    private double monthlySalary;

    public Admin(int id, String name, int age, String address, String phone, String email, double monthlySalary) {
        super(id, name, age, address, phone, email);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calSalary() {
        System.out.println("Total Salary: $" + monthlySalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
