import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Account acc1;
	private Account acc2;

	private western w1;
	private western w2;
	private western w3;
	private western w4;

	private asian a1;
	private asian a2;
	private asian a3;
	private asian a4;

	private drinks d1;
	private drinks d2;
	private drinks d3;
	private drinks d4;

	private Fruits f1;
	private Fruits f2;
	private Fruits f3;
	private Fruits f4;

	private Vegetarian v1;
	private Vegetarian v2;
	private Vegetarian v3;

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

		lb1 = new LunchBox(123, "6 August 2021", "Chilli Crab", "Qoo10", "Grape");
		lb2 = new LunchBox(456, "7 August 2021", "Mee Soto", "Coke", "Mangosteen");
		lb3 = new LunchBox(789, "8 August 2021", "Chicken Briyani", "Fanta", "Durian");

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

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());

		// The item just added is as same as the first item of the list
		assertSame("Check that Menu is added", mm1, menuList.get(0));

		// Add another item. test The size of the list is 2? -normal
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		assertSame("Check that Menu is added", mm2, menuList.get(1));

	}

	@Test
	public void retrieveMonthlyMenuTest() {

		// Went through it with you and mentioned testing is very complex
		// and would not be needed

	}

	@Test
	public void deleteMonthlyMenuTest() {

		// Test that Menu list is not empty
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertFalse(menuList.isEmpty());

		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteMonthlyMenu();
		assertEquals("Check that Menu arraylist size is 0", 0, menuList.size());

	}

	@Test
	public void deleteDailyMenuTest() {
		// Test that Menu list size is 2
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());

		// Test that after deleting one the size of menulist is 1
		C206_CaseStudy.deleteDailyMenu(menuList);
		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());

		C206_CaseStudy.deleteDailyMenu(menuList);
		assertEquals("Check that Menu arraylist size is 0", 0, menuList.size());

	}

	@Test
	public void editDailyMenuTest() {
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		assertSame("Check that Menu is added", mm1, menuList.get(0));
		C206_CaseStudy.updateDailyMenu(menuList);
		assertNotSame(mm1, menuList.get(0));

	}

	//================================================ OPTION 4 LUNCH BOX ORDER ==========================================//

	@Test
	public void addLunchBoxOrder() {

		// Boundary
		assertNotNull("Check if there is valid LunchBox arraylist to add to", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());   //check?

		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb1, lunchBoxList.get(0));

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb2, lunchBoxList.get(1));

		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb3, lunchBoxList.get(2));
		
		// Error
		assertNotEquals("Check that LunchBox arraylist size is 4", 4, lunchBoxList.size());
		assertNotEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());   //check?
		assertNotSame("Check that lunch box order added is the same", lb1, lunchBoxList.get(2));
		assertNotSame("Check that lunch box order added is the same", lb3, lunchBoxList.get(0));

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
		
		assertNotSame("Check that lunch box order added is same", lb3, lunchBoxList.get(0));
		assertNotSame("Check that lunch box order added is same", lb1, lunchBoxList.get(1));

	}
	
//	@Test
//	public void viewAllLunchBoxOrders() {
//		Need to test the JUnit since i have test the retrieve all lunch box orders method already???
//	}

	@Test
	public void doFoundLunchBoxOrder() {

		// Boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);
		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());   //check?
		
		// Normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that lunch box order ID matched", 456, lunchBoxList.get(0).getOrderID());
		assertSame("Check that lunch box order added is same", lb2, lunchBoxList.get(0));
		assertNotNull("Test that the lunch box order is not empty", lb2);
		
		Boolean ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 456) ;
		assertTrue("Test if the lunch box order ID is found?", ok);
		
		
		// Error
		ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 123) ;
		assertFalse("Test if the lunch box order ID is found?", ok);
		
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 777);
		assertFalse("Test that lunch box order ID does not exist is NOT found?", ok);
		
		ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 777);
		assertNotSame("Test if the lunch box order ID matches the records?", ok);
		
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertNotEquals("Check that lunch box order ID matched", 789, lunchBoxList.get(2).getOrderID());

	}
	
//	@Test
//	public void deleteLunchBoxOrders() {
//		
//		// Boundary
//		assertNotNull("Check if there is valid LunchBox arraylist to delete lunchbox orders", lunchBoxList);
//		assertEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());   //check?
//
//		// Normal
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
//		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
//		
//		C206_CaseStudy.deleteLunchBoxOrders(lunchBoxList);
//		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
//		assertSame("Check that lunch box order ID removed is the same", lb1, lunchBoxList.get(0).getOrderID());
//		
//		C206_CaseStudy.deleteLunchBoxOrders(lunchBoxList);
//		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
//		assertSame("Check that lunch box order ID removed is the same", lb3, lunchBoxList.get(2).getOrderID());
//		
//
//		// Error
//		assertNotEquals("Check that LunchBox arraylist size is 4", 4, lunchBoxList.size());
//		assertNotEquals("Check that LunchBox arraylist size is 0", 0, lunchBoxList.size());   //check?
//		
//		C206_CaseStudy.deleteLunchBoxOrders(lunchBoxList, 123);
//		assertNotSame("Check that lunch box order ID removed is NOT the same", lb2, lunchBoxList.get(1).getOrderID());
//		
//		C206_CaseStudy.deleteLunchBoxOrders(lunchBoxList, 777);
//		assertNotSame("Check that lunch box order ID CANNOT be removed as it does not exist", lb2, lunchBoxList.get(1).getOrderID());
//		
//		C206_CaseStudy.deleteLunchBoxOrders(lunchBoxList, 789);
//		assertNotSame("Check that lunch box order ID CANNOT be removed again", lb2, lunchBoxList.get(1).getOrderID());
//		
//	}
	
	
	
	
	

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

		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteOrderBill(orderBillArr);
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
