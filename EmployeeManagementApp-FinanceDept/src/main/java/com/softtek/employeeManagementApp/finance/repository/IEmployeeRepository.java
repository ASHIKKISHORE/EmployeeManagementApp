package com.softtek.employeeManagementApp.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.employeeManagementApp.employee.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
