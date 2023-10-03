package com.example.Homework26.service;

import com.example.Homework26.model.employee;

import java.util.Collection;

public interface EmployeeService {
    employee add(String firstName, String lastName);
    employee remove( String firstName, String lastName);
    employee find( String firstName, String lastName);
    Collection <employee> findAll();
}
