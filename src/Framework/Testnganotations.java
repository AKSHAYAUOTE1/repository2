package Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testnganotations {
	@BeforeClass
	public void openbrowser() {
		System.out.println("openbrowsere");
	}
	@BeforeMethod
	public void applogin() {
		System.out.println("login successfull");
	}
	
	@Test
	public void test1() {
		System.out.println("running test case 1");
	}
	@Test
    public void test2() {
    	System.out.println("running test case 2");
    }
	@AfterMethod
      public  void afterlogin() {
    	  System.out.println("logout successfull");
      }
	@AfterClass
	public void closedbrowser() {
		System.out.println("close browser");
	}
}
