package QaTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuHover {
	
	static WebDriver driver;
	static Actions action;
	static WebDriverWait waits;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Programmed Files\\Eclipse\\SeleniumPractise\\lib\\ChromeDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.crmpro.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Login
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("deepbharty10");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		System.out.println("Login successfully");
		driver.switchTo().frame("mainpanel");
		//Menu Click
		//WebElement menu = driver.findElement(By.xpath("//div[@id='navmenu']//ul//li[4]//a[text()='Contacts']"));	
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
		waits=new WebDriverWait(driver,30);
		action=new Actions(driver);
		waits.until(ExpectedConditions.visibilityOf(contact));
	    action.moveToElement(contact).build().perform();
		//Submenu
		//WebElement submenu=driver.findElement(By.linkText("New Contact"));
		WebElement newcontact=driver.findElement(By.xpath("//a[text()='New Contact']"));
		action.moveToElement(newcontact).click().build().perform();
		Thread.sleep(2000);
		driver.quit();
	}
}

