package actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 
			     //Implicit Wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 driver.get("https://demoapps.qspiders.com/button");
				 
				 driver.findElement(By.xpath("//section[text()='Button']")).click();
				
				 //Click on doubleclick button
				 driver.findElement(By.partialLinkText("Double Click")).click();
				 
//				WebElement yesTarget= driver.findElement(By.xpath("//button[text()='Yes'])[1]")).click();
//				WebElement noTarget= driver.findElement(By.xpath("//button[text()='No'])[2]")).click();
//				WebElement scaleTarget= driver.findElement(By.xpath("//button[text()='5']")).click();
//		}

	}


}
