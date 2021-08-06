/**
 * 
 */

/**
 * @author 20022824
 *
 */
public class Bill {
	private String ID;
	private String Date;
	private int dailyAmt;
	private int meal;
	private int drink;
	private int fruit;
	
	public Bill(String iD, String date, int dailyAmt, int meal, int drink, int fruit) {
		super();
		this.ID = iD;
		this.Date = date;
		this.dailyAmt = dailyAmt;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		
	}

	public String getID() {
		return ID;
	}

	public String getDate() {
		return Date;
	}

	public int getDailyAmt() {
		dailyAmt = meal + drink + fruit ;
		return dailyAmt;
	}

	public int getMeal() {
		return meal;
	}

	public int getDrink() {
		return drink;
	}
	
	public int getFruit() {
		return fruit;
	}
	
	
	
}
