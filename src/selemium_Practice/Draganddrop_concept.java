package selemium_Practice;

import java.awt.Dimension;
import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_concept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver"," C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		 Dimension a=new Dimension();
		
		 //driver.manage().window().setSize(a);
		driver.navigate().to("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		//or 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0] click()", firstframe);
	WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(3000);
	Actions mouseperform=new Actions(driver);
	mouseperform.dragAndDrop(from, to).build().perform();


	}

}
