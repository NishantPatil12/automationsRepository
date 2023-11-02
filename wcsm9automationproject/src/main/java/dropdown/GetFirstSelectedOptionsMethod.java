package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 driver.get("file:///C:/Users/hp/Desktop/selenium%20data/Dropddown.html");
		 
		 //Single Select Dropdown
		 WebElement dropDown1=driver.findElement(By.id("iddddd"));
		 
		 //Handle the Dropdown
		 Select sel=new Select(dropDown1);
		 
		 //select the options from dropdown
		 sel.selectByValue("v1");
		 
		 //get the option which is selected first
		 WebElement firstopt=sel.getFirstSelectedOption();
		 
		 //Get the text of 1st opt
		 System.out.println(firstopt.getText());
		 
		 
		 
		 //Multi Select dropdown
		 driver.navigate().to("");
		 
		 //identify dropdown
		 WebElement Dropdown=sel.getFirstSelectedOption();
		 //Handle the Dropdown
		 Select sel1=new Select(Dropdown);
		 
		 //select multiple option from multiple select drodown
		 for(int i=5; i<8;i++)
		 {
			 Thread.sleep(2000);
			 sel1.deselectByIndex(i);
		 }
		 
		 //get options
		 }
		 
	

}
