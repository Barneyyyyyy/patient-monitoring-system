// package com.healthcare.patient_monitoring_system.controller;

// import com.healthcare.patient_monitoring_system.model.Patient;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.FieldError;
// import org.springframework.web.bind.MethodArgumentNotValidException;
// import org.springframework.web.bind.annotation.*;
// import com.healthcare.patient_monitoring_system.service.PatientService;

// import jakarta.validation.Valid;

// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// @RestController
// @RequestMapping("/patients")
// public class PatientController {

//     @Autowired
//     private PatientService patientService;

//     @PostMapping
// public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient) {
//     try {
//         patientService.savePatient(patient);
//         return ResponseEntity.ok("Patient added successfully");
//     } catch (Exception e) {
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the patient");
//     }
// }

// @GetMapping
// public ResponseEntity<List<Patient>> getPatients() {
//     try {
//         List<Patient> patients = patientService.getAllPatients();
//         return ResponseEntity.ok(patients);
//     } catch (Exception e) {
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
//     }
// }


//     // Exception handler for validation errors
//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
//         Map<String, String> errors = new HashMap<>();
//         ex.getBindingResult().getAllErrors().forEach((error) -> {
//             String fieldName = ((FieldError) error).getField();
//             String errorMessage = error.getDefaultMessage();
//             errors.put(fieldName, errorMessage);
//         });
//         return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//     }
// }
