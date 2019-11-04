package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import config.baseBrowser;
import config.baseBrowsers;
import utilities.mouserHover;


public class TC_2 extends mouserHover {

	baseBrowsers base = new baseBrowsers();
	 
	@Test(groups="smoke")
	 public void landingPage() throws IOException {
		 
		 baseBrowsers.browsers();
		// mouserHover.baseURL();
		 
	 }
	 
	@Test(groups="smoke")
	 public void carloan() throws IOException {
		 
		 baseBrowsers.browsers();
		// mouserHover.baseURL();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
