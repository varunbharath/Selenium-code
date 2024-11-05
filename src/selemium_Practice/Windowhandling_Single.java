package selemium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
	
String oldwinow		=driver.getWindowHandle();
		
WebElement a= driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']"));
a.click();


WebElement b= driver.findElement(By.xpath("//span[text()=\"Sign up\"]"));
b.click();

//*[@id="layers"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/button[1]

WebElement c= driver.findElement
(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/button[1]\r\n"
		));
c.click();

	}

}
