package popupHandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		
		//Generate Alert pop up
		driver.findElement(By.xpath("//button[contains(@class,'active:bg')]")).click();
		Thread.sleep(2000);
		
		//Handle Alert pop up
		Alert al = driver.switchTo().alert();
		al.accept();
		
		//Accept alert pop up
		al.accept();
		
		//Dismiss Alert pop up		
		al.dismiss();
		
		//Get text alert pop up
		String textofAlert = al.getText();
		System.out.println(textofAlert);
		
		//Sendkeys alert pop up
		al.sendKeys("Nishant");
		
	}

}
