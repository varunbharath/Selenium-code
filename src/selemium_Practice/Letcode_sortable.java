package selemium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Letcode_sortable{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/test");
		
		

		WebElement Sortablee=driver.findElement(By.xpath("//a[contains(text(),'AUI - 3')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",Sortablee);
		//windowclick.click();
		
		driver.switchTo().frame(0);
		
		List<WebElement> Sortable1=driver.findElements(By.xpath("//*[@id='cdk-drop-list-0']//div"));
		
		WebElement From=Sortable1.get(2);
	WebElement to	=Sortable1.get(1);
	Actions per=new Actions(driver);
	per.clickAndHold(From).moveToElement(to).release(to).build().perform();
		   
	//
	List<WebElement> Secondsortable=driver.findElements(By.xpath("//*[@id='cdk-drop-list-1']//div"));
	
	WebElement FromElement=Secondsortable.get(2);
	WebElement toElement=Secondsortable.get(4);
	Actions tryit= new Actions(driver);
	tryit.clickAndHold(FromElement).moveToElement(toElement).release(toElement).build().perform();
	
	}

}
