package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://demoapps.qspiders.com/");
		 
		 driver.findElement(By.xpath("//secction[text()='Drag And Drop']"));
		 driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		 
		 //store all the drag element
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		//store all the drop element
		WebElement Target1 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		//WebElement Target2 = driver.findElement(By.xpath("//div[@class']"));
		
		//Perform drag and Drop Elements
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, Target1).perform();
		
		
		
	}

}
