package com.softtek.employeeManagementApp.finance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class VenderInvoice {

	@Id
	@GeneratedValue
	private Integer invoiceId;

	private String vname;

	@Transient
	private Transaction transaction;
}