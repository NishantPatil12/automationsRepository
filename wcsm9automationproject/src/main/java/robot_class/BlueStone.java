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

public class BlueStone {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.bluestone.com/");
        Thread.sleep(2000);
        
      //Handle the pop up
        driver.findElement(By.id("denyBtn")).click();
        
        
        Robot robot = new Robot();
        
        Actions act = new Actions(driver);
        
        WebElement element1 = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
        act.moveToElement(element1).perform();
        
        driver.findElement(By.xpath("//a[text()='Band']")).click();
        WebElement element2 = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
        
        for(int i=0;i<2;i++) {
       	 act.doubleClick(element2);
       	 Thread.sleep(2000);
           act.clickAndHold(element2).perform();
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        
        robot.keyRelease(KeyEvent.VK_CONTROL); 
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(2000);
        
        driver.findElement(By.id("search_query_top_elastic_search")).click();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        driver.findElement(By.name("submit_search")).click();

}
}
