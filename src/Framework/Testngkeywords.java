package Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngkeywords {
	public class Testnganotations {
		@BeforeClass
		public void openbrowser() {
			System.out.println("openbrowsere");
		}
		@BeforeMethod
		public void applogin() {
			System.out.println("login successfull");
		}
		
		@Test(priority=2)
		public void test1() {
			System.out.println("running test case 1");
		}
		@Test(invocationCount=5)
	    public void test2() {
	    	System.out.println("running test case 2");
	    }
		@Test(timeOut=5000)
		public void test3() throws InterruptedException {
			Thread.sleep(6000);
			System.out.println("running test case3");
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


}
