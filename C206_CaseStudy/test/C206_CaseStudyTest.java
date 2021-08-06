import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
<<<<<<< HEAD

	
	private ArrayList<Account> accountArr;
	
	
	public C206_CaseStudyTest() {
		super();
		
	}

=======
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
	
	private Bill b1;
	private Bill b2;
	

	
	private ArrayList<western> westernArr;
	private ArrayList<asian>  asianArr;
	private ArrayList<Vegetarian>  vegetarianArr;
	private ArrayList<drinks>  drinksArr;
	private ArrayList<Fruits>  fruitsArr;
	private ArrayList <Bill> orderBillArr;
	public static String monthlyMenu ="";
	
	public C206_CaseStudyTest() {
		super();
	}
	

	public void setUp() throws Exception {
		
		w1 = new western("Fries");
		w2 = new western("Pizza");
		w3 = new western("Spaghetti");
		w4 = new western("Fish & Chips");
		
		

		a1 = new asian("Chilli Crab");
		a2 = new asian("Chicken Rice");
		a3 = new asian("Nasi Lemak");
		a4 = new asian("Cai Fan");

		d1 = new drinks("Coke");
		d2 = new drinks("Fanta");
		d3 = new drinks("Sprite");
		d4 = new drinks("Ayataka");

		f1 = new Fruits("Apple");
		f2 = new Fruits("Orange");
		f3 = new Fruits("WaterMelon");
		f4 = new Fruits("BlueBerry");
		
		v1 = new Vegetarian("Vegi Burger");
		v2 = new Vegetarian("BlueBerry");
		v3 = new Vegetarian("BlueBerry");
		
		b1= new Bill("syaz123","drinks" ,100, "07/2021");
		b2 = new Bill("syaz456", "western", 150, "08/2021");
		
		
		
	}
	
	
	
		// TODO Auto-generated constructor stub
	
	

	@Test
	public void c206_test() {
		
	
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
	
	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================
	@Test
	public void createMonthlyMenuTest() {
		
		//assertNotNull("Check if there is valid western items arraylist to random generate", westernArr);
		//Test if MonthlyMenu is empty 
		assertTrue(monthlyMenu.isEmpty());
		
		//Test if MonthlyMenu is not empty
		
		// add into arrayList so that it would not be empty
		C206_CaseStudy.addWestern(westernArr, w1);
		C206_CaseStudy.addWestern(westernArr, w2);
		C206_CaseStudy.addWestern(westernArr, w3);
		C206_CaseStudy.addWestern(westernArr, w4);
		
		C206_CaseStudy.addAsian(asianArr, a1);
		C206_CaseStudy.addAsian(asianArr, a2);
		C206_CaseStudy.addAsian(asianArr, a3);
		C206_CaseStudy.addAsian(asianArr, a4);
		
		String monthlyMenu = C206_CaseStudy.createMonthlyMenu();
		assertFalse(monthlyMenu.isEmpty());
		
		
	}
	
	@Test
	public void retrieveMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty 
		C206_CaseStudy.createMonthlyMenu();
		assertFalse(C206_CaseStudy.monthlyMenu.isEmpty());
		
		
			
		// Test if the expected output String is same as the variable MonthlyMenu retrieved from the Case Study
		String viewMenu = C206_CaseStudy.viewMonthlyMenu();
		String testOutput = C206_CaseStudy.monthlyMenu;
		assertEquals("Test that View Monthly Menu has the expected output ", testOutput, viewMenu);
		
	}
	
	@Test
	public void deleteMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty
		String testCreate = C206_CaseStudy.monthlyMenu;
		assertFalse(testCreate.isEmpty());
		
		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteMonthlyMenu();
		assertTrue(testCreate.isEmpty());
		
	}
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	
	
	//=============================================== OPTION 5 BILL =============================================================
	public void createOrderBilTest() {
		//Test that orderBillArr is not null, so that an order bill can be created 
		assertNotNull("Check if the OrderBillArr arraylist is valid to be added to", orderBillArr);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
				//The item just added is as same as the first item of the list
				C206_CaseStudy.createOrderBill( orderBillArr, b1);
				assertEquals("Check that orderBillArr arraylist size is 1", 1, orderBillArr.size());
				assertSame("Check that the Bill is added", b1, orderBillArr.get(0));
				
				//Add another item. test The size of the list is 2? -normal
				//The item just added is as same as the second item of the list
				C206_CaseStudy.createOrderBill(orderBillArr,b2);
				assertEquals("Check that the orderBillArr arraylist size is 2", 2, orderBillArr.size());
				assertSame("Check that the Bill is added", b2, orderBillArr.get(1));
	}
	public void viewOrderBill() {
		//Test that 
	}
	public void deleteOrderBill() {
		//Test that 
	}
	@After
	public void tearDown() throws Exception {
	
	}
}
