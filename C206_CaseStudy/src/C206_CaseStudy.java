
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class C206_CaseStudy { 
	
	private static final int OPTION_QUIT = 6;
	public static ArrayList<western> westernArr = new ArrayList<western>();
	public static ArrayList<asian> asianArr = new ArrayList<asian>();
	public static ArrayList<Vegetarian> vegetarianArr = new ArrayList<Vegetarian>();
	public static ArrayList<drinks> drinksArr = new ArrayList<drinks>();
	public static ArrayList<Fruits> fruitsArr = new ArrayList<Fruits>();
	
	public static ArrayList<Menu> menuList = new ArrayList<Menu>();
	public static String monthlyMenu ="";
	
	public static void main(String[] args) { 
		
		
		ArrayList<LunchBox> lunchBoxList = new ArrayList<LunchBox>();
		ArrayList<Bill> orderBillArr = new ArrayList<Bill>();
		ArrayList<Account> accountArr = new ArrayList <Account> ();
		
		accountArr.add(new Account("Roy Tan", "schoolR0ck$", "4E4","Credit Card, Account Credit"));
		accountArr.add(new Account("Hannah", "12345abc", "3E2","Credit Card"));


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
		vegetarianArr.add(new Vegetarian("Cauliflower RiceA", 2));

		orderBillArr.add(new Bill("t0326720i","drinks", 1000 , "01/2012"));
		orderBillArr.add(new Bill("lol", "western", 1500, "02/2021"));
		int option = 0;
		
		while (option != OPTION_QUIT) {
			
			menu();
			option = Helper.readInt("Enter option: ");
			
			if(option == 1) {
				// Hannah User Account 
				accountMenu();
				
				int accountOption = Helper.readInt("Enter option: ");
				
				if(accountOption ==1 ) {
					C206_CaseStudy.setHeader("Create Account");
					Account acc = inputAccount();
					C206_CaseStudy.addAccount(accountArr, acc);
					
					}else if (accountOption == 2 ) {
						C206_CaseStudy.setHeader("View Account");
						C206_CaseStudy.viewAccount(accountArr);
						
					}else if (accountOption == 3) {
						C206_CaseStudy.setHeader("DELETE ORDER BILL");
						C206_CaseStudy.deleteAccount(accountArr);
						
					}else {
						System.out.println("Invalid option!");
					}
					
					
				}
				
		else if (option == 2) {
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
						for (western i : westernArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (i.getName().equalsIgnoreCase(item)) {
								removeWestern(westernArr, i);
							}
							
						}

					} else if (category.equalsIgnoreCase("asian")) {
						for (asian i : asianArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (i.getName().equalsIgnoreCase(item)) {
								removeAsian(asianArr, i);
							}
								
						}
					} else if (category.equalsIgnoreCase("drinks")) {

						for (drinks i : drinksArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (i.getName().equalsIgnoreCase(item)) {
								removeDrinks(drinksArr, i);
							}
						}
					} else if (category.equalsIgnoreCase("fruits")) {
						for (Fruits i : fruitsArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (i.getName().equalsIgnoreCase(item)) {
								removeFruits(fruitsArr, i);
							}

							
						}
					}
					
					

				} else if (itemOption == 3) {
					C206_CaseStudy.setHeader("ADD");
					String category = Helper.readString("Choose a category to add to: ");

					if (category.equalsIgnoreCase("western")) {
						String item = Helper.readString("Choose a item to add: ");
						int cost = Helper.readInt("Price of the item: ");
						western itemw = new western(item, cost);
						addWestern(westernArr, itemw);

					} else if (category.equalsIgnoreCase("asian")) {
						for (asian i : asianArr) {
							String item = Helper.readString("Choose a item to add: ");
							int cost = Helper.readInt("Price of the item: ");
							asian itemw = new asian(item, cost);
							addAsian(asianArr, itemw);
						}
					} else if (category.equalsIgnoreCase("drinks")) {

						for (drinks i : drinksArr) {
							String item = Helper.readString("Choose a item to add: ");
							int cost = Helper.readInt("Price of the item: ");
							drinks itemw = new drinks(item, cost);
							addDrinks(drinksArr,itemw);
							
						}
					} else if (category.equalsIgnoreCase("fruits")) {
						for (Fruits i : fruitsArr) {
							String item = Helper.readString("Choose a item to add: ");
							int cost = Helper.readInt("Price of the item: ");
							Fruits itemw = new Fruits(item, cost);
							addFruits(fruitsArr, itemw);
						}

					}else if (category.equalsIgnoreCase("vegetarian")) {
						for (Vegetarian i : vegetarianArr) {
							String item = Helper.readString("Choose a item to add: ");
							int cost = Helper.readInt("Price of the item: ");
							Vegetarian itemw = new Vegetarian(item, cost);
							addVegetarian(vegetarianArr, itemw);
									
						}
					}
					
				
				}
				
			}else if (option == 3) {
				//Ying Teng Monthly Menu
				monthlyMenu();
				
				int monthlyOption = Helper.readInt("Enter option to select Monthly Menu > ");
				
				if(monthlyOption == 1 ) {
					createMonthlyMenu();
					System.out.println("Menu Successfully Created!");

								
				}else if (monthlyOption == 2) {
					
					String menu = viewMonthlyMenu();
					System.out.println(menu);
					for (int i = 0; i < menuList.size(); i++) {
			            System.out.println(menuList.get(i).getDay());
			            System.out.println(menuList.get(i).getWestern());
			            
			          }
					
	
				}else if (monthlyOption == 3) {
					String output = deleteMonthlyMenu();
					System.out.println(output);
					
					
					
				}else {
					System.out.println("Invalid option");
				}
						
				
				
				
			}else if (option == 4) {
				// Angela Lunch Box Order
				lunchBox();
				
				int choice = Helper.readInt("Enter option > ");
				
				if (choice == 1) {
					
					String menu = viewMonthlyMenu();
					System.out.println(menu);
					
					C206_CaseStudy.setHeader("PLACE LUNCH BOX ORDERS");
					
					for (int i = 0; i < 5; i++) {
						
						LunchBox lb = inputLunchBox();
						System.out.println();
						addLunchBoxOrder(lunchBoxList, lb);
						System.out.println();
						
					}
					
					
				} else if (choice == 2) {
					
					C206_CaseStudy.setHeader("VIEW LUNCH BOX ORDERS");
					viewAllLunchBoxOrders(lunchBoxList);
					
				} else if (choice == 3) {
					
					C206_CaseStudy.setHeader("DELETE LUNCH BOX ORDERS");
					deleteLunchBoxOrders(lunchBoxList);
					
					
					
				} else {
					
					System.out.println("Invalid Option!");
					
				}
				
				
				
				
			}else if (option == 5) {
				// Syazwan Bills 
				menuBill();
				int billOptions = Helper.readInt("Enter option > ");
				
				if (billOptions == 1) {
					C206_CaseStudy.setHeader("CREATE ORDER BILL ");
					createOrderBill(orderBillArr);
				}else if (billOptions == 2 ) {
					C206_CaseStudy.setHeader("VIEW ORDER BILL");
					String orderBill = viewOrderBill(orderBillArr);
					System.out.println(orderBill);
				}else if (billOptions == 3) {
					C206_CaseStudy.setHeader("DELETE ORDER BILL");
					deleteOrderBill(orderBillArr);
				}else {
					System.out.println("Invalid option!");
				}
				
			}else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			}else {
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
	}
	
	private static void lunchBox() {
		C206_CaseStudy.setHeader("LUNCH BOX SELECTION");
		System.out.println("1. Add/Place Lunch Box Order");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete/Cancel Lunch Box Order");
	}
	
	private static void menuBill() {
		System.out.println("1. Create Order Bill ");
		System.out.println("2. View Order Bill ");
		System.out.println("3. Delete Order Bill");
	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
	
	// Add user account
	public static Account inputAccount () {
		
		String username = Helper.readString("Enter username: ");
		String password = Helper.readString("Enter password: ");
		String formClass = Helper.readString("Enter Form Class: ");
		String paymentMethods = Helper.readString("Enter Payment Methods: ");
		
		
		Account acc = new Account(username,password, formClass, paymentMethods);
		return acc;
	}
	
	public static void addAccount(ArrayList<Account> accountList, Account acc) {
		accountList.add(acc);
		System.out.println("User Account Created!");
	}
	
	// View User Account
	
	public static String retrieveAccount(ArrayList<Account> accountArr) {
		String output = "";

		for (Account a : accountArr ) {

			output += String.format("%-10s %-15s %-12s %-10s\n", a.getUsername(), a.getPassword(),a.getFormClass(),a.getPaymentMethods());
		}
		return output;
	}
	public static void viewAccount(ArrayList<Account> accountArr) {
		String output = String.format("%-10s %-15s %-12s %-10s \n", "USERNAME", "PASSWORD",
				"FORM CLASS", "PAYMENT METHOD");
		 output += retrieveAccount(accountArr);	
		System.out.println(output);
	}
	
	// Delete User Account
	public static String retrieveAccount2s(ArrayList<Account> accountArr) {
		String output = "";

		for (Account a : accountArr ) {

			output += String.format("%-10s %-15s %-12s %-10s\n", a.getUsername(), a.getPassword(),a.getFormClass(),a.getPaymentMethods());
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
			if(username.equals(a.getUsername())&& password.equals(a.getPassword() )) { 
				itr.remove(); } 
		}		
	}
	
	
	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
	//View items From menu bank
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
	
	//Delete Items from menu bank
	public static void removeWestern(ArrayList<western> westernArr, western cc) {
		westernArr.remove(cc);
		System.out.println("Western Removed!");
	}

	public static void removeAsian(ArrayList<asian> asianArr, asian cc) {
		asianArr.remove(cc);
		System.out.println("Asian removed!");
	}

	public static void removeVegetarian(ArrayList<Vegetarian> vegetarianArr, Vegetarian cc) {
		vegetarianArr.remove(cc);
		System.out.println("Vegetarian removed!");
	}

	public static void removeDrinks(ArrayList<drinks> drinksArr, drinks cc) {
		drinksArr.remove(cc);
		System.out.println("Drinks removed!");
	}

	public static void removeFruits(ArrayList<Fruits> fruitsArr, Fruits cc) {
		fruitsArr.remove(cc);
		System.out.println("Fruits removed");
	}
	
	
	
	//Add items into menu bank
	public static void addWestern(ArrayList<western> westernArr, western cc) {
		
		westernArr.add(cc);
		System.out.println("Western added");
	}
	
	public static void addAsian(ArrayList<asian> asianArr, asian cc) {
		
		asianArr.add(cc);
		System.out.println("Asian added");
	}
	
	public static void addVegetarian(ArrayList<Vegetarian> vegetarianArr, Vegetarian cc) {
	
		vegetarianArr.add(cc);
		System.out.println("Vegetarian added");
	}

	public static void addDrinks(ArrayList<drinks> drinksArr, drinks cc) {
	
		drinksArr.add(cc);
		System.out.println("Drinks added");
	}

	public static void addFruits(ArrayList<Fruits> fruitsArr, Fruits cc) {
	
		fruitsArr.add(cc);
		System.out.println("Fruits added");
	}

	
	
	
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================

	
	public static String randomWestern() {
		Random rand = new Random();
		int randomInt = rand.nextInt(westernArr.size());
		return westernArr.get(randomInt).getName();
	
	}
	
	public static String randomAsian() {
		Random rand = new Random();
		int randomInt = rand.nextInt(asianArr.size());
		return westernArr.get(randomInt).getName();
	
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

            for (int i = 1 , j = firstDay; i <= days[month]; i++, j++) {

            	if (j <= maxday) {
            	String Western ="";
            	String Asian ="";
            	String Vegetarian ="";
            	String Drink1 ="";
            	String Drink2 ="";
            	String Fruit1 ="";
            	String Fruit2 ="";
            	
                monthlyMenu += String.format("%5d ", i);
                monthlyMenu += months[month-1];
                monthlyMenu += "  (" + dayname[j] + ")\n"; 
                monthlyMenu += "  --------------------------\n";
                Western = String.format("     %5s: %s \n", "Western",  randomWestern());
                Asian = String.format("     %5s: %s \n", "Asian",  randomAsian());
                Vegetarian += String.format("     %5s: %s \n", "Vegetarian",  randomVegetarian());
                Drink1 = String.format("     %5s: %s \n", "Drinks",  randomDrink());
                Drink2 = String.format("     %5s: %s \n", "Drinks",  randomDrink());
                Fruit1 = String.format("     %5s: %s \n", "Fruit",  randomFruit());
                Fruit2 = String.format("     %5s: %s \n\n", "Fruit",  randomFruit());
                
                //menuList.add(new Menu(dayMenu));
                monthlyMenu += Western + Asian + Vegetarian + Drink1 + Drink2 + Fruit1 + Fruit2;
                menuList.add(new Menu(i, Western, Asian, Vegetarian, Drink1, Drink2, Fruit1, Fruit2));
                
                
                

            }
            	if (j > maxday && j <= fullweek) {
                    monthlyMenu += String.format("%5d ", i);
                    monthlyMenu += months[month-1];

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
	
 
	
	public static String viewMonthlyMenu() {
		String output = "";
		if(monthlyMenu.isEmpty()) {
			output = "There is no menu to view!";
			
		}else {
			C206_CaseStudy.setHeader("MONTHLY MENU");
			output = monthlyMenu;
		}
		return output;
	}
	
	public static String deleteMonthlyMenu() {
		String output = "";
		if(monthlyMenu.isEmpty()) {
			output = "There is no menu to delete!";
			
			
		}else {
			monthlyMenu = "";
			output = "Menu deleted!";
			menuList.clear();
		}
		return output;
	}
	
	
	
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	public static LunchBox inputLunchBox() {
		
		int orderID = Helper.readInt("Enter order ID > ");
		String date = Helper.readString("Enter date > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		
		LunchBox lb = new LunchBox(orderID, date, meal, drink, fruit);
		return lb;
		
	}
	
	public static void addLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, LunchBox lb) {
		
		lunchBoxList.add(lb);
		System.out.println("Successfully placed a lunch box order!");
		
	}
	
	public static String retrieveAllLunchBoxOrders(ArrayList<LunchBox> lunchBoxList) {
		String output = "";

		for (int i = 0; i < lunchBoxList.size(); i++) {

			output += String.format("%-85s \n", lunchBoxList.get(i));
		}
		return output;
	}
	
	public static void viewAllLunchBoxOrders(ArrayList<LunchBox> lunchBoxList) {
		String output = String.format("%-10s %-16s %-25s %-15s %-15s\n", "ORDER ID", "DATE", "MEAL",
				"DRINK", "FRUIT");
		 output += retrieveAllLunchBoxOrders(lunchBoxList);	
		System.out.println(output);
	}
	
	public static boolean doFoundLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, int orderID) {
		boolean isFound = false;

		for (int i = 0; i < lunchBoxList.size(); i++) {
			if (orderID == lunchBoxList.get(i).getOrderID()) {
				char confirm = Helper.readChar("Do you really want to cancel the lunch box order? (Y/N) > ");
				if (confirm == 'y' || confirm == 'Y') {
					lunchBoxList.remove(orderID - 1);
				}
				isFound = true;
			}
		}
		return isFound;
		
	}
	
	public static void deleteLunchBoxOrders(ArrayList<LunchBox> lunchBoxList) {
		
		viewAllLunchBoxOrders(lunchBoxList);
		
		int orderID = Helper.readInt("Enter order ID to cancel the lunch box order > ");
		
		Boolean isFound = doFoundLunchBoxOrder(lunchBoxList, orderID);
		
		if (isFound == false) {
			System.out.println("Invalid Lunch Box Order!");
		} else {
			System.out.println("Lunch Box Order " + orderID + " is successfully cancelled!");
		}
	}
	
	
	
	//=============================================== OPTION 5 BILL ==================================================
	public static void createOrderBill(ArrayList<Bill>orderBillArr) {
		String username = Helper.readString("Enter username > ");
		String menu = Helper.readString("Enter menu category > ");
		int bill = Helper.readInt("Enter amount to bill > ");
		String date = Helper.readString("Enter month in this format : MM/YYYY > ");
		
		Bill ob1 = new Bill(username, menu, bill,date);

		System.out.println("Order Bill Added!");
	}
	
		
	public static String viewOrderBill(ArrayList<Bill>orderBillArr) {
			C206_CaseStudy.setHeader("VIEW ORDER BILL");
			String output = " ";
			output = String.format("%-10s %-10s %-10s %-10s \n", "USERNAME", "MENU" , "AMOUNT", "DATE ");
			for (Bill b :  orderBillArr) {
				output += String.format("%-10s %-10s %-10d %-10s \n", b.getUsername(),b.getMenu(),b.getAmount(), b.getDate());
				
		}
			return output;
	}
	
	public static void deleteOrderBill(ArrayList<Bill>orderBillArr) {
			//boolean isFound to check whether the conditions are met 
		   boolean isFound = false;
		   String userDelete = Helper.readString("Enter username to delete > ");
		   
		   for (int i=0; i<orderBillArr.size(); i++){
			if (orderBillArr.get(i) != null && orderBillArr.get(i).getUsername().equals(userDelete)) {
			   orderBillArr.remove(i);
			   isFound = true;
			   System.out.println("Username: "+ userDelete  +" is deleted");
			   break;
			}
		   }
		   if (isFound == false){
			System.out.println("Username not found");
		   }	

	}
}
