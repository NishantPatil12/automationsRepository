package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get("http://demoapps.qspiders.com/dropdown");
			//identify dropdown options and click
			 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
			 WebElement dropDown1=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
			 Select sel1 = new Select(dropDown1);
			 boolean status= sel1.isMultiple();
			 System.out.println(status);
			 
			 driver.findElement(By.partialLinkText("Multi Select")).click();
			 WebElement dropDown2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
			 Select sel2 = new Select(dropDown2);
			 boolean status1= sel2.isMultiple();
			 System.out.println(status1);
			 
			 

	}

}
