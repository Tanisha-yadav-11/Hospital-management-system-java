public class Appointment {
    Patient patient;
    Doctor doctor;
    String date;
    String time;

    Appointment(Patient patient, 
                Doctor doctor, 
                String date, 
                String time){
this.patient = patient;
this.doctor = doctor;
this.date = date;
this.time = time;
    }
    
}
