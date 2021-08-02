
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<western> westernArr = new ArrayList<western>();
		ArrayList<asian> asianArr = new ArrayList<asian>();
		ArrayList<drinks> drinksArr = new ArrayList<drinks>();
		ArrayList<Fruits> fruitsArr = new ArrayList<Fruits>();

		westernArr.add(new western("Fries"));
		westernArr.add(new western("Pizza"));
		westernArr.add(new western("Spaghetti"));
		westernArr.add(new western("Fish & Chips"));

		asianArr.add(new asian("chilli crab"));
		asianArr.add(new asian("chicken rice"));
		asianArr.add(new asian("nasi lemak"));
		asianArr.add(new asian("cai fan"));

		drinksArr.add(new drinks("Coke"));
		drinksArr.add(new drinks("Fanta"));
		drinksArr.add(new drinks("Sprite"));
		drinksArr.add(new drinks("Ayataka"));

		fruitsArr.add(new Fruits("Apple"));
		fruitsArr.add(new Fruits("Orange"));
		fruitsArr.add(new Fruits("WaterMelon"));
		fruitsArr.add(new Fruits("BlueBerry"));

		menu();

		int choice = Helper.readInt("Enter choice: ");

		while (choice != 4) {
			if (choice == 1) {
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

				choice = Helper.readInt("Enter choice: ");
			} else if (choice == 2) {

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
				choice = Helper.readInt("Enter choice: ");

			} else if (choice == 3) {
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

				}
				choice = Helper.readInt("Enter choice: ");
			}
		}

	}

	// TODO Auto-generated method stub

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1: Show all Inside Menu Bank");
		System.out.println("2: Remove a item from menu bank");
		System.out.println("3: Add a item into menu bank");
		System.out.println("4: Quit");

	}

}
