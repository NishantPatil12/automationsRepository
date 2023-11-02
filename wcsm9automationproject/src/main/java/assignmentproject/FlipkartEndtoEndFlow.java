package assignmentproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndtoEndFlow {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//span[contains(@class,'_30XB9F')and (text()='✕')]")).click();
		 
		//div[contains(@class,'_4rR01T')and (text()='APPLE iPhone 14 (Starlight, 128 GB)')]
		 driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		 driver.findElement(By.xpath("(//div[@class='_4rR01T'] )[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"swatch-1-color\"]/a/div")).click();

	}

}
