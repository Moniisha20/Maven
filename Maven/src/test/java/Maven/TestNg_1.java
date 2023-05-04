package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNg_1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monishs\\Desktop\\LearnTech\\Maven\\driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
		  WebDriver  driver = new ChromeDriver(options);
		  //driver = new ChromeDriver();

		driver.manage().window().maximize();
		
	driver.get("http://facebook.com/");
	//Thread.sleep(10000);
	String title = driver.getTitle();
	System.out.println(title);
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	//WebElement mail = driver.findElement(By.id("email"));
	WebElement mail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	mail.sendKeys("monihsa");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("iagvjhf");
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
//	driver.quit();
}
}