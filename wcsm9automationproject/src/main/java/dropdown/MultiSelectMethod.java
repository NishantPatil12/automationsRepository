package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 driver.get("http://demoapps.qspiders.com/dropdown");
		 
		 //identify dropdown options and click
		 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		 driver.findElement(By.partialLinkText("Multi Select")).click(); 
		 
		 //identify phone number
		 WebElement CitydropDown1 = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		 			 
		 Select sel=new Select(CitydropDown1);
		 boolean status1= sel.isMultiple();
		 System.out.println(status1);
	}

}
