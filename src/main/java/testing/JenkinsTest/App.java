package testing.JenkinsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void testGoogle() throws InterruptedException
    {
    	 /*HtmlUnitDriver unitDriver = new HtmlUnitDriver();
    	 unitDriver.setJavascriptEnabled(true);*/
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhii\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	 // open google.com webpage
    	driver.get("http://google.com");
    	 
    	
    	 
    	 // find the search edit box on the google page
    	 WebElement searchBox = driver.findElement(By.name("q"));
    	 
    	 // type in Selenium
    	 searchBox.sendKeys("roasting");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//div[@class='suggestions-inner-container']//span[text()='roasting'])[1]")).click();
    	 // find the search button
    	//driver.findElement(By.name("btnK")).click();
    	 
    	 System.out.println("Title of the page is -> " + driver.getTitle());
    	
    	 
    	 }
}