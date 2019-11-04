package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserHover {

	

	
public static void mouseHoverCompany (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverComapany= driver.findElement(By.xpath("//*[@id=\'menu-item-2535-\']"));
	action.moveToElement(mouseHoverComapany).build().perform();
	//click on about
    driver.findElement(By.xpath("//*[@id=\'menu-item-2536-\']")).click();
}
	
public static void mouseHoverAbout (WebDriver driver) {
	
	Actions action1 = new Actions(driver);
	WebElement mouseHoverTeam= driver.findElement(By.xpath("//*[@id=\'menu-item-2535-\']"));
	action1.moveToElement(mouseHoverTeam).build().perform();
	//click on team
	driver.findElement(By.xpath("//*[@id=\'menu-item-4024-\']")).click();
}
public static void mouseHoverTeam (WebDriver driver) {
	
	Actions action11 = new Actions(driver);
	WebElement mouseHoverNews= driver.findElement(By.xpath("//*[@id=\'menu-item-2535-\']"));
	action11.moveToElement(mouseHoverNews).build().perform();
	//click on news
	driver.findElement(By.xpath("//*[@id=\'menu-item-2546-\']")).click();
}
public static void mouseHoverNews (WebDriver driver) throws InterruptedException {
	
	Actions action111 = new Actions(driver);
	WebElement mouseHoverCareers= driver.findElement(By.xpath("//*[@id=\'menu-item-2535-\']"));
	action111.moveToElement(mouseHoverCareers).build().perform();
	//click on Careers
	driver.findElement(By.xpath("//*[@id=\'menu-item-2551-\']")).click();
	Thread.sleep(500);
}

	
public static void mouseHoverSolutions (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\'menu-item-3315-\']"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on Overviews
	driver.findElement(By.xpath("//*[@id=\'menu-item-3876-\']")).click();
}
	
public static void mouseHoverMarkets (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\'menu-item-3315-\']"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on markets
	driver.findElement(By.xpath("//*[@id=\"menu-item-3001-\"]")).click();
}
	
public static void mouseHoverTvNetworks (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\'menu-item-3315-\']"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on TV Networks
	driver.findElement(By.xpath("//*[@id=\"menu-item-3377-\"]")).click();
}
	
public static void mouseHoverMyPDS (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\'menu-item-3315-\']"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on TV My PDS
	driver.findElement(By.xpath("//*[@id=\"menu-item-3378-\"]")).click();
}

public static void mouseHoverOnProducts (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\"menu-item-2800-\"]"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on 605 IndexrTM
	driver.findElement(By.xpath("//*[@id=\"menu-item-3549-\"]")).click();
}
	
public static void mouseHoverOn605AudianceSalesApp (WebDriver driver) {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\"menu-item-2800-\"]"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on 605 IndexrTM
	driver.findElement(By.xpath("//*[@id=\"menu-item-3569-\"]/a")).click();
}

public static void mouseHoverOnContact (WebDriver driver) throws InterruptedException {
	
	Actions action = new Actions(driver);
	WebElement mouseHoverSolutions= driver.findElement(By.xpath("//*[@id=\"menu-item-4968-\"]"));
	action.moveToElement(mouseHoverSolutions).build().perform();
	//click on contact
	driver.findElement(By.xpath("//*[@id=\"menu-item-4968-\"]")).click();
	Thread.sleep(5000);
}













}
