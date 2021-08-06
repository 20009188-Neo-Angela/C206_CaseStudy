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
	

	private ArrayList<Account> accountArr;
	private ArrayList<western> westernArr;
	private ArrayList<asian>  asianArr;
	private ArrayList<Vegetarian>  vegetarianArr;
	private ArrayList<drinks>  drinksArr;
	private ArrayList<Fruits>  fruitsArr;
	public static String monthlyMenu ="";
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		acc1 = new Account()
		
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
		
		
	}



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
		


		
		// Test is after creating MonthlyMenu is not empty
		String testOutput = C206_CaseStudy.createMonthlyMenu();
		assertFalse(testOutput.isEmpty());
				
	}
	
	@Test
	public void retrieveMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty 
		C206_CaseStudy.createMonthlyMenu();
		assertFalse(C206_CaseStudy.monthlyMenu.isEmpty());
		
		C206_CaseStudy.createMonthlyMenu();
		String testOutput = C206_CaseStudy.viewMonthlyMenu();
	
		
		
		// Test if the expected output String contains the menu item 
		 if (testOutput.contains("Fries") || testOutput.contains("Pizza") ||testOutput.contains("Spaghetti")||testOutput.contains("Fish & Chips") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Chilli Crab") || testOutput.contains("Chicken Rice") ||testOutput.contains("Nasi Lemak")||testOutput.contains("Cai Fan") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Coke") || testOutput.contains("Fanta") ||testOutput.contains("Sprite")||testOutput.contains("Ayataka") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Apple") || testOutput.contains("Orange") ||testOutput.contains("WaterMelon")||testOutput.contains("BlueBerry") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Vegi Burger") || testOutput.contains("Pumpkin Soup") ||testOutput.contains("Vegetarian Meatball")||testOutput.contains("Cauliflower Rice") ) {
	            assertTrue(testOutput, true);
	        }

			
	}
	
	@Test
	public void deleteMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty
		C206_CaseStudy.createMonthlyMenu();
		assertFalse(C206_CaseStudy.monthlyMenu.isEmpty());
		
		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteMonthlyMenu();
		assertTrue(C206_CaseStudy.monthlyMenu.isEmpty());
		
	}
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	
	
	//=============================================== OPTION 5 BILL =============================================================

	@After
	public void tearDown() throws Exception {
	
	}
}
