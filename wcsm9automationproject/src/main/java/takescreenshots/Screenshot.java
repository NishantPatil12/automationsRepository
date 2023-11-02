package takescreenshots;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      
		    driver.get("http://www.bluestone.com/");
		    Thread.sleep(2000);
		    
		    TakesScreenshot takescreenshot= (TakesScreenshot) driver;
		    
		    File src= takescreenshot.getScreenshotAs(OutputType.FILE);
		    
		    FileHandler.copy(src,new File("G:\\ss/sc5.jpeg"));
		    
		    driver.close();
		
	}
}
