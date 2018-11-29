package com.tw.apistackbase.application;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

//    private static List<Employee> employees = new LinkedList<>(Arrays.asList(
//        new Employee("Xiaoming", 20),
//        new Employee("Xiaohong", 19),
//        new Employee("Xiaozhi", 15)
//    ));
//    public List<Employee> list() {
//        return employees;
//    }
//
//    public void add(Employee employee) {
//        employees.add(employee);
//    }
}
