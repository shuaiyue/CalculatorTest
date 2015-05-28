import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculateTest {
	
	private static Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {		
		assertEquals(5, cal.add(2, 3));
	}

	@Test
	public void testSubstract() {
		assertEquals(5, cal.substract(5, 0));
	}

	@Test
	public void testMultiply() {
		assertEquals(-1, cal.multiply(-1, 1));
	}

	@Test
	public void testDivide() throws Exception {
		cal.divide(4, 0);
	}

}
