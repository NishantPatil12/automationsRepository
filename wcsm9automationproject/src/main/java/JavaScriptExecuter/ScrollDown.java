package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Scroll Up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		//Scroll Right
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		
		//Scroll Left
		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("window.scrollBy(-500,0)");

	}

	}


