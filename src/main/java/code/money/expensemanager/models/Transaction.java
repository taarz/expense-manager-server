package code.money.expensemanager.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("transaction")
public class Transaction {
	
	@Id
	private String id;
	private String userId;
	private String category;
	private String amount;
	private String timestamp;
	private String type;
	private String desc;

	public Transaction(String userId, String category, String amount, String timestamp, String type, String desc) {
		super();
		this.userId = userId;
		this.category = category;
		this.amount = amount;
		this.timestamp = timestamp;
		this.type = type;
		this.desc = desc;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBase() {
		return category;
	}

	public void setBase(String base) {
		this.category = base;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
