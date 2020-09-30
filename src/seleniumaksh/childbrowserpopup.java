package seleniumaksh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe"); 
						WebDriver driver=new ChromeDriver();
						driver.get("https://skpatro.github.io/demo/links/");
						driver.findElement(By.xpath("//input[@name='NewTab']")).click();
					//	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
						
						//*****TO get the addres of main page*******
						String id = driver.getWindowHandle();
                        System.out.println(id);
                        
                        
                        //******To get the addres of main page & child browser*******
                       Set<String> allid = driver.getWindowHandles();
                       System.out.println(allid);
                      for (String ids : allid) {
//                    	   System.out.println(ids);
//                    	   driver.switchTo().window(ids);
//                    	   driver.close();
                   	   if(!id.equals(ids)) {
                        	   driver.switchTo().window(ids);
                        	   driver.close();
//                        	   
                           }
						
				}
                     
                    	   
                       
}}
