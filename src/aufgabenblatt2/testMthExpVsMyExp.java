package aufgabenblatt2;

import org.junit.Assert;
import org.junit.Test;
//import Euler.java;

public class testMthExpVsMyExp {

	@Test
	public void testMyExp() {
//		for (int x = 0; x < 10; x++) {
		int x=1;
			Assert.assertEquals(Math.exp(x), Euler.myExp(x, 10*x), 0.1);
			
//		}
		// fail("Not yet implemented"); // TODO
	}

	// @Test
	// public void testMyExpFast() {
	// fail("Not yet implemented"); // TODO
	// }

}
