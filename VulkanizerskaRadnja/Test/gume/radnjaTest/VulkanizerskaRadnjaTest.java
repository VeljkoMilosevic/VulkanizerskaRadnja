package gume.radnjaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {

VulkanizerskaRadnja v;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Sava");
		g1.setPrecnik(18);
		g1.setSirina(205);
		g1.setVisina(50);
		v.dodajGumu(g1);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Tigar");
		g2.setPrecnik(21);
		g2.setSirina(220);
		g2.setVisina(80);
		v.dodajGumu(g2);
	    
	    AutoGuma g3 = new AutoGuma();
	    g3.setMarkaModel("Sava");
		g3.setPrecnik(19);
		g3.setSirina(206);
		g3.setVisina(51);
		v.dodajGumu(g3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pireli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(80);
		v.dodajGumu(a);
		assertTrue(v.pronadjiGumu("Pireli").getFirst().equals(a));
	}
	
	
	@Test (expected = NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test (expected = RuntimeException.class)
	public void dodajGumuKojaJEUListi() {
		  AutoGuma g1 = new AutoGuma();
			g1.setMarkaModel("Sava");
			g1.setPrecnik(18);
			g1.setSirina(205);
			g1.setVisina(50);
			v.dodajGumu(g1);
	}
	
	@Test
	public void pronadjiGumuJedna()  {
	    AutoGuma g2 = new AutoGuma();
	    g2.setMarkaModel("Tigar");
	    g2.setPrecnik(21);
		g2.setSirina(220);
		g2.setVisina(80);
		assertEquals(v.pronadjiGumu("Tigar").getFirst(),g2);
	}
	
	
	@Test (expected = NoSuchElementException.class)
	public void pronadjiGumuKojeNema()  {
	    AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Trajal");
		g1.setPrecnik(18);
		g1.setSirina(205);
		g1.setVisina(50);
		assertEquals(v.pronadjiGumu("Trajal").getFirst(),g1);
	}
	
	@Test
	public void pronadjiGumuNull() {
		assertEquals(null,v.pronadjiGumu(null));
	}
	
	@Test
	public void pronadjiViseGuma() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Sava");
		g1.setPrecnik(18);
		g1.setSirina(205);
		g1.setVisina(50);
		
		AutoGuma g3 = new AutoGuma();
		g3.setMarkaModel("Sava");
		g3.setPrecnik(19);
		g3.setSirina(206);
		g3.setVisina(51);

	    assertEquals(2,v.pronadjiGumu("Sava").size());
		
		assertTrue(g3.equals(v.pronadjiGumu("Sava").getFirst()));
		assertTrue(g1.equals(v.pronadjiGumu("Sava").getLast()));
		
	}
}
