package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestSigma {

    public static void main(String[] args) throws Exception {
       

        // Instantiate the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Launch a website
        driver.get("https://testsigma.com/");
       
        driver.manage().window().maximize();
        // Identify the element to be hovered
      
        WebElement element = driver.findElement(By.xpath("//a[text()=’Resources’]"));
        // Instantiate the Actions class
        Actions actions = new Actions(driver);

        // Perform the mouse hover action
        actions.moveToElement(element).build().perform();
        
        // close the browser
        driver.close();
    }
}



