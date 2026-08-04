# 🏥 Hospital Management System

A **console-based Hospital Management System** built in Java ->> a lightweight simulation of how a hospital front desk might register patients, list doctors, and manage appointments, all from the terminal.

## ✨ What It Does

Run the program and you're greeted with a simple numbered menu. From there, you can:

- 🧍 **Add a patient** ->> enter their name, ID, age, blood group, and diagnosis
- 📋 **View the list of patients** ->> see everyone currently registered, with full details
- 👨‍⚕️ **View the list of doctors** ->> browse 5 pre-loaded doctors across different specializations
- 📅 **Book an appointment** ->> enter a Patient ID and Doctor ID to link them, along with a date and time
- 🔍 **View appointments** ->> see every booked appointment, including patient, doctor, specialization, date, and time
- 🚪 **Exit** ->> close the system safely

No database, no external dependencies ->> just plain Java, running entirely in memory.

## 🎬 How It Works

1. Launch the program ->> the main menu appears with 6 options
2. **Add a Patient** → enter name, ID, age, blood group, and diagnosis → they're added to the system
3. **View Doctors** → see the built-in list of 5 doctors, each with an ID and specialization
4. **Book an Appointment** → the system shows you the list of patients → enter a **Patient ID**, then a **Doctor ID** → enter a date and time → booking confirmed
5. **View Appointments** → see every appointment booked so far, matched to the right patient and doctor
6. **Exit** → the system shuts down cleanly


## 📸 Screenshots

**Adding patients**


<img width="353" height="435" alt="add_patient png" src="https://github.com/user-attachments/assets/a993455a-1ca0-4cfd-8384-37e0b96908a2" />


**Viewing the list of doctors**


<img width="360" height="369" alt="view_doctors png" src="https://github.com/user-attachments/assets/a9982500-1078-4b5c-8f6e-7e96a808e3da" />


**Booking and viewing an appointment**


<img width="354" height="443" alt="book_appointment png" src="https://github.com/user-attachments/assets/6674932e-f37d-43b8-8115-2e1d197a7aa3" />


## 👨‍⚕️ Pre-Loaded Doctors

The system comes with 5 doctors with master specialities ready to go:

| ID | Name | Specialization |
|---|---|---|
| 101 | Dr. Mehul Shah | Cardiology |
| 102 | Dr. Rajeev Mehta | Neurology |
| 103 | Dr. Payal Medhi | Osteology |
| 104 | Dr. Nita Goyal | Odontology |
| 105 | Dr. Meenakshi Ahuja | Hepatology |

## 🛠️ Concepts Used

| Concept | Where It's Used |

| Classes & Objects | `Patient`, `Doctor`, and `Appointment` model real-world entities |
| Constructors | Initializing patient, doctor, and appointment data |
| ArrayLists | Storing dynamic lists of patients, doctors, and appointments |
| Object Relationships | An `Appointment` links a `Patient` object to a `Doctor` object |
| Loops | Running the menu in a loop until the user exits |
| Switch Statements | Handling menu navigation (`switch` with arrow syntax) |
| Conditional Statements | Validating patient/doctor IDs before booking |
| Scanner | Reading user input from the console |

## 📁 Project Structure

```
 Main1.java          # Contains the main menu and program flow
 Patient.java         # Stores patient information (name, ID, age, blood group, diagnosis)
 Doctor.java           # Stores doctor information (name, ID, specialization)
 Appointment.java      # Connects a patient with a doctor, date, and time
```

## 🚀 Getting Started

**Prerequisites:** Java JDK installed on your machine

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/<repo-name>.git

# 2. Navigate into the project folder
cd <repo-name>

# 3. Compile all Java files
javac *.java

# 4. Run the program
java Main1
```

## 🔮 Future Improvements

- ❌ Appointment cancellation
- 🔎 Patient search
- 🏥 Patient discharge tracking (the groundwork is already there!)
- 💾 Data persistence using files
- 🗄️ Database integration
- 🔐 User authentication

## 🤝 Contributing

This is a learning project ->> suggestions and feedback are always welcome! Feel free to open an issue or fork the repo.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
