import java.util.*;

class Nurse extends Employee {
    private String department;
    private Map<Date, Integer> shifts;
    private double hourlyRate;
    private List<String> assistedDoctors;
    private List<Patient> assignedPatients;

    public Nurse(int id, String name, int age, String address, String phone, String email, String department, double hourlyRate) {
        super(id, name, age, address, phone, email);
        this.department = department;
        this.shifts = new HashMap<>();
        this.hourlyRate = hourlyRate;
        this.assistedDoctors = new ArrayList<>();
        this.assignedPatients = new ArrayList<>();
    }
    @Override
    public void calSalary() {
        int totalHours = 0;
        for (int hours : shifts.values()) {
            totalHours += hours;
        }
        double totalSalary = (totalHours * hourlyRate);
        System.out.println("Total Salary: $" + totalSalary);
    }
    public void assistDoctor(String doctorName) {
        assistedDoctors.add(doctorName);
        System.out.println("Nurse " + getName() + " is assisting Doctor " + doctorName + " in the " + department + " department.");
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }
    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
    public void checkVitals() {
        System.out.println("Nurse " + getName() + " is checking patient vitals.");
    }
    public List<String> getAssistedDoctors() {
        return assistedDoctors;
    }
    public void setAssistedDoctors(List<String> assistedDoctors) {
        this.assistedDoctors = assistedDoctors;
    }
    public Map<Date, Integer> getShifts() {
        return shifts;
    }
    public void setShifts(Map<Date, Integer> shifts) {
        this.shifts = shifts;
    }
    public String getDepartment() {
        return department;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void allPatients()
    {
        for (Patient patient:assignedPatients)
            System.out.print(patient.getName() + " , ");
        System.out.println();
    }
}