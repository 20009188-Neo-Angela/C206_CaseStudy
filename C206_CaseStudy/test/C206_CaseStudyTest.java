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
	
	private ArrayList<Menu> menuList;
	

	

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		acc1 = new Account("Roy Tan", "schoolR0ck$", "4E4","Credit Card");
		acc2 = new Account("Hannah", "12345abc", "3E2","Credit Card");
		
		mm1 = new Menu("Fries", "Chilli Crab", "Vegi Burger", "Coke", "Fanta", "Apple", "Orange");
		mm2 = new Menu("Pizza", "Chicken Rice", "Cauliflower Rice", "Sprite", "Ayataka", "WaterMelon", "BlueBerry");

		menuList = new ArrayList<Menu>();


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
			// Trying 
			//Kid
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
		C206_CaseStudy.addDailyMenu(menuList, mm2);
//		assertSame("Check that Menu is added", mm1, menuList.get(0));
//		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		
		//The item just added is as same as the first item of the list
		
		
		//Add another item. test The size of the list is 2? -normal
//		C206_CaseStudy.addDailyMenu(menuList, mm2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		assertSame("Check that Menu is added", mm2, menuList.get(1));
				
	}
	
	@Test
	public void retrieveMonthlyMenuTest() {
		
		// Went through it with you and said 
		//testing would be very complex hence no need to test... ):
		
		
	} 
	
	@Test
	public void deleteMonthlyMenuTest() {

		C206_CaseStudy.addDailyMenu(menuList, mm1);
		C206_CaseStudy.addDailyMenu(menuList, mm2);
		
		// Test that Menu list is not empty
		assertFalse(C206_CaseStudy.menuList.isEmpty());
		
		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteMonthlyMenu();
		assertTrue(C206_CaseStudy.monthlyMenu.isEmpty());
		
		
	}
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	@Test
	public void addLunchBoxOrder() {
		
		// Lunch Box list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid LunchBox arraylist to add to", lunchBoxList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb1);
		assertEquals("Check that LunchBox arraylist size is 1", 1, lunchBoxList.size());
		assertSame("Check that Lunch Box Order is added", lb1, lunchBoxList.get(0));
		
		//Add another item. test the size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb2);
		assertEquals("Check that LunchBox arraylist size is 2", 2, lunchBoxList.size());
		assertSame("Check that Lunch Box Order is added", lb2, lunchBoxList.get(1));
		
		//Add third item. test the size of the list is 3? - normal
		//The item just added is as same as the third item of the list
		C206_CaseStudy.addLunchBoxOrder(lunchBoxList, lb3);
		assertEquals("Check that LunchBox arraylist size is 3", 3, lunchBoxList.size());
		assertSame("Check that Lunch Box Order is added", lb3, lunchBoxList.get(2));
		
	}
	
	
	
	
	
	
	
	
	
	
	//=============================================== OPTION 5 BILL =============================================================

	@After
	public void tearDown() throws Exception {
		lb1 = null;
		lb2 = null;
		lb3 = null;
		lunchBoxList = null;
	
	mm1 = null;
	mm2 = null;
	menuList = null;
	}
}
