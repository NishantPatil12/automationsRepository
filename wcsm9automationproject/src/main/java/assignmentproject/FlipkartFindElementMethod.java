package assignmentproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 
		driver.get("https://www.flipkart.com/");
		 
		//Handle the Popup
		driver.findElement(By.xpath("//span[contains(@class,'_30XB9F')and (text()='✕')]")).click();
		 
		
		//Click on search bar and search product
		//div[contains(@class,'_4rR01T')and (text()='APPLE iPhone 14 (Starlight, 128 GB)')]
		 driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 //applying filter 
		 //Processor
		 driver.findElement(By.xpath("//div[contains(@class,'_24_Dny')]")).click();
		 Thread.sleep(2000);
		 
		 //Brand name
		 driver.findElement(By.xpath(" //div[(text()='HP')]")).click();
		 Thread.sleep(2000);
		 
		 //Ram
		 driver.findElement(By.xpath("//div[contains(@class,'_3879cV') and (text()='8 GB')]")).click();
		 Thread.sleep(2000);
		 
		 //Customer Rtings
		 driver.findElement(By.xpath("//div[(text()=' 4★ & above')]")).click();
		 Thread.sleep(2000);
		 
		 //
		 
		 //identify the name of laptops
//		 List<WebElement> allLaptops=driver.findElements(By.
//		for (int=0,i<allLaptops.size();i++)
//		{
//			String Laptop=allLaptop.get(i).getText();
//			Thread.sleep(2000);
//			System.out.println(Laptops);
		}
			
	

}
