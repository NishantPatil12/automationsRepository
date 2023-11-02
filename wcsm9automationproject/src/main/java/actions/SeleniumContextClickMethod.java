 package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumContextClickMethod {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	     //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		 
		
				 
		 WebElement element = driver.findElement(By.xpath("//span[text()='Downloads']"));
     	//Click on Download RightClick
     	Actions act = new Actions(driver);
     	act.moveToElement(element).perform();
     	act.contextClick(element).perform();
}
}