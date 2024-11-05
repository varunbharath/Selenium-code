package selemium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_listshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	List<WebElement>	options=driver.findElements(By.xpath("//tbody[1]//following::tr//a[text()]"));
List<WebElement> change=driver.findElements(By.xpath("//font[@class='green']"));
List<WebElement> change1=driver.findElements(By.xpath("(//td[text()][4])"));
List<WebElement> change2=driver.findElements(By.xpath("(//td[3])"));
List<WebElement> change3=driver.findElements(By.xpath("//td[2]"));

//=driver.findElements(By.xpath(""))
	//for (WebElement webElement : options) {
		
	//String Storedvalue	=webElement.getText();
//		System.out.println("Companyname + "+ Storedvalue);
//		System.out.println("Group + "+ Storedvalue);
//		System.out.println("	Prev Close (Rs) + "+ Storedvalue);
//		System.out.println("Current Price (Rs) + "+ Storedvalue);
//		System.out.println("% Change+ "+ Storedvalue);

	for(int i=1;i<options.size();i++) {
	String a	=options.get(i).getText();
		System.out.println(" Companyname" +a);
		
			//System.out.println(" Change" +a);
			//System.out.println("% Change+ "+ options);
			//System.out.println("% Change+ "+ Storedvalue);
		
for(int j=i;j<change.size();j++) {
	String b=change.get(j).getText();
System.out.println(" Change" +b);

for(int k=j;k<change1.size();k++) {
String b1=change1.get(k).getText();
System.out.println("	Current Price (Rs) " +b1);

	for(int l=k;l<change1.size();l++) {
	String b2=change1.get(l).getText();		System.out.println("	Current Price (Rs) " +b2);
//for(int M=2;M<change3.size();M++) {
//	String b3=change3.get(M).getText();
//	System.out.println("		Group" +b3);
//					
					
				
	}}}}}}
	


