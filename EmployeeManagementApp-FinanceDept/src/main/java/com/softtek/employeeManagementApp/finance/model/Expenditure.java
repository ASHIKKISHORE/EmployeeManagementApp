package com.softtek.employeeManagementApp.finance.model;

import com.softtek.employeeManagementApp.finance.entity.EmployeeDeduction;
import com.softtek.employeeManagementApp.finance.entity.InfraExp;
import com.softtek.employeeManagementApp.hr.entity.EmployeeEarning;

import lombok.Data;

@Data
public class Expenditure {
	private EmployeeEarning empEarn;
	private EmployeeDeduction empDeduct;
	private InfraExp infraEx;
	private DepartmentBudget deptBgBalance;
	private Double corpoTax;
	private Double csrExp;
}
