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
	private double credit;
	private String paymentMethods;
	
	
	
	
	public Account(String username, String password, String formClass, double credit, String paymentMethods) {
		super();
		this.username = username;
		this.password = password;
		this.formClass = formClass;
		this.credit = credit;
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

	public double getCredit() {
		return credit;
	}

	public String getPaymentMethods() {
		return paymentMethods;
	}
	
	
	
}
