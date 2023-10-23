package com.example.Homework26.service;

import com.example.Homework26.exception.EmployeeAlreadyAddedException;
import com.example.Homework26.exception.EmployeeNotFoundException;
import com.example.Homework26.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map < String, Employee> employees = new HashMap<>();


    @Override
    public Employee add(String firstName, String lastName) {
      Employee employee = new Employee(firstName, lastName);

      if (employees.containsKey(employee.getFullName())) {
          throw new EmployeeAlreadyAddedException();
      }
      employees.put(employee.getFullName(),employee);
      return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee( firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException();
        }

        employees.remove(employee.getFullName());
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee( firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        return employees.values();
    }
}
