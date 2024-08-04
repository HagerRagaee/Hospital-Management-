import java.util.*;

public class AppointmentAdmin extends Admin implements AppointmentManagement {
    private List<Appointment> appointments = new ArrayList<>();

    public AppointmentAdmin(int id, String name, int age, String address, String phone, String email, double monthlySalary) {
        super(id, name, age, address, phone, email,monthlySalary);
    }

    public void scheduleAppointment(List<Appointment> appointments,Patient patient, Doctor doctor, Date date, String time,String department) {
        if (doctor.getDepartment().equals(department)) {
            Appointment appointment = new Appointment(
                    generateAppointmentId(),
                    patient.getId(),
                    doctor.getId(),
                    date,
                    time,
                    "Scheduled"
            );
            appointments.add(appointment);
            appointment.schedule(appointments);
            System.out.println("Appointment scheduled for patient " + patient.getName() + " with Doctor " + doctor.getName());
        } else {
            System.out.println("Appointment scheduling failed. Doctor is not in the same department.");
        }
    }
    private int generateAppointmentId() {
        return new Random().nextInt(10000);
    }
    @Override
    public void manageDoctorSchedule(Doctor doctor, Date date, String time, boolean addSlot) {
        Map<Date, List<String>> schedule = doctor.getSchedule();
        List<String> slots = schedule.get(date);

        if (slots == null) {
            slots = new ArrayList<>();
            schedule.put(date, slots);
        }

        if (addSlot) {
            if (!slots.contains(time)) {
                slots.add(time);
                System.out.println("Available slot added for Doctor " + doctor.getName() + " on " + date + " at " + time);
            } else {
                System.out.println("Slot already exists for Doctor " + doctor.getName() + " on " + date + " at " + time);
            }
        } else {
            if (slots.remove(time)) {
                System.out.println("Available slot removed for Doctor " + doctor.getName() + " on " + date + " at " + time);
            } else {
                System.out.println("Slot not found for Doctor " + doctor.getName() + " on " + date + " at " + time);
            }
        }
    }


    public void addShiftToNurse(Map<Integer, Nurse> nurses,Nurse nurse, Date date, int hours) {

        if (nurse != null) {
            Map<Date, Integer> shifts = nurse.getShifts();
            shifts.put(date, hours);
            nurse.setShifts(shifts);
            System.out.println("Shift added to Nurse " + nurse.getName() + " on " + date + " with " + hours + " hours");
        } else {
            System.out.println("Nurse not found.");
        }
    }
    public void assignNurseToDoctor(Map<Integer, Doctor> doctors, Map<Integer, Nurse> nurses, int nurseId, int doctorId) {
        Doctor doctor = doctors.get(doctorId);
        Nurse nurse = nurses.get(nurseId);

        if (nurse != null && doctor != null && nurse.getDepartment().equals(doctor.getDepartment())) {
            List<Nurse> assignedNurses = doctor.getAssignedNurses();
            if (assignedNurses == null) {
                assignedNurses = new ArrayList<>();
            }
            assignedNurses.add(nurse);
            doctor.setAssignedNurses(assignedNurses);

            List<String> assistedDoctors = nurse.getAssistedDoctors();
            if (assistedDoctors == null) {
                assistedDoctors = new ArrayList<>();
            }
            assistedDoctors.add(doctor.getName());
            nurse.setAssistedDoctors(assistedDoctors);

            System.out.println("Nurse " + nurse.getName() + " assigned to Doctor " + doctor.getName());
        } else {
            System.out.println("Assignment failed. Ensure nurse and doctor are in the same department.");
        }
    }

    @Override
    public Map<Date, List<String>> getDoctorSchedule(Doctor doctor) {
        return doctor.getSchedule();
    }
}
