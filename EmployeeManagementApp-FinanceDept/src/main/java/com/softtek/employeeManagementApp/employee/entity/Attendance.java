package com.softtek.employeeManagementApp.employee.entity;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Attendance {
	private Date loginTime;
	private Date logoutTime;
}