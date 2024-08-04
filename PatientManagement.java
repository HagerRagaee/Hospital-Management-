import java.util.List;
import java.util.Map;

public interface PatientManagement {
    boolean registerPatient(Map<Integer, Patient> patients,Patient patient);
    boolean addMedicalHistory(Map<Integer, Patient> patients,int patientId, String entry);
    List<String> getMedicalHistory(Map<Integer, Patient> patients,int patientId);
    void assignPatientToDoctor(Map<Integer, Patient> patients,Map<Integer, Doctor> doctors,int patientId, int doctorId,String department);
    void assignNurseToPatient(Map<Integer, Nurse> nurses, Map<Integer, Patient> patients,Nurse nurse, Patient patient);
}
