package gumeTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void setMarkaModel() {
		a.setMarkaModel("Mercedes");
		assertEquals("Mercedes",a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class) 
	public void setMarkaModeKracaOd3Znaka() {
		a.setMarkaModel("A");
		}
	
	@Test 
	public void setPrecnik() {
		a.setPrecnik(15);
		assertEquals(15,a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setPrecnikKraci() {
		a.setPrecnik(1);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setPrecnikDuzi() {
		a.setPrecnik(50);
	}
	
	@Test
	public void setSirina() {
		a.setSirina(200);
		assertEquals(200,a.getSirina());
	}


	@Test (expected = java.lang.RuntimeException.class)
	public void setSirinaManja() {
		a.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setSirinaVeca() {
		a.setSirina(500);
	}
	
	@Test
	public void setVisina() {
		a.setVisina(80);
		assertEquals(80,a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setVisinaManja() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setVisinaVeca() {
		a.setVisina(100);
	}
	
	@Test 
	public void testToString() {
		a.setMarkaModel("Mercedes");
		a.setPrecnik(20);
		a.setVisina(50);
		a.setSirina(200);
		assertEquals("AutoGuma [markaModel=Mercedes, precnik=20, sirina=200, visina=50]",
		a.toString());
	}
	
	@Test
	public void testEqualsTrue() {
		a.setMarkaModel("BMW");
		a.setPrecnik(20);
		a.setVisina(50);
		a.setSirina(200);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("BMW");
		b.setPrecnik(20);
		b.setVisina(50);
		b.setSirina(200);
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("BMW");
		a.setPrecnik(20);
		a.setVisina(50);
		a.setSirina(200);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Mercedes");
		b.setPrecnik(20);
		b.setVisina(50);
		b.setSirina(200);
		assertFalse(a.equals(b));
	}
	}
