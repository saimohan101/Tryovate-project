package com.tryovate.service;

import com.tryovate.dto.EmployeeDto;
import com.tryovate.exception.EmployeeAlreadyExistsException;
import com.tryovate.mapper.EmployeeMapper;
import com.tryovate.model.Employee;
import com.tryovate.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto, new Employee());
        Optional<Employee> optionalEmployee = employeeRepo.findByEmail(employeeDto.getEmail());
        if (optionalEmployee.isPresent()) {
            throw new EmployeeAlreadyExistsException("Employee already Exist with given email Id "
                    + employee.getEmail());
        }
        Employee savedEmployee = employeeRepo.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(savedEmployee);
           return savedEmployeeDto;

    }

    public Employee get(long id) {
        Employee mo = employeeRepo.findById(id).get();
        return mo;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepo.deleteById(id);
    }

    public List<Employee> getAll() {
        List<Employee> lm = employeeRepo.findAll();
        return lm;
    }


}
