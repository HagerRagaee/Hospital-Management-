import java.util.*;

public class HospitalManager {
    private Map<Integer, Doctor> doctors = new HashMap<>();
    private Map<Integer, Nurse> nurses = new HashMap<>();
    private Map<Integer, Admin> admins = new HashMap<>();
    private Map<Integer, Patient> patients = new HashMap<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getId(), doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.put(nurse.getId(), nurse);
    }

    public void addAdmin(Admin admin) {
        admins.put(admin.getId(), admin);
    }

    public Map<Integer, Doctor> getDoctors() {
        return doctors;
    }

    public Map<Integer, Nurse> getNurses() {
        return nurses;
    }

    public Map<Integer, Admin> getAdmins() {
        return admins;
    }

    public Map<Integer, Patient> getPatients() {
        return patients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Doctor findDoctorById(int id) {
        return doctors.get(id);
    }

    public Nurse findNurseById(int id) {
        return nurses.get(id);
    }
}