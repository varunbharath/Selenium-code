package selemium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class LoadBarWaitExample {
	public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.navigate().to("https://jqueryui.com/droppable/");

            // Wait for the loading bar to appear and then disappear
            By loadBarLocator = By.id("loadBar"); // Adjust the locator as per your actual loading bar

            // Initialize WebDriverWait
          //  WebDriverWait wait = new WebDriverWait(driver, 20);
         //  WebDriverWait wait=new WebDriverWait(driver,20);

            // Wait for the loading bar to be visible
          //  wait.until(ExpectedConditions.visibilityOfElementLocated(loadBarLocator));

            // Wait for the loading bar to disappear
         //   wait.until(ExpectedConditions.invisibilityOfElementLocated(loadBarLocator));

            // Switch to the frame containing the draggable and droppable elements
            driver.switchTo().frame(0);

            // Locate the draggable and droppable elements
            WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
            WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));

            // Perform the drag and drop action
            Actions action = new Actions(driver);
            action.clickAndHold(from).moveToElement(to).release(to).build().perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}


