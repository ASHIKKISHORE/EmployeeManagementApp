package com.softtek.employeeManagementApp.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ProjInfo {
	@Id
	private Integer projid;

	private String projName;

	private Integer projStrength;

	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_ID", referencedColumnName = "PROJID")
	private List<Employee> employee;

	@Override
	public String toString() {
		return "ProjInfo [projid=" + projid + ", projName=" + projName + ", projStrength=" + projStrength + "]";
	}

}
