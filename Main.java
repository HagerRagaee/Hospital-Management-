import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Hospital hospital = new Hospital();
//
//        PatientAdmin patientAdmin = new PatientAdmin(1, "Alice", 40, "123 Admin St", "555-1001", "alice.admin@example.com");
//        MedicationAdmin medicationAdmin = new MedicationAdmin(2, "Bob", 45, "456 Admin St", "555-1002", "bob.admin@example.com");
//        AppointmentAdmin appointmentAdmin = new AppointmentAdmin(3, "Carol", 50, "789 Admin St", "555-1003", "carol.admin@example.com");
//
//
//        hospital.addAdmin(patientAdmin);
//        hospital.addAdmin(medicationAdmin);
//        hospital.addAdmin(appointmentAdmin);
//
//
//        Patient patient1 = new Patient(1, "John Doe", 30, "123 Patient Rd", "555-1234", "john.doe@example.com");
//        Patient patient2 = new Patient(2, "Jane Smith", 28, "456 Patient Rd", "555-5678", "jane.smith@example.com");
//
//
//        Doctor doctor1 = new Doctor(1, "Dr. James", 50, "789 Doctor St", "555-9101", "dr.james@example.com", "Cardiology", 12000, 150);
//        Doctor doctor2 = new Doctor(2, "Dr. Lisa", 45, "101 Doctor St", "555-9102", "dr.lisa@example.com", "Neurology", 13000, 160);
//
//
//        hospital.getDoctors().put(doctor1.getId(), doctor1);
//        hospital.getDoctors().put(doctor2.getId(), doctor2);
//
//
//        Nurse nurse1 = new Nurse(1, "Nurse Clara", 35, "202 Nurse Rd", "555-1122", "nurse.clara@example.com", "Cardiology", 25);
//        Nurse nurse2 = new Nurse(2, "Nurse Ella", 32, "303 Nurse Rd", "555-2233", "nurse.ella@example.com", "Neurology", 30);
//
//
//        hospital.getNurses().put(nurse1.getId(), nurse1);
//        hospital.getNurses().put(nurse2.getId(), nurse2);
//
//
//        patientAdmin.registerPatient(hospital.getPatients(), patient1);
//        patientAdmin.registerPatient(hospital.getPatients(), patient2);
//
//
//        patientAdmin.addMedicalHistory(hospital.getPatients(), patient1.getId(), "Initial checkup completed.");
//        patientAdmin.addMedicalHistory(hospital.getPatients(), patient2.getId(), "Follow-up appointment scheduled.");
//
//
//        patientAdmin.assignPatientToDoctor(hospital.getPatients(), hospital.getDoctors(), patient1.getId(), doctor1.getId(), "Cardiology");
//        patientAdmin.assignPatientToDoctor(hospital.getPatients(), hospital.getDoctors(), patient2.getId(), doctor2.getId(), "Neurology");
//
//
//        medicationAdmin.prescribeMedication(patient1, "Blood Pressure Medication");
//        medicationAdmin.prescribeMedication(patient2, "Antidepressants");
//
//
//        Map<String, Integer> availableMedications = new HashMap<>();
//        medicationAdmin.manageAvailableMedications(availableMedications, "Blood Pressure Medication", 100);
//        medicationAdmin.manageAvailableMedications(availableMedications, "Antidepressants", 50);
//
//
//        Date appointmentDate = new Date();
//        appointmentAdmin.scheduleAppointment(hospital.getAppointments(), patient1, doctor1, appointmentDate, "10:00 AM", "Cardiology");
//        appointmentAdmin.scheduleAppointment(hospital.getAppointments(), patient2, doctor2, appointmentDate, "11:00 AM", "Neurology");
//
//
//        appointmentAdmin.manageDoctorSchedule(doctor1, appointmentDate, "10:00 AM", true);
//
//        appointmentAdmin.addShiftToNurse(hospital.getNurses(), nurse1, appointmentDate, 8);
//        appointmentAdmin.addShiftToNurse(hospital.getNurses(), nurse2 ,appointmentDate, 10);
//
//
//        appointmentAdmin.assignNurseToDoctor(hospital.getDoctors(), hospital.getNurses(), nurse1.getId(), doctor1.getId());
//        appointmentAdmin.assignNurseToDoctor(hospital.getDoctors(), hospital.getNurses(), nurse2.getId(), doctor2.getId());
//
//
//        patientAdmin.assignNurseToPatient(hospital.getNurses(),hospital.getPatients(),nurse1,patient1);
//        patientAdmin.assignNurseToPatient(hospital.getNurses(),hospital.getPatients(),nurse1,patient2);
//
//
//        System.out.println("Doctor 1 Schedule: " + doctor1.getSchedule());
//        System.out.println("Doctor 2 Schedule: " + doctor2.getSchedule());
//
//
//        System.out.println("Nurse 1 Assigned Patients: ");
//        nurse1.allPatients();
//        System.out.println("Nurse 2 Assigned Patients: ");
//        nurse2.allPatients();
        int x = 5;
        System.out.println(x++);

    }
}
