package com.employee.springjdbc.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;

    private String name;

    private String location;

    private String department;

    public Employee(String name, String location, String department) {
        this.name = name;
        this.location = location;
        this.department = department;
    }
}
