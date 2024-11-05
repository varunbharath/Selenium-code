package selemium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drodown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement test=driver.findElement(By.xpath("//select[@name='country']"));
		Select newselect=new Select(test);
		newselect.selectByValue("AMERICAN SAMOA");
	WebElement RANGE	=newselect.getFirstSelectedOption();
	String expected="AMERICAN SAMOA";
	
	if (RANGE.equals(expected)) {
	String Storedvalue	=RANGE.getText();
		System.out.println("expected value"+ Storedvalue);
		
		//System.out.println(expected); 
		
	}
	else {
		System.out.println("expected value is different"+RANGE.getText());
	}
		List< WebElement> size1=newselect.getOptions();
		int v1=size1.size();
		System.out.println(v1);
		for (WebElement web : size1) {
			System.out.println(web.getText());
				
			}
			
		}

	
}
