package com.example.Homework26.model;

import java.util.Objects;
import java.util.Random;

public class Employee {
    private final String firstName;
    private  final String lastName;
    private Integer salary;
    private Integer departmentId;

    private final Random random = new Random();

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = random.nextInt(10000) + 1000;
        this.departmentId = random.nextInt(5) + 1;
    }

    public Employee (String firstName, String lastName, Integer salary, Integer departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getDepartmentId(), employee.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSalary(), getDepartmentId());
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}
