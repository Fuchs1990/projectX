package de.facharbeit.projectX;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProjectXTest {

	private ProjectX projectX;
	
	@Before
	public void setUp() throws Exception {
		projectX = new ProjectX();
		assertEquals("zahl1 sollte den Wert 0 haben", 0, projectX.getZahl());
	}

	@After
	public void tearDown() throws Exception {
		projectX = null;
	}

	@Test
	public void testGetAndSetZahl() {
		projectX.setZahl(3);
		assertEquals("zahl1 sollte den Wert 3 haben", 3, projectX.getZahl());
	}
	
	@Test
	public void testMultiplizieren() {
		projectX.setZahl(3);
		projectX.setBool(true);
		assertTrue("3 * 4 sollte 12 sein", projectX.multiplizieren(4) == 12);
		
	}
	

}
