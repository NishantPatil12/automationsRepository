package SynchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.instagram.com/");
		
		
		
		driver.findElement(By.name("username")).sendKeys("admin12");
		
		driver.findElement(By.name("password")).sendKeys("admin12345");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'L')]")).click(); //for click on login
	}
	}


