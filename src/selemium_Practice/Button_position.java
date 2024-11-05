package selemium_Practice;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class Button_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		driver.navigate().refresh();
		driver.get("https://www.mycontactform.com/samples.php");
		//position of the button
WebElement  position=driver.findElement(By.xpath("//input[@name='submit']"));
org.openqa.selenium.Point findposition =position.getLocation();
int X=findposition.getX();
int Yvalue=findposition.getY();
int xx=findposition.x;
int yy=findposition.y;
System.out.println( "X value"+X+ "Y value is"+Yvalue);
System.out.println( "X value"+xx+ "Y value is"+yy);


// find the button colours
WebElement color= driver.findElement(By.xpath("//input[@name='submit']"));
String Stored=color.getCssValue("background-color");
System.out.println("button color"+Stored);
	}

}
