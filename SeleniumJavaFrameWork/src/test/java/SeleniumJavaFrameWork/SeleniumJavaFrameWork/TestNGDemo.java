package SeleniumJavaFrameWork.SeleniumJavaFrameWork;

import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.TextBox;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGDemo {

	static WebDriver driver = null;
	
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:/Users/elvin/Desktop/Selenium/QA/Selenium/jars/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	}
	
	@Test
	public static void googleSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/elvin/Desktop/Selenium/QA/Selenium/jars/chromedriver.exe");
		driver= new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();	
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Step by Step in Selenium");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void Closebrowser() {
		
		driver.close();
		System.out.println("The Process is Successfull");
	}
}
