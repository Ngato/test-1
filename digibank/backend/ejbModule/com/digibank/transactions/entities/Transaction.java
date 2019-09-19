package com.digibank.transactions.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the transactions database table.
 * 
 */
@Entity
@Table(name="transactions")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transactions_code")
	private int transactionsCode;

	@Column(name="account_number")
	private String accountNumber;

	private BigDecimal amount;

	@Column(name="cust_name")
	private String custName;

	@Column(name="destination_bank")
	private String destinationBank;

	@Column(name="destination_country")
	private String destinationCountry;

	@Column(name="destination_passport")
	private String destinationPassport;

	@Column(name="source_passport")
	private String sourcePassport;

	public Transaction() {
	}

	public int getTransactionsCode() {
		return this.transactionsCode;
	}

	public void setTransactionsCode(int transactionsCode) {
		this.transactionsCode = transactionsCode;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDestinationBank() {
		return this.destinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}

	public String getDestinationCountry() {
		return this.destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getDestinationPassport() {
		return this.destinationPassport;
	}

	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}

	public String getSourcePassport() {
		return this.sourcePassport;
	}

	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}

}