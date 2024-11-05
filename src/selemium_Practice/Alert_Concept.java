package selemium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//Java Script Alert Box
	WebElement Alertclick1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		Alertclick1.click();
//		
	Alert a= driver.switchTo().alert();
	a.accept();
//		
		// Java Script Confirm Box
		
	WebElement js_confirmbox=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
	js_confirmbox.click();
	Alert b= driver.switchTo().alert();
	b.dismiss();
//		
		// Java Script Alert Box
		WebElement promtbox=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		promtbox.click();
		
		Alert promt=driver.switchTo().alert();
		Thread.sleep(5000);
		promt.sendKeys("description");
		Thread.sleep(5000);
		promt.accept();
		
		
		
		
		
	}

}
