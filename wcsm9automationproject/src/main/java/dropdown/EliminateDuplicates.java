package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///C:/Users/hp/Desktop/selenium%20data/Dropddown.html");
		 Thread.sleep(2000);
		 
		 WebElement menuDropdown = driver.findElement(By.id("idddd"));
          
		 //Get all the options of menudrop
		 Select sel = new Select(menuDropdown);
		 List<WebElement> allops= sel.getOptions();
		 
		 //to eleminate duplicates we use HASHSET
		 
		HashSet<String> hs = new HashSet<String> ();
				 
		//Read the list by using for loop and eliminate duplicates
		for(int i=0;i<allops.size();i++)
		{
			WebElement op= allops.get(i);
			
		//get the text of WebElement
		String DropdownOption = op.getText();
			
		//Add the Dropdown option into hashset and remove duplicates			
		hs.add(DropdownOption);
			
}
		Thread.sleep(2000);
		
		//Read the options from hashset by using for each loop
		for(String opt :hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		}
				 
	}


