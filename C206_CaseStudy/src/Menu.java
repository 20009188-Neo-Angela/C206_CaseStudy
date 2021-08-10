
public class Menu {
	
	private int ID;
	private String Western;
	private String Asian;
	private String Vegetarian; 
	private String Drink1;
	private String Drink2;
	private String Fruit1;
	private String Fruit2; 
	
	
	
	public Menu(int ID, String Western, String Asian, String Vegetarian, String Drink1, String Drink2, String Fruit1, String Fruit2) {
		
		this.ID = ID;
		this.Western = Western;
		this.Asian = Asian;
		this.Vegetarian = Vegetarian; 
		this.Drink1 = Drink1;
		this.Drink2 = Drink2;
		this.Fruit1 = Fruit1;
		this.Fruit2 = Fruit2;
		 
	} 
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getWestern() {
		return Western;
	} 
	
	public void setWestern(String Western) {
		this.Western = Western;
	}
	
	
	public String getAsian() {
		return Asian;
	}
	
	public void setAsian(String Asian) {
		this.Asian = Asian;
	}
	
	public String getVegetarian() {
		return Vegetarian;
	}
	
	public void setVegetarian(String Vegetarian) {
		this.Vegetarian = Vegetarian;
	}
	
	
	public String getDrink1() {
		return Drink1;
	}
	
	public void setDrink1(String Drink1) {
		this.Drink1 = Drink1;
	}
	
	public String getDrink2() {
		return Drink2;
	}
	
	public void setDrink2(String Drink2) {
		this.Drink2 = Drink2;
	}
	
	public String getFruit1() {
		return Fruit1;
	}
	
	public void setFruit1(String Fruit1) {
		this.Fruit1 = Fruit1;
	}
	
	public String getFruit2() {
		return Fruit2;
	}
	
	public void setFruit2(String Fruit2) {
		this.Fruit2 = Fruit2;
	}
	
	
	public String toString() {
		String dailyInfo = String.format("     %5s: %s \n", "ID",  ID);
		dailyInfo += String.format("     %5s: %s \n", "Western",  Western);
		dailyInfo += String.format("     %5s: %s \n", "Asian",  Asian);
		dailyInfo += String.format("     %5s: %s \n", "Vegetarian",  Vegetarian);
		dailyInfo += String.format("     %5s: %s \n", "Drinks",  Drink1);
		dailyInfo += String.format("     %5s: %s \n", "Drinks",  Drink2);
		dailyInfo += String.format("     %5s: %s \n", "Fruit",  Fruit1);
		dailyInfo += String.format("     %5s: %s \n\n", "Fruit",  Fruit2);

		return dailyInfo;
	}
}
