package com.digibank.transactions.services;

import com.digibank.transactions.entities.Transaction;

public interface TransactionsInt {

		Boolean saveTransactions(Transaction transaction);
}
