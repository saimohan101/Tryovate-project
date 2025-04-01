package com.tryovate.mapper;

import com.tryovate.dto.EmployeeDto;
import com.tryovate.model.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFullName(employee.getFullName());
        employeeDto.setDob(employee.getDob());
        employeeDto.setGender(employee.getGender());
        employeeDto.setContactNumber(employee.getContactNumber());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setCurrentAddress(employee.getCurrentAddress());
        employeeDto.setPermanentAddress(employee.getPermanentAddress());
        employeeDto.setMotherName(employee.getMotherName());
        employeeDto.setFatherName(employee.getFatherName());
        employeeDto.setAlternateNumber(employee.getAlternateNumber());
        employeeDto.setAadharCard(employee.getAadharCard());
        employeeDto.setPanCard(employee.getPanCard());
        employeeDto.setReference(employee.getReference());
        employeeDto.setHighestDegree(employee.getHighestDegree());
        employeeDto.setUniversityCollegeName(employee.getUniversityCollegeName());
        employeeDto.setYearOfPassing(employee.getYearOfPassing());
        employeeDto.setSpecializationMajor(employee.getSpecializationMajor());
        employeeDto.setPercentageCgpa(employee.getPercentageCgpa());
        employeeDto.setLongMemo(employee.getLongMemo());
        employeeDto.setSelectedCourse(employee.getSelectedCourse());
        employeeDto.setPaymentType(employee.getPaymentType());

        return employeeDto;
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto, Employee employee){
        employee.setFullName(employeeDto.getFullName());
        employee.setDob(employeeDto.getDob());
        employee.setGender(employeeDto.getGender());
        employee.setContactNumber(employeeDto.getContactNumber());
        employee.setEmail(employeeDto.getEmail());
        employee.setCurrentAddress(employeeDto.getCurrentAddress());
        employee.setPermanentAddress(employeeDto.getPermanentAddress());
        employee.setMotherName(employeeDto.getMotherName());
        employee.setFatherName(employeeDto.getFatherName());
        employee.setAlternateNumber(employeeDto.getAlternateNumber());
        employee.setAadharCard(employeeDto.getAadharCard());
        employee.setPanCard(employeeDto.getPanCard());
        employee.setReference(employeeDto.getReference());
        employee.setHighestDegree(employeeDto.getHighestDegree());
        employee.setUniversityCollegeName(employeeDto.getUniversityCollegeName());
        employee.setYearOfPassing(employeeDto.getYearOfPassing());
        employee.setSpecializationMajor(employeeDto.getSpecializationMajor());
        employee.setPercentageCgpa(employeeDto.getPercentageCgpa());
        employee.setLongMemo(employeeDto.getLongMemo());
        employee.setSelectedCourse(employeeDto.getSelectedCourse());
        employee.setPaymentType(employeeDto.getPaymentType());

        return employee;
    }
}
