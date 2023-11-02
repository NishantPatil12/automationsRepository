package methodsofelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrtAttributeMethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(2000);
				
				//get the attribute value of username textbox i.e name attribute
				WebElement usnTB=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				String attributeValue = usnTB.getAttribute("class");
				System.out.println(attributeValue);
				
				//get the css property of username textbox i.e color
				String cssValue = usnTB.getCssValue("color");
				System.out.println(cssValue);
				
				//get the css property of username textbox i.e width
				String csssValue = usnTB.getCssValue("width");
				System.out.println(csssValue);
				
				driver.close();
	}

}
