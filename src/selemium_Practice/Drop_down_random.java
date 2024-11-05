package selemium_Practice;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;

public class Drop_down_random {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random ran=new Random();
		
		//Select Langauge
		 WebElement dropdown = driver.findElement(By.xpath("//div[@id='msdd']"));
	        dropdown.click();

		 List<WebElement> language = driver.findElements(By.xpath("//li[@class='ng-scope']"));
	        int list1 = ran.nextInt(language.size());
	        language.get(list1).click();
	        Thread.sleep(3000);
	        
	        WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		      day.click();
	        
	        //select Skills
	        
	        WebElement skillsdropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
	        skillsdropdown.click();
	        
	       List<WebElement> Skills=driver.findElements(By.xpath("//select[@id='Skills']//option"));
	      int StoredSkills =ran.nextInt(Skills.size());
	      Skills.get(StoredSkills).click();
	      Thread.sleep(3000);
	      
	      WebElement day1=driver.findElement(By.xpath("//select[@id='daybox']"));
	      day.click();
	      
	      //select countries
	      
	      WebElement countries=driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
	      countries.click();
	     
	      WebElement enterthecountry=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	      
	      Actions act=new Actions(driver);
	      act.sendKeys(enterthecountry, "India");
	      act.build().perform();
	      
          Thread.sleep(3000);
	     
	      day.click();
	      

	        
		
	}

}
