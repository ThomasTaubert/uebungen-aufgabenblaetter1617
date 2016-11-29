package uebung3_Taschenrechner;

import org.junit.Test;

import org.junit.Assert;

/**
 * @author Thomas
 *
 */
public class MyWurzelTest {

	/**
	 * Test method for {@link uebung3_Taschenrechner.MyWurzel#sqrt(int)}.
	 */
	@Test
	public void testSqrt() {
		int sqrt = 325;
		int n = sqrt * sqrt;
		// int n = 1;

		Assert.assertEquals("Die Wurzel aus " + n + " ist " + sqrt, MyWurzel.sqrt(n));
	}

}
