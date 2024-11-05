package selemium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_webside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", null);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.seleniumeasy.com/");
		WebElement Basicoption=driver.findElement(By.xpath("//a[@id='basic_example']"));
		Basicoption.click();
		
		
		WebElement Sample=driver.findElement(By.xpath("(//a[text()='Simple Form Demo' and @href=\"./basic-first-form-demo.html\"])[3]"));
		Basicoption.click(); 
		
		//frame
		driver.switchTo().frame(0);
		WebElement Sample1=driver.findElement(By.xpath("(//a[text()='Simple Form Demo' and @href=\"./basic-first-form-demo.html\"])[3]"));
		Basicoption.click(); 
		driver.switchTo().defaultContent();
		
		
	}

}
