package methodsofelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Open the browser and pass the url and open the page
		driver.get("http://desktop-u6mlrj4/login.do");
		
		WebElement checkBoxElement =driver.findElement(By.id("keepLoggedInCheckBox"));
		
		
		 boolean status=checkBoxElement.isSelected();
		System.out.println(status);
		
		
		
		
	

	}

}
