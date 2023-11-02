package takescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.get("https://www.shoppersstack.com/");
	     
	     Thread.sleep(2000);
	     
	     //take screenshot of webpage
	     TakesScreenshot ts = (TakesScreenshot)driver;
	  
	     //call the method    
		    File src= ts.getScreenshotAs(OutputType.FILE);
		    
		    //define way for storing Screenshot
		   File dest= new File("./Screenshot/seleniums.png");
		   
		   //Store the screenshot into dest
		   Files.copy(src, dest);
	     
	     

	}

}
