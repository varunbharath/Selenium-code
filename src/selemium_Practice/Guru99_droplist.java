package selemium_Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_droplist {

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		//WebElement dropdown=driver.findElement(By.xpath("//select[@name='q10']"));
		WebElement v1=driver.findElement(By.xpath("//select[@name='country']"));
		Select variable1= new Select(v1);
	List<WebElement>	options=variable1.getOptions();
	int sizeofdropdown=options.size();
	System.out.println("sizeofdropdown"+sizeofdropdown);
	for (WebElement storedvalues : options) {
		String values=storedvalues.getText();
		//or 
		//System.out.println(storedvalues.getText());
		boolean isPresent = false;
		System.out.println(values);
		if (values.equalsIgnoreCase("present")) {
			isPresent=true;
			System.out.println("Present");
			
		}
		else {
			System.out.println("not present");
			
		}
		
		
		
	}
		
	}}

