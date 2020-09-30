package Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngkeyword2 {
	@Test(dependsOnMethods= {"login"})
	public void tc1() {
		System.out.println("runnimg tc1");
	}
	@Test
	public void login() {
		System.out.println("login successfull");
		Assert.fail();
	}
	@Test(enabled=false)
public void tc2() {
	System.out.println("running tc2");
}
}
