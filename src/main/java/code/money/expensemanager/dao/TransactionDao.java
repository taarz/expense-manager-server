package code.money.expensemanager.dao;

import java.util.List;

import code.money.expensemanager.models.Transaction;

public interface TransactionDao {
	
	public boolean persistTransaction(Transaction transaction);
	
	public List<Transaction> getTransaction(String userId);
	
	public boolean deleteTransaction(String userId);
}
