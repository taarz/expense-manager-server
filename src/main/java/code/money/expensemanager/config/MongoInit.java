package code.money.expensemanager.config;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoInit {
	public MongoDatabase connectToMongo() {
		try (MongoClient mongo = new MongoClient("localhost", 27017)) {
			return mongo.getDatabase("ExpenseManager");
		}
	}
}
