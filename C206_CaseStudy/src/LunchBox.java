import java.time.LocalDate;

public class LunchBox {
	
	private int orderID;
	private String date;
	private String meal;
	private String drink;
	private String fruit;
	private double price;
	
	public LunchBox(int orderID, String date, String meal, String drink, String fruit, double price) {
		
		this.orderID = orderID;
		this.date = date;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		this.price = price;
		
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

	public void setDate(String date) {
		this.date = date;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
