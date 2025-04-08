package com.tryovate.mapper;

import com.tryovate.dto.CandidateDto;
import com.tryovate.model.Candidate;
import com.tryovate.model.Course;
import com.tryovate.repository.CourseRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateMapper {

    public static CandidateDto mapToCandidateDto(Candidate candidate) {
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setId(candidate.getId());
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

//          this is for backend logic
//        candidateDto.setSelectedCourses(
//        Arrays.stream(candidate.getSelectedCourses().split(","))
//              .map(String::trim)
//              .toList()
//    );
//        candidateDto.setPaymentType(candidate.getPaymentType());
//        candidateDto.setPaymentMode(candidate.getPaymentMode());
//        candidateDto.setPartialPaidAmount(candidate.getPartialPaidAmount());
//        candidateDto.setTotalPayableAmount(candidate.getTotalPayableAmount());

//        candidateDto.setSelectedCourses(
//                Arrays.asList(candidate.getSelectedCourses().split(","))
//        );
//        candidateDto.setSelectedCourses(Arrays.asList(candidate.getSelectedCourses().split(","))); // back to list

        // Convert comma-separated string back to list
        if (candidate.getSelectedCourse() != null && !candidate.getSelectedCourse().isEmpty()) {
            candidateDto.setSelectedCourse(Arrays.asList(candidate.getSelectedCourse().split(",")));
        }
    else {
        candidateDto.setSelectedCourse(new ArrayList<>());
    }

        // without logic
//        candidateDto.setSelectedCourse(candidate.getSelectedCourse());
        candidateDto.setPaymentType(candidate.getPaymentType());
        candidateDto.setPaymentMode(candidate.getPaymentMode());
        candidateDto.setPartialPaidAmount(candidate.getPartialPaidAmount());
        candidateDto.setTotalPayableAmount(candidate.getTotalPayableAmount());
        candidateDto.setRemainingAmount(candidate.getRemainingAmount());

        return candidateDto;
    }

    public static Candidate mapToCandidate(CandidateDto candidateDto, Candidate candidate){
        candidate.setId(candidateDto.getId());
        candidate.setFullName(candidateDto.getFullName());                              // CourseRepo courseRepo  this is for logic
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
//        candidate.setPaymentType(candidateDto.getPaymentType());
//        candidate.setPaymentMode(candidateDto.getPaymentMode());
//        List<Course> courseList = courseRepo.findByCourseNameIn(candidateDto.getCourses());
//        candidate.setCourses(courseList);
//
//        double totalFee = courseList.stream().mapToDouble(Course::getCourseFee).sum();
//        double gst = 0.0;
//
//        if ("FULL".equalsIgnoreCase(candidateDto.getPaymentType())) {
//            if ("ONLINE".equalsIgnoreCase(candidateDto.getPaymentMode())) {
//                gst = totalFee * 0.18;
//            }
//            candidate.setPaidAmount(totalFee + gst);
//        } else if ("PARTIAL".equalsIgnoreCase(candidateDto.getPaymentType())) {
//            candidate.setPaidAmount(candidateDto.getPartialAmount());
//        }
//
//        candidate.setTotalPayableAmount(totalFee + gst);


        // this is for backend calculation
//        List<Course> courseList = candidateDto.getSelectedCourses().stream()
//                .map(courseName -> courseRepo.findByCourseName(courseName)
//                        .orElseThrow(() -> new RuntimeException("Course not found: " + courseName)))
//                .toList();
//        candidate.setSelectedCourses(courseList);
//
//        candidate.setPaymentType(candidateDto.getPaymentType());
//        candidate.setPaymentMode(candidateDto.getPaymentMode());


//        candidate.setSelectedCourses(
//                candidateDto.getSelectedCourses() != null ? String.join(",", candidateDto.getSelectedCourses()) : ""
//        );

        // Convert list to comma-separated string
        if (candidateDto.getSelectedCourse() != null && !candidateDto.getSelectedCourse().isEmpty()) {
            candidate.setSelectedCourse(String.join(",", candidateDto.getSelectedCourse()));
        }
    else {
        candidate.setSelectedCourse("");
    }

//        candidate.setSelectedCourses(String.join(",", candidateDto.getSelectedCourses()));
//        candidate.setSelectedCourses(String.join(",", candidateDto.getSelectedCourses())); // convert to string
//        just accepting the values
//        candidate.setSelectedCourse(candidateDto.getSelectedCourse());
        candidate.setPaymentType(candidateDto.getPaymentType());
        candidate.setPaymentMode(candidateDto.getPaymentMode());
        candidate.setPartialPaidAmount(candidateDto.getPartialPaidAmount());
        candidate.setTotalPayableAmount(candidateDto.getTotalPayableAmount());
        candidate.setRemainingAmount(candidateDto.getRemainingAmount());

        return candidate;

    }
}
