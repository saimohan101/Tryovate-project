package com.tryovate.service;

import com.tryovate.constants.CourseFeeConstants;
import com.tryovate.dto.CandidateDto;
import com.tryovate.exception.CandidateAlreadyExistsException;
import com.tryovate.exception.CandidateNotFoundException;
import com.tryovate.exception.NoCandidatesFoundException;
import com.tryovate.mapper.CandidateMapper;
import com.tryovate.model.Candidate;
import com.tryovate.model.Course;
import com.tryovate.repository.CandidateRepo;
import com.tryovate.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepo candidateRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void saveCandidateDto(CandidateDto candidateDto) {

            Optional<Candidate> existingCandidate = candidateRepo.findByEmail(candidateDto.getEmail());
            if(existingCandidate.isPresent()) {
                throw new CandidateAlreadyExistsException("email already exist "
                        +candidateDto.getEmail());
            }

//        if (candidateDto.getSelectedCourses() == null || candidateDto.getSelectedCourses().isEmpty()) {
//            throw new IllegalArgumentException("Selected courses must not be null or empty");
//        }

        Candidate candidate = CandidateMapper.mapToCandidate(candidateDto,new Candidate());
        candidate.setId(generateCandidateId()); // your existing ID generator
        candidateRepo.save(candidate);


  //      for logic
//        double totalCourseFee = 0.0;
//        for (String courseName : candidateDto.getSelectedCourses()) {
//            totalCourseFee += CourseFeeConstants.getFeeByCourseName(courseName);
//        }
//
//        double gst = 0.0;
//        double payableAmount = 0.0;
//        double paidAmount = 0.0;
//        double remainingAmount = 0.0;
//
//        if ("FULL".equalsIgnoreCase(candidateDto.getPaymentType())) {
//            if ("ONLINE".equalsIgnoreCase(candidateDto.getPaymentMode())) {
//                gst = totalCourseFee * CourseFeeConstants.GST_PERCENTAGE;
//            }
//            payableAmount = totalCourseFee + gst;
//            paidAmount = payableAmount; // full payment
//            remainingAmount = 0.0;
//
//        } else if ("PARTIAL".equalsIgnoreCase(candidateDto.getPaymentType())) {
//            if ("ONLINE".equalsIgnoreCase(candidateDto.getPaymentMode())) {
//                gst = totalCourseFee * CourseFeeConstants.GST_PERCENTAGE;
//                totalCourseFee += gst;
//            }
//            payableAmount = candidateDto.getPartialPaidAmount();
//            remainingAmount = totalCourseFee - payableAmount;
//        }
//
//        // Set calculated values into DTO
//        candidateDto.setTotalPayableAmount(payableAmount);
//        candidateDto.setPartialPaidAmount(paidAmount);
//        candidateDto.setRemainingAmount(remainingAmount);
//
//        Candidate candidate = CandidateMapper.mapToCandidate(candidateDto, new Candidate(), courseRepo);
//        candidate.setPartialPaidAmount(paidAmount);
//        candidate.setTotalPayableAmount(payableAmount);
//        candidate.setRemainingAmount(remainingAmount);
//
//
//        candidate.setId(generateCandidateId());
//
//    candidateRepo.save(candidate);

    }

//    @Override
//    public EmployeeDto fetchAccount(long id) {
//        Employee customer = employeeRepo.findById(id).orElseThrow(
//                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
//        );
//        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
//                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
//        );
//        CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer, new CustomerDto());
//        customerDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));
//        return customerDto;
//    }


//    @Override
//    public CandidateDto saveCandidateDto(CandidateDto candidateDto) {
//
//        Candidate candidate = CandidateMapper.mapToCandidate(candidateDto, new Candidate());
//        Optional<Candidate> existingCandidate = candidateRepo.findByEmail(candidateDto.getEmail());
//        if(existingCandidate.isPresent()) {
//            throw new CandidateAlreadyExistsException("Candidate already Exist with given email Id " + candidateDto.getEmail());
//        }
//        candidate.setId(generateCandidateId());
//
//        System.out.println("Generated Candidate ID: " + candidate.getId());
//
//        Candidate savedCandidate = candidateRepo.save(candidate);
//
//
//        return CandidateMapper.mapToCandidateDto(savedCandidate);
//    }

    @Override
    public String generateCandidateId() {
        LocalDate now = LocalDate.now();
        String year = String.valueOf(now.getYear()).substring(2); // "2025" → "25"
        String month = String.format("%02d", now.getMonthValue()); // "4" → "04"

        String prefix = year + month; // "2504"

        // Get the latest ID with this prefix
        String latestId = candidateRepo.findLatestIdForMonth(prefix);

        int nextSequence = 1;
        if (latestId != null) {
            int lastSequence = Integer.parseInt(latestId.substring(4)); // Extract "XXXX" part
            nextSequence = lastSequence + 1;
        }

        // Format sequence as 4 digits (0001, 0002, ...)
        return prefix + String.format("%04d", nextSequence);
    }




//        @Override
//        public CandidateDto saveCandidate (CandidateDto candidateDto){
//
//            Optional<Candidate> existingCandidate = candidateRepo.findByEmail(candidateDto.getEmail());
//            if (existingCandidate.isPresent()) {
//                throw new CandidateAlreadyExistsException("Candidate already Exist with given email Id "
//                        + candidateDto.getEmail());
//            }
//
//    Candidate candidate = CandidateMapper.mapToCandidate(candidateDto, new Candidate());
//            Candidate savedCandidate = candidateRepo.save(candidate);
//
//            CandidateDto savedEmployeeDto = CandidateMapper.mapToCandidateDto(savedCandidate);
//            return CandidateMapper.mapToCandidateDto(savedCandidate);
//
//        }

//    @Override
//    public Candidate saveCandidate(Candidate candidate) {
//        candidate.setId(generateCandidateId());
//        return candidateRepo.save(candidate);
//    }

    @Override
    public CandidateDto getCandidateById(String id) {
        Candidate candidate = candidateRepo.findById(id)
                .orElseThrow(() -> new CandidateNotFoundException("Given Id Not Found"));
        return CandidateMapper.mapToCandidateDto(candidate);
    }

    @Override
    public CandidateDto updateCandidate(String id, CandidateDto candidateDto) {
        Candidate candidate = candidateRepo.findById(id)
                .orElseThrow(() -> new CandidateNotFoundException("Given Id Not Found"));

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
        candidate.setPaymentType(candidateDto.getPaymentType());

        Candidate updatedCandidate = candidateRepo.save(candidate);
        return CandidateMapper.mapToCandidateDto(updatedCandidate);
    }


    @Override
    public void deleteCandidate(String id) {
        Candidate candidate = candidateRepo.findById(id)
                .orElseThrow(() -> new CandidateNotFoundException("Candidate not found with ID: " + id));
        candidateRepo.delete(candidate);
    }


    @Override
    public List<CandidateDto> getAllCandidates() {
        List<Candidate> candidates = candidateRepo.findAll();
        if (candidates.isEmpty()) {
            throw new NoCandidatesFoundException("No candidates available");
        }
        return candidates.stream()
                .map(CandidateMapper::mapToCandidateDto)
                .collect(Collectors.toList());
    }
    }
