package methodsofelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("http://desktop-u6mlrj4/login.do");
		Thread.sleep(2000);
		
		//Identify username textbox
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
		
		//Identify Password textbox
		WebElement passTB =driver.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		usnTB.clear();
		passTB.clear();
		
		driver.close();
	}

}
