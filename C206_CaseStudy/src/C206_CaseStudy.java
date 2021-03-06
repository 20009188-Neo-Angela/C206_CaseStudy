
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator; 

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 6;
	private static final int OPTION_MONTHLY_BILLS = 5;
	private static final int OPTION_LUNCH_BOX_ORDERS = 4;
	private static final int OPTION_MONTHLY_MENU = 3;
	private static final int OPTION_USER_ACCOUNTS = 1;
	public static ArrayList<western> westernArr = new ArrayList<western>();
	public static ArrayList<asian> asianArr = new ArrayList<asian>();
	public static ArrayList<Vegetarian> vegetarianArr = new ArrayList<Vegetarian>();
	public static ArrayList<drinks> drinksArr = new ArrayList<drinks>();
	public static ArrayList<Fruits> fruitsArr = new ArrayList<Fruits>();
	public static ArrayList<Bill> orderBillArr = new ArrayList<Bill>();
 
	public static ArrayList<Menu> menuList = new ArrayList<Menu>();
	public static String monthlyMenu = "";

	public static void main(String[] args) {

		ArrayList<LunchBox> lunchBoxList = new ArrayList<LunchBox>();
		ArrayList<Bill> orderBillArr = new ArrayList<Bill>();
		ArrayList<Account> accountArr = new ArrayList<Account>();

		accountArr.add(new Account("Roy Tan", "schoolR0ck$", "4E4", "Credit Card, Account Credit"));
		accountArr.add(new Account("Hannah", "12345abc", "3E2", "Credit Card"));

		westernArr.add(new western("Fries", 4));
		westernArr.add(new western("Pizza", 2));
		westernArr.add(new western("Spaghetti", 2));
		westernArr.add(new western("Fish & Chips", 3));

		asianArr.add(new asian("Chilli Crab", 4));
		asianArr.add(new asian("Chicken Rice", 2));
		asianArr.add(new asian("Nasi Lemak", 3));
		asianArr.add(new asian("Cai Fan", 2));

		drinksArr.add(new drinks("Coke", 1));
		drinksArr.add(new drinks("Fanta", 1));
		drinksArr.add(new drinks("Sprite", 1));
		drinksArr.add(new drinks("Ayataka", 1));

		fruitsArr.add(new Fruits("Apple", 2));
		fruitsArr.add(new Fruits("Orange", 2));
		fruitsArr.add(new Fruits("WaterMelon", 2));
		fruitsArr.add(new Fruits("BlueBerry", 2));

		vegetarianArr.add(new Vegetarian("Vegi Burger", 2));
		vegetarianArr.add(new Vegetarian("Pumpkin Soup", 2));
		vegetarianArr.add(new Vegetarian("Vegetarian Meatball", 2));
		vegetarianArr.add(new Vegetarian("Cauliflower Rice", 2));

		orderBillArr.add(new Bill("t0326720i", "03/09", 9, 3, 3, 3));
		orderBillArr.add(new Bill("lol", "03/09", 12, 4, 4, 4));
		orderBillArr.add(new Bill("t0326720i", "03/09", 6, 2, 2, 2));
		
		
		int option = 0;

		while (option != OPTION_QUIT) {

			menu();
			option = Helper.readInt("Enter option: ");

			if (option == OPTION_USER_ACCOUNTS) {
				// Hannah User Account

				accountMenu();

				int accountOption = Helper.readInt("Enter option: ");

				if (accountOption == 1) {

					C206_CaseStudy.setHeader("Create Account");
					Account acc = inputAccount();
					C206_CaseStudy.addAccount(accountArr, acc);

				} else if (accountOption == 2) {
					C206_CaseStudy.setHeader("View Account");
					C206_CaseStudy.viewAccount(accountArr);

				} else if (accountOption == 3) {
					C206_CaseStudy.setHeader("DELETE ORDER BILL");
					C206_CaseStudy.deleteAccount(accountArr);

				} else {
					System.out.println("Invalid option!");
				}

			} else if (option == 2) {

				// Kidson Menu Items

				itemMenu();

				int itemOption = Helper.readInt("Enter option: ");

				if (itemOption == 1) {
					C206_CaseStudy.setHeader("VIEW");
					System.out.println(viewWestern(westernArr));
					System.out.println(viewAsian(asianArr));
					System.out.println(viewDrinks(drinksArr));
					System.out.println(viewFruits(fruitsArr));
					System.out.println(viewVege(vegetarianArr));

				} else if (itemOption == 2) {
					C206_CaseStudy.setHeader("DELETE");
					String category = Helper.readString("Choose a category to delete from: ");

					if (category.equalsIgnoreCase("western")) {
						String item = Helper.readString("Enter item to delete: ");
						for (int i = 0; i < westernArr.size(); i++) {
							if (item.equalsIgnoreCase(westernArr.get(i).getName())) {
								removeWestern(westernArr, westernArr.get(i));
							}
						}
						
					} else if (category.equalsIgnoreCase("asian")) {
						String item = Helper.readString("Enter item to delete: ");
						for (int i = 0; i < asianArr.size(); i++) {
							if (item.equalsIgnoreCase(asianArr.get(i).getName())) {
								removeAsian(asianArr, asianArr.get(i));
							}
						}

					} else if (category.equalsIgnoreCase("vegetarian")) {
						String item = Helper.readString("Enter item to delete: ");
						for (int i = 0; i < vegetarianArr.size(); i++) {
							if (item.equalsIgnoreCase(vegetarianArr.get(i).getName())) {
								removeVegetarian(vegetarianArr, vegetarianArr.get(i));
							}
						}
						
					} else if (category.equalsIgnoreCase("drinks")) {
						String item = Helper.readString("Enter item to delete: ");
						for (int i = 0; i < drinksArr.size(); i++) {
							if (item.equalsIgnoreCase(drinksArr.get(i).getName())) {
								removeDrinks(drinksArr, drinksArr.get(i));
							}
						}
						
					} else if (category.equalsIgnoreCase("fruits")) {
						String item = Helper.readString("Enter item to delete: ");
						for (int i = 0; i < fruitsArr.size(); i++) {
							if (item.equalsIgnoreCase(fruitsArr.get(i).getName())) {
								removeFruits(fruitsArr, fruitsArr.get(i));
							}
						}
						
					}

				} else if (itemOption == 3) {
					C206_CaseStudy.setHeader("ADD");
					String category = Helper.readString("Choose a category to add to: ");

					if (category.equalsIgnoreCase("western")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						western witem = new western(item, cost);
						addWestern(westernArr, witem);

					} else if (category.equalsIgnoreCase("asian")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						asian witem = new asian(item, cost);
						addAsian(asianArr, witem);

					} else if (category.equalsIgnoreCase("vegetarian")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						Vegetarian witem = new Vegetarian(item, cost);
						addVegetarian(vegetarianArr, witem);

					} else if (category.equalsIgnoreCase("drinks")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						drinks witem = new drinks(item, cost);
						addDrinks(drinksArr, witem);

					} else if (category.equalsIgnoreCase("fruits")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						Fruits witem = new Fruits(item, cost);
						addFruits(fruitsArr, witem);
					}
				}

			} else if (option == OPTION_MONTHLY_MENU) {
				// Ying Teng Monthly Menu

				monthlyMenu();

				int monthlyOption = Helper.readInt("Enter option to select Monthly Menu > ");

				if (monthlyOption == 1) {
					createMonthlyMenu();
					System.out.println("Menu Successfully Created!");

				} else if (monthlyOption == 2) {

					String menu = viewMonthlyMenu();
					System.out.println(menu);
					
					System.out.println("--------------------------------------");
					doLoop(menuList);
					
					for(int i=0; i<menuList.size(); i++) {
						System.out.println(menuList.get(i).getAsian());
					}
					
					System.out.println(menuList.size());

				} else if (monthlyOption == 3) {
					String output = deleteMonthlyMenu();
					System.out.println(output);

				} else if(monthlyOption == 4) {
					deleteDailyMenu(menuList);
					
				
				}else if(monthlyOption == 5) {
					updateDailyMenu(menuList);
					
				}else {
				
					System.out.println("Invalid option");
				}

			} else if (option == OPTION_LUNCH_BOX_ORDERS) {

				// Angela Lunch Box Order
				lunchBox();
				int choice = Helper.readInt("Enter option > ");

				if (choice == 1) {

					String menu = viewMonthlyMenu();
					System.out.println(menu);
					
					if (!monthlyMenu.isEmpty()) {
						
						C206_CaseStudy.setHeader("PLACE LUNCH BOX ORDERS");

						for (int i = 0; i < 5; i++) {

							LunchBox lb = inputLunchBox();
							System.out.println();
							addLunchBoxOrder(lunchBoxList, lb);
							System.out.println();

						}
						
					} else {
						
						System.out.println("Please CREATE a menu first!");
						
					}

				} else if (choice == 2) {

					C206_CaseStudy.setHeader("VIEW LUNCH BOX ORDERS");
					viewAllLunchBoxOrders(lunchBoxList);
					double price = 0;
					calculateTotalPrice(lunchBoxList, price);

				} else if (choice == 3) {

					C206_CaseStudy.setHeader("DELETE LUNCH BOX ORDERS");
					deleteLunchBoxOrder(lunchBoxList);

				} else if (choice == 4) {

					C206_CaseStudy.setHeader("UPDATE LUNCH BOX ORDERS");
					updateLunchBoxOrder(lunchBoxList);

				} else {

					System.out.println("Invalid Option!");

				}

			} else if (option == OPTION_MONTHLY_BILLS) {
				// Syazwan Bills

				menuBill();
				int billOptions = Helper.readInt("Enter option > ");

				if (billOptions == 1) {
					C206_CaseStudy.setHeader("CREATE ORDER BILL ");
					createOrderBill(orderBillArr, null);
				} else if (billOptions == 2) {
					C206_CaseStudy.setHeader("VIEW ORDER BILL");
					String orderBill = viewMonthlyBill(orderBillArr);
					System.out.println(orderBill);
				} else if (billOptions == 3) {
					C206_CaseStudy.setHeader("DELETE ORDER BILL");
					 dodeleteOrderBill(orderBillArr);
				} else {
					System.out.println("Invalid option!");
				}

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {

				System.out.println("Invalid option");
			}
		}
	}

	private static void menu() {
		C206_CaseStudy.setHeader("LUNCH BOX ORDERING APP");
		System.out.println("1. User Account");
		System.out.println("2. Menu Items");
		System.out.println("3. Monthly Menu");
		System.out.println("4. Lunch Box Order");
		System.out.println("5. Bill");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	private static void accountMenu() {
		System.out.println("1. Create Account");
		System.out.println("2. View Account");
		System.out.println("3. Delete Account");
	}

	private static void itemMenu() {
		System.out.println("1. Show all Inside Menu Bank");
		System.out.println("2. Remove an Item from Menu Bank");
		System.out.println("3. Add an Item into Menu Bank");
	}

	private static void monthlyMenu() {
		System.out.println("1. Create Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Delete Monthly Menu");
		System.out.println("4. Delete Daily Menu");
		System.out.println("5. Edit Daily Menu");
	}

	private static void lunchBox() {
		C206_CaseStudy.setHeader("LUNCH BOX SELECTION");
		System.out.println("1. Add/Place Lunch Box Order");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete/Cancel Lunch Box Order");
		System.out.println("4. Update Lunch Box Order\n");
	}

	private static void menuBill() {
		System.out.println("1. Create Order Bill ");
		System.out.println("2. View Order Bill ");
		System.out.println("3. Delete Order Bill");
	} 

	// ================================================= OPTION 1 USER ACCOUNT
	// ============================================//

	// Add user account
	public static Account inputAccount() {

		String username = Helper.readString("Enter username: ");
		String password = Helper.readString("Enter password: ");
		String formClass = Helper.readString("Enter Form Class: ");
		String paymentMethods = Helper.readString("Enter Payment Methods: ");

		Account acc = new Account(username, password, formClass, paymentMethods);
		return acc;
	}

	public static void addAccount(ArrayList<Account> accountArr, Account acc) {
		accountArr.add(acc);
		System.out.println("User Account Created!");
	}

	// View User Account

	public static String retrieveAccount(ArrayList<Account> accountArr) {
		String output = "";

		for (Account a : accountArr) {

			output += String.format("%-50s \n", a.toString() );
		}
		return output;
	}

	public static void viewAccount(ArrayList<Account> accountArr) {
		String output = String.format("%-10s %-15s %-12s %-10s \n", "USERNAME", "PASSWORD", "FORM CLASS",
				"PAYMENT METHOD");
		output += retrieveAccount(accountArr);
		System.out.println(output);
	}

	// Delete User Account
	public static String retrieveAccount2s(ArrayList<Account> accountArr) {
		String output = "";

		for (Account a : accountArr) {

			output += String.format("%-50s \n", a.toString() );
		}
		return output;
	}

	public static void deleteAccount(ArrayList<Account> accountArr) {

		// Using this method because I cant remove while iterating.

		Iterator<Account> itr = accountArr.iterator();
		String username = Helper.readString("Enter username: ");
		String password = Helper.readString("Enter password: ");
		while (itr.hasNext()) {
			Account a = itr.next();
			if (username.equals(a.getUsername()) && password.equals(a.getPassword())) {
				itr.remove();

				System.out.println("Account Deleted.");
			}
		}
	}

	// ================================================ OPTION 2 MENU ITEMS
	// ===============================================//
	// View items From menu bank
	public static String viewWestern(ArrayList<western> westernArr) {
		String output = "";

		for (western i : westernArr) {
			output += String.format("Western: %10s Price: $%d \n", i.getName(), i.getPrice());
		}

		return output;
	}

	public static String viewAsian(ArrayList<asian> asianArr) {
		String output = "";

		for (asian i : asianArr) {
			output += String.format("Asian: %10s Price: $%d \n", i.getName(), i.getPrice());
		}

		return output;
	}

	public static String viewDrinks(ArrayList<drinks> drinksArr) {
		String output = "";

		for (drinks i : drinksArr) {
			output += String.format("Drinks: %10s Price: $%d \n", i.getName(), i.getPrice());
		}

		return output;
	}

	public static String viewFruits(ArrayList<Fruits> fruitsArr) {
		String output = "";

		for (Fruits i : fruitsArr) {
			output += String.format("Fruits: %10s Price: $%d \n", i.getName(), i.getPrice());
		}

		return output;
	}

	public static String viewVege(ArrayList<Vegetarian> vegetarianArr) {
		String output = "";

		for (Vegetarian i : vegetarianArr) {
			output += String.format("Vegetarian: %10s Price: $%d\n", i.getName(), i.getPrice());
		}

		return output;
	}

	// Delete Items from menu bank
	public static void removeWestern(ArrayList<western> westernArr, western item) {
		westernArr.remove(item);
		System.out.println("Item deleted!");
	}

	public static void removeAsian(ArrayList<asian> asianArr, asian item) {
		asianArr.remove(item);
		System.out.println("Item deleted!");
	}

	public static void removeVegetarian(ArrayList<Vegetarian> vegetarianArr, Vegetarian item) {
		vegetarianArr.remove(item);
		System.out.println("Item deleted!");
	}

	public static void removeDrinks(ArrayList<drinks> drinksArr, drinks item) {
		drinksArr.remove(item);
		System.out.println("Item deleted!");
	}

	public static void removeFruits(ArrayList<Fruits> fruitsArr, Fruits item) {
		fruitsArr.remove(item);
		System.out.println("Item deleted!");
	}

	// Add items into menu bank
	public static void addWestern(ArrayList<western> westernArr, western item) {
		westernArr.add(item);
		System.out.println("Western added");

	}

	public static void addAsian(ArrayList<asian> asianArr, asian item) {
		asianArr.add(item);
		System.out.println("Asian added");

	}

	public static void addVegetarian(ArrayList<Vegetarian> vegetarianArr, Vegetarian item) {
		vegetarianArr.add(item);
		System.out.println("Vegetarian added");

	}

	public static void addDrinks(ArrayList<drinks> drinksArr, drinks item) {
		drinksArr.add(item);
		System.out.println("Drinks added");

	}

	public static void addFruits(ArrayList<Fruits> fruitsArr, Fruits item) {
		fruitsArr.add(item);
		System.out.println("Fruits added");

	}

	// ================================================ OPTION 3 MONTHLY MENU
	// =============================================//

	public static String randomWestern() {
		Random rand = new Random();
		int randomInt = rand.nextInt(westernArr.size());
		return westernArr.get(randomInt).getName();

	}

	public static String randomAsian() {
		Random rand = new Random();
		int randomInt = rand.nextInt(asianArr.size());
		return asianArr.get(randomInt).getName();

	}

	public static String randomVegetarian() {
		Random rand = new Random();
		int randomInt = rand.nextInt(vegetarianArr.size());
		return vegetarianArr.get(randomInt).getName();

	}

	public static String randomDrink() {
		Random rand = new Random();
		int randomInt = rand.nextInt(drinksArr.size());
		return drinksArr.get(randomInt).getName();

	}

	public static String randomFruit() {
		Random rand = new Random();
		int randomInt = rand.nextInt(fruitsArr.size());
		return fruitsArr.get(randomInt).getName();

	}

	public static String createMonthlyMenu() {

		int year = Helper.readInt("Enter year: ");
		int firstDay = Helper.readInt("Enter first day of the month(1(Mon)-7 (Sun)): ");
		int month = Helper.readInt("Enter month (1-12): ");

		int[] days = {
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		String[] months = {
				"JANUARY", "FEBRUARY", "MARCH",
				"APRIL", "MAY", "JUNE",
				"JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER"
		};

		String[] dayname = {
				"", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday",
				"Sunday"
		};



		// print calendar header
		// Display the month and year
		monthlyMenu = ("\n        "+ months[month-1] + " " + year+ "\n");

		// Display the lines
		monthlyMenu += (" __________________________________\n\n");

		int maxday = 5;
		int fullweek = 7;

		for (int i = 1, j = firstDay; i <= days[month]; i++, j++) {
		if (j <= maxday) {
			String Western = randomWestern();
			String Asian = randomAsian();
			String Vegetarian = randomVegetarian();
			String Drink1 = randomDrink();
			String Drink2 = randomDrink();
			String Fruit1 = randomFruit();
			String Fruit2 = randomFruit();
			
			monthlyMenu += String.format("%5d ", i);
			monthlyMenu += months[month-1];
			monthlyMenu += "  (" + dayname[j] + ")\n"; 
			monthlyMenu += "  --------------------------\n";

			monthlyMenu += String.format("     %5s: %s \n", "Western",  Western);
			monthlyMenu += String.format("     %5s: %s \n", "Asian",  Asian);
			monthlyMenu += String.format("     %5s: %s \n", "Vegetarian",  Vegetarian);
			monthlyMenu += String.format("     %5s: %s \n", "Drinks",  Drink1);
			monthlyMenu += String.format("     %5s: %s \n", "Drinks",  Drink2);
			monthlyMenu += String.format("     %5s: %s \n", "Fruit",  Fruit1);
			monthlyMenu += String.format("     %5s: %s \n\n", "Fruit",  Fruit2);
			
			Menu mm = new Menu(i, Western, Asian, Vegetarian, Drink1, Drink2, Fruit1, Fruit2);
			addDailyMenu(menuList, mm);
					
		}

				if (j > maxday && j <= fullweek) {
					monthlyMenu += String.format("%5d ", i);
					monthlyMenu += months[month - 1];

					monthlyMenu += "  (" + dayname[j] + ")\n";
					monthlyMenu += "  --------------------------\n";
					monthlyMenu += "     WEEKEND!\n\n";

				}
				if (j == fullweek) {
					j = 0;
				}
			}
		

		return monthlyMenu;
}
	
	public static void addDailyMenu(ArrayList<Menu> menuList, Menu mm) {
		
       menuList.add(mm);
//       System.out.println("add!");
//       System.out.println(menuList.size());
//       for(int i =0; i< menuList.size(); i++) {
//       System.out.println(i);
//       }
       System.out.println("Menu Added!");

	}
 
	public static String viewMonthlyMenu() {
		String output = "";
		if (monthlyMenu.isEmpty()) {
			output = "There is no menu to view!";

		} else {
			C206_CaseStudy.setHeader("MONTHLY MENU");
			output = monthlyMenu;
		}
		return output;
	}

	  public static String deleteMonthlyMenu() {
		    String output = "";
		    if (monthlyMenu.isEmpty()) {
		      output = "There is no menu to delete!";

		    } else {
		      monthlyMenu = "";
		      output = "Monthly Menu deleted!";
		      doDeleteMonthlyMenu(menuList);
		      System.out.println("delete");
		      System.out.println(menuList.size());
		    }
		    return output;
		  }
	  
	  
	  
	  public static void doDeleteMonthlyMenu(ArrayList<Menu> menuList) {
		  menuList.clear();
		  System.out.println("Monthly Menu Deleted!");
		}
	  
	  
		public static void deleteDailyMenu(ArrayList<Menu> menuList) {

			System.out.println(viewMonthlyMenu());

			int index = Helper.readInt("Enter day to cancel order > ");
			//menuList.remove(index-1);
			doDeleteDailyMenu(menuList, index);
			System.out.println("Day Menu delete!");
			System.out.println(menuList.size());
		} 
		
		public static void doDeleteDailyMenu(ArrayList<Menu> menuList, int index) {
			menuList.remove(index-1);
			System.out.println("Daily Menu Deleted!");
		}
		 
		public static void updateDailyMenu(ArrayList <Menu> menuList) {
			
			System.out.println(viewMonthlyMenu());
			int index = Helper.readInt("Enter day to edit menu > ");
			index = index - 1;
			System.out.println(menuList.get(index));
			int userID = Helper.readInt("Enter ID > ");
			String userWestern = Helper.readString("Enter Western Dish > ");
			String userAsian = Helper.readString("Enter Asian Dish > ");
			String userVeg = Helper.readString("Enter Vegetarian Dish > ");
			String userDrink1 = Helper.readString("Enter Drink 1 > ");
			String userDrink2 = Helper.readString("Enter Drink 2 > ");
			String userFruit1 = Helper.readString("Enter Fruit 1  > ");
			String userFruit2 = Helper.readString("Enter Fruit 2 >");
			
			char confirm = Helper.readChar("Confirm Changes? (Y/N) ");
			
			if ((confirm == 'Y') || (confirm == 'y')) {
				doEditDailyMenu(menuList,index , userID, userWestern, userAsian, userVeg, userDrink1, userDrink2, userFruit1, userFruit2);
				System.out.println("Successfully Updated!");
	
				System.out.println(menuList.get(index).toString());
				
			}
		}
		
		public static void doLoop (ArrayList <Menu> menuList) {
			for (int i=0; i<menuList.size(); i++) {
				System.out.println(menuList.get(i).toString());
			}
		}
			
		public static void doEditDailyMenu(ArrayList<Menu> menuList, int index, int userID, String userWestern, String userAsian, String userVeg, String userDrink1, 
					String userDrink2, String userFruit1, String userFruit2 ) {
			System.out.println(menuList.get(index).toString());
			menuList.get(index).setID(userID);
			menuList.get(index).setWestern(userWestern);
			menuList.get(index).setAsian(userAsian);
			menuList.get(index).setVegetarian(userVeg);
			menuList.get(index).setDrink1(userDrink1);
			menuList.get(index).setDrink2(userDrink2);
			menuList.get(index).setFruit1(userFruit1);
			menuList.get(index).setFruit2(userFruit2);
			System.out.println(menuList.get(index).toString());
			System.out.println("Daily Menu Edit Successful");
			}
			

		//================================================= OPTION 4 LUNCH BOX ORDER =========================================//
		public static LunchBox inputLunchBox() {

			int orderID = Helper.readInt("Enter order ID > ");
			String date = Helper.readString("Enter date (yyyy-mm-dd) > ");
			String meal = Helper.readString("Enter meal > ");
			String drink = Helper.readString("Enter drink > ");
			String fruit = Helper.readString("Enter fruit > ");
			double price = Helper.readDouble("Enter total price > $");


			LunchBox lb = new LunchBox(orderID, LocalDate.parse(date), meal, drink, fruit, price);
			return lb;

		}

		public static void addLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, LunchBox lb) {

			if (!lb.getMeal().isEmpty() && !lb.getDrink().isEmpty() && !lb.getFruit().isEmpty() && lb.getPrice() > 0) {

				lunchBoxList.add(lb);
				System.out.println("Successfully placed a lunch box order!");

			} else {

				System.out.println("Please fill in all the fields!");

			}

		}

		public static void calculateTotalPrice(ArrayList<LunchBox> lunchBoxList, double price) {

			double sum = 0;

			for (LunchBox i : lunchBoxList) {
				sum += i.getPrice();
			}
			System.out.println(String.format("Total price: $%.2f", sum));
		}

		public static String retrieveAllLunchBoxOrders(ArrayList<LunchBox> lunchBoxList) {
			String output = "";

			for (int i = 0; i < lunchBoxList.size(); i++) {

				output += String.format("%-85s \n", lunchBoxList.get(i).toString());
			}
			return output;
		}

		public static void viewAllLunchBoxOrders(ArrayList<LunchBox> lunchBoxList) {
			String output = String.format("%-10s %-16s %-25s %-15s %-15s\n", "ORDER ID", "DATE", "MEAL", "DRINK", "FRUIT");
			output += retrieveAllLunchBoxOrders(lunchBoxList);
			System.out.println(output);
		}

		public static boolean doFoundLunchBoxOrderID(ArrayList<LunchBox> lunchBoxList, int orderID) {
			boolean isFound = false;

			for (int i = 0; i < lunchBoxList.size(); i++) {
				if (orderID == lunchBoxList.get(i).getOrderID()) {
					isFound = true;
				}
			}
			return isFound;

		}

		public static int calculateDays(String date) {

			int days = LocalDate.parse(date).getDayOfYear() - LocalDate.now().getDayOfYear();

			return days;

		}

		public static boolean doDeleteLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, int orderID, String date) {
			boolean isDelete = false;

			for (int i = 0; i < lunchBoxList.size(); i++) {
				if (orderID == lunchBoxList.get(i).getOrderID() &&
						calculateDays(date) >= 3) {
					lunchBoxList.remove(lunchBoxList.get(i));
					isDelete = true;
				}
			}
			return isDelete;

		}

		public static void deleteLunchBoxOrder(ArrayList<LunchBox> lunchBoxList) {

			viewAllLunchBoxOrders(lunchBoxList);

			int orderID = Helper.readInt("Enter order ID to cancel the lunch box order > ");

			Boolean isFound = doFoundLunchBoxOrderID(lunchBoxList, orderID);

			if (isFound == false) {

				System.out.println("Invalid Lunch Box Order!");

			} else {

				String date = Helper.readString("Enter date (yyyy-mm-dd) > ");

				char confirm = Helper.readChar("Do you really want to cancel the lunch box order? (Y/N) > ");

				if (confirm == 'y' || confirm == 'Y') {

					Boolean isDelete = doDeleteLunchBoxOrder(lunchBoxList, orderID, date);

					if (isDelete == false) {
						System.out.println("Cancellation FAILED!");
					} else {

						System.out.println("Lunch Box with Order ID " + orderID + " is successfully cancelled!");

					}

				} else {

					System.out.println("No lunch box order is being deleted!");

				}

			}

		}

		public static boolean doUpdateLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, int orderID, String date, String meal,
				String drink, String fruit, double price) {
			boolean isUpdated = false;

			for (int i = 0; i < lunchBoxList.size(); i++) {
				if (orderID == lunchBoxList.get(i).getOrderID() && !date.isEmpty() &&
						!meal.isEmpty() && !drink.isEmpty() && !fruit.isEmpty() && price > 0) {

					lunchBoxList.get(i).setDate(LocalDate.parse(date));
					lunchBoxList.get(i).setMeal(meal);
					lunchBoxList.get(i).setDrink(drink);
					lunchBoxList.get(i).setFruit(fruit);
					lunchBoxList.get(i).setPrice(price);

					isUpdated = true;

				}
			}
			return isUpdated;
		}

		public static void updateLunchBoxOrder(ArrayList<LunchBox> lunchBoxList) {

			viewAllLunchBoxOrders(lunchBoxList);

			int orderID = Helper.readInt("Enter order ID to update the lunch box order > ");

			Boolean isFound = doFoundLunchBoxOrderID(lunchBoxList, orderID);

			if (isFound == false) {

				System.out.println("Invalid Lunch Box Order!");

			} else {

				char confirm = Helper.readChar("Do you really want to update the lunch box order? (Y/N) > ");


				if (confirm == 'y' || confirm == 'Y') {

					String date = Helper.readString("\nEnter new date (yyyy-mm-dd) > ");
					String meal = Helper.readString("Enter new meal > ");
					String drink = Helper.readString("Enter new drink > ");
					String fruit = Helper.readString("Enter new fruit > ");
					double price = Helper.readDouble("Enter total price > $");

					Boolean isUpdated = doUpdateLunchBoxOrder(lunchBoxList, orderID, date, meal, drink, fruit, price);

					if (isUpdated == false) {
						System.out.println("Update FAILED!");
					} else {
						System.out.println("Lunch Box with Order ID " + orderID + " is successfully updated!");
					}

				} else {

					System.out.println("No lunch box order is being updated!");

				}

			}

		}



	// ================================================ OPTION 5 BILL
	// =====================================================//
	public static Bill inputBill() {
		String userId = Helper.readString("Enter userId > ");
		String dateOrdered = Helper.readString("Enter month in this format : dd/MM > ");
		int orderedMeal = Helper.readInt("Enter the price of the meal > ");
		int orderedDrink = Helper.readInt("Enter the price of the drinks > ");
		int orderedFruit = Helper.readInt("Enter the price of fruits > ");

		int dailyAmt = orderedMeal + orderedDrink + orderedFruit;

		Bill b1 = new Bill(userId, dateOrdered, dailyAmt, orderedMeal, orderedDrink, orderedFruit);
		return b1;
	}

	public static void createOrderBill(ArrayList<Bill> orderBillArr, Bill b1) {

		orderBillArr.add(b1);

		System.out.println("Order Bill Added!");
	}

	public static String viewMonthlyBill(ArrayList<Bill> orderBillArr) {

		String output = " ";
		int sumDailyAmt = 0;
		output = String.format("%-10s %-10s %-10s \n", "USERID", "DATE", "TOTAL AMOUNT");
		for (Bill b : orderBillArr) {
			// monthlybill = orderBillArr + sum(DailyAmt)
			sumDailyAmt += b.getDailyAmt();
			output += String.format("%-10s %-10s %-15d \n", b.getID(), b.getDate(), b.getDailyAmt());

		}
		return output;
	}


	public static boolean deleteOrderBill(ArrayList<Bill> orderBillArr, String userId) {
		// boolean isFound to check whether the conditions are met
		boolean isFound = false;

		for (int i = 0; i < orderBillArr.size(); i++) {
			if (orderBillArr.get(i) != null && orderBillArr.get(i).getID().equals(userId)) {
				orderBillArr.remove(i);
				isFound = true;
				break;
			}
		}
		return isFound;
		
		}
	
	public static void dodeleteOrderBill(ArrayList<Bill>orderBillArr) {
		String userId = Helper.readString("Enter userId to delete > ");
		
		Boolean isFound = deleteOrderBill(orderBillArr, userId);
		
		if (isFound == false) {
			System.out.println("User ID not found!");
		} else {
			viewMonthlyBill(orderBillArr);
			System.out.println("Username: " + userId + " is deleted");
		}

	}
}