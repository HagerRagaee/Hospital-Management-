import java.util.Date;
import java.util.List;
import java.util.Map;

public interface AppointmentManagement {
    void scheduleAppointment(List<Appointment> appointments,Patient patient, Doctor doctor, Date date, String time,String department);
    void manageDoctorSchedule(Doctor doctor, Date date, String time, boolean addSlot);
    Map<Date, List<String>> getDoctorSchedule(Doctor doctor);
    public void assignNurseToDoctor(Map<Integer, Doctor> doctors, Map<Integer, Nurse> nurses, int nurseId, int doctorId);
    void addShiftToNurse(Map<Integer, Nurse> nurses,Nurse nurse, Date date, int hours) ;

}
