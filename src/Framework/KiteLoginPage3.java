package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage3 {
	@FindBy(xpath="//div[@class='avatar']")private WebElement PROFILENAME;
	
public KiteLoginPage3(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String GetKitehomePageprofilename() {
	String actreasult=PROFILENAME.getText();
	return actreasult;
	}
}
