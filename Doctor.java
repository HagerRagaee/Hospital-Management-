import java.util.*;

class Doctor extends Employee {
    private String department;
    private Map<Date, List<String>> schedule;
    private double baseSalary;
    private double appointmentRate;
    private Map<Integer, Patient> patients;
    private List<Nurse> assignedNurses;

    public Doctor(int id, String name, int age, String address, String phone, String email,String department,double baseSalary, double appointmentRate) {
        super(id, name, age, address, phone, email);
        this.department = department;
        this.schedule = new HashMap<>();
        this.baseSalary = baseSalary;
        this.appointmentRate = appointmentRate;
        this.patients = new HashMap<>();
        this.assignedNurses = new ArrayList<>();
    }
    @Override
    public void calSalary() {
        int totalAppointments = 0;
        for (Patient patient : patients.values()) {
            totalAppointments += patient.getAppointments().size();
        }
        double totalSalary = baseSalary + (totalAppointments * appointmentRate);
        System.out.println("Total Salary: $" + totalSalary);
    }
    public boolean isSlotAvailable(Date date, String time) {
        List<String> slots = schedule.get(date);
        if (slots == null) {
            return true;
        }
        return !slots.contains(time);
    }

    public Map<Date, List<String>> getSchedule() {
        return schedule;
    }
    public String getDepartment() {
        return department;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getAppointmentRate() {
        return appointmentRate;
    }
    public Map<Integer, Patient> getPatients() {
        return patients;
    }
    public List<Nurse> getAssignedNurses() {
        return assignedNurses;
    }
    public void setAssignedNurses(List<Nurse> assignedNurses) {
        this.assignedNurses = assignedNurses;
    }
}