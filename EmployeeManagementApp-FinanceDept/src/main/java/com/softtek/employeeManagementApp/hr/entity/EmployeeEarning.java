package com.softtek.employeeManagementApp.hr.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Table(name = "emp_earning_table")
@Setter
@Getter
public class EmployeeEarning {

	private Float basic;
	private Float hrAllow;
	private Float medicalAllow;
	private Float specialAllow;

	@Override
	public String toString() {
		return "EmployeeEarning [basic=" + basic + ", hrAllow=" + hrAllow + ", medicalAllow=" + medicalAllow
				+ ", specialAllow=" + specialAllow + "]";
	}

}
