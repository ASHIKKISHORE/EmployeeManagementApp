package com.softtek.employeeManagementApp.finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.employeeManagementApp.employee.entity.DeptInfo;
import com.softtek.employeeManagementApp.employee.entity.Employee;
import com.softtek.employeeManagementApp.employee.entity.ProjInfo;
import com.softtek.employeeManagementApp.hr.entity.EmployeeEarning;

@Service("financeService")
public interface IEmployeeManagementEmployeeService {

	public String saveEmployeeDetails(List<Employee> employeeList);

	public String saveDepartmentDetails(List<DeptInfo> deptInfoList);

	public String saveProjectDetails(List<ProjInfo> projInfoList);

	public EmployeeEarning employeeEarningsInfo(Employee employee, String choice, Float medicalAllow);

	public Boolean employeeAttendanceValidation(Employee employee);

}