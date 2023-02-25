package com.softtek.employeeManagementApp.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.employeeManagementApp.employee.entity.DeptInfo;

public interface IDeptInfoRepository extends JpaRepository<DeptInfo, Integer> {

}
