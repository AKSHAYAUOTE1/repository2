package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 {
	//pin
@FindBy(xpath="//input[@type='password']")private WebElement PIN;

//CONTINUE
@FindBy(xpath="//button[@type='submit']")private WebElement CONTINUE;



public  KiteLoginPage2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setKiteLoginPagePIN(String PIN1){
	PIN.sendKeys(PIN1);
}
public void clickKiteLoginPagecontinue(){
	CONTINUE.click();
}
	
	
}
