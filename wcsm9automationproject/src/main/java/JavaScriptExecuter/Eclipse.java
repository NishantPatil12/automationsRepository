package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Eclipse {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement tw = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		
		//get the location of twittersyn
		Point loc = tw.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
			
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(2000);
		
		//take a screenshot of twitter
		File src = tw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/twitter.jpg");
		
		Files.copy(src, dest);
	}
	
                                                                                                                                                     //jkgydyddrdudud
}
