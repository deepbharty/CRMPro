package QaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddNewContact {

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
	    
	    Thread.sleep(2000); 
	    WebElement newcontact=driver.findElement(By.xpath("//a[text()='New Contact']"));
		action.moveToElement(newcontact).click().build().perform();
	    System.out.println("New contact form has been opened");
	    
	    Thread.sleep(3000);
	    //Selecting Title of the person
	    WebElement title=driver.findElement(By.name("title"));
	    Select DropDown=new Select(title);
	    	DropDown.selectByVisibleText("Mr.");
	    	
	    	System.out.println("Title selected");
	    	
	    	driver.findElement(By.name("first_name")).sendKeys("Rakesh ");
	    	driver.findElement(By.name("surname")).sendKeys("Patra");
	    	
	    	driver.findElement(By.name("nickname")).sendKeys("Motu");
	    	driver.findElement(By.name("client_lookup")).sendKeys("Monday Morning");
	    	driver.findElement(By.name("company_position")).sendKeys("QA Engineer");
	    	driver.findElement(By.name("department")).sendKeys("QA Team");
	    
	    	
	    	 WebElement category=driver.findElement(By.name("category"));
	 	    Select DropDown1=new Select(category);
	 	    	DropDown1.selectByVisibleText("Friend");
	 	    	
	 	    	 WebElement status=driver.findElement(By.name("status"));
	 		    Select DropDown2=new Select(status);
	 		    	DropDown2.selectByVisibleText("Active");
	 		    	
	 		    	
	 		    	driver.findElement(By.name("phone")).sendKeys("0123456789");
	 		   	driver.findElement(By.name("email")).sendKeys("rakeshk@yopmail.com");
	 		   	
	 		   	
	 		   	//Save button click
	 		   	
	 		   	driver.findElement(By.xpath("//form[@name='contactForm']/table/tbody/tr/td/input[2]")).click();
	 		   	
	 		   	driver.close();
}}
