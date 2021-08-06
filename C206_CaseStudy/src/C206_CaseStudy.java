
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
	public static String monthlyMenu ="";
	
	public static void main(String[] args) {
		
		
		ArrayList<LunchBox> lunchBoxList = new ArrayList<LunchBox>();
		ArrayList<Bill> orderBillArr = new ArrayList<Bill>();
		ArrayList<Account> accountArr = new ArrayList <Account> ();
		
		accountArr.add(new Account("Roy Tan", "schoolR0ck$", "4E4","Credit Card, Account Credit"));

		westernArr.add(new western("Fries"));
		westernArr.add(new western("Pizza"));
		westernArr.add(new western("Spaghetti"));
		westernArr.add(new western("Fish & Chips"));

		asianArr.add(new asian("Chilli Crab"));
		asianArr.add(new asian("Chicken Rice"));
		asianArr.add(new asian("Nasi Lemak"));
		asianArr.add(new asian("Cai Fan"));

		drinksArr.add(new drinks("Coke"));
		drinksArr.add(new drinks("Fanta"));
		drinksArr.add(new drinks("Sprite"));
		drinksArr.add(new drinks("Ayataka"));

		fruitsArr.add(new Fruits("Apple"));
		fruitsArr.add(new Fruits("Orange"));
		fruitsArr.add(new Fruits("WaterMelon"));
		fruitsArr.add(new Fruits("BlueBerry"));
		
		vegetarianArr.add(new Vegetarian("Vegi Burger"));
		vegetarianArr.add(new Vegetarian("BlueBerry"));
		vegetarianArr.add(new Vegetarian("BlueBerry"));

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
					viewWestern(westernArr);
					viewAsian(asianArr);
					viewDrinks(drinksArr);
					viewFruits(fruitsArr);
					viewVege(vegetarianArr);

				} else if (itemOption == 2) {
					C206_CaseStudy.setHeader("DELETE");
					String category = Helper.readString("Choose a category to delete from: ");

					if (category.equalsIgnoreCase("western")) {
						String item = Helper.readString("Choose a item to delete: ");
						for (western i : westernArr) {
							if (item.equals(i.getName())) {
								i = null;
							
							}
						}

					} else if (category.equalsIgnoreCase("asian")) {
						for (asian i : asianArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (item.equals(i.getName())) {
								i = null;
								
							}
						}
					} else if (category.equalsIgnoreCase("drinks")) {

						for (drinks i : drinksArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (item.equals(i.getName())) {
								i = null;
							
							}
						}
					} else if (category.equalsIgnoreCase("fruits")) {
						for (Fruits i : fruitsArr) {
							String item = Helper.readString("Choose a item to delete: ");
							if (item.equals(i.getName())) {
								i = null;
							
							}
						}
					}
					

				} else if (itemOption == 3) {
					C206_CaseStudy.setHeader("ADD");
					String category = Helper.readString("Choose a category to add to: ");

					if (category.equalsIgnoreCase("western")) {
						String item = Helper.readString("Choose a item to add: ");
						western itemw = new western(item);
						addWestern(westernArr, itemw);

					} else if (category.equalsIgnoreCase("asian")) {
						for (asian i : asianArr) {
							String item = Helper.readString("Choose a item to add: ");
							asian items = new asian(item);
							addAsian(asianArr, items);
						}
					} else if (category.equalsIgnoreCase("drinks")) {

						for (drinks i : drinksArr) {
							String item = Helper.readString("Choose a item to add: ");
							drinks itemw = new drinks(item);
							addDrinks(drinksArr,itemw);
							
						}
					} else if (category.equalsIgnoreCase("fruits")) {
						for (Fruits i : fruitsArr) {
							String item = Helper.readString("Choose a item to add: ");
							Fruits itemw = new Fruits(item);
							addFruits(fruitsArr, itemw);
						}

					}else if (category.equalsIgnoreCase("vegetarian")) {
						for (Vegetarian i : vegetarianArr) {
							String item = Helper.readString("Choose a item to add: ");
							Vegetarian itemw = new Vegetarian(item);
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
					
					LunchBox lb = inputLunchBox();
					addLunchBoxOrder(lunchBoxList, lb);
					
					
				} else if (choice == 2) {
					
					
					
				} else if (choice == 3) {
					
					
					
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
			output += String.format("%10s", i.getName());
		}
		
		
		return output;
	}
	
	public static String viewAsian(ArrayList<asian> asianArr) {
		String output = "";
		
		for (asian i : asianArr) {
			output += String.format("%10s", i.getName());
		}
		
		
		return output;
	}
	
	public static String viewDrinks(ArrayList<drinks> drinksArr) {
		String output = "";
		
		for (drinks i : drinksArr) {
			output += String.format("%10s", i.getName());
		}
		
		
		return output;
	}
	
	public static String viewFruits(ArrayList<Fruits> fruitsArr) {
		String output = "";
		
		for (Fruits i : fruitsArr) {
			output += String.format("%10s", i.getName());
		}
		
		
		return output;
	}
	
	public static String viewVege(ArrayList<Vegetarian> vegetarianArr) {
		String output = "";
		
		for (Vegetarian i : vegetarianArr) {
			output += String.format("%10s", i.getName());
		}
		
		
		return output;
	}
	
	//Delete Items from menu bank
	
	
	
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
                monthlyMenu += String.format("%5d ", i);
                monthlyMenu += months[month-1];

                monthlyMenu += "  (" + dayname[j] + ")\n"; 
                monthlyMenu += "  --------------------------\n";
                monthlyMenu += String.format("     %5s: %s \n", "Western",  randomWestern());
                monthlyMenu += String.format("     %5s: %s \n", "Asian",  randomAsian());
                monthlyMenu += String.format("     %5s: %s \n", "Vegetarian",  randomVegetarian());
                monthlyMenu += String.format("     %5s: %s \n", "Drinks",  randomDrink());
                monthlyMenu += String.format("     %5s: %s \n\n", "Fruit",  randomFruit());

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
		}
		return output;
	}
	
	
	
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	public static LunchBox inputLunchBox() {
		
		viewMonthlyMenu();
		
		int orderID = Helper.readInt("Enter order id > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		String day = Helper.readString("Enter day > ");
		String date = Helper.readString("Enter date > ");

		LunchBox lb = new LunchBox(orderID, meal, drink, fruit, day, date);
		return lb;
		
	}
	
	public static void addLunchBoxOrder(ArrayList<LunchBox> lunchBoxList, LunchBox lb) {
		
		lunchBoxList.add(lb);
		System.out.println("Successfully placed a lunch box order!");
		
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
