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

	@Override
	public List<Transaction> getTransaction(String userId) {
		return transactionDao.getTransaction(userId);
	}

}
