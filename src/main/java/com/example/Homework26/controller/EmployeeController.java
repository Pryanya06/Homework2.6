package com.example.Homework26.controller;

import com.example.Homework26.model.employee;
import com.example.Homework26.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public employee add(@RequestParam String firstName, @RequestParam String lastName) {

    }
}
