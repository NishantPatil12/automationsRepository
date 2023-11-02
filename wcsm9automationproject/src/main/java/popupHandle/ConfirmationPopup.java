package popupHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		
		//Generate Alert pop up
		driver.findElement(By.xpath("//button[contains(@class,'active:bg')]")).click();
		Thread.sleep(2000);
		

	}

}
