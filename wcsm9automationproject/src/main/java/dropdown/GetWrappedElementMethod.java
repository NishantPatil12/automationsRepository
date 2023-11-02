package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 driver.get("file:///C:/Users/hp/Desktop/selenium%20data/Dropddown.html");
		 
		 //single select dropdown
		 WebElement Dropdown=driver.findElement(By.id("iddddd"));
		 
		 //Handle Dropdown
		 Select sel = new Select(Dropdown);
		 
		 //get all the options from dropdown By using GetWrappedElementMethod
		 WebElement allops=sel.getWrappedElement();
		 System.out.println(allops.getText());
		 
		 //Get all the options from Dropdown by using get options
		 List<WebElement> options=sel.getOptions();
		 
		 
		 //Select the options from dropdown Without using Selection Method
		 for(WebElement opt:options)
		 {
			 Thread.sleep(2000);
			 if(opt.getText().equals("Pav bhaji"));
			 {
				 opt.click();
				 break;
			 }
		 }
		 

	}

}
