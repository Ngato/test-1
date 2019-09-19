package com.digibank.transactionController;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import com.digibank.transactionDTO.TransactionsDTO;
import com.digibank.transactions.service.Impl.TransactionServicesImp;


@ManagedBean(name="transactionsController")
@SessionScoped
public class TransactionsController{
	

	@ManagedProperty(value ="#{transactionDto}")
	TransactionsDTO transactionDto = new TransactionsDTO();
	
	@EJB
	private TransactionServicesImp transactionServiceImp;
	
	public Boolean isTransactionSaved = false;
	
	public Boolean saveNewTransaction(TransactionsDTO transactionDto) {
		Boolean saveTransaction = transactionServiceImp.saveTransactions(transactionDto.getTransaction());
		System.out.println("is transaction saved saveTransaction " + saveTransaction);
		if(saveTransaction) {
			isTransactionSaved = true;
		}
		return isTransactionSaved;
	}

	public TransactionsDTO getTransactionDto() {
		return transactionDto;
	}

	public void setTransactionDto(TransactionsDTO transactionDto) {
		this.transactionDto = transactionDto;
	}

	public Boolean getIsTransactionSaved() {
		return isTransactionSaved;
	}

	public void setIsTransactionSaved(Boolean isTransactionSaved) {
		this.isTransactionSaved = isTransactionSaved;
	}
		
}
