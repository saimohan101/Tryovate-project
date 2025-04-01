package com.tryovate.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.aspectj.bridge.IMessage;

@Data
public class EmployeeDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String fullName;

    @Column(name = "DOB",nullable = false)
    private String dob;;

    @NotEmpty(message = "Gender can not be a null or empty")
    @Column(name = "Gender",nullable = false)
    private String gender;

    @NotEmpty(message = "you must enter your contact number")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
    private String contactNumber;

    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @NotEmpty(message = "your address can not be a null or empty")
    private String currentAddress;


    private String permanentAddress;

    @NotEmpty(message = "Mother Name can not be a null or empty")
    private String motherName;

    @NotEmpty(message = "Father Name can not be a null or empty")
    private String fatherName;


    @Pattern(regexp = "^[0-9]{10}$", message = "Alternate mobile number must be 10 digits")
    private String alternateNumber;

    @NotEmpty(message = "Aadhar card number cannot be null or empty")
    @Pattern(regexp = "^[0-9]{12}$", message = "Aadhar card number must be 12 digits")
    private String aadharCard;

    @NotEmpty(message = "Pan card number cannot be null or empty")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Pan card number should be in the format XXXXX9999X")
    private String panCard;

    private String reference;

    @NotEmpty(message = "highest Degree can not be a null or empty")
    private String highestDegree;

    @NotEmpty(message = "university/CollegeName can not be a null or empty")
    private String universityCollegeName;

    @NotNull(message = "Year of passing cannot be null")
//    @Pattern(regexp = "^[0-9]{4}$", message = "Year of passing must be a 4-digit value")
    private int yearOfPassing;

    @NotEmpty(message = "specialization can not be a null or empty")
    private String specializationMajor;

    @NotNull(message = "Percentage/CGPA cannot be null")
//    @Min(value = 0, message = "Percentage/CGPA must be at least 0")
//    @Max(value = 100, message = "Percentage must be at most 100")
    private double percentageCgpa;

    private String longMemo;

    @NotEmpty(message = "Course can not be a null or empty")
    private String selectedCourse;

    private String paymentType;
}
