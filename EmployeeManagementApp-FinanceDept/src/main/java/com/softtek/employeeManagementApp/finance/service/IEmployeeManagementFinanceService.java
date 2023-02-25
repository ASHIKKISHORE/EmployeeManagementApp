package com.softtek.employeeManagementApp.finance.service;

import org.springframework.stereotype.Service;

import com.softtek.employeeManagementApp.finance.entity.EmployeeDeduction;
import com.softtek.employeeManagementApp.finance.entity.InfraExp;
import com.softtek.employeeManagementApp.finance.entity.Transaction;
import com.softtek.employeeManagementApp.hr.entity.EmployeeEarning;

@Service("financeService")
public interface IEmployeeManagementFinanceService {

	public String saveTransactionDetails(Transaction transaction);

	public String saveInfraExpDetails(InfraExp infraExp);

	public EmployeeDeduction employeeDeductionsInfo(EmployeeEarning empEarn);

}