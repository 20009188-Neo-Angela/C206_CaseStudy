/**
 * 
 */

/**
 * @author 20022824
 *
 */
public class Bill {
	private String username;
	private int amount;
	private int month;
	private int year;
	
	public Bill(String username, int amount, int month, int year) {
		super();
		this.username = username;
		this.amount = amount;
		this.month = month;
		this.year = year;
	}

	public String getUsername() {
		return username;
	}

	public int getAmount() {
		return amount;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
}
