package com.jtanye.payroll.model;

import com.jtanye.payroll.controller.EmployeeController;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by: Jonathan Tanye
 * Email: jtanye@gmail.com
 * Project: payroll
 * Date: 04/07/2022
 */

@Data
@Document(collection = "employee")
public class Employee implements Serializable {
    @Id
    @Generated
    private String id;

    private String name;

    private String role;

    private String email;

    public Employee() {}

    public Employee( String name, String role, String email) {
        this.email = email;
        this.name = name;
        this.role = role;
    }

}
