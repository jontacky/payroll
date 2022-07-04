package com.jtanye.payroll.repository;

import com.jtanye.payroll.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Created by: Jonathan Tanye
 * Email: jtanye@gmail.com
 * Project: payroll
 * Date: 04/07/2022
 */


public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query("{'name': ?0}")
    Optional<Employee> findByName(String name);
}
