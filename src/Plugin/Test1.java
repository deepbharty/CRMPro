package Plugin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\CRMPro\\lib\\Seleniumjars\\Chrome\\chromedriver1.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://newpixxlesstore.myshopify.com/pages/pixxlespayment");
		
		driver.findElement(By.xpath("//a[contains(text(),\" Enter using password \")]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"LoginModal\"]/div/div/p/a")).click();
		
		
		//shopify Login Module
		
		driver.findElement(By.id("account_email")).sendKeys("pratimap@chetu.com");
		
		driver.findElement(By.name("commit")).click(); // Next Button Click
		
		
		driver.findElement(By.id("account_password")).sendKeys("newpixxlesstore@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); // LOgin Button Click
		
		System.out.println(" Login successful");
		
		//
		

		driver.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[2]/li[2]/div/a[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Popover3\"]/div/div/div/ul/li/a/div/div[2]")).click();
		
		
	}
}
