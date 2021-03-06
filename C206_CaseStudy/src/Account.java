/**
 * 
 */

/**
 * @author Hannah
 *
 */
public class Account {
	private String username;
	private String password;
	
	private String formClass;
	private String paymentMethods;
	
	
	
	
	public Account(String username, String password, String formClass, String paymentMethods) {
		super();
		this.username = username;
		this.password = password;
		this.formClass = formClass;
		this.paymentMethods = paymentMethods;
	}
	
	public String toString() {
		
		// Write your codes here
		String itemInfo = String.format("%-10s %-15s %-12s %-10s", 
				username,password,formClass,paymentMethods);			
		
		return itemInfo;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFormClass() {
		return formClass;
	}

	public String getPaymentMethods() {
		return paymentMethods;
	}
	
	
	
}
