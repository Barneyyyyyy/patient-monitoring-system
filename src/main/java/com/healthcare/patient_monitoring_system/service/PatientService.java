// package com.healthcare.patient_monitoring_system.service;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.healthcare.patient_monitoring_system.model.Patient;
// import com.healthcare.patient_monitoring_system.repository.PatientRepository;

// @Service
// public class PatientService {
//     @Autowired
//     private PatientRepository patientRepository;

    // PatientService.java
//     public Patient savePatient(Patient patient) {
//         if (patient.getName() == null || patient.getName().trim().isEmpty()) {
//             throw new IllegalArgumentException("Name cannot be null or empty");
//         }
//         if (patient.getAge() < 0) {
//             throw new IllegalArgumentException("Age must be a non-negative integer");
//         }
//         return patientRepository.save(patient);
//     }
    

    

//     public List<Patient> getAllPatients() {
//         return patientRepository.findAll();
//     }
// }
