package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class OmayoBlogSpot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		//Handle Disabled Name text box
		js.executeScript("document.getElementById('tb2').value='Nishant'");
		Thread.sleep(2000);
		WebElement tss = driver.findElement(By.id("tb2"));
		
		 //take screenshot of web page
	     TakesScreenshot ts = (TakesScreenshot)driver;
	  
	     //call the method    
		    File src= ts.getScreenshotAs(OutputType.FILE);
		    
		    //define way for storing Screenshot
		   File dest= new File("./Screenshot/seleniums.png");
		   
		   //Store the screenshot into destination
		   Files.copy(src, dest);			
		

	}

}
