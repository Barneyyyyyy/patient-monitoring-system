// package com.healthcare.patient_monitoring_system.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import jakarta.persistence.Column;
// import jakarta.validation.constraints.Min;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Size;

// @Entity
// @Table(name = "patients")
// public class Patient {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @NotBlank(message = "Name cannot be blank") // Ensures name is not null or empty
//     @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
//     private String name;

//     @NotNull(message = "Age cannot be null") // Ensures age is provided
//     @Min(value = 0, message = "Age must be a non-negative integer") // Ensures age is 0 or more
//     private Integer age;

//     @Column(name = "actual_condition")
//     private String condition;

//     // Constructors
//     public Patient() {
//     }

//     public Patient(Long id, String name, int age, String condition) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.condition = condition;
//     }

//     public Patient(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Add this constructor in Patient.java
// public Patient(String name, int age, String condition) {
//     this.name = name;
//     this.age = age;
//     this.condition = condition;
// }


//     // Getters and Setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public Integer getAge() {
//         return age;
//     }

//     public void setAge(Integer age) {
//         this.age = age;
//     }

//     public String getCondition() {
//         return condition;
//     }

//     public void setCondition(String condition) {
//         this.condition = condition;
//     }
// }
