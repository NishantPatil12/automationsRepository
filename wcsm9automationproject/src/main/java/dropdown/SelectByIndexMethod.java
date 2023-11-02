package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 driver.get("http://demoapps.qspiders.com/dropdown");
		 
		 //identify dropdown options and click
		 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		 
		 //identify phone number
		 WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/12')]"));
		 Select sel=new Select(dropDown1);
		 
		 //select the options by using index
		 sel.selectByIndex(0);
		 Thread.sleep(2000);
		 
		 //identify country dropdown
         WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		 
		 Select sel2=new Select(dropDown2);
		 Thread.sleep(2000);
		 //select the options by using value
		 sel2.selectByValue("India");
		 
		 
		//identify state dropdown
		 WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		 
		 Select sel3=new Select(dropDown3);
		 Thread.sleep(2000);
		 //select the options by using visibletext
		 sel3.selectByVisibleText("Maharashtra");
		 
		//identify state dropdown
		 WebElement dropDown6 = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		 
		 Select sel6=new Select(dropDown6);
		 Thread.sleep(2000);
		 //select the options by using visibletext
		 sel3.selectByVisibleText("Mumbai");

		 Thread.sleep(2000);
		 
		 	
		 
		 //Multiselect
		 driver.navigate().to("http://demoapps.qspiders.com/dropdown");
		 //identify dropdown options and click
		 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		 
		 driver.findElement(By.partialLinkText("Multi Select")).click();
		 //identify country dropdown
         WebElement dropDown5 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
         
         Select sel5=new Select(dropDown5);
         Thread.sleep(2000);
         
         
         WebElement dropDown4 = driver.findElement(By.id("idddd"));
         
         Select sel4=new Select(dropDown4);
         Thread.sleep(2000);
            for(int i=0; i<=5; i++)
         {
        	 sel4.selectByIndex(i);
         }
         
         
	} 
		 	 
	}


