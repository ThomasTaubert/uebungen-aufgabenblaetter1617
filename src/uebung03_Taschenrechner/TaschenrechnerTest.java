package uebung03_Taschenrechner;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaschenrechnerTest {
	Taschenrechner tr;

	@Before
	public void setUp() {
		tr = new Taschenrechner();
	}

	 @Test
	 public void testTaschenrechner() {
	 Assert.assertEquals(0., tr.getResult(), 0);
	 }

	@Test
	public void testReset() {
		Assert.assertEquals(0., tr.getResult(), 0);
	}
	//
	// @Test
	// public void testSet() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testGetResult() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testAdd() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testSubstract() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testFakultaet() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testFak() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testSqrt() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testMain() {
	// fail("Not yet implemented"); // TODO
	// }

}
