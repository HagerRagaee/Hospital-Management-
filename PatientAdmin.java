import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientAdmin extends Admin implements PatientManagement {

    public PatientAdmin(int id, String name, int age, String address, String phone, String email, double monthlySalary) {
        super(id, name, age, address, phone, email,monthlySalary);
    }

    @Override
    public boolean registerPatient(Map<Integer, Patient> patients,Patient patient) {
        if (patients.containsKey(patient.getId())) {
            return false;
        }
        patients.put(patient.getId(), patient);
        return true;
    }

    @Override
    public boolean addMedicalHistory(Map<Integer, Patient> patients,int patientId, String entry) {
        Patient patient = patients.get(patientId);
        if (patient != null) {
            List<String> medicalHistory = patient.getMedicalHistory();
            medicalHistory.add(entry);
            patient.setMedicalHistory(medicalHistory);
            return true;
        }
        return false;
    }

    @Override
    public List<String> getMedicalHistory(Map<Integer, Patient> patients,int patientId) {
        Patient patient = patients.get(patientId);
        if (patient != null) {
            return patient.getMedicalHistory();
        }
        return Collections.emptyList();
    }

    public void assignPatientToDoctor(Map<Integer, Patient> patients,Map<Integer, Doctor> doctors,int patientId, int doctorId,String department) {
        Patient patient = patients.get(patientId);
        Doctor doctor = doctors.get(doctorId);

        if (patient != null && doctor != null && doctor.getDepartment().equals(department)) {
            doctor.getPatients().put(patientId, patient);
            List<Doctor> assignedDoctor = patient.getAssignedDoctor();
            assignedDoctor.add(doctor);
            patient.setAssignedDoctor(assignedDoctor);
            System.out.println("Patient ID " + patientId + " assigned to Doctor ID " + doctorId);
            return;
        }

        System.out.println("Cannot assign Patient ID " + patientId + " to Doctor ID " + doctorId);
    }

    public  void assignNurseToPatient(Map<Integer, Nurse> nurses, Map<Integer, Patient> patients,Nurse nurse, Patient patient) {
        if (nurse != null) {
            List<Patient> assignedPatients = nurse.getAssignedPatients();
            assignedPatients.add(patient);
            nurse.setAssignedPatients(assignedPatients);

            List<Nurse> assignedNurse = patient.getAssignedNurse();
            assignedNurse.add(nurse);
            patient.setAssignedNurse(assignedNurse);
            System.out.println("Nurse " + getName() + " is assigned to take care of patient " + patient.getName());
            nurse.setAssignedPatients(assignedPatients);
        } else {
            System.out.println("Nurse " + nurse.getName() + " not found.");
        }
    }
}
