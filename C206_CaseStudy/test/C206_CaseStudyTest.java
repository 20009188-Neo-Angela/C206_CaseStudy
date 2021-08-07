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
	private Vegetarian v4;

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

		westernArr = new ArrayList<western>();

		w1 = new western("Fries", 4);
		w2 = new western("Pizza", 2);
		w3 = new western("Spaghetti", 2);
		w4 = new western("Fish & Chips", 3);

		asianArr = new ArrayList<asian>();

		a1 = new asian("Chilli Crab", 4);
		a2 = new asian("Chicken Rice", 2);
		a3 = new asian("Nasi Lemak", 3);
		a4 = new asian("Cai Fan", 2);

		drinksArr = new ArrayList<drinks>();

		d1 = new drinks("Coke", 1);
		d2 = new drinks("Fanta", 1);
		d3 = new drinks("Sprite", 1);
		d4 = new drinks("Ayataka", 1);

		fruitsArr = new ArrayList<Fruits>();

		f1 = new Fruits("Apple", 1);
		f2 = new Fruits("Orange", 1);
		f3 = new Fruits("WaterMelon", 1);
		f4 = new Fruits("BlueBerry", 1);

		vegetarianArr = new ArrayList<Vegetarian>();

		v1 = new Vegetarian("Vegi Burger", 2);
		v2 = new Vegetarian("Vegetarian Meatball", 2);
		v3 = new Vegetarian("Pumpkin Soup", 2);
		v4 = new Vegetarian("Cauliflower Rice", 2);

		b1 = new Bill("hi", "03/09", 15, 5, 5, 5);
		b2 = new Bill("hey", "04/09", 18, 6, 6, 6);

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	// ================================================ OPTION 1 USER ACCOUNT
	// ================================================
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
		testOutput = String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(0).toString());
		testOutput += String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(1).toString());

		assertEquals("Test that ViewAccount", testOutput, viewAccount);

	}

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
	public void viewmenuBankTest() {

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

	public void removeMenuItem() {

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

	// =============================================== OPTION 4 LUNCH BOX ORDER
	// ==================================================

	@Test
	public void addLunchBoxOrder() {

		// LunchBox list is not null, so that can add a new lunch box order - boundary
		assertNotNull("Check if there is valid LunchBox arraylist to add to", lunchBoxList);

		// Given an empty list, after adding 1 lunch box order, the size of the list is
		// 1 - normal
		// The lunch box order just added is as same as the first lunch box order of the
		// list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb1, lunchBoxList.get(0));

		// Add another order. test the size of the list is 2? - normal
		// The order just added is as same as the second order of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb2, lunchBoxList.get(1));

		// Add third order. test the size of the list is 3? - normal
		// The order just added is as same as the third order of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb3, lunchBoxList.get(2));

	}

	@Test
	public void retrieveAllLunchBoxOrders() {

		// Test if LunchBox list is not null but empty - boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);

		// test if the list of lunch box orders retrieved from the C206_CaseStudy is
		// empty - boundary
		String allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		String testOutput = "";
		assertEquals("Check that viewAllLunchBoxOrders", testOutput, allLunchBoxOrders);

		// Given an empty list, after adding 2 lunch box orders, test if the size of the
		// list is 2 - normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Test that LunchBox arraylist size is 2", 2, lunchBoxList.size());

		// test if the expected output string same as the list of lunch box orders
		// retrieved from the C206_CaseStudy
		allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		testOutput = String.format("%-85s \n", lunchBoxList.get(0));
		testOutput += String.format("%-85s \n", lunchBoxList.get(1));

		assertEquals("Test that viewAllLunchBoxOrders", testOutput, allLunchBoxOrders);

	}

//	@Test
//	public void doFoundLunchBoxOrder() {
//
//		// Test if LunchBox list is not null but empty - boundary
//		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);
//		
//		// normal condition
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
//		assertEquals("Check that lunch box order ID matched", 456, lunchBoxList.get(0).getOrderID());
//		assertNotNull("Test that the lunch box order is not empty", lb2);
//		// error condition
//		Boolean ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 456 - 1) ;
////		char confirm = 'Y';
//		assertFalse("Test if the lunch box order ID is found?", ok);
//		//error condition
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
//		ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 777);
//		assertFalse("Test that lunch box order ID does not exist is NOT found?", ok);
//		//error condition
//		ok = C206_CaseStudy.doFoundLunchBoxOrder(lunchBoxList, 777);
//		assertNotSame("Test if the lunch box order ID matches the records?", ok);
//		// error condition
//		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
//		assertNotEquals("Check that lunch box order ID matched", 789, lunchBoxList.get(2).getOrderID());
//
//	}
//	
//	
//	

	// =============================================== OPTION 5 BILL
	// =============================================================
	public void createOrderBillTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid orderBillArr arraylist to add to", orderBillArr);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addBill(orderBillArr, b1);
		assertEquals("Test that orderBillArr arraylist size is 1", 1, orderBillArr.size());
		assertSame("Test that Bill is added", b1, orderBillArr.get(0));

		// Add another item. test The size of the list is 2? - normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.addBill(orderBillArr, b2);
		assertEquals("Test that orderBillArr arraylist size is 2", 2, orderBillArr.size());
		assertSame("Test that orderBillArr is added", b2, orderBillArr.get(1));
	}

	public void viewMonthlyBillTest() {
		// Test if orderBillArr list is not null but empty -boundary
		assertNotNull("Test if there is valid orderBillArr arraylist to retrieve item", orderBillArr);

		// test if the list of accounts retrieved from the CaseStudy is empty - boundary
		String viewBill = C206_CaseStudy.addBill(orderBillArr);
		String testOutput = "";
		assertEquals("Check that viewBill has the same output as the testOutput", testOutput, viewBill);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.createOrderBill(orderBillArr, b1);
		C206_CaseStudy.createOrderBill(orderBillArr, b2);
		assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());

		// test if the expected output string same as the list of Account retrieved from
		// the CaseStudy
		viewBill = C206_CaseStudy.addBill(orderBillArr);
		testOutput = String.format("%-10s %-15s %-12s %-10s\n", orderBillArr.get(0).toString());
		testOutput += String.format("%-10s %-15s %-12s %-10s\n", orderBillArr.get(1).toString());
	}

	public void deleteOrderBillTest() {
		// Test that MonthlyMenu is not empty
		C206_CaseStudy.createOrderBill();
		assertFalse(C206_CaseStudy.orderBillArr.isEmpty());

		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteOrderBill();
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
	}
}
