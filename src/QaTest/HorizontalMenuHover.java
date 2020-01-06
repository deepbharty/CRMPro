package QaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HorizontalMenuHover {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium Topics\\lib\\Seleniumjars\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.crmpro.com/");

		//Login
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("deepbharty10");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		System.out.println("Login successfully");
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
		//Calendar Menu
		WebElement calendar = driver.findElement(By.xpath("//a[text()='Calendar']"));
	     Actions action=new Actions(driver);
	    action.moveToElement(calendar).build().perform();
	    
	    Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("//a[text()='New Event']")).click();
	   
	    //Companies menu
	    Thread.sleep(2000);
	    WebElement Companies = driver.findElement(By.xpath("//a[text()='Companies']"));
	     Actions action1=new Actions(driver);
	    action1.moveToElement(Companies).build().perform();
	    //Contacts
	    Thread.sleep(2000);
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
	     Actions action2=new Actions(driver);
	    action2.moveToElement(contact).build().perform();
	    
	    //Deals
	    Thread.sleep(2000);
		
		WebElement deals = driver.findElement(By.xpath("//a[text()='Deals']"));
	     Actions action3=new Actions(driver);
	    action3.moveToElement(deals).build().perform();
	    
	    //Tasks
	    
       Thread.sleep(2000);
		WebElement task = driver.findElement(By.xpath("//a[text()='Tasks']"));
	     Actions action4=new Actions(driver);
	    action4.moveToElement(task).build().perform();
	    
	    //Cases
	    
	    Thread.sleep(2000);
	    WebElement cases = driver.findElement(By.xpath("//a[text()='Cases']"));
	     Actions action5=new Actions(driver);
	    action5.moveToElement(cases).build().perform();
	    
	    //Call
	    Thread.sleep(2000);
	    WebElement call = driver.findElement(By.xpath("//a[text()='Call']"));
	     Actions action6=new Actions(driver);
	    action6.moveToElement(call).build().perform();
	    
	    //Email
	    Thread.sleep(2000);
	    WebElement email = driver.findElement(By.xpath("//a[text()='Email']"));
	     Actions action7=new Actions(driver);
	    action7.moveToElement(email).build().perform();
	  
	    //Text/SMS
	    Thread.sleep(2000);
	    WebElement sms = driver.findElement(By.xpath("//a[text()='Text/SMS']"));
	     Actions action8=new Actions(driver);
	    action8.moveToElement(sms).build().perform();
	    
	    //Print
	    Thread.sleep(2000);
	    WebElement Print = driver.findElement(By.xpath("//a[text()='Print']"));
	     Actions action9=new Actions(driver);
	    action9.moveToElement(Print).build().perform();
	 
	    //Campaigns
	    Thread.sleep(2000);
	    WebElement Camp = driver.findElement(By.xpath("//a[text()='Campaigns']"));
	     Actions action10=new Actions(driver);
	    action10.moveToElement(Camp).build().perform();
	    
	    
	  //Docs
	    Thread.sleep(2000);
	    WebElement Doc = driver.findElement(By.xpath("//a[text()='Docs']"));
	     Actions action11=new Actions(driver);
	    action11.moveToElement(Doc).build().perform(); 
	    
	   // Forms 
	    Thread.sleep(2000);
	    WebElement form = driver.findElement(By.xpath("//a[text()='Forms']"));
	     Actions action12=new Actions(driver);
	    action12.moveToElement(form).build().perform(); 
	   
	    // Reports
	    Thread.sleep(2000);
	    WebElement Report = driver.findElement(By.xpath("//a[text()='Reports']"));
	     Actions action13=new Actions(driver);
	    action13.moveToElement(Report).build().perform(); 
	    
	    Thread.sleep(2000);
		driver.close();
	}

}
