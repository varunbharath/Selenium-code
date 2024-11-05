package selemium_Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MY_Contact_form_Application {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");

	//	System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mycontactform.com/samples.php");



		 
		
		WebElement Marketingtype=driver.findElement(By.xpath("(//input[@name='email_to[]'])[1]"));
		if(Marketingtype.isSelected()) {
			
			System.out.println("Default selected");
		}
		else {
			Marketingtype.click();
			System.out.println("Clicked by Automation");
		}
		WebElement sales= driver.findElement(By.xpath("(//input[@name='email_to[]'])[2]"));
		if(sales.isSelected()) {
			System.out.println("default select");
			
		}
		else {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", sales);
			System.out.println("clicked By Automation");
		}
		WebElement customerservice=driver.findElement(By.xpath("(//input[@name='email_to[]'])[3]"));
		if (customerservice.isSelected()) {
			
			
			System.out.println("default select");
		}
		else 
		{
			JavascriptExecutor jss=(JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click()", customerservice);
		}
		
		// subject
		
		WebElement Subject=driver.findElement(By.xpath("//input[@id='subject']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement boxfield =driver.findElement(By.xpath("//input[@id='q1']"));
		WebElement multiline=driver.findElement(By.xpath("//textarea[@id='q2']"));
		Actions act=new Actions(driver);
		
		act.sendKeys(Subject, "Application ");
		
		act.sendKeys(email ,"12345@gmail.com");
		act.sendKeys(boxfield,"Characters");
		act.sendKeys(multiline, "I will enter few points here").build().perform();
		Random ran=new Random();
		
		
	WebElement	Dropdownbox= driver.findElement(By.xpath("//select[@id='q3']"));
	Dropdownbox.click();
List<WebElement>	dropdownbox1=driver.findElements(By.xpath("//select[@id='q3']//option"));

	int Storeddropdown=ran.nextInt(dropdownbox1 .size());
	dropdownbox1.get(Storeddropdown).click();
	for (WebElement webElement : dropdownbox1) {
		String dropdownvalues=webElement.getText();
		System.out.println(dropdownvalues);
			
		}
//	JavascriptExecutor js3=(JavascriptExecutor)driver;
//	js3.executeScript("window.scrollBy(0,1000");
	WebElement clicksomeother=driver.findElement(By.xpath("//select[@id='q10']"));
	clicksomeother.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//radio button
	WebElement secondradiobutton=driver.findElement(By.xpath("//input[@value='Second Option']"));
	secondradiobutton.click();

	//singlecheckbox
	WebElement singlebox=driver.findElement(By.xpath("//input[@id='q5']"));
	singlebox.click();
	
	//firstcheckbox
	WebElement Firstcheckbox=driver.findElement(By.xpath("//input[@value='First Check Box']"));
	if(Firstcheckbox.isSelected()) {
		System.out.println("defaultselected");
	}
	else {
		Firstcheckbox.click();
		System.out.println("firstcheckbox clicked by automation");
	}
	
	WebElement secondcheckbox=driver.findElement(By.xpath("//input[@value='Second Check Box']"));
	if(secondcheckbox.isSelected()) {
		System.out.println("defaultselected");
	}
	else {
		secondcheckbox.click();
		System.out.println("secondcheckbox clicked by automation");
	}
	WebElement Fifthcheckbox=driver.findElement(By.xpath("//input[@value='Fifth Check Box']"));
	if(Fifthcheckbox.isSelected()) {
		System.out.println("defaultselected");
	}
	else {
		Fifthcheckbox.click();
		System.out.println("firstcheckbox clicked by automation");
	}
	
	WebElement thirdcheckbox=driver.findElement(By.xpath("//input[@value='Third Check Box']"));
	if(thirdcheckbox.isSelected()) {
		System.out.println("defaultselected");
	}
	else {
		thirdcheckbox.click();
		System.out.println("thirdcheckbox clicked by automation");
	}
	WebElement Fourthcheckbox=driver.findElement(By.xpath("//input[@value='Fourth Check Box']"));
	if(Fourthcheckbox.isSelected()) {
		System.out.println("defaultselected");
	}
	else {
		Fourthcheckbox.click();
		System.out.println("fourthcheckbox clicked by automation");
	}

    TakesScreenshot scrshot = ((TakesScreenshot) driver);


    File source = scrshot.getScreenshotAs(OutputType.FILE);
	File a= new File(("C:\\Screenshotstroed\\amazondown3.PNG"));
    //File path = new File("D:\\screenshot\\img.png");
    FileUtils.copyFile(source,a);
    
    //datapicker
    
    WebElement datepicker=driver.findElement(By.xpath("//input[@id='q7']"));
//    JavascriptExecutor js5=(JavascriptExecutor)driver;
//    js5.executeScript("arguments[0].click()",datepicker);
    datepicker.click();
    Date selectdate= new Date();
    SimpleDateFormat simple=new SimpleDateFormat("dd-MM-YYYY");
  String Storeddateformat  =simple.format(selectdate);
  System.out.println(Storeddateformat);
    
   List<WebElement> storeddate =driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
  int checkthesize =storeddate.size();
  System.out.println("get the datpicker date"+checkthesize);
  for (WebElement webElement : storeddate) {
String Datestored	=webElement.getText();
System.out.println(Datestored);
	
if(Datestored.equals("25")) {
	webElement.click();
	System.out.println(Datestored);
}
else {
	System.out.println("Date is not picked");
	
}
////month
//WebElement Allmonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//Allmonth.click();
//
//List< WebElement>	listofmomths  = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']//option"));
//int Storedmonth =ran.nextInt(listofmomths.size());
//listofmomths.get(Storedmonth).click();
//
//for (WebElement webElement3 : listofmomths) {
//	String monthh=  webElement3.getText();
//	System.out.println(monthh);
//	  
//Date next1= new Date();
//SimpleDateFormat Sm=new SimpleDateFormat("dd-MM-YYYY");
//String currentt=Sm.format(next1);
//System.out.println(currentt);
//	
//}
//year
//	 WebElement Selectyear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
//	 Selectyear.click();
//	List<WebElement>  Allyear=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//Option"));
//	   int Allyearstored           =ran.nextInt(Allyear.size());
//	   Allyear.get(Allyearstored).click();
//	   for (WebElement webElement2 : Allyear)
//	   {
//	String years	=webElement2.getText();
//	System.out.println("years"+years);
//	}
	
} 
  
  WebElement usstate=driver.findElement(By.xpath("//select[@id='q8']"));
  usstate.click();
 List<WebElement> Allusstattes= driver.findElements(By.xpath("//select[@id='q8']//option"));
int sizeofstates =ran.nextInt(Allusstattes.size());
 
Allusstattes.get(sizeofstates).click();
for (WebElement webElement5 : Allusstattes) {
	String storedstates=webElement5.getText();
	System.out.println("Stored"+storedstates);
	
}

WebElement country=driver.findElement(By.xpath("//select[@id='q9']"));
Select select=new Select(country);
select.selectByVisibleText("American Samoa");
List<WebElement> options=select.getOptions();
int size22=options.size();
System.out.println(size22+"country");

WebElement canadian=driver.findElement(By.xpath("//select[@id='q10']"));
canadian.click();

List<WebElement> Allcandian=driver.findElements(By.xpath("//select[@name='q10']//option"));
int value=ran.nextInt(Allcandian.size());
Allcandian.get(value).click();

WebElement pre=driver.findElement(By.xpath("//select[@name='q11_title']"));
pre.click();

List<WebElement> prestored=driver.findElements(By.xpath("//select[@name='q11_title']//option"));
int prestoredvalue=ran.nextInt(prestored.size());
prestored.get(prestoredvalue).click();

WebElement firstname=driver.findElement(By.xpath("//input[@name='q11_first']"));
WebElement lastname=driver.findElement(By.xpath("//input[@name='q11_last']"));
act.sendKeys(firstname,"Varun");
act.sendKeys(lastname,"Bharath");

act.build().perform();
//dob month

WebElement dobmonth=driver.findElement(By.xpath("//select[@name='q12_month']"));
dobmonth.click();
List<WebElement> dobmon=driver.findElements(By.xpath("//select[@name='q12_month']//option"));
int monstored=ran.nextInt(dobmon.size());
System.out.println(monstored);
dobmon.get(monstored).click();
//dob day
WebElement dobday=driver.findElement(By.xpath("//select[@name='q12_day']"));
dobday.click();
List< WebElement> DOBDAY=driver.findElements(By.xpath("//select[@name='q12_day']//option"));

  int DOBDAYY  =ran.nextInt(DOBDAY.size());
  System.out.println(DOBDAYY);
  DOBDAY.get(DOBDAYY).click();
  
  
  //DOBYear
  
  WebElement Year1=driver.findElement(By.xpath("//select[@name='q12_year']"));
  Select SSselect=new Select(Year1);
  SSselect.selectByIndex(10);
 List<WebElement> Storedyear1 =SSselect.getOptions();
 int yearsize=Storedyear1.size();
 System.out.println("DoB year"+yearsize);
 
 //Attachfile
 WebElement uploadfile=driver.findElement(By.xpath("//input[@id='attach4589']"));
String storedfile ="C:\\\\Qtree_Selenium\\\\ChromeDriver\\\\chromedriver.exe";
 uploadfile.sendKeys(storedfile);
 
	File ab= new File(("C:\\Screenshotstroed\\amazondown8.PNG"));
    //File path = new File("D:\\screenshot\\img.png");
    FileUtils.copyFile(source,ab);
    
 
  
  //find buttonsize
 WebElement sizeofbutton=driver.findElement(By.xpath("//input[@value='Submit']"));
int height =sizeofbutton.getSize().getHeight();
int width=sizeofbutton.getSize().getWidth();
    System.out.println("Size of button = " +height +" " + width);
	
	//find button position
	 WebElement buttonposition1=driver.findElement(By.xpath("//input[@value='Submit']"));
	Point xy =buttonposition1.getLocation();
	int x=xy.getX();
	int y=xy.getY();
	System.out.println("button position"+ x +"  +"+y);
	
	WebElement username=driver.findElement(By.xpath("(//input[@id='user'])[1]"));
	WebElement Password=driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
	act.sendKeys(username,"Bharath");
	act.sendKeys(Password,"12456@2345");
	act.build().perform();
	WebElement login=driver.findElement(By.xpath("(//input[@value='Login'])[1]"));
	login.click(); 
	
	
	//find button color
	 WebElement clrofbutton=driver.findElement(By.xpath("//input[@value='Submit']"));
	String storedcolor=clrofbutton.getCssValue("    background-color");
	System.out.println(storedcolor+"Stored color");
	//click submitbutton
	WebElement button=driver.findElement(By.xpath("//input[@value='Submit']"));
button.click();

File ab1= new File(("C:\\Screenshotstroed\\amazondown11.PNG"));
//File path = new File("D:\\screenshot\\img.png");
FileUtils.copyFile(source,ab1);

	
	}
}
