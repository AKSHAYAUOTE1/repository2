package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
	//UN
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	
	//PWD
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	
	//Login
	@FindBy(xpath="//button[@type='submit']")private WebElement LOGIN;
	
	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Enter un
	public void setKiteLoginPageUN(String UN1){
		UN.sendKeys(UN1);
	}
	//enter pwd
	public void setKiteLoginPagePWD(String PWD1) {
		PWD.sendKeys(PWD1);
	}
	
	public void ClickKiteLoginPageLOGIN() {
		LOGIN.click();
		
		
		
	}
	

}
