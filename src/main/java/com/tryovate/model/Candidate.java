package com.tryovate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Data

@Entity
@Table(name = "Candidate")
public class Candidate {

    @Id
    private String id;

    @Column(name = "full Name")
    private String fullName;

   @Column(name = "DOB")
    private String dob;;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Contact Number")
    private String contactNumber;

    @Column(name = "Email")
    private String email;

    @Column(name = "Current Address")
    private String currentAddress;

    @Column(name = "permanent Address")
    private String permanentAddress;

    @Column(name = "Mother Name")
    private String motherName;

    @Column(name = "Father Name")
    private String fatherName;

    @Column(name = "Alternate Number")
    private String alternateNumber;

    @Column(name = "Aadhar Card")
    private String aadharCard;

    @Column(name = "Pan Card")
    private String panCard;

    @Column(name = "Reference Name")
    private String reference;

    private String highestDegree;

    private String universityCollegeName;

    private int yearOfPassing;

    private String specializationMajor;

    private double percentageCgpa;

    private String longMemo;

    private String selectedCourse;

    private String paymentType;

    public Candidate() {
    }

    public Candidate(String aadharCard, String alternateNumber, String contactNumber, String currentAddress, String dob, String email, String fatherName, String fullName, String gender, String highestDegree, String id, String longMemo, String motherName, String panCard, String paymentType, double percentageCgpa, String permanentAddress, String reference, String selectedCourse, String specializationMajor, String universityCollegeName, int yearOfPassing) {
        this.aadharCard = aadharCard;
        this.alternateNumber = alternateNumber;
        this.contactNumber = contactNumber;
        this.currentAddress = currentAddress;
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
        this.paymentType = paymentType;
        this.percentageCgpa = percentageCgpa;
        this.permanentAddress = permanentAddress;
        this.reference = reference;
        this.selectedCourse = selectedCourse;
        this.specializationMajor = specializationMajor;
        this.universityCollegeName = universityCollegeName;
        this.yearOfPassing = yearOfPassing;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getPercentageCgpa() {
        return percentageCgpa;
    }

    public void setPercentageCgpa(double percentageCgpa) {
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

    public String getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(String selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public String getSpecializationMajor() {
        return specializationMajor;
    }

    public void setSpecializationMajor(String specializationMajor) {
        this.specializationMajor = specializationMajor;
    }

    public String getUniversityCollegeName() {
        return universityCollegeName;
    }

    public void setUniversityCollegeName(String universityCollegeName) {
        this.universityCollegeName = universityCollegeName;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "aadharCard='" + aadharCard + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", alternateNumber='" + alternateNumber + '\'' +
                ", panCard='" + panCard + '\'' +
                ", reference='" + reference + '\'' +
                ", highestDegree='" + highestDegree + '\'' +
                ", universityCollegeName='" + universityCollegeName + '\'' +
                ", yearOfPassing=" + yearOfPassing +
                ", specializationMajor='" + specializationMajor + '\'' +
                ", percentageCgpa=" + percentageCgpa +
                ", longMemo='" + longMemo + '\'' +
                ", selectedCourse='" + selectedCourse + '\'' +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
