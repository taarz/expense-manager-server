package code.money.expensemanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.money.expensemanager.dao.TransactionDao;
import code.money.expensemanager.models.Transaction;
import code.money.expensemanager.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Override
	public boolean addTransaction(Transaction transaction) {
		boolean isSuccess = false;
		try {
			transactionDao.save(transaction);
			isSuccess = true;
		} catch(Exception e) {
			
		}
		return isSuccess;
	}

	//TO BE IMPLEMENTED
	@Override
	public boolean editTransaction(Transaction transaction)
	{
		boolean isSuccess = false;
		try
		{
			transactionDao.save(transaction);
			isSuccess = true;
		}
		catch(Exception e)
		{
			
		}
		return isSuccess;
	}

	@Override
	public boolean deleteTransaction(String userId) {
		boolean isSuccess = false;
		try {
			Transaction deleteTransaction = transactionDao.findByUserId(userId);
			if (deleteTransaction == null)
			{
				throw new NullPointerException("Transaction does not exist");
			}
			transactionDao.delete(deleteTransaction);
			isSuccess = true;
		}
		catch (IllegalArgumentException iae)
		{
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	@Override
	public List<Transaction> getTransaction(String userId) {
		return transactionDao.getTransaction(userId);
	}

}
