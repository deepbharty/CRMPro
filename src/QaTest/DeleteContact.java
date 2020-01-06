package QaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteContact {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Programmed Files\\Eclipse\\SeleniumPractise\\lib\\ChromeDriver\\chromedriver.exe"); 
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
		
		Thread.sleep(2000);
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
	     Actions action=new Actions(driver);
	    action.moveToElement(contact).build().perform();
	    
	    System.out.println("Contact navigation");
	    
	    //Full search Form Click
	    
	    Thread.sleep(2000); 
	    WebElement fullsearch=driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/ul/li[3]/a"));
		action.moveToElement(fullsearch).click().build().perform();
	    System.out.println("Full Search form has been opened");
	    
	    Thread.sleep(3000); 
	    
	    driver.findElement(By.xpath("//form[@name='contactForm']/table/tbody/tr[1]/td//input[@value='Search Contacts']")).click();
	    
	    //Deleting contact
	    
	    driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[5]/td[8]/a[5]/i")).click();
	    //driver.close();
	}

}//*[@id="vContactsForm"]/table/tbody/tr[5]/td[8]/a[5]/i
