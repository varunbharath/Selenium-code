package selemium_Practice;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("Webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.mycontactform.com/samples.php");
//		driver.navigate().refresh();
//		driver.get("https://www.mycontactform.com/samples.php");
//		
		
		Date currentdate=new Date();
		SimpleDateFormat stored=new SimpleDateFormat("dd-MM-YYYY");
		String a=stored.format(currentdate);
		System.out.println(a);
		
		
		
		

	}

}
