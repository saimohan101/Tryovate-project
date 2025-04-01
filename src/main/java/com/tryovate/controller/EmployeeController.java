package com.tryovate.controller;

import com.tryovate.dto.EmployeeDto;
import com.tryovate.model.Employee;
import com.tryovate.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController()
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-candidate")
    public ResponseEntity<EmployeeDto> submitPersonalDetails(@Valid @RequestBody EmployeeDto employeeDto) {
        try {

            EmployeeDto savedDetails = employeeService.saveEmployee(employeeDto);

            return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle errors (e.g., invalid data) and return 400 Bad Request
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeService.get(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

}
