import java.util.*;

class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private Date date;
    private String time;
    private String status;

    public Appointment(int appointmentId, int patientId, int doctorId, Date date, String time, String status) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public void schedule(List<Appointment> appointments) {
        if (!"Scheduled".equals(this.status)) {
            this.status = "Scheduled";
            appointments.add(this);
            System.out.println("Appointment ID " + appointmentId + " scheduled for patient ID " + patientId + " with doctor ID " + doctorId + " on " + date + " at " + time);
        } else {
            System.out.println("Appointment is already scheduled.");
        }
    }

    public void cancel(List<Appointment> appointments) {
        if (!"Cancelled".equals(this.status)) {
            this.status = "Cancelled";
            appointments.remove(this);
            System.out.println("Appointment ID " + appointmentId + " for patient ID " + patientId + " with doctor ID " + doctorId + " has been cancelled.");
        } else {
            System.out.println("Appointment is already cancelled.");
        }
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }
}