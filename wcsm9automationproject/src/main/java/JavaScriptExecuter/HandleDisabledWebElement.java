package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']"));
		
		//explicit type casting into JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		//Handle Disabled Name text box
		jse.executeScript("document.getElementById('name').value='Nishant'");
		Thread.sleep(2000);
		
		//Handle Disabled email text box
		jse.executeScript("document.getElementById('email').value='nishant123@gmail.com'");
		Thread.sleep(2000);
		
		//Handle Disabled Password text box
		jse.executeScript("document.getElementById('password').value='Nishant@123'");
		Thread.sleep(2000);
		
		//Handle Disabled Register button  
		WebElement DisabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		
		WebElement Login = driver.findElement(By.xpath("//a[contains(@class,'bg-orange-5')]"));
		if(DisabledButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click(),DisabledButton");
			Thread.sleep(2000);
			
			System.out.println("Button is disabled and click");
		}
		else
		{
			System.out.println("Button is not disabled and not click");
		}
		
    }
	


}
