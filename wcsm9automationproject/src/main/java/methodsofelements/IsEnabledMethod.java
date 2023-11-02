package methodsofelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Open the browser and pass the url and open the page
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
		
		WebElement LoginButtonElement =driver.findElement(By.id(""));
		
		//Verify login button is disabled or not
		 boolean status=LoginButtonElement.isEnabled();
		System.out.println(status);
		
		
		
		
		
		

	}

}
