package Framework;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertcls {
	@Test
	public void assertequal() {
		String act="akshay";
		String exp="aki";
		Assert.assertEquals(act, exp);
		
	}
	@Test
	public void assertnotequal() {
		String act="akshay";
		String exp="aki";
		Assert.assertNotEquals(exp, act);
	}
	@Test
 public void assertTrue() {
	 boolean act=true;
	Assert.assertTrue("condition mismatch", act);
 }
	@Test
	public void assertFalse() {
		boolean act=false;
		Assert.assertFalse(act);
	}
	@Test
	public void Fail() {
		Assert.fail();
		
	}
}














