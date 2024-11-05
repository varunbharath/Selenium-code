package selemium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Let_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/test");
		
		WebElement calendar= driver.findElement(By.xpath("//a[text()='Date & Time']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		//js1.executeScript("arguments[0],click();", calendar);
		js1.executeScript("arguments[0].click();", calendar);
		//calendar.click();

		
		List<WebElement> calenderlist=driver.findElements(By.xpath("(//div[@class='datepicker']//div[@class='datepicker-body'][1]//div[@class='datepicker-days'][1])[1]"));
		
		
		
		for (WebElement webElement : calenderlist) {
         String		Stored	=webElement.getText();
         System.out.println(Stored);
         
         if(Stored.equals("6")) {
         webElement.click();
         System.out.println("clicked");
		}
		else
		{
			System.out.println("not clicked");
		}
		
		
	}
		String a="JAVA";
		a.toUpperCase();
		System.out.println(a);
		
		
		
		
		
	}

}
