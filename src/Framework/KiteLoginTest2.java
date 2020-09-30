package Framework;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 

public class KiteLoginTest2 extends BrowserFactory  {
KiteLoginPage1 login1;
KiteLoginPage2 login2;
KiteLoginPage3 login3;
int TCID;
@Parameters(value="browser")
//Sheet sheetvalue;
	@BeforeClass
	public    void openbrowse(String browser) throws EncryptedDocumentException, IOException {
		
		System.out.println("open browser");
		openbrowsers(browser);
		login1=new KiteLoginPage1(driver);
		login2=new KiteLoginPage2(driver);
		login3=new KiteLoginPage3(driver);
			
		
		
		 
			}
		@BeforeMethod
		
		public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
			Reporter.log("login to app", true);
			String UN = Utility.gettestdata(0, 0);
			
			login1.setKiteLoginPageUN(UN);
			
		//	String PWD =  Utility.gettestdata(0, 1);
			login1.setKiteLoginPagePWD(Utility.gettestdata(0, 1));
			
			login1.ClickKiteLoginPageLOGIN();
			Thread.sleep(5000);
			String PIN =   Utility.gettestdata(0, 2);
			login2.setKiteLoginPagePIN(PIN);
			login2.clickKiteLoginPagecontinue();
			Thread.sleep(5000);
		}
		@Test
			public void verifyprofilepage() throws InterruptedException, EncryptedDocumentException, IOException {
			String act = login3.GetKitehomePageprofilename();
			String EXP =  Utility.gettestdata(0, 3);
			Assert.assertEquals(act, EXP);
			Thread.sleep(2000);
		}
		@AfterMethod
		
		public void LogoutFromApp(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				Utility.takescnsht(driver ,TCID=500);
				Reporter.log("logout from app", true);
			}
							}
			
		
			@AfterClass
			
			public void closebrowser() {
				Reporter.log("logout", true);
				driver.quit();
			}
		
			
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	

}
