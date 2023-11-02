package methodsofelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiplayed {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Open the browser and pass the url and open the page
		driver.get("http://desktop-u6mlrj4/login.do");
		
		
		//Identify username textbox
		driver.findElement(By.name("username")).sendKeys("admin");
		
		
		//Identify Password textbox
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		
		driver.findElement(By.id("loginButton")).click();
	
		
		//identify logout link for verify
		WebElement logoutLinkElement =driver.findElement(By.partialLinkText("Logout"));
		
		
		//check for logoutLinkElementis displayed or not
		boolean status=logoutLinkElement.isDisplayed();
		System.out.println(status);
		
		driver.close();
	}

}
