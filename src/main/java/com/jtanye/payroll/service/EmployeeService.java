package com.jtanye.payroll.service;

import com.jtanye.payroll.model.Employee;
import com.jtanye.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by: Jonathan Tanye
 * Email: jtanye@gmail.com
 * Project: payroll
 * Date: 04/07/2022
 */
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(
           EmployeeRepository employeeRepository
    ) {
        this.employeeRepository = employeeRepository;
    }

    // Add new Employee
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    // update employee
    public void updateEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.findById((employee.getId())).orElseThrow();
    }

    //get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //  get  employee by name
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name).orElseThrow();
    }

    //get employee by Id
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    // delete Employee
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
