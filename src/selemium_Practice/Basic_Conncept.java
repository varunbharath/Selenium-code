package selemium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class Basic_Conncept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");	
	//	System.setProperty("Webdriver.chrome.driver", );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null);
		driver.navigate().to("https://letcode.in/test");
		
		WebElement  edit = driver.findElement(By.xpath("//a[text()='Edit']"));
		edit.click();
		//Enter your full Name
		
		WebElement entername=driver.findElement(By.xpath("//input[@id='fullName']"));
		entername.sendKeys("Vibes");
		// //input[@id='getMe']
		WebElement clearvalue =driver.findElement(By.xpath("//input[@id='clearMe']"));
		clearvalue.clear();
		//getvalue
		WebElement getvalue1=driver.findElement(By.xpath("//input[@id='getMe']"));
	String a	=getvalue1.getAttribute("value");
	System.out.println(a);
	
	
		// is enabled
	WebElement isenabled1=driver.findElement(By.xpath("//input[@id='dontwrite']"));
	if(isenabled1.isEnabled()) {
		System.out.println("button is ennabled");
	}
	else {
		System.out.println( "Button is not enabled");
	}
		// is displayed
	WebElement displayed=driver.findElement(By.xpath("//input[@id='noEdit']"));
	displayed.isDisplayed();
	//System.out.println(displayed);
	if(displayed.isDisplayed()) {
		System.out.println("button is displayed");
	}
	else {
		System.out.println("button is not displayed");
	}
	
	//
	
	WebElement presskey=driver.findElement(By.xpath("//input[@id='join']"));
	presskey.sendKeys("value"+Keys.TAB);
	
	driver.navigate().back();
	
	///////////////////////////////////////
	//button
	WebElement buttonclick=driver.findElement(By.xpath("//a[text()='Click']"));
	buttonclick.click();
	
	//Get the X & Y co-ordinates
	WebElement positions=driver.findElement(By.xpath("//button[@id='position']"));
	Point xy=positions.getLocation();
	int x=xy.getX();
	int y=xy.getY();
	System.out.println(x+y);
	
	
	
	//Find the height & width of the button
	WebElement button_heightand_width=driver.findElement(By.xpath("(//button[@id='property'])[1]"));
	int height=button_heightand_width.getSize().getHeight();
	int witdh=button_heightand_width.getSize().getWidth();
	System.out.println(height+witdh);
	
	//Confirm button is disabled
	
	WebElement disabled=driver.findElement(By.xpath("(//button[@id='isDisabled'])[1]"));
	if(disabled.isEnabled()) {
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is not enabled");
	}
	
	//Click and Hold Button
	WebElement Holdbuttonclick=driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));
	Holdbuttonclick.click();
	
	
	//Find the color of the button
	WebElement color=driver.findElement(By.xpath("(//button[@id='color'])[1]"));
	String button_color=color.getCssValue("background-color");
	System.out.println(button_color);
	
	//WebElement dropdown=driver.findElement(By.xpath("//a[text()='Drop-Down']"));
	
	
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
//	wait.until(ExpectedConditions.visibilityOf(dropdown));
	driver.navigate().back();
	WebElement dropdown=driver.findElement(By.xpath("//a[text()='Drop-Down']"));
	
	
	dropdown.click();
	//Select the apple using visible text//select[@id='fruits']
	WebElement selectapple=driver.findElement(By.xpath("//select[@id='fruits']"));
	Select select=new Select(selectapple);
	select.selectByVisibleText("Apple");
	//Select your super hero's
WebElement Superhero=driver.findElement(By.xpath("//select[@id='superheros']"));
Select select1=new Select(Superhero);
select1.selectByIndex(0);
	//Select the last programming language and print all the options
	WebElement PL=driver.findElement(By.xpath("//select[@id='lang']"));
	Select select2=new Select(PL);
	select2.selectByIndex(4);
//	select2.selectByValue("C#");
	List<WebElement> options1=select2.getOptions();
	int viewoptions=options1.size();
	System.out.println(viewoptions+"view options");
	
	for (WebElement webElement : options1) {
		
	
	
	//	if(webElement.equals("C#")) {
		String stored	=webElement.getText();
		System.out.println(stored);
		//}
		
	}
	
	//Select India using value & print the selected value
	WebElement india1=driver.findElement(By.xpath("//*[@id='country']"));
	Select select3=new Select(india1);
	//select3.selectByValue("India");
	
	select3.selectByVisibleText("India");
	WebElement s1=select3.getFirstSelectedOption();
	String value="India";
	String s2	=s1.getText();
	System.out.println(s1.getText());
	
	//List<WebElement> opt=select3.getOptions();
	if(s2.equals(value)) {
	
		System.out.println("samevalue"+s2);
	}
	else {
		System.out.println("not printed");
	}
	
	
		
	}

}
