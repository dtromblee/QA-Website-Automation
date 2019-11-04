package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class captureScreenShot {

	
	public static void screenShot(WebDriver driver, String screensShotName) throws IOException {
	
	try {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File soure= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(soure, new File("./screenShots/"+ screensShotName+".png"));
		System.out.println("screeenshot taken");
	} 
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Exception while takeing screenshot" + e.getMessage());
	}
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
