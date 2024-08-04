import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

class Patient extends Person{
    private List<String> medicalHistory;
    private List<Appointment> appointments;
    private List<Doctor> assignedDoctor;
    private List<Nurse> assignedNurse;

    public Patient(int id, String name, int age, String address, String phone, String email) {
        super(id, name, age, address, phone, email);
        this.medicalHistory = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.assignedDoctor = new ArrayList<>();
        this.assignedNurse = new ArrayList<>();
    }
    public List<String> getMedicalHistory() {
        return medicalHistory;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setMedicalHistory(List<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public List<Doctor> getAssignedDoctor() {
        return assignedDoctor;
    }
    public void setAssignedDoctor(List<Doctor> assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }
    public List<Nurse> getAssignedNurse() {
        return assignedNurse;
    }
    public void setAssignedNurse(List<Nurse> assignedNurse) {
        this.assignedNurse = assignedNurse;
    }
}