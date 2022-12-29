package code.money.expensemanager.models.dto;

import java.util.List;

import code.money.expensemanager.models.Transaction;

public class TransactionDto {

	private Transaction transaction;
	
	private List<Transaction> transactionList;

	private String status;

	private String message;
	
	public TransactionDto(Transaction transaction, List<Transaction> transactionList, String status, String message) {
		super();
		this.transaction = transaction;
		this.transactionList = transactionList;
		this.status = status;
		this.message = message;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
