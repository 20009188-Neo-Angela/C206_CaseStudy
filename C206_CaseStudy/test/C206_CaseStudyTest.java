import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
<<<<<<< HEAD

	
	private ArrayList <Bill> orderBillArr;
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
>>>>>>> branch 'master' of https://github.com/20009188-Neo-Angela/C206_CaseStudy.git
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
		
		
	}
<<<<<<< HEAD
	
	
	
		// TODO Auto-generated constructor stub
	
	@After
	public void tearDown() throws Exception {

		
		
		accountArr = null;
		orderBillArr = null;

	}
	
=======


>>>>>>> branch 'master' of https://github.com/20009188-Neo-Angela/C206_CaseStudy.git

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

	@After
	public void tearDown() throws Exception {
	
	}
}
