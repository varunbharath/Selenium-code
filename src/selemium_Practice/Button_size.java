package selemium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		//driver.navigate.("https://www.mycontactform.com/samples.php");
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		WebElement buttonsize=driver.findElement(By.xpath("//input[@name='submit']"));
	int height	=buttonsize.getSize().height;
	int width=buttonsize.getSize().width;
	
	System.out.println(" Button height :"+height+ "   "+"Button Width :"+width);

	}

}
