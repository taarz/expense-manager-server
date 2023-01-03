package code.money.expensemanager.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import code.money.expensemanager.models.Transaction;

@Repository
public interface TransactionDao extends MongoRepository<Transaction, String> {
	
	@Query("{userId:'?0'}")
	public List<Transaction> getTransaction(String userId);
	
	public Transaction findByUserId(String userId);

}
