
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 { public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList <Doctor> doctors = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

doctors.add(new Doctor("Dr. Mehul Shah",101,"Cardiology"));
doctors.add(new Doctor("Dr. Rajeev Mehta",102,"Neurology"));
doctors.add(new Doctor("Dr. Payal Medhi",103,"Osteology"));
doctors.add(new Doctor("Dr. Nita Goyal",104,"Odontology"));
doctors.add(new Doctor("Dr. Meenakshi Ahuja",105,"Hepatology"));
boolean running = true;

while(running){
        System.out.println("HOSPITAL MANAGEMENT SYSTEM : ");
        System.out.println("1) Add a patient ");
        System.out.println("2) View list of the patients  ");
        System.out.println("3) VIew list of the Doctors "); 
        System.out.println("4) Book appointment ");
        System.out.println("5) View appointment "); 
        System.out.println("6) EXIT ");
        System.out.print("Choose an Option : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
    
switch(choice){

case 1 -> {
        System.out.print("Enter Patient's name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient's ID : ");
        int patientID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Patient's age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Patient's blood group : ");
        String BloodGroup = scanner.nextLine();
        System.out.print("Enter Patient's Diagnosis : ");
        String Diagonisis = scanner.nextLine();

        Patient newPatient = new Patient(name, patientID, age,  BloodGroup, Diagonisis);
        patients.add(newPatient);
        System.out.println("Patient was added successfully.");
        }

case 2 -> {
       if (patients.isEmpty()) {
       System.out.println("No patients have been added yet.");
       } else {
       for (int i = 0; i < patients.size(); i++) {
       Patient patient = patients.get(i);
       System.out.println((i + 1) + ". " + patient.named);
       System.out.println("Patient ID: " + patient.patientID);
       System.out.println("Age: " + patient.age);
       System.out.println("Blood Group: " + patient.BloodGroup);
       System.out.println("Diagnosis: " + patient.Diagonisis);
       }
    }
}
       
case 3 -> {
      System.out.println("Available Doctors : ");
      for (int i = 0; i < doctors.size(); i++) {
      Doctor doctor = doctors.get(i);
      System.out.println((i + 1) + ". " + doctor.name);
      System.out.println("Doctor ID: " + doctor.doctorID);
      System.out.println("Specialization: " + doctor.specialization);
    }
}

case 4 -> {
      if (patients.isEmpty()) {
      System.out.println("No patients have been added yet.");
}
      else if (doctors.isEmpty()) {
        System.out.println("No doctors are available.");
}
      else {
      System.out.println("Choose a patient:");

      for (int i = 0; i < patients.size(); i++) {
      System.out.println((i + 1) + ". " + patients.get(i).named + " | ID: " + patients.get(i).patientID);
}

      System.out.print("Enter patient ID : ");
      int patientID = scanner.nextInt();
      Patient selectedPatient =null;
      for (Patient patient : patients){
      if(patient.patientID == patientID){
            selectedPatient = patient;
            break;
  }
}
      if(selectedPatient == null){
      System.out.println("Patient ID not found.");
}
      else{
      System.out.print("Enter doctor ID : ");
      int doctorID = scanner.nextInt();
      scanner.nextLine();
      Doctor selectedDoctor = null;
      for(Doctor doctor : doctors){
      if(doctor.doctorID == doctorID){
      selectedDoctor = doctor;
      break;
        }
 }
      if(selectedDoctor == null){
      System.out.println("Doctor ID not found.");
}
else{
      System.out.print("Enter appointment date: ");
      String date = scanner.nextLine();

      System.out.print("Enter appointment time: ");
      String time = scanner.nextLine();

      Appointment newAppointment = new Appointment(selectedPatient, selectedDoctor, date, time );
      appointments.add(newAppointment);

      System.out.println("Appointment booked successfully!");

    }
}
      }
}

case 5 -> {

      if (appointments.isEmpty()) {
      System.out.println("No appointments booked yet.");
    } else {
      for (Appointment appointment : appointments) {
      System.out.println("Patient: " + appointment.patient.named);
      System.out.println("Doctor: " + appointment.doctor.name);
      System.out.println("Specialization: " + appointment.doctor.specialization);
      System.out.println("Date: "  + appointment.date);
      System.out.println("Time: " + appointment.time);
        }
    }
}

case 6 -> {
     System.out.println("You exited the system successfully.");
     running = false;
}

}
        }
scanner.close();
        }
    }
    

