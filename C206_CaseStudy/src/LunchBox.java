public class LunchBox {
	
	private int orderID;
	private String date;
	private String meal;
	private String drink;
	private String fruit;
	
	public LunchBox(int orderID, String date, String meal, String drink, String fruit) {
		
		this.orderID = orderID;
		this.date = date;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		
	}

	public int getOrderID() {
		return orderID;
	}
	
	public String getDate() {
		return date;
	}

	public String getMeal() {
		return meal;
	}

	public String getDrink() {
		return drink;
	}

	public String getFruit() {
		return fruit;
	}
	
	public String toString(){
		// Write your codes here
		String lunchBoxInfo = String.format("%-10d %-16s %-25s %-15s %-15s",
				orderID,
				date,
				meal,
				drink,
				fruit);
		
		return lunchBoxInfo;
	}

}
