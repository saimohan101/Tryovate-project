package com.tryovate.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
public class CandidateDto {

    private String id;

//    @NotBlank(message = "Full name is required")
//    @Size(min = 3, max = 30, message = "The length of the candidate name should be between 5 and 30")
    private String fullName;

//    @NotBlank(message = "Gender is required")
    private String dob;
    ;

//    @NotBlank(message = "Gender is required")
    private String gender;

//    @NotBlank(message = "Contact number is required")
//    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number")
    private String contactNumber;

//    @NotBlank(message = "Email is required")
//    @Email(message = "Invalid email format")
    private String email;

//    @NotBlank(message = "Current address is required")
    private String currentAddress;


    private String permanentAddress;

//    @NotBlank(message = "Mother's name is required")
    private String motherName;

//    @NotBlank(message = "Father's name is required")
    private String fatherName;


//    @NotBlank(message = "Contact number is required")
//    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number")
    private String alternateNumber;

//    @NotBlank(message = "Aadhar card number is required")
//    @Pattern(regexp = "^\\d{12}$", message = "Invalid Aadhar number")
    private String aadharCard;

//    @NotBlank(message = "PAN card number is required")
//    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$", message = "Invalid PAN number")
    private String panCard;

    private String reference;

    private String degree;

    private String universityCollegeName;

    private int yearOfPassing;

    private String specializationMajor;

    private String percentageCgpa;

    private String highestDegree;

    private String pgUniversityCollegeName;

    private int pgYearOfPassing;

    private String pgSpecializationMajor;

    private double pgPercentageCgpa;

////    @NotBlank(message = "Highest degree is required")
//    private String highestDegree;
//
////    @NotBlank(message = "University/College name is required")
//    private String universityCollegeName;
//
////    @NotNull(message = "Year of passing is required")
//    private int yearOfPassing;
//
////    @NotBlank(message = "Specialization is required")
//    private String specializationMajor;
//
////    @NotNull(message = "Percentage/CGPA is required")
////    @DecimalMin(value = "0.0", inclusive = false, message = "Percentage must be greater than 0")
//    private double percentageCgpa;

    private String longMemo;

//    @NotNull(message = "Selected courses must not be null")
//    @Size(min = 1, message = "At least one course must be selected")
    private List<String> selectedCourse;

    private String batchId;

//    @NotBlank(message = "Payment type is required")
    private String paymentType; // FULL or PARTIAL

//    @NotBlank(message = "Payment mode is required")
    private String paymentMode; // ONLINE or OFFLINE

//    @NotNull(message = "Partial paid amount is required")
//    @PositiveOrZero(message = "Partial paid amount must be zero or positive")
    private double partialPaidAmount; // optional for partial payments

//    @NotNull(message = "Total payable amount is required")
//    @Positive(message = "Total payable amount must be greater than zero")
    private Double totalPayableAmount;

    private double remainingAmount;


    public CandidateDto() {
    }

    public CandidateDto(String aadharCard, String alternateNumber, String batchId, String contactNumber, String currentAddress, String degree, String dob, String email, String fatherName, String fullName, String gender, String highestDegree, String id, String longMemo, String motherName, String panCard, double partialPaidAmount, String paymentMode, String paymentType, String percentageCgpa, String permanentAddress, double pgPercentageCgpa, String pgSpecializationMajor, String pgUniversityCollegeName, int pgYearOfPassing, String reference, double remainingAmount, List<String> selectedCourse, String specializationMajor, Double totalPayableAmount, String universityCollegeName, int yearOfPassing) {
        this.aadharCard = aadharCard;
        this.alternateNumber = alternateNumber;
        this.batchId = batchId;
        this.contactNumber = contactNumber;
        this.currentAddress = currentAddress;
        this.degree = degree;
        this.dob = dob;
        this.email = email;
        this.fatherName = fatherName;
        this.fullName = fullName;
        this.gender = gender;
        this.highestDegree = highestDegree;
        this.id = id;
        this.longMemo = longMemo;
        this.motherName = motherName;
        this.panCard = panCard;
        this.partialPaidAmount = partialPaidAmount;
        this.paymentMode = paymentMode;
        this.paymentType = paymentType;
        this.percentageCgpa = percentageCgpa;
        this.permanentAddress = permanentAddress;
        this.pgPercentageCgpa = pgPercentageCgpa;
        this.pgSpecializationMajor = pgSpecializationMajor;
        this.pgUniversityCollegeName = pgUniversityCollegeName;
        this.pgYearOfPassing = pgYearOfPassing;
        this.reference = reference;
        this.remainingAmount = remainingAmount;
        this.selectedCourse = selectedCourse;
        this.specializationMajor = specializationMajor;
        this.totalPayableAmount = totalPayableAmount;
        this.universityCollegeName = universityCollegeName;
        this.yearOfPassing = yearOfPassing;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongMemo() {
        return longMemo;
    }

    public void setLongMemo(String longMemo) {
        this.longMemo = longMemo;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public double getPartialPaidAmount() {
        return partialPaidAmount;
    }

    public void setPartialPaidAmount(double partialPaidAmount) {
        this.partialPaidAmount = partialPaidAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPercentageCgpa() {
        return percentageCgpa;
    }

    public void setPercentageCgpa(String percentageCgpa) {
        this.percentageCgpa = percentageCgpa;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public double getPgPercentageCgpa() {
        return pgPercentageCgpa;
    }

    public void setPgPercentageCgpa(double pgPercentageCgpa) {
        this.pgPercentageCgpa = pgPercentageCgpa;
    }

    public String getPgSpecializationMajor() {
        return pgSpecializationMajor;
    }

    public void setPgSpecializationMajor(String pgSpecializationMajor) {
        this.pgSpecializationMajor = pgSpecializationMajor;
    }

    public String getPgUniversityCollegeName() {
        return pgUniversityCollegeName;
    }

    public void setPgUniversityCollegeName(String pgUniversityCollegeName) {
        this.pgUniversityCollegeName = pgUniversityCollegeName;
    }

    public int getPgYearOfPassing() {
        return pgYearOfPassing;
    }

    public void setPgYearOfPassing(int pgYearOfPassing) {
        this.pgYearOfPassing = pgYearOfPassing;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public List<String> getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(List<String> selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public String getSpecializationMajor() {
        return specializationMajor;
    }

    public void setSpecializationMajor(String specializationMajor) {
        this.specializationMajor = specializationMajor;
    }

    public Double getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(Double totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public String getUniversityCollegeName() {
        return universityCollegeName;
    }

    public void setUniversityCollegeName(String universityCollegeName) {
        this.universityCollegeName = universityCollegeName;
    }
}