package com.digibank.transactions.dto;

import java.math.BigDecimal;

public class TransactionsDTO {

	private int transactionsCode;
	private String accountNumber;
	private BigDecimal amount;
	private String destinationBank;
	private String destinationCountry;
	private String destinationPassport;
	private String sourcePassport;
	private String custName;
	
	public int getTransactionsCode() {
		return transactionsCode;
	}
	public void setTransactionsCode(int transactionsCode) {
		this.transactionsCode = transactionsCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	
	
}
