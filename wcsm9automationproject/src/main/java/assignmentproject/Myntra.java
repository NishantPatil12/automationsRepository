package assignmentproject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open the link
		driver.get("https://www.myntra.com/");
		
		//Click on search bar and search shoes
		driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]")).sendKeys("Shoes",Keys.ENTER);
		
	    //
		//driver.findElement(By.xpath("// a[contains(@class,'desktop-submit')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click(); 
		String parentHandle = driver.getWindowHandle();
		
		//get the address of all window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}

	}

}
