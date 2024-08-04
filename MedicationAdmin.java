import java.util.*;

public class MedicationAdmin extends Admin implements MedicationManagement {

    public MedicationAdmin(int id, String name, int age, String address, String phone, String email, double monthlySalary) {
        super(id, name, age, address, phone, email,monthlySalary);
    }
    @Override
    public void prescribeMedication(Patient patient, String medication) {
        int patientId = patient.getId();

        if (patient != null) {
            List<String> medicalHistory = patient.getMedicalHistory();
            medicalHistory.add(medication);
            patient.setMedicalHistory(medicalHistory);
            System.out.println("Prescribed " + medication + " to patient ID " + patientId);
        } else {
            System.out.println("Patient not found.");
        }
    }

    @Override
    public boolean manageAvailableMedications(Map<String, Integer> availableMedications,String medicationName, int quantity) {
        availableMedications.put(medicationName, quantity);
        return true;
    }

}

