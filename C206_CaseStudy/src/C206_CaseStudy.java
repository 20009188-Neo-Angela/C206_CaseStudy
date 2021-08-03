
import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 6;
	public static void main(String[] args) {

		ArrayList<western> westernArr = new ArrayList<western>();
		ArrayList<asian> asianArr = new ArrayList<asian>();
		ArrayList<drinks> drinksArr = new ArrayList<drinks>();
		ArrayList<Fruits> fruitsArr = new ArrayList<Fruits>();
		ArrayList<Bill> orderBillArr = new ArrayList<Bill>();

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

		orderBillArr.add(new Bill("t0326720i",1000, 01, 2021));
		int option = 0;
		
		while (option != OPTION_QUIT) {
			
			menu();
			option = Helper.readInt("Enter option: ");
			
			if(option == 1) {
				// Hannah User Account 
				
			}else if (option == 2) {
				// Kidson Menu Items
				
				itemMenu();
				
				int itemOption = Helper.readInt("Enter option: ");
				
				
				if (itemOption == 1) {
					C206_CaseStudy.setHeader("VIEW");
					for (western i : westernArr) {
						System.out.println("Western Food: " + i.getName());
					}
					System.out.println("");

					for (asian i : asianArr) {
						System.out.println("Asian Food: " + i.getName());
					}
					System.out.println("");

					for (drinks i : drinksArr) {
						System.out.println("Drinks: " + i.getName());
					}
					System.out.println("");

					for (Fruits i : fruitsArr) {
						System.out.println("Fruits: " + i.getName());
					}
					System.out.println("");

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
						for (western i : westernArr) {
							if (i == null) {
								i = new western(item);
								westernArr.add(i);

							}
						}

					} else if (category.equalsIgnoreCase("asian")) {
						for (asian i : asianArr) {
							String item = Helper.readString("Choose a item to add: ");
							if (i == null) {
								i = new asian(item);
								asianArr.add(i);

							}
						}
					} else if (category.equalsIgnoreCase("drinks")) {

						for (drinks i : drinksArr) {
							String item = Helper.readString("Choose a item to add: ");
							if (i == null) {
								i = new drinks(item);
								drinksArr.add(i);

							}
						}
					} else if (category.equalsIgnoreCase("fruits")) {
						for (Fruits i : fruitsArr) {
							String item = Helper.readString("Choose a item to add: ");
							if (i == null) {
								i = new Fruits(item);
								fruitsArr.add(i);
							}
						}

					}else {
						System.out.println("Invalid option");
					}
				
				}
				
			}else if (option == 3) {
				//Ying Teng Monthly Menu
				monthlyMenu();
				
				int monthlyOption = Helper.readInt("Enter option to select Monthly Menu > ");
				
				if(monthlyOption == 1 ) {
					C206_CaseStudy.setHeader("CREATE MONTHLY MENU");
					String menu = createMonthlyMenu();
					System.out.println(menu);
				
					
				}else if (monthlyOption == 2) {
					C206_CaseStudy.setHeader("VIEW MONTHLY MENU");
					
					
				}else if (monthlyOption == 3) {
					C206_CaseStudy.setHeader("DELETE MONTHLY MENU");
					
					
				}else {
					System.out.println("Invalid option");
				}
						
				
				
				
			}else if (option == 4) {
				// Angela Lunch Box Order
				
				
				
				
			}else if (option == 5) {
				// Syazwan Bills 
				menuBill();
				int billOptions = Helper.readInt("Enter option > ");
				
				if (billOptions == 1) {
					C206_CaseStudy.setHeader("CREATE ORDER BILL ");
					//createOrderBill();
				}else if (billOptions == 2 ) {
					viewOrderBill(orderBillArr);
				}else if (billOptions == 3) {
					C206_CaseStudy.setHeader("DELETE ORDER BILL");
					//deleteOrderBill();
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
	private static void menuBill() {
		System.out.println("1. Create Order Bill ");
		System.out.println("2. View Order Bill ");
		System.out.println("3. Delete Order Bill");
	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================
	
	
	public static String createMonthlyMenu() {
		
		int year = Helper.readInt("Enter year: ");
		int firstDay = Helper.readInt("Enter first day of the year(0-6): ");
		int month = Helper.readInt("Enter month (1-12): \n");
		int spaces = firstDay -2;
		String monthlyMenu = "";
		int numOfDays = 0;
		int[] days = {
               31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };
		String[] months = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };
		
			// print calendar header
            // Display the month and year
		 	monthlyMenu = ("          "+ months[month-1] + " " + year + "\n");
				 
			// Display the lines
			monthlyMenu += ("_____________________________________\n");
			monthlyMenu +=("   Sun  Mon Tue  Wed  Thu   Fri  Sat\n");
	             
	        // spaces required
	        spaces = (days[month-1] + spaces)%7;
                 
            // print the calendar
	        for (int i = 0; i < spaces; i++)
	        	monthlyMenu += ("     ");
            for (int i = 1; i <= days[month-1]; i++) {
            	monthlyMenu += String.format(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[month])) 
                	monthlyMenu += "\n";
            }
 
 
			return monthlyMenu;
	}
	
	
	
	
	
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	
	
	
	
	
	//=============================================== OPTION 5 BILL ==================================================
	public static void createOrderBill() {
		String username = Helper.readString("Enter username > ");
		int bill = Helper.readInt("Enter amount to bill > ");
		int month = Helper.readInt("Enter month in this format : MM > ");
		int year = Helper.readInt("Enter year in this format : YYYY > ");
		
			
	}
	
		
	
	public static String viewOrderBill(ArrayList<Bill>orderBillArr) {
			C206_CaseStudy.setHeader("VIEW ORDER BILL");
			String output = " ";
			output = String.format("%-10s %-10s %-10s %-10s ", "USERNAME", "AMOUNT" , "MONTH", "YEAR ");
			for (Bill b :  orderBillArr) {
				output += String.format("%-10s %-10d %-10d %-10d \n", b.getUsername(), b.getAmount(), b.getMonth(),  b.getYear());
				
		}
			return output;
	}
	
	public static void deleteOrderBill() {
		
	}
}
