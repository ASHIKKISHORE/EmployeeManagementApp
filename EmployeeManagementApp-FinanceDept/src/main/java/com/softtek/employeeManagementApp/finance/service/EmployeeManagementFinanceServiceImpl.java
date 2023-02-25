package com.softtek.employeeManagementApp.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.employeeManagementApp.finance.entity.EmployeeDeduction;
import com.softtek.employeeManagementApp.finance.entity.InfraExp;
import com.softtek.employeeManagementApp.finance.entity.Transaction;
import com.softtek.employeeManagementApp.finance.repository.IInfraExpRepository;
import com.softtek.employeeManagementApp.finance.repository.ITransactionRepository;
import com.softtek.employeeManagementApp.hr.entity.EmployeeEarning;

@Service("financeService")
public class EmployeeManagementFinanceServiceImpl implements IEmployeeManagementFinanceService {

	@Autowired
	private ITransactionRepository transRepo;

	@Autowired
	private IInfraExpRepository infraRepo;

	@Override
	public String saveTransactionDetails(Transaction transaction) {
		return "Transaction Details saved with Transaction ID :: " + transRepo.save(transaction).getTransId();
	}

	@Override
	public String saveInfraExpDetails(InfraExp infraExp) {
		return "Ifrastructure Expense saved with ID :: " + infraRepo.save(infraExp).getInfraExpId();
	}

	

	@Override
	public EmployeeDeduction employeeDeductionsInfo(EmployeeEarning empEarn) {
		EmployeeDeduction deduct = new EmployeeDeduction();
		deduct.setPf(0.12F * empEarn.getBasic());
		deduct.setGratuity(0.048F * empEarn.getBasic());

		Float totalIncome = empEarn.getBasic() + empEarn.getHrAllow() + empEarn.getMedicalAllow()
				+ empEarn.getSpecialAllow();

		// pf
		if (totalIncome > 750000)
			deduct.setIncomeTax(0.15F * totalIncome);
		else if (totalIncome > 500000)
			deduct.setIncomeTax(0.1F * totalIncome);
		else if (totalIncome > 250000)
			deduct.setIncomeTax(0.05F * totalIncome);
		else
			deduct.setIncomeTax(0F);

		return deduct;
	}

}