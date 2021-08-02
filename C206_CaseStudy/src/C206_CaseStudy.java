
import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 6;
	public static void main(String[] args) {

		ArrayList<western> westernArr = new ArrayList<western>();
		ArrayList<asian> asianArr = new ArrayList<asian>();
		ArrayList<drinks> drinksArr = new ArrayList<drinks>();
		ArrayList<Fruits> fruitsArr = new ArrayList<Fruits>();

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
				
				
				
			}else if (option == 4) {
				// Angela Lunch Box Order
				
				
				
				
			}else if (option == 5) {
				// Syazwan Bills 
				
				
				
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
		System.out.println("1: Show all Inside Menu Bank");
		System.out.println("2: Remove a item from menu bank");
		System.out.println("3: Add a item into menu bank");

	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	
	
	
	
	
	//=============================================== OPTION 5 BILL ==================================================
	
	
	
	
	

}
