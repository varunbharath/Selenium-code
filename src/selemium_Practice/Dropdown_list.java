package selemium_Practice;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		//driver.navigate.("https://www.mycontactform.com/samples.php");
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='q10']"));
		
		  // Create a Select object
		Select value=new Select(dropdown);
		value.selectByVisibleText("Prince Edward Island");
		
		
        // Get the selected option
	WebElement verify	=value.getFirstSelectedOption();
	
	

    // Expected value
	String Expectedvalue="Prince Edward1 Island";
	
	
	 // Verify if the selected option's value matches the expected value
	
	if (verify.getText().equalsIgnoreCase(Expectedvalue)) {
		System.out.println("Selected value is correct:"+verify.getText());
		
	}
	else {
		System.out.println("Selected value is incorrect. Expected:"+Expectedvalue+"but I got"+verify.getText());
	}
	
	// Get all options in the dropdown
		
	List<WebElement> options	=value.getOptions();
	int range	=options.size();
	System.out.println(range);
	// Print all options in the dropdown
	//JComboBox<WebElement> printer=new JComboBox<WebElement>();
	for (WebElement a : options) {
		System.out.println(a.getText());
		
		
	
		
	}

	}

}
