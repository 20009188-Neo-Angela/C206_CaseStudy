/**
 * 
 */

/**
 * @author 20022824
 *
 */
public class Bill {
	private String username;
	private String menu;
	private int amount;
	private String date;
	
	public Bill(String username, String menu, int amount, String date) {
		super();
		this.username = username;
		this.menu = menu;
		this.amount = amount;
		this.date = date;
	}

	public String getUsername() {
		return username;
	}
	public String getMenu() {
		return menu;
	}
	public int getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}
	
}
