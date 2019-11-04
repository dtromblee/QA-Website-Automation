package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import config.baseBrowser;
import config.baseBrowsers;
import utilities.captureScreenShot;
import utilities.mouserHover;


public class TC_1 extends mouserHover {
	WebDriver driver = null;
	baseBrowsers base = new baseBrowsers();
	captureScreenShot ss= new captureScreenShot();
	 
	@Test
	 public void landingPage() throws IOException {
		
		
		 baseBrowsers.browsers();
		 Actions action1 = new Actions(driver);
			WebElement mouseHoverTeam= driver.findElement(By.xpath("//*[@id=\'menu-item-2535-\']"));
			action1.moveToElement(mouseHoverTeam).build().perform();
			//click on team
			driver.findElement(By.xpath("//*[@id=\'menu-item-4024-\']")).click();
		 
	 }
	 
	@Test
	 public void carloan() throws IOException {
		 
		 baseBrowsers.browsers();
		// mouserHover.baseURL();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
