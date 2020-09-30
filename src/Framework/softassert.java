package Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	

	@Test
	public void softassert() {
		SoftAssert soft = new SoftAssert();
		String act="hiiii";
		String exp="hello";
		Reporter.log("running 1st verification", true);
		soft.assertEquals(act, exp, "1st verification failed");
		Reporter.log("running 2nd verification", true);
		soft.assertNotEquals(act, exp);
		
		soft.assertAll();
				}

}
