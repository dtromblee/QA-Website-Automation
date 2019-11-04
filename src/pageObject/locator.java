package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class locator  {

 WebDriver driver;
	
	By ADSales= By.xpath("//*[@id=\"post-3346\"]/div/section[1]/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/p/a");
	
	By marketing = By.xpath("//*[@id=\"post-3500\"]/div/section[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/p/a");
	
	By programming= By.xpath("//*[@id=\"post-3455\"]/div/section[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div/div/p/a");
	
	By searchButton= By.xpath("//*[@id=\"wraper-mainmenu\"]/ul[2]/li/a/i");
	 
	By inputInSearch= By.xpath("//*[@id=\"df-search-input\"]");
	
	By clickPrivacyStatement= By.xpath("//a[@class='privacy_link']"); ////*[@id="footer-links"]/a[1]
	By privacyStatement= By.cssSelector("#footer-links > a.privacy_link");
	By privacy=  By.partialLinkText("Privacy");

	
	//contact details
	By inputFirst= By.xpath("//input[contains(@id,'796523_5399pi_796523_5399')]");
	By first= By.cssSelector("#\\37 96523_5399pi_796523_5399");
	By Inputlast= By.xpath("//*[@id=\'796523_5401pi_796523_5401\']");
	
	
	
	public void landingPages (WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnAdSales(WebDriver driver) {
		 driver.findElement(ADSales).click();;
		   }
	public void clickOnMarketing(WebDriver driver) {
		 driver.findElement(marketing).click();
		   }
	
	public void clickOnProgramming(WebDriver driver) {
		 driver.findElement(programming).click();;
		   }
	
	public void displayOnprivacyStatement(WebDriver driver) throws InterruptedException {
	

		
		try {
			driver.findElement(clickPrivacyStatement).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		   }
public void clickOnprivacyStatement(WebDriver driver) throws InterruptedException {
	

		
		driver.findElement(clickPrivacyStatement).click();
		
		
		
		
		
		   }
	
	
	public void clickOnSearchButton(WebDriver driver) {
		 driver.findElement(searchButton).click();
		
		   }
	
	public void inputTvProgmram(WebDriver driver) throws InterruptedException {
		 
		 driver.findElement(inputInSearch).sendKeys("TV Program");
		 Thread.sleep(500);
		 driver.findElement(inputInSearch).submit();
		   }
	
	public void inputFirstName(WebDriver driver) throws InterruptedException {
		 
		driver.findElement(inputFirst).sendKeys("c");
		
		   }
	
	public void inputLastName(WebDriver driver) {
		 driver.findElement(inputFirst).sendKeys("A");
		
		   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
