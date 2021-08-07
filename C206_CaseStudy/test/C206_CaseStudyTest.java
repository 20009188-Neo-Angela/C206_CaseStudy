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



	private LunchBox  lb1;
	private LunchBox lb2;
	private LunchBox lb3;


	private ArrayList<LunchBox> lunchBoxList;
	private ArrayList<Account> accountArr;
	private ArrayList<western> westernArr;
	private ArrayList<asian>  asianArr;
	private ArrayList<Vegetarian>  vegetarianArr;
	private ArrayList<drinks>  drinksArr;

	private ArrayList<Fruits>  fruitsArr;
	private ArrayList<Bill> orderBillArr;
	

	private ArrayList<Menu> menuList;
	


	

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		acc1 = new Account("Roy Tan", "schoolR0ck$", "4E4","Credit Card");
		acc2 = new Account("Hannah", "12345abc", "3E2","Credit Card");
		
		accountArr = new ArrayList<Account>();
		
		mm1 = new Menu(1, "Fries", "Chilli Crab", "Vegi Burger", "Coke", "Fanta", "Apple", "Orange");
		mm2 = new Menu(2, "Pizza", "Chicken Rice", "Cauliflower Rice", "Sprite", "Ayataka", "WaterMelon", "BlueBerry");

		menuList= new ArrayList<Menu>();


		lb1 = new LunchBox(123, "6 August 2021", "Chilli Crab", "Qoo10", "Grape");
		lb2 = new LunchBox(456, "7 August 2021", "Mee Soto", "Coke", "Mangosteen");
		lb3 = new LunchBox(789, "8 August 2021", "Chicken Briyani", "Fanta", "Durian");
		
		lunchBoxList = new ArrayList<LunchBox>();

		
//		w1 = new western("Fries");
//		w2 = new western("Pizza");
//		w3 = new western("Spaghetti");
//		w4 = new western("Fish & Chips");
//		
//		
//
//		a1 = new asian("Chilli Crab");
//		a2 = new asian("Chicken Rice");
//		a3 = new asian("Nasi Lemak");
//		a4 = new asian("Cai Fan");
//
//		d1 = new drinks("Coke");
//		d2 = new drinks("Fanta");
//		d3 = new drinks("Sprite");
//		d4 = new drinks("Ayataka");
//
//		f1 = new Fruits("Apple");
//		f2 = new Fruits("Orange");
//		f3 = new Fruits("WaterMelon");
//		f4 = new Fruits("BlueBerry");
//		
//		v1 = new Vegetarian("Vegi Burger");
//		v2 = new Vegetarian("BlueBerry");
//		v3 = new Vegetarian("BlueBerry");
		
		b1 = new Bill ("hi", "03/09", 15,5,5,5);
		b2 = new Bill("hey", "04/09" , 18 , 6,6,6);
		
		orderBillArr = new ArrayList<Bill>();
		
	}



	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
		public void addAccount() {
			// Account list is not null, so that can add a new item - boundary
			assertNotNull("Test if there is valid Account arraylist to add to", accountArr);
			
			//Given an empty list, after adding 1 item, the size of the list is 1 - normal
			//The item just added is as same as the first item of the list
			C206_CaseStudy.addAccount(accountArr, acc1);		
			assertEquals("Test that Account arraylist size is 1", 1, accountArr.size());
			assertSame("Test that Account is added", acc1, accountArr.get(0));
			
			//Add another account. test The size of the list is 2? - normal
			//The account just added is as same as the second account of the list
			C206_CaseStudy.addAccount(accountArr, acc2);
			assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());
			assertSame("Test that Account is added", acc2, accountArr.get(1));
		}
		public void viewAccount() {
			// Test if Account list is not null but empty -boundary
			assertNotNull("Test if there is valid Account arraylist to retrieve item", accountArr);
			
			//test if the list of accounts retrieved from the CaseStudy is empty - boundary
			String viewAccount= C206_CaseStudy.retrieveAccount(accountArr);
			String testOutput = "";
			assertEquals("Check that viewAccount", testOutput,viewAccount);
			
			//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
			C206_CaseStudy.addAccount(accountArr, acc1);
			C206_CaseStudy.addAccount(accountArr, acc2);
			assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());
			
			//test if the expected output string same as the list of Account retrieved from the CaseStudy	
			viewAccount= C206_CaseStudy.retrieveAccount(accountArr);
			testOutput = String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(0).toString());
			testOutput += String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(1).toString() );
		
			assertEquals("Test that ViewAccount", testOutput, viewAccount);
			
		}

		public void deleteAccount( ) {
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

	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
		
		public void menuBank() {
			
			
		}
		
		public void addMenuItem() {
			
		}
		
		public void removeMenuItem() {
			
		}
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================
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
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addDailyMenu(menuList, mm1);
		assertSame("Check that Menu is added", mm1, menuList.get(0));
		C206_CaseStudy.updateDailyMenu(menuList);
		assertNotSame(mm1, menuList.get(0));
		
	
		
	}
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	@Test
	public void addLunchBoxOrder() {
		
		// LunchBox list is not null, so that can add a new lunch box order - boundary
		assertNotNull("Check if there is valid LunchBox arraylist to add to", lunchBoxList);
		
		//Given an empty list, after adding 1 lunch box order, the size of the list is 1 - normal
		//The lunch box order just added is as same as the first lunch box order of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb1, lunchBoxList.get(0));
		
		//Add another order. test the size of the list is 2? - normal
		//The order just added is as same as the second order of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb2, lunchBoxList.get(1));
		
		//Add third order. test the size of the list is 3? - normal
		//The order just added is as same as the third order of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
		assertSame("Check that lunch box order is added", lb3, lunchBoxList.get(2));
		
	}
	
	@Test
	public void retrieveAllLunchBoxOrders() {
		
		// Test if LunchBox list is not null but empty - boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve lunch box orders", lunchBoxList);
		
		//test if the list of lunch box orders retrieved from the C206_CaseStudy is empty - boundary
		String allLunchBoxOrders = C206_CaseStudy.retrieveAllLunchBoxOrders(lunchBoxList);
		String testOutput = "";
		assertEquals("Check that viewAllLunchBoxOrders", testOutput, allLunchBoxOrders);
		
		//Given an empty list, after adding 2 lunch box orders, test if the size of the list is 2 - normal
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Test that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		
		//test if the expected output string same as the list of lunch box orders retrieved from the C206_CaseStudy	
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
	
	
	
	
	
	
	
	//=============================================== OPTION 5 BILL =============================================================
	//Syazwan's bill test methods ->

	public void createOrderBill() {
		//  orderBillArr is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Menu arraylist to add to", orderBillArr);

		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.createOrderBill(orderBillArr, b1);
		assertEquals("Check that Menu arraylist size is 1", 1, orderBillArr.size());

		//The item just added is as same as the first item of the list
		assertSame("Check that Menu is added", mm1, orderBillArr.get(0));

		//Add another item. test The size of the list is 2? -normal
		C206_CaseStudy.createOrderBill(orderBillArr, b2);
		assertEquals("Check that Menu arraylist size is 2", 2, orderBillArr.size());
		assertSame("Check that Menu is added", b2, orderBillArr.get(1));

	public void inputBill() {
	//  orderBillArr is not null, so that can add a new item - boundary
					assertNotNull("Check if there is valid Menu arraylist to add to", orderBillArr);
	}
	public void createOrderBill() {
		
				//Given an empty list, after adding 1 item, the size of the list is 1 - normal
				C206_CaseStudy.createOrderBill(orderBillArr, b1);
				assertEquals("Check that Menu arraylist size is 1", 1, orderBillArr.size());
				
				//The item just added is as same as the first item of the list
				assertSame("Check that Menu is added", b1, orderBillArr.get(0));
				
				//Add another item. test The size of the list is 2? -normal
				C206_CaseStudy.createOrderBill(orderBillArr, b2);
				assertEquals("Check that Menu arraylist size is 2", 2, orderBillArr.size());
				assertSame("Check that Menu is added", b2, orderBillArr.get(1));

	}
	public void viewMonthlyBill() {
		// Test if orderBillArr list is not null but empty -boundary
		assertNotNull("Test if there is valid orderBillArr arraylist to retrieve item", orderBillArr);

		//test if the list of bills retrieved from the CaseStudy is empty 
		String viewBill= C206_CaseStudy.viewMonthlyBill(orderBillArr);
		String testOutput = "";
		assertEquals("Check that viewBill has the same output as the testOutput", testOutput,viewBill);

		//after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.createOrderBill(orderBillArr, b1);
		C206_CaseStudy.createOrderBill(orderBillArr, b2);
		assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());

		//test if the expected output string same as the bills retrieved from the CaseStudy	
		String viewBill1= C206_CaseStudy.viewMonthlyBill(orderBillArr);
		testOutput = String.format("%-10s %-15s %-12s %-10s\n", orderBillArr.get(0).toString());
		testOutput += String.format("%-10s %-15s %-12s %-10s\n", orderBillArr.get(1).toString() );

		assertEquals("Test that viewBill", testOutput, viewBill1);
	}
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
