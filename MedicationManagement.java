import java.util.Map;

public interface MedicationManagement {
    void prescribeMedication(Patient patient, String medication);
    boolean manageAvailableMedications(Map<String, Integer> availableMedications,String medicationName, int quantity);
}
