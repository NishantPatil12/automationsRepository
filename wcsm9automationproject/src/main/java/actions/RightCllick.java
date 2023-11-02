package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightCllick 
{

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 
			     //Implicit Wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 driver.get("https://demoapps.qspiders.com/button");
				 
				
				 driver.findElement(By.xpath("//section[text()='Button']")).click();
				 driver.findElement(By.xpath("//a[text()='Right Click']")).click();
				 
				 Actions act = new Actions(driver);
				 
				 WebElement rightclick1= driver.findElement(By.xpath("//button[text()='Right Click'])[1]"));
				 WebElement rightclick2= driver.findElement(By.xpath("//button[text()='Right Click'])[2]"));
				 WebElement rightclick3= driver.findElement(By.xpath("//button[text()='Right Click'])[3]"));
				 
				 act.contextClick(rightclick1).perform();
				 driver.findElement(By.xpath("//div[text()='Yes']")).click();
				 
				 act.contextClick(rightclick2).perform();
				 driver.findElement(By.xpath("//div[text()='Yes']")).click();
				 
				 act.contextClick(rightclick3).perform();
				 driver.findElement(By.xpath("//div[text()='4']")).click();

	}

}
