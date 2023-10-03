package com.example.Homework26.service;

import com.example.Homework26.exception.EmployeeAlreadyAddedException;
import com.example.Homework26.exception.EmployeeNotFoundException;
import com.example.Homework26.model.employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List <employee> employees = new ArrayList<>();


    @Override
    public employee add(String firstName, String lastName) {
      employee employee = new employee(firstName, lastName);

      if (employees.contains(employee)) {
          throw new EmployeeAlreadyAddedException();
      }
      employees.add(employee);
      return employee;
    }

    @Override
    public employee remove(String firstName, String lastName) {
        employee employee = new employee ( firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }

        employees.remove(employee);
        return employee;
    }

    @Override
    public employee find(String firstName, String lastName) {
        employee employee = new employee ( firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public Collection<employee> findAll() {
        return employees;
    }
}
