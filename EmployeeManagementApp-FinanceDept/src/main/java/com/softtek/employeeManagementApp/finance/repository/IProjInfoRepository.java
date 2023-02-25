package com.softtek.employeeManagementApp.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.employeeManagementApp.employee.entity.ProjInfo;

public interface IProjInfoRepository extends JpaRepository<ProjInfo, Integer> {

}
