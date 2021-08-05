public class LunchBox {
	
	private int id;
	private String name;
	private double amount;
	
	public LunchBox(int id, String name, double amount) {
		
		this.id = id;
		this.name = name;
		this.amount = amount;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

}
