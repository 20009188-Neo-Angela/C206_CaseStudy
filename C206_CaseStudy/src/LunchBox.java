public class LunchBox {
	
	private int orderID;
	private String meal;
	private String drink;
	private String fruit;
	private String day;
	private String date;
	
	public LunchBox(int orderID, String meal, String drink, String fruit, String day, String date) {
		
		this.orderID = orderID;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		this.day = day;
		this.date = date;
		
	}

	public int getOrderID() {
		return orderID;
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

	public String getDay() {
		return day;
	}

	public String getDate() {
		return date;
	}

}
