package com.tryovate.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class CandidateDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 3, max = 30, message = "The length of the customer name should be between 5 and 30")
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


    public @NotEmpty(message = "Aadhar card number cannot be null or empty") @Pattern(regexp = "^[0-9]{12}$", message = "Aadhar card number must be 12 digits") String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(@NotEmpty(message = "Aadhar card number cannot be null or empty") @Pattern(regexp = "^[0-9]{12}$", message = "Aadhar card number must be 12 digits") String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public @Pattern(regexp = "^[0-9]{10}$", message = "Alternate mobile number must be 10 digits") String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(@Pattern(regexp = "^[0-9]{10}$", message = "Alternate mobile number must be 10 digits") String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public @NotEmpty(message = "you must enter your contact number") @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits") String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(@NotEmpty(message = "you must enter your contact number") @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits") String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public @NotEmpty(message = "your address can not be a null or empty") String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(@NotEmpty(message = "your address can not be a null or empty") String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public @NotEmpty(message = "Email address can not be a null or empty") @Email(message = "Email address should be a valid value") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email address can not be a null or empty") @Email(message = "Email address should be a valid value") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Father Name can not be a null or empty") String getFatherName() {
        return fatherName;
    }

    public void setFatherName(@NotEmpty(message = "Father Name can not be a null or empty") String fatherName) {
        this.fatherName = fatherName;
    }

    public @NotEmpty(message = "Name can not be a null or empty") String getFullName() {
        return fullName;
    }

    public void setFullName(@NotEmpty(message = "Name can not be a null or empty") String fullName) {
        this.fullName = fullName;
    }

    public @NotEmpty(message = "Gender can not be a null or empty") String getGender() {
        return gender;
    }

    public void setGender(@NotEmpty(message = "Gender can not be a null or empty") String gender) {
        this.gender = gender;
    }

    public @NotEmpty(message = "highest Degree can not be a null or empty") String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(@NotEmpty(message = "highest Degree can not be a null or empty") String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getLongMemo() {
        return longMemo;
    }

    public void setLongMemo(String longMemo) {
        this.longMemo = longMemo;
    }

    public @NotEmpty(message = "Mother Name can not be a null or empty") String getMotherName() {
        return motherName;
    }

    public void setMotherName(@NotEmpty(message = "Mother Name can not be a null or empty") String motherName) {
        this.motherName = motherName;
    }

    public @NotEmpty(message = "Pan card number cannot be null or empty") @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Pan card number should be in the format XXXXX9999X") String getPanCard() {
        return panCard;
    }

    public void setPanCard(@NotEmpty(message = "Pan card number cannot be null or empty") @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Pan card number should be in the format XXXXX9999X") String panCard) {
        this.panCard = panCard;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @NotNull(message = "Percentage/CGPA cannot be null")
    public double getPercentageCgpa() {
        return percentageCgpa;
    }

    public void setPercentageCgpa(@NotNull(message = "Percentage/CGPA cannot be null") double percentageCgpa) {
        this.percentageCgpa = percentageCgpa;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public @NotEmpty(message = "Course can not be a null or empty") String getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(@NotEmpty(message = "Course can not be a null or empty") String selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public @NotEmpty(message = "specialization can not be a null or empty") String getSpecializationMajor() {
        return specializationMajor;
    }

    public void setSpecializationMajor(@NotEmpty(message = "specialization can not be a null or empty") String specializationMajor) {
        this.specializationMajor = specializationMajor;
    }

    public @NotEmpty(message = "university/CollegeName can not be a null or empty") String getUniversityCollegeName() {
        return universityCollegeName;
    }

    public void setUniversityCollegeName(@NotEmpty(message = "university/CollegeName can not be a null or empty") String universityCollegeName) {
        this.universityCollegeName = universityCollegeName;
    }

    @NotNull(message = "Year of passing cannot be null")
    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(@NotNull(message = "Year of passing cannot be null") int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }
}
