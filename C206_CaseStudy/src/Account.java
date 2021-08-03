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
