package selemium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Completion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/search?q=google");
		
		//clear the value
		WebElement searchclear=driver.findElement(By.xpath("//textarea[@name='q']"));
		searchclear.clear();
		
		//Pass the vale
		WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("acc");
		
		List<WebElement> options=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]"));
	int sizeoption=options.size();

	for(WebElement option1:options) {
		System.out.println(option1);
	}
	System.out.println(sizeoption);
	for (WebElement dropdownselect : options) {
		if (dropdownselect.getText().equalsIgnoreCase("accenture")) {
			dropdownselect.click();
		System.out.println(dropdownselect.getText());
		
		
	}
			
		}
		
	}}


