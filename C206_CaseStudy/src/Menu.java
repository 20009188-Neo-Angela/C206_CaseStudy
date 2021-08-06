
public class Menu {
	

	private String Western;
	private String Asian;
	private String Vegetarian;
	private String Drink1;
	private String Drink2;
	private String Fruit1;
	private String Fruit2;
	 
	
	public Menu(String Western, String Asian, String Vegetarian, String Drink1, String Drink2, String Fruit1, String Fruit2) {
	
		this.Western = Western;
		this.Asian = Asian;
		this.Vegetarian = Vegetarian;
		this.Drink1 = Drink1;
		this.Drink2 = Drink2;
		this.Fruit1 = Fruit1;
		this.Fruit2 = Fruit2;
		 
	} 
	
	
	public String getWestern() {
		return Western;
	} 
	
	public String getAsian() {
		return Asian;
	}
	
	public String getVegetarian() {
		return Vegetarian;
	}
	
	public String getDrink1() {
		return Drink1;
	}
	
	public String getDrink2() {
		return Drink2;
	}
	
	public String getFruit1() {
		return Fruit1;
	}
	
	public String getFruit2() {
		return Fruit2;
	}
	
	
	public String toString() {
		String dailyInfo = String.format("     %5s: %s \n", "Western",  Western);
		dailyInfo += String.format("     %5s: %s \n", "Asian",  Asian);
		dailyInfo += String.format("     %5s: %s \n", "Vegetarian",  Vegetarian);
		dailyInfo += String.format("     %5s: %s \n", "Drinks",  Drink1);
		dailyInfo += String.format("     %5s: %s \n", "Drinks",  Drink2);
		dailyInfo += String.format("     %5s: %s \n", "Fruit",  Fruit1);
		dailyInfo += String.format("     %5s: %s \n\n", "Fruit",  Fruit2);

		return dailyInfo;
	}
}
