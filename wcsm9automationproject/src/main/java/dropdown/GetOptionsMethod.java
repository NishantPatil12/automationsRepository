package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get("http://demoapps.qspiders.com/dropdown");
			//identify dropdown options and click
			 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
			 
			 WebElement phonenodropDown=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));

			 //Get all the options present inside phone no.
			 Select sel2 = new Select(phonenodropDown);
			 List<WebElement> allops= sel2.getOptions();
			 
			 //We read list by using for loop
			 for(int i=0;i<allops.size();i++)
			 {
				 String opt=allops.get(i).getText();
				 Thread.sleep(2000);
				 System.out.println(opt);
			 }
			 
			 //We read list by using for each loop
			 for(WebElement op:allops)
			 {
				 String opt1=op.getText();
				 Thread.sleep(2000);
				 System.out.println(opt1);
			 }
			 
			 
	}

}
