package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.locator;
import utilities.captureScreenShot;
import utilities.mouserHover;


public class baseBrowser extends mouserHover {
 
	
	locator loc= new locator();
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null; 
		
		Properties pro = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\config.properties");
		pro.load(ip);
		
		System.out.println(pro.getProperty("browser"));
		String browserName = pro.getProperty("browser");
		
		
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
		}
		
		else if(browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 
		}
		
       else if(browserName.equals("ie")) {
    	   System.setProperty("webdriver.ie.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 
		
		}
       else if(browserName.equals("safari")) {
    	   System.setProperty("webdriver.ie.driver", "");
			 driver = new SafariDriver();
			 driver.manage().window().maximize();
			 
		}
       else {
    	   System.out.println("no browser value is given");
       }
		
		driver.get(pro.getProperty("url"));
		driver.close();
		
		
		
    
		
	  
	  
	
	}

}
