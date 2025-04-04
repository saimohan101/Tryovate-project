package com.tryovate.mapper;

import com.tryovate.dto.CandidateDto;
import com.tryovate.model.Candidate;

public class CandidateMapper {

    public static CandidateDto mapToCandidateDto(Candidate candidate) {
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setFullName(candidate.getFullName());
        candidateDto.setDob(candidate.getDob());
        candidateDto.setGender(candidate.getGender());
        candidateDto.setContactNumber(candidate.getContactNumber());
        candidateDto.setEmail(candidate.getEmail());
        candidateDto.setCurrentAddress(candidate.getCurrentAddress());
        candidateDto.setPermanentAddress(candidate.getPermanentAddress());
        candidateDto.setMotherName(candidate.getMotherName());
        candidateDto.setFatherName(candidate.getFatherName());
        candidateDto.setAlternateNumber(candidate.getAlternateNumber());
        candidateDto.setAadharCard(candidate.getAadharCard());
        candidateDto.setPanCard(candidate.getPanCard());
        candidateDto.setReference(candidate.getReference());
        candidateDto.setHighestDegree(candidate.getHighestDegree());
        candidateDto.setUniversityCollegeName(candidate.getUniversityCollegeName());
        candidateDto.setYearOfPassing(candidate.getYearOfPassing());
        candidateDto.setSpecializationMajor(candidate.getSpecializationMajor());
        candidateDto.setPercentageCgpa(candidate.getPercentageCgpa());
        candidateDto.setLongMemo(candidate.getLongMemo());
        candidateDto.setSelectedCourse(candidate.getSelectedCourse());
        candidateDto.setPaymentType(candidate.getPaymentType());

        return candidateDto;
    }

    public static Candidate mapToCandidate(CandidateDto candidateDto, Candidate candidate){
        candidate.setFullName(candidateDto.getFullName());
        candidate.setDob(candidateDto.getDob());
        candidate.setGender(candidateDto.getGender());
        candidate.setContactNumber(candidateDto.getContactNumber());
        candidate.setEmail(candidateDto.getEmail());
        candidate.setCurrentAddress(candidateDto.getCurrentAddress());
        candidate.setPermanentAddress(candidateDto.getPermanentAddress());
        candidate.setMotherName(candidateDto.getMotherName());
        candidate.setFatherName(candidateDto.getFatherName());
        candidate.setAlternateNumber(candidateDto.getAlternateNumber());
        candidate.setAadharCard(candidateDto.getAadharCard());
        candidate.setPanCard(candidateDto.getPanCard());
        candidate.setReference(candidateDto.getReference());
        candidate.setHighestDegree(candidateDto.getHighestDegree());
        candidate.setUniversityCollegeName(candidateDto.getUniversityCollegeName());
        candidate.setYearOfPassing(candidateDto.getYearOfPassing());
        candidate.setSpecializationMajor(candidateDto.getSpecializationMajor());
        candidate.setPercentageCgpa(candidateDto.getPercentageCgpa());
        candidate.setLongMemo(candidateDto.getLongMemo());
        candidate.setSelectedCourse(candidateDto.getSelectedCourse());
        candidate.setPaymentType(candidateDto.getPaymentType());

        return candidate;
    }
}
