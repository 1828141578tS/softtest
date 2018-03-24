/**
 * 
 */
/**
 * @author lenovo
 *
 */
package cn.tju.scs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	private Triangle tri;
	@Before
	public void setUp() throws Exception {
		tri = new Triangle(3,3,3);
	}
	
	@Test
	public void testIsEquilatera1() {
		assertTrue(tri.isEquilatera());
	}
	
	@Test
	public void testIsIsosceles() {
		assertTrue(tri.isIsosceles());
	}
	
	@Test
	public void testIsScalene() {
		assertFalse(tri.isScalene());
	}
}