package code.money.expensemanager.service;

import java.util.List;

import code.money.expensemanager.models.Transaction;

public interface TransactionService {
	
	public boolean addTransaction(Transaction transaction);
	
	public List<Transaction> getTransaction(String userId);
}
