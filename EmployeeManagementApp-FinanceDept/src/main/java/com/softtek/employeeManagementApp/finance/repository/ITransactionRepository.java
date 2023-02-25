package com.softtek.employeeManagementApp.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.employeeManagementApp.finance.entity.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Integer> {

}
