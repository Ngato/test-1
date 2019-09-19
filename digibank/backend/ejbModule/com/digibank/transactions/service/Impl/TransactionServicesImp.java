package com.digibank.transactions.service.Impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.digibank.transactions.entities.Transaction;
import com.digibank.transactions.services.TransactionsInt;


@Stateless
@LocalBean
public class TransactionServicesImp implements TransactionsInt{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Boolean saveTransactions(Transaction transaction) {
		Boolean isTransactionSaved = false;
		
		if(transaction != null) {
			try {
				System.out.println("transaction.getAccountNumber() " + transaction.getAccountNumber());
				System.out.println("transaction.getCustName() " + transaction.getCustName());
				System.out.println("transaction.getDestinationBank() " + transaction.getDestinationBank());
				System.out.println("transaction.getDestinationCountry() " + transaction.getDestinationCountry());
				System.out.println(" transaction.getDestinationPassport() " + transaction.getDestinationPassport());
				System.out.println(" transaction.getAmount() " + transaction.getAmount());
				System.out.println(" transaction.getSourcePassport() " + transaction.getSourcePassport());
				em.persist(transaction);
				isTransactionSaved = true;
			}catch (Exception e) {
				isTransactionSaved = false;
			}
				
		}
		
		return isTransactionSaved;
	}
}
