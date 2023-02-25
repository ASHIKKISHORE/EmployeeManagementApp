package com.softtek.employeeManagementApp.finance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.employeeManagementApp.employee.entity.DeptInfo;
import com.softtek.employeeManagementApp.employee.entity.Employee;
import com.softtek.employeeManagementApp.employee.entity.ProjInfo;
import com.softtek.employeeManagementApp.finance.repository.IDeptInfoRepository;
import com.softtek.employeeManagementApp.finance.repository.IEmployeeRepository;
import com.softtek.employeeManagementApp.finance.repository.IProjInfoRepository;
import com.softtek.employeeManagementApp.hr.entity.EmployeeEarning;

public class EmployeeManagementEmployeeServiceImpl implements IEmployeeManagementEmployeeService {

	@Autowired
	private IEmployeeRepository empRepo;

	@Autowired
	private IDeptInfoRepository deptRepo;

	@Autowired
	private IProjInfoRepository projRepo;

	@Override
	public String saveEmployeeDetails(List<Employee> employeeList) {
		if (employeeList != null) {
			Iterable<Employee> sEmployees = empRepo.saveAll(employeeList);
			List<Integer> empIds = new ArrayList<>();
			for (Employee employee : sEmployees) {
				empIds.add(employee.getEmpid());
			}
			return empIds.size() + " Employees' Details saved with Employee IDs :: " + empIds;
		} else
			return "Employee List in saveEmployeeDetails() :: Null!!!";
	}

	@Override
	public String saveDepartmentDetails(List<DeptInfo> deptInfoList) {
		if (deptInfoList != null) {
			Iterable<DeptInfo> sDeptInfo = deptRepo.saveAll(deptInfoList);
			List<Integer> deptNos = new ArrayList<>();
			for (DeptInfo deptInfo : sDeptInfo) {
				deptNos.add(deptInfo.getDeptno());
			}
			return deptNos.size() + " Departments' information saved with Department Numbers :: " + deptNos;
		} else
			return "Department Info List in saveDepartmentDetails() :: Null!!!";
	}

	@Override
	public String saveProjectDetails(List<ProjInfo> projInfoList) {
		if (projInfoList != null) {
			Iterable<ProjInfo> sProjInfo = projRepo.saveAll(projInfoList);
			List<Integer> projIds = new ArrayList<>();
			for (ProjInfo projInfo : sProjInfo) {
				projIds.add(projInfo.getProjid());
			}
			return projIds.size() + " Projects' information saved with Project Ids :: " + projIds;
		} else
			return "Project Info List in saveProjectDetails() :: Null!!!";
	}

	@Override
	public EmployeeEarning employeeEarningsInfo(Employee employee, String choice, Float medicalAllow) {

		EmployeeEarning earn = new EmployeeEarning();
		earn.setBasic(9000F);

		// hr allowance
		if (employee.getEaddrs().equalsIgnoreCase("Delhi"))
			earn.setHrAllow(earn.getBasic() * 0.5F);
		else if (employee.getEaddrs().equalsIgnoreCase("Bengaluru"))
			earn.setHrAllow(earn.getBasic() * 0.4F);
		else
			earn.setHrAllow(earn.getBasic() * 0.3F);

		// medical allowance
		if (choice.equalsIgnoreCase("default"))
			earn.setMedicalAllow(1300F);
		else
			earn.setMedicalAllow(medicalAllow);

		// special allowance
		earn.setSpecialAllow(3000F);
		return earn;
	}

	@Override
	public Boolean employeeAttendanceValidation(Employee employee) {
		long timeAtOffice = employee.getAttendance().getLogoutTime().getTime()
				- employee.getAttendance().getLoginTime().getTime();

		if (timeAtOffice >= 8)
			return true;
		else
			return false;
	}

}
