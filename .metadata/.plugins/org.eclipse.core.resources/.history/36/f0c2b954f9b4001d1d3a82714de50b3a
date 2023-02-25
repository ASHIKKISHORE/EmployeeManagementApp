package com.softtek.employeeManagementApp.finance.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Table(name = "employee_deduction_table")
@Setter
@Getter
@NoArgsConstructor
public class EmployeeDeduction {

	@Column(name = "provident_fund")
	private Float pf;

	@Column(name = "income_tax")
	private Float incomeTax;

	private Float gratuity;

	@Override
	public String toString() {
		return "EmployeeDeduction [ pf=" + pf + ", incomeTax=" + incomeTax + ", gratuity=" + gratuity + "]";
	}

}
