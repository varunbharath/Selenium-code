package selemium_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Let_go_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/test");
		
		WebElement window= driver.findElement(By.xpath("//a[text()='Tabs']"));
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
	//	js1.executeScript("arguments[0].click();", window);
		//js.executeScript("arguments[0].click();", window);
		window.click();
		driver.switchTo().frame(0);
		
		//oldwindow
		String oldwindow =driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement clickhomebutton=driver.findElement(By.xpath("//button[@id='home']"));
		clickhomebutton.click();
				//JavascriptExecutor js2=(JavascriptExecutor) driver;
	//	js2.executeScript("arguments[0],click()", clickhomebutton);
		//js2.executeScript("arguments[0].click();", clickhomebutton);
		
	Set<String>	newwindow=driver.getWindowHandles();
	
	for (String string : newwindow) {
		
		driver.switchTo().window(string);
		
	}
	WebElement windowconcept= driver.findElement(By.xpath("//a[text()='Tabs']"));
	//JavascriptExecutor js3=(JavascriptExecutor)driver;
	//js3.executeScript("arguments[0],click()", windowconcept);
	windowconcept.click();
	
		
		 
	}

}
