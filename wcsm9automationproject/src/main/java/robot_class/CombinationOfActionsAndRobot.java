package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CombinationOfActionsAndRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigate to web page
		driver.get("https://www.selenium.dev");
		
		
		//identify news element
		WebElement newsTarget=driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		
		Thread.sleep(2000);
		
		//perform right click on News 
		Actions act = new Actions(driver);
		act.contextClick(newsTarget).build().perform();
		
		Thread.sleep(2000);
		
		//press pagedown go till to inspect
		Robot robot =new Robot();
		
		for(int i=0;i<10;i++) {
			Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		 //press enter key
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Generate print pop up ctrl+p
		
		Thread.sleep(2000);
		
	}

}
