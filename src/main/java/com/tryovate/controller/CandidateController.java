package com.tryovate.controller;

import com.tryovate.constants.CandidateConstants;
import com.tryovate.dto.CandidateDto;
import com.tryovate.dto.ResponseDto;
import com.tryovate.model.Candidate;
import com.tryovate.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/candidate-api")
@RestController()
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping(value = "/add-candidate",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CandidateDto candidateDto) {
        candidateService.saveCandidateDto(candidateDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(CandidateConstants.STATUS_201, CandidateConstants.MESSAGE_201));
    }

//    @PostMapping("/add-candidate")
//    public ResponseEntity<CandidateDto> submitPersonalDetails(@Valid @RequestBody CandidateDto employeeDto) {
//        try {
//
//            CandidateDto savedDetails = candidateService.saveEmployee(employeeDto);
//
//            return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
//        } catch (Exception e) {
//            // Handle errors (e.g., invalid data) and return 400 Bad Request
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }

//    @PostMapping("/add-candidate")
//    public CandidateDto addCandidate( @RequestBody CandidateDto candidateDto){
//       return candidateService.saveCandidateDto(candidateDto);
//    }


//    @PostMapping("/add-candidate")
//   public Candidate addCandidate(@RequestBody Candidate candidate){
//        return  candidateService.saveCandidate(candidate);
//    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CandidateDto> getCandidateById(@PathVariable String id) {
        CandidateDto candidateDto = candidateService.getCandidateById(id);
        return ResponseEntity.ok(candidateDto);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CandidateDto>> getAllCandidates() {
        List<CandidateDto> candidateDto = candidateService.getAllCandidates();
        return ResponseEntity.ok(candidateDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteCandidate(@PathVariable String id) {
        candidateService.deleteCandidate(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(CandidateConstants.STATUS_200, "Candidate deleted successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CandidateDto> updateCandidate(@PathVariable String id, @RequestBody CandidateDto candidateDto) {
        CandidateDto updatedCandidate = candidateService.updateCandidate(id, candidateDto);
        return ResponseEntity.ok(updatedCandidate);
    }


}
