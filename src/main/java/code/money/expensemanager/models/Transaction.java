package code.money.expensemanager.models;

public class Transaction {

	private String userId;
	private String base;
	private String amount;
	private String timestamp;
	private String type;
	private String desc;

	public Transaction(String userId, String base, String amount, String timestamp, String type, String desc) {
		super();
		this.userId = userId;
		this.base = base;
		this.amount = amount;
		this.timestamp = timestamp;
		this.type = type;
		this.desc = desc;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
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
