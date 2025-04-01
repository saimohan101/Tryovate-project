package com.tryovate.service;

import com.tryovate.dto.EmployeeDto;
import com.tryovate.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    public List<Employee> getAll();

    public Employee get(long id);

    public Employee updateEmployee(long id, Employee employee);

    public void deleteEmployee(long id);
}
