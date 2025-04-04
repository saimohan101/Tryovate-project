package com.tryovate.service;

import com.tryovate.dto.CandidateDto;
import com.tryovate.model.Candidate;

import java.util.List;

public interface CandidateService {

    void saveCandidateDto(CandidateDto candidateDto);

//    EmployeeDto fetchAccount(String email);
//
//    boolean updateAccount(EmployeeDto email);
//
//    boolean deleteAccount(String email);




    String generateCandidateId();

//    public CandidateDto saveCandidateDto(CandidateDto candidateDto);

//    public Candidate saveCandidate(Candidate candidate);

//    public List<Candidate> getAll();

    public CandidateDto getCandidateById(String id);

    List<Candidate> getAllCandidates();

    CandidateDto updateCandidate(String id, CandidateDto candidateDto);

    void deleteCandidate(String id);
}
