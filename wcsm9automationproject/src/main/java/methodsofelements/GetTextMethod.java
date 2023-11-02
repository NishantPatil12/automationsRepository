package methodsofelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// open the search engine
				driver.get("https://www.google.com/");
				
				
				driver.switchTo().activeElement().sendKeys("Iphone");
				
				//explicit wait
				
			   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				Thread.sleep(2000);
				
				//get the suggetions of iphone
                List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='wM6W7d]"));
                
                for(WebElement phone:allIphone)
                {
                	System.out.println(phone.getText());
                }
                // driver.close();	
	}
              
}
