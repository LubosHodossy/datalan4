package com.luboshodossy;

import java.util.List;

public interface IEmployees {
    List<Employee> getEmployeesByGender(List<Employee> emp, Gender gender);
    List<Employee> sortEmployeesByAge(List<Employee> emp);
    List<Employee> getEmployeesByCity(List<Employee> emp, String cityCode);
    List<Employee> getActiveEmployees(List<Employee> emp);
    void printEmployees(List<Employee> emp);
}
