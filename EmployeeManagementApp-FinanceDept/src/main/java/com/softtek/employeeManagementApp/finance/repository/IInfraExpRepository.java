package com.softtek.employeeManagementApp.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.employeeManagementApp.finance.entity.InfraExp;

public interface IInfraExpRepository extends JpaRepository<InfraExp, Integer> {

}
