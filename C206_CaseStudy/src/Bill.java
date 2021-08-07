/**
 * 
 */

/**
 * @author 20022824
 *
 */
public class Bill {
	private String ID;
	private String date;
	private int dailyAmt;
	private int meal;
	private int drink;
	private int fruit;
	
	public Bill(String ID, String date, int dailyAmt, int meal, int drink, int fruit) {
		super();
		this.ID = ID;
		this.date = date;
		this.dailyAmt = dailyAmt;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		
	}
	public String toString() {
			String BillInfo = String.format("%-10s %-10s %-15d \n", ID, date, dailyAmt);
				
		// Write your codes here
		return BillInfo;
	}


	public String getID() {
		return ID;
	}

	public String getDate() {
		return date;
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
	
	public void setDailyAmt(int dailyAmt) {
		this.dailyAmt = dailyAmt;
	}
	
	
	
}
