package SynchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
      //Applying Explicitly wait
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("check"))).click();
		WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(By.id("check")));
		ele.click();*/
		
		WebElement checkButton =driver.findElement(By.id("check"));
		explicitWait(driver,30,checkButton).click();
		
	}
	public static WebElement explicitWait (WebDriver driver,long sec,WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
		
	}

}
