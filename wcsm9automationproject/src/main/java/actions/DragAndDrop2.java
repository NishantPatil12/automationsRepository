package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
//		 driver.findElement(By.xpath());
//		 driver.findElement(By.xpath());
//		 driver.findElement(By.xpath());
//		 driver.findElement(By.xpath());
//		 Actions act = new Actions(driver);
		
	}

}
