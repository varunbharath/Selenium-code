package selemium_Practice;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// URL launch

		driver.navigate().to("https://www.mycontactform.com/samples.php");
		Random ran=new Random();
		//Send to
		WebElement drop=driver.findElement(By.xpath("//select[@id='q3']"));
		drop.click();
		//Select value=new Select(drop);
		////value.selectByIndex(3);
		//System.out.println("value of the first dropdown"+value);
		List<WebElement> moreoptions=driver.findElements(By.xpath("//select[@id='q3']//option"));
		int stored=ran.nextInt(moreoptions.size());
		  moreoptions.get(stored).click();
		  
		  
		
			

		

	}

}
