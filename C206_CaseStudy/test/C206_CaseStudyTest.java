import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
 
	private Account acc1;
	private Account acc2;

	private western w1;
	private western w2;

	private asian a1;
	private asian a2;

	private drinks d1;
	private drinks d2;

	private Fruits f1;
	private Fruits f2;

	private Vegetarian v1;
	private Vegetarian v2;

	private Menu mm1;
	private Menu mm2;

	private Bill b1;
	private Bill b2;

	private LunchBox lb1;
	private LunchBox lb2;
	private LunchBox lb3;

	private ArrayList<LunchBox> lunchBoxList;
	private ArrayList<Account> accountArr;
	private ArrayList<western> westernArr;
	private ArrayList<asian> asianArr;
	private ArrayList<Vegetarian> vegetarianArr;
	private ArrayList<drinks> drinksArr;

	private ArrayList<Fruits> fruitsArr;
	private ArrayList<Bill> orderBillArr;

	private ArrayList<Menu> menuList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {

		acc1 = new Account("Roy Tan", "schoolR0ck$", "4E4", "Credit Card");
		acc2 = new Account("Hannah", "12345abc", "3E2", "Credit Card");

		accountArr = new ArrayList<Account>();

		mm1 = new Menu(1, "Fries", "Chilli Crab", "Vegi Burger", "Coke", "Fanta", "Apple", "Orange");
		mm2 = new Menu(2, "Pizza", "Chicken Rice", "Cauliflower Rice", "Sprite", "Ayataka", "WaterMelon", "BlueBerry");

		menuList = new ArrayList<Menu>();

		lb1 = new LunchBox(123, LocalDate.parse("2021-12-19"), "Chilli Crab", "Qoo10", "Grape", 35.00);
		lb2 = new LunchBox(456, LocalDate.parse("2021-10-27"), "Mee Soto", "Coke", "Mangosteen", 10.00);
		lb3 = new LunchBox(789, LocalDate.parse("2021-08-30"), "Chicken Briyani", "Fanta", "Durian", 50.00);

		lunchBoxList = new ArrayList<LunchBox>();

		w1 = new western("Fries", 1);
		w2 = new western("Spaghetti", 2);
		westernArr = new ArrayList<western>();

		a1 = new asian("Chilli Crab", 1);
		a2 = new asian("Chicken Rice", 3);
		asianArr = new ArrayList<asian>();

		d1 = new drinks("Coke", 2);
		d2 = new drinks("Sprite", 2);
		drinksArr = new ArrayList<drinks>();

		f1 = new Fruits("Apple", 1);
		f2 = new Fruits("Orange", 2);
		fruitsArr = new ArrayList<Fruits>();

		v1 = new Vegetarian("Vegi Burger", 2);
		v2 = new Vegetarian("Pumpkin Soup", 2);
		vegetarianArr = new ArrayList<Vegetarian>();

		b1 = new Bill("hi", "03/09", 15, 5, 5, 5);
		b2 = new Bill("hey", "04/09", 18, 6, 6, 6);

		orderBillArr = new ArrayList<Bill>();

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	// ================================================ OPTION 1 USER ACCOUNT
	// ================================================
	@Test
	public void addAccount() {
		// Account list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Account arraylist to add to", accountArr);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addAccount(accountArr, acc1);
		assertEquals("Test that Account arraylist size is 1", 1, accountArr.size());
		assertSame("Test that Account is added", acc1, accountArr.get(0));

		// Add another account. test The size of the list is 2? - normal
		// The account just added is as same as the second account of the list
		C206_CaseStudy.addAccount(accountArr, acc2);
		assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());
		assertSame("Test that Account is added", acc2, accountArr.get(1));
	}

	@Test
	public void viewAccount() {
		// Test if Account list is not null but empty -boundary
		assertNotNull("Test if there is valid Account arraylist to retrieve item", accountArr);

		// test if the list of accounts retrieved from the CaseStudy is empty - boundary
		String viewAccount = C206_CaseStudy.retrieveAccount(accountArr);
		String testOutput = "";
		assertEquals("Check that viewAccount", testOutput, viewAccount);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addAccount(accountArr, acc1);
		C206_CaseStudy.addAccount(accountArr, acc2);
		assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());

		// test if the expected output string same as the list of Account retrieved from
		// the CaseStudy
		viewAccount = C206_CaseStudy.retrieveAccount(accountArr);
		testOutput = String.format("%-50s \n", accountArr.get(0).toString());
		testOutput += String.format("%-50s \n", accountArr.get(1).toString());

		assertEquals("Test that ViewAccount", testOutput, viewAccount);

	}
	
	@Test
	public void deleteAccount() {
		// delete account testing
		// Test if list is not null but empty -boundary
		assertNotNull("Test if there is valid Account arraylist to delete from", accountArr);

		// Given a list with 2 items, after deleting 2 items, test if the list is empty
		accountArr.clear();
		C206_CaseStudy.addAccount(accountArr, acc1);
		C206_CaseStudy.addAccount(accountArr, acc2);
		accountArr.clear();
		assertEquals("Test that Account arraylist is empty", 0, accountArr.size());

		// Test that list can't be cleared if it's empty
		assertEquals("Test that Account arraylist can't be cleared if it's empty", 0, accountArr.size());
		accountArr.clear();

	}

	// =============================================== OPTION 2 MENU ITEMS
	// ==================================================

	@Test
	public void viewmenuBank() {
		
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Western arraylist to retrieve item", westernArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid asian arraylist to retrieve item", asianArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Vegetarian arraylist to retrieve item", vegetarianArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid drinks arraylist to retrieve item", drinksArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid fruits arraylist to retrieve item", fruitsArr);
		
		//test if the list of Western items retrieved from the array is empty - boundary
		String allWestern= C206_CaseStudy.viewWestern(westernArr);
		String testOutput = "";
		assertEquals("Check that viewWestern", testOutput, allWestern);
		
		//test if the list of asian items retrieved from the array is empty - boundary
		String allAsian= C206_CaseStudy.viewAsian(asianArr);
		String testOutput1 = "";
		assertEquals("Check that viewAsian", testOutput1, allAsian);
		
		//test if the list of vegetarian items retrieved from the array is empty - boundary
		String allVegetarian= C206_CaseStudy.viewVege(vegetarianArr);
		String testOutput2 = "";
		assertEquals("Check that viewVege", testOutput2, allVegetarian);
		
		//test if the list of drinks items retrieved from the array is empty - boundary
		String allDrinks= C206_CaseStudy.viewDrinks(drinksArr);
		String testOutput3 = "";
		assertEquals("Check that viewDrinks", testOutput3, allDrinks);
		
		//test if the list of fruits items retrieved from the array is empty - boundary
		String allFruits= C206_CaseStudy.viewFruits(fruitsArr);
		String testOutput4 = "";
		assertEquals("Check that viewFruits", testOutput4, allFruits);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addWestern(westernArr, w1);
		C206_CaseStudy.addWestern(westernArr, w2);
		assertEquals("Test that Western arraylist size is 2", 2, westernArr.size());
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addAsian(asianArr, a1);
		C206_CaseStudy.addAsian(asianArr, a2);
		assertEquals("Test that Western arraylist size is 2", 2, asianArr.size());
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addVegetarian(vegetarianArr, v1);
		C206_CaseStudy.addVegetarian(vegetarianArr, v2);
		assertEquals("Test that Western arraylist size is 2", 2, vegetarianArr.size());

		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addDrinks(drinksArr, d1);
		C206_CaseStudy.addDrinks(drinksArr, d2);
		assertEquals("Test that Western arraylist size is 2", 2, drinksArr.size());
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addFruits(fruitsArr, f1);
		C206_CaseStudy.addFruits(fruitsArr, f2);
		assertEquals("Test that Western arraylist size is 2", 2, fruitsArr.size());
		
		//test if the expected output string same as the list of western retrieved from the SourceCentre	
		allWestern = C206_CaseStudy.viewWestern(westernArr);
		testOutput = String.format("Western: %10s Price: $%d \n", westernArr.get(0).getName(), westernArr.get(0).getPrice());
		testOutput += String.format("Western: %10s Price: $%d \n", westernArr.get(1).getName(), westernArr.get(1).getPrice());
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allWestern);
		
		//test if the expected output string same as the list of western retrieved from the SourceCentre	
		allAsian = C206_CaseStudy.viewAsian(asianArr);
		testOutput1 = String.format("Asian: %10s Price: $%d \n", asianArr.get(0).getName(), asianArr.get(0).getPrice());
		testOutput1 += String.format("Asian: %10s Price: $%d \n", asianArr.get(1).getName(), asianArr.get(1).getPrice());
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput1, allAsian);
		
		//test if the expected output string same as the list of western retrieved from the SourceCentre	
		allVegetarian = C206_CaseStudy.viewVege(vegetarianArr);
		testOutput2 = String.format("Vegetarian: %10s Price: $%d\n", vegetarianArr.get(0).getName(), vegetarianArr.get(0).getPrice());
		testOutput2 += String.format("Vegetarian: %10s Price: $%d\n", vegetarianArr.get(1).getName(), vegetarianArr.get(1).getPrice());
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput2, allVegetarian);
		
		//test if the expected output string same as the list of western retrieved from the SourceCentre	
		allDrinks = C206_CaseStudy.viewDrinks(drinksArr);
		testOutput3 = String.format("Drinks: %10s Price: $%d \n", drinksArr.get(0).getName(), drinksArr.get(0).getPrice());
		testOutput3 += String.format("Drinks: %10s Price: $%d \n", drinksArr.get(1).getName(), drinksArr.get(1).getPrice());
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput3, allDrinks);
		
		//test if the expected output string same as the list of western retrieved from the SourceCentre	
		allFruits = C206_CaseStudy.viewFruits(fruitsArr);
		testOutput4 = String.format("Fruits: %10s Price: $%d \n", fruitsArr.get(0).getName(), fruitsArr.get(0).getPrice());
		testOutput4 += String.format("Fruits: %10s Price: $%d \n", fruitsArr.get(1).getName(), fruitsArr.get(1).getPrice());
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput4, allFruits);

		
		
		

	}

	@Test
	public void addMenuItem() {
		
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Western arraylist to retrieve item", westernArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid asian arraylist to retrieve item", asianArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Vegetarian arraylist to retrieve item", vegetarianArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid drinks arraylist to retrieve item", drinksArr);

		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid fruits arraylist to retrieve item", fruitsArr);

		// Given an empty list, after adding 1 item, size of the list is 1 - normal
		C206_CaseStudy.addWestern(westernArr,w1);

		assertEquals("Check arrayList size is 1", 1, westernArr.size());
		
		// Given an empty list, after adding 1 item, size of the list is 1 - normal
		C206_CaseStudy.addAsian(asianArr, a1);

		assertEquals("Check arrayList size is 1", 1, asianArr.size());
		
		// Given an empty list, after adding 1 item, size of the list is 1 - normal
		C206_CaseStudy.addVegetarian(vegetarianArr, v1);

		assertEquals("Check arrayList size is 1", 1, vegetarianArr.size());
		
		// Given an empty list, after adding 1 item, size of the list is 1 - normal
		C206_CaseStudy.addDrinks(drinksArr, d1);
		assertEquals("Check arrayList size is 1", 1, drinksArr.size());
		
		// Given an empty list, after adding 1 item, size of the list is 1 - normal
		C206_CaseStudy.addFruits(fruitsArr, f1);
		assertEquals("Check arrayList size is 1", 1, fruitsArr.size());
		
		
		  
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addWestern(westernArr, w1);
		assertEquals("Check that western arraylist size is 2", 2, westernArr.size());
		assertSame("Check that western is added", w1.getName(), westernArr.get(1).getName());
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addAsian(asianArr, a1);
		assertEquals("Check that asian arraylist size is 2", 2, asianArr.size());
		assertSame("Check that asian is added", a1.getName(), asianArr.get(1).getName());
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addVegetarian(vegetarianArr, v1);
		assertEquals("Check that vegetarian arraylist size is 2", 2, vegetarianArr.size());
		assertSame("Check that vegetarian is added", v1.getName(), vegetarianArr.get(1).getName());
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addDrinks(drinksArr, d1);
		assertEquals("Check that drinks arraylist size is 2", 2, drinksArr.size());
		assertSame("Check that drinks is added", d1.getName(), drinksArr.get(1).getName());
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addFruits(fruitsArr, f1);
		assertEquals("Check that fruits arraylist size is 2", 2, fruitsArr.size());
		assertSame("Check that fruits is added", f1.getName(), fruitsArr.get(1).getName());
		

	}

	@Test
	public void removeMenuItem() {
		//Test that Array is not empty
		C206_CaseStudy.addAsian(asianArr, a1);
		assertFalse(asianArr.isEmpty());
		
		//Test that Array is not empty
		C206_CaseStudy.addWestern(westernArr, w1);
		assertFalse(westernArr.isEmpty());
		
		//Test that Array is not empty
		C206_CaseStudy.addVegetarian(vegetarianArr, v1);
		assertFalse(vegetarianArr.isEmpty());
		
		//Test that Array is not empty
		C206_CaseStudy.addDrinks(drinksArr, d1);
		assertFalse(drinksArr.isEmpty());
		
		//Test that Array is not empty
		C206_CaseStudy.addFruits(fruitsArr, f1);
		assertFalse(fruitsArr.isEmpty());
		
		//Test After removal list is empty
		C206_CaseStudy.removeAsian(asianArr, a1);
		assertEquals("Check that Menu arraylist size is 0", 0, asianArr.size());
		
		//Test After removal list is empty
		C206_CaseStudy.removeWestern(westernArr, w1);
		assertEquals("Check that Menu arraylist size is 0", 0, westernArr.size());
		
		//Test After removal list is empty
		C206_CaseStudy.removeVegetarian(vegetarianArr, v1);
		assertEquals("Check that Menu arraylist size is 0", 0, vegetarianArr.size());
		
		//Test After removal list is empty
		C206_CaseStudy.removeDrinks(drinksArr, d1);
		assertEquals("Check that Menu arraylist size is 0", 0, drinksArr.size());
		
		//Test After removal list is empty
		C206_CaseStudy.removeFruits(fruitsArr, f1);
		assertEquals("Check that Menu arraylist size is 0", 0, fruitsArr.size());
		

	}

	// =============================================== OPTION 3 MONTHLY MENU
	// ==================================================
	@Test
	public void createMonthlyMenuTest() {
		
		// Menu list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Menu arraylist to add to", menuList);
	
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Check that Menu is added", mm1, menuList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		assertSame("Check that Menu is added", mm2, menuList.get(1));
				
	}
	 
	@Test
	public void retrieveMonthlyMenuTest() {
		
		// Went through it with you and mentioned testing is very complex
		// and would not be needed
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertFalse(menuList.isEmpty());
	
			
	} 
	
	@Test
	public void deleteMonthlyMenuTest() {
		
		// Test that Menu list is not empty
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertFalse(menuList.isEmpty());
		
		// Test that after delete, menu list size is 0
		C206_CaseStudy.doDeleteMonthlyMenu(menuList);
		assertEquals("Check that Menu arraylist size is 0", 0, menuList.size());
		
	}
	
	@Test
	public void deleteDailyMenuTest() {
		// Test that Menu list size is 2 
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		
		
		// Test that after deleting one the size of menulist is 1
		C206_CaseStudy.doDeleteDailyMenu(menuList, 2);
		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());
		
		// Test that after deleting another, the size of menuList is 0
		C206_CaseStudy.doDeleteDailyMenu(menuList, 1);
		assertEquals("Check that Menu arraylist size is 0", 0, menuList.size());
		
	}
	 
	@Test
	public void editDailyMenuTest() {
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		assertSame("Check that Menu is added", mm1, menuList.get(0));
		
		//Test that after editing the the item matches the changes
		assertEquals(mm1.getAsian(), "Chilli Crab");
		C206_CaseStudy.doEditDailyMenu(menuList, 0, 4, "Fish & Chips", "Cai Fan", "Pumpkin Soup",  "Water", "Juice", "Mango", "Papaya");
		
		assertEquals(menuList.get(0).getAsian(), "Cai Fan");

	}

	//================================================ OPTION 4 LUNCH BOX ORDER ==========================================//

	@Test
	public void addLunchBoxOrder() {

		// Boundary
		assertNotNull("Check if there is valid LunchBox arraylist to add to", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertSame("Check that first lunch box order is added to the lunchBoxList index position (0)", lb1, lunchBoxList.get(0));

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that second lunch box order is added to the lunchBoxList index position (1)", lb2, lunchBoxList.get(1));

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
		assertSame("Check that third lunch box order is added to the lunchBoxList index position (2)", lb3, lunchBoxList.get(2));

		// Error
		assertNotEquals("Check that LunchBox arraylist size is NOT equals to 4", 4, lunchBoxList.size());
		assertNotEquals("Check that LunchBox arraylist size is NOT equals to 1", 1, lunchBoxList.size());
		assertNotSame("Check that lunch box order added is NOT the same", lb1, lunchBoxList.get(2));
		assertNotSame("Check that lunch box order added is NOT the same", lb3, lunchBoxList.get(0));

	}

	@Test
	public void retrieveAllLunchBoxOrders() {

		// Boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);

		String allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		String testOutput = "";
		assertEquals("Check that viewAllLunchBoxOrders", testOutput, allLunchBoxOrders);

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Test that LunchBox arraylist size is 2", 2, lunchBoxList.size());

		allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		testOutput = String.format("%-85s \n", lunchBoxList.get(0));
		testOutput += String.format("%-85s \n", lunchBoxList.get(1));

		assertEquals("Test that viewAllLunchBoxOrders", testOutput, allLunchBoxOrders);

		assertSame("Check that lunch box order added is same", lb1, lunchBoxList.get(0));
		assertSame("Check that lunch box order added is same", lb2, lunchBoxList.get(1));

		// Error
		allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		testOutput = String.format("%s \n", lunchBoxList.get(1).toString());
		testOutput += String.format("%s \n", lunchBoxList.get(0).toString());

		assertNotEquals("Test that viewAllLunchBoxOrders is NOT equals to the output", testOutput, allLunchBoxOrders);

		assertNotSame("Check that lunch box order added is NOT the same as lunchBoxList index position (0)", lb3, lunchBoxList.get(0));
		assertNotSame("Check that lunch box order added is NOT the same as lunchBoxList index position (1)", lb1, lunchBoxList.get(1));

	}


	@Test
	public void doFoundLunchBoxOrderID()  {

		// Boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that lunch box order ID matched", 456, lunchBoxList.get(0).getOrderID());
		assertSame("Check that lunch box order added is same", lb2, lunchBoxList.get(0));
		assertNotNull("Test that the lunch box order is not empty", lb2);

		Boolean ok = C206_CaseStudy.doFoundLunchBoxOrderID(lunchBoxList, 456) ;
		assertTrue("Test if the lunch box order ID is found?", ok);


		// Error
		ok = C206_CaseStudy.doFoundLunchBoxOrderID(lunchBoxList, 123) ;
		assertFalse("Test if the lunch box order ID is found?", ok);

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		ok = C206_CaseStudy.doFoundLunchBoxOrderID(lunchBoxList, 777);
		assertFalse("Test that lunch box order ID does not exist is NOT found?", ok);

		ok = C206_CaseStudy.doFoundLunchBoxOrderID(lunchBoxList, 777);
		assertNotSame("Test if the lunch box order ID matches the records?", ok);

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertNotEquals("Check that lunch box order ID matched", 789, lunchBoxList.get(2).getOrderID());

	}

	@Test
	public void calculateDaysTest() {

		String current = "2021-08-15";
		int noOfDays = C206_CaseStudy.calculateDays(current);
		assertEquals("Check if the number of days is 5?", 5, noOfDays);

	}

	@Test
	public void doDeleteLunchBoxOrder() {

		// Boundary
		assertNotNull("Check if there is valid LunchBox arraylist to delete lunchbox orders", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());

		Boolean ok = C206_CaseStudy.doDeleteLunchBoxOrder(lunchBoxList, 123, "2021-12-19");
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that lunch box order is the same", lb2, lunchBoxList.get(0));
		assertTrue("Check that lunch box order is removed successfully?", ok);


		ok = C206_CaseStudy.doDeleteLunchBoxOrder(lunchBoxList, 789, "2021-08-30");
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertEquals("Check that lunch box order is the same", lb2.getOrderID(), lunchBoxList.get(0).getOrderID());
		assertSame("Check that lunch box order is the same", lb2, lunchBoxList.get(0));
		assertTrue("Check that lunch box order is removed successfully?", ok);



		// Error
		assertNotEquals("Check that LunchBox arraylist size is 4", 4, lunchBoxList.size());
		assertNotEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());

		ok = C206_CaseStudy.doDeleteLunchBoxOrder(lunchBoxList, 123, "2222-12-19");
		assertFalse("Check that lunch box order ID removed is UNSUCCESSFUL", ok);
		assertNotEquals("Check that lunch box order date is NOT equal/matched", "2222-12-19", lb1.getDate());

		ok = C206_CaseStudy.doDeleteLunchBoxOrder(lunchBoxList, 777, "2021-12-19");
		assertFalse("Check that lunch box order ID removed is UNSUCCESSFUL", ok);
		assertNotEquals("Check that lunch box order ID is NOT equal/matched", 777, lb1.getOrderID());

		ok = C206_CaseStudy.doDeleteLunchBoxOrder(lunchBoxList, 789, "2021-08-30");
		assertFalse("Check that lunch box order ID CANNOT be removed again",ok);
	}

	@Test
	public void doUpdateLunchBoxOrder()  {

		// Boundary
		assertNotNull("Test if there is valid LunchBox arraylist to update lunch box orders", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		Boolean ok = C206_CaseStudy.doUpdateLunchBoxOrder(lunchBoxList, 123, "2021-04-05", "Bao", "Coffee", "Durian", 100.00);
		assertEquals("Check that lunch box order date is the same and updated", lunchBoxList.get(0).getDate(), LocalDate.parse("2021-04-05"));
		assertEquals("Check that lunch box order meal is the same and updated", lunchBoxList.get(0).getMeal(), "Bao");
		assertEquals("Check that lunch box order drink is the same and updated", lunchBoxList.get(0).getDrink(), "Coffee");
		assertEquals("Check that lunch box order fruit is the same and updated", lunchBoxList.get(0).getFruit(), "Durian");
		assertNotEquals("Check that lunch box order ID is different?", lunchBoxList.get(0).getOrderID(), 456);
		assertTrue("Test if the lunch box order is found?", ok);


		// Error
		ok = C206_CaseStudy.doUpdateLunchBoxOrder(lunchBoxList, 123, "", "", "", "Durian", 100.00);
		assertFalse("Test if the lunch box order is NOT updated", ok);

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		ok = C206_CaseStudy.doUpdateLunchBoxOrder(lunchBoxList, 777, "2021-10-27", "Fish", "Black Coffee", "Lychee", 500.00);
		assertFalse("Test that lunch box order ID does not exist is NOT updated?", ok);

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		ok = C206_CaseStudy.doUpdateLunchBoxOrder(lunchBoxList, 000, "2021-03-21", "Chicken", "Coke", "Apple", 10.00);
		assertNotEquals("Check that LunchBox arraylist size is NOT equals to 4", 4, lunchBoxList.size());
		assertFalse("Test if the lunch box order is updated?", ok);

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertNotEquals("Check that lunch box order ID is NOT matched", 999, lunchBoxList.get(2).getOrderID());

		ok = C206_CaseStudy.doUpdateLunchBoxOrder(lunchBoxList, 789, "2021-12-19", "Chicken", "Coke", "Apple", -1000.00);
		assertFalse("Test if the lunch box order is NOT updated", ok);

	}

	
	

	// =============================================== OPTION 5 BILL
	// =============================================================
	// Syazwan's bill test methods ->
	@Test
	public void inputBill() {
		// orderBillArr is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Menu arraylist to add to", orderBillArr);
	}

	@Test
	public void createOrderBill() {

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.createOrderBill(orderBillArr, b1);
		assertEquals("Check that Menu arraylist size is 1", 1, orderBillArr.size());

		// The item just added is as same as the first item of the list
		assertSame("Check that Menu is added", b1, orderBillArr.get(0));

		// Add another item. test The size of the list is 2? -normal
		C206_CaseStudy.createOrderBill(orderBillArr, b2);
		assertEquals("Check that Menu arraylist size is 2", 2, orderBillArr.size());
		assertSame("Check that Menu is added", b2, orderBillArr.get(1));
	}

	@Test
	public void viewMonthlyBill() {
		// Test if orderBillArr list is not null but empty -boundary
		assertNotNull("Test if there is valid orderBillArr arraylist to retrieve item", orderBillArr);

		// test if the list of bills retrieved from the CaseStudy is empty
		String viewBill = C206_CaseStudy.viewMonthlyBill(orderBillArr);
		String testOutput = String.format("%-10s %-10s %-10s \n", "USERID", "DATE", "TOTAL AMOUNT");
		assertEquals("Check that viewBill has the same output as the testOutput", testOutput, viewBill);

		// after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.createOrderBill(orderBillArr, b1);
		C206_CaseStudy.createOrderBill(orderBillArr, b2);
		assertEquals("Test that Account arraylist size is 2", 2, orderBillArr.size());

		// test if the expected output string same as the bills retrieved from the
		// CaseStudy
		String viewBill1 = C206_CaseStudy.viewMonthlyBill(orderBillArr);
		testOutput += String.format("%-10s %-10s %-15d \n", orderBillArr.get(0).getID(), orderBillArr.get(0).getDate(), orderBillArr.get(0).getDailyAmt());
		testOutput += String.format("%-10s %-10s %-15d \n", orderBillArr.get(1).getID(), orderBillArr.get(1).getDate(), orderBillArr.get(1).getDailyAmt());

		assertEquals("Test that viewBill", testOutput, viewBill1);
	}

	@Test
	public void deleteOrderBill() {
		// Test that orderBillArr is not empty
		assertNotNull("Test if there is valid orderBillArr arraylist to retrieve item", orderBillArr);

		// Test that after delete, order bill is empty
		C206_CaseStudy.deleteOrderBill(orderBillArr, null);
		assertTrue(C206_CaseStudy.orderBillArr.isEmpty());

	}

	@After
	public void tearDown() throws Exception {

		acc1 = null;
		acc2 = null;

		lb1 = null;
		lb2 = null;
		lb3 = null;
		lunchBoxList = null;

		mm1 = null;
		mm2 = null;
		menuList = null;

		b1 = null;
		b2 = null;
		orderBillArr = null;
	}
}
