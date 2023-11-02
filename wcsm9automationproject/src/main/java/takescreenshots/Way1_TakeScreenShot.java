package takescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Way1_TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.get("http://www.bluestone.com/");
		    Thread.sleep(2000);
		    
		    // HAandle pop up
		    driver.findElement(By.id("denyBtn")).click();
		    
		    //identify coins and perform mouseHover
		    WebElement CoinsTarget = driver.findElement(By.xpath("//a[test()='coins']"));
		    
		    Actions act = new Actions(driver);
		    
		    act.moveToElement(CoinsTarget).perform();
		    driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		    
		    Thread.sleep(2000);
		    WebElement CoinsElement = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		    Thread.sleep(2000);
		    
		//Take a SS of Demo Apps 
		File src = CoinsElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Coin.png");
		Files.copy(src, dest);
		 
		//
	}

}
