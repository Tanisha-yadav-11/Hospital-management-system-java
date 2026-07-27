public class Patient {
String named;
int patientID;
double age;
String BloodGroup;
String Diagonisis;
boolean discharged;

Patient(String named,
int patientID,
double age,
String BloodGroup,
String Diagonisis){

    this.named = named;
    this.patientID = patientID;
this.age = age;
this.BloodGroup = BloodGroup;
this.Diagonisis = Diagonisis;

this.discharged = false;
}
}
