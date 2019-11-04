package config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.locator;
import utilities.captureScreenShot;
import utilities.mouserHover;


public class base extends mouserHover {
 
	locator loc= new locator();
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.605.tv/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		locator loc= new locator();
		/*mouserHover.mouseHoverCompany(driver);
		mouserHover.mouseHoverAbout(driver);
		mouserHover.mouseHoverTeam(driver);
		mouserHover.mouseHoverNews(driver);
		mouserHover.mouseHoverSolutions(driver);
		mouserHover.mouseHoverMarkets(driver);
		mouserHover.mouseHoverTvNetworks(driver);
		mouserHover.mouseHoverMyPDS(driver);
		loc.clickOnAdSales(driver);
		loc.clickOnMarketing(driver);
		loc.clickOnProgramming(driver);
		
		mouserHover.mouseHoverOnProducts(driver);
		mouserHover.mouseHoverOn605AudianceSalesApp(driver);
		mouserHover.mouseHoverOnContact(driver);
		
		loc.clickOnSearchButton(driver);
		loc.inputTvProgmram(driver);*/
		
//		WebDriverWait w= new WebDriverWait(driver,10);
//		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer-links\"]/a[1]")));
		//driver.manage().window().fullscreen();
		loc.displayOnprivacyStatement(driver);
		//loc.clickOnprivacyStatement(driver);
		
		
		
    
		
	  
	  Thread.sleep(5000);
		driver.close();
	
	}

}
