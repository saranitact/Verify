package com.devops.Inventory;

//Integration Test Cases
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;
import java.lang.Thread;

import java.util.concurrent.TimeUnit;

import org.junit.experimental.categories.Category;
import com.devops.Inventory.IntegrationTest;

@Category(IntegrationTest.class)
public class IntegrationTest {

	static WebDriver driver;
	

	@BeforeClass
	public static void setup() {
		//Chrome webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\SARAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Firefox webdriver
		//System.setProperty("webdriver.gecko.driver", "E:\\sarhuhu\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

		
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
	
	}

	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}

	/*@Test
	public void shouldLogin() {
		
		driver.get("http://localhost:7080/MyWebIntegration/index.jsp");
		driver.manage().window().maximize();
		//Thread.sleep(9000000);
		//try {Thread.sleep(80000000);	
				//Boolean bool = false;
				//driver.switchTo().frame("email");
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("email")).sendKeys("a@b.com");
		//var txtemail= element(By.name("email"));
			//txtemail.cl
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("pass");
				driver.findElement(By.name("btnlogin")).click();
	//} catch (InterruptedException e) {}
		//System.out.println(driver.getTitle());
		Assert.assertTrue((driver.getTitle().contains("Home")));

		}*/
	
	@Test
	public void shouldAddInventory() {
		
		driver.get("http://localhost:7080/MyWebIntegration/index.jsp");
		driver.manage().window().maximize();
		//Thread.sleep(9000000);
		//try {Thread.sleep(80000000);	
				//Boolean bool = false;
				//driver.switchTo().frame("email");
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("email")).sendKeys("a@b.com");
		//var txtemail= element(By.name("email"));
			//txtemail.cl
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("pass");
				driver.findElement(By.name("btnlogin")).click();
	//} catch (InterruptedException e) {}
		//System.out.println(driver.getTitle());
	
				driver.findElement(By.name("AddInventory")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.name("name")).clear();
				driver.findElement(By.name("name")).sendKeys("Coded UI");

				driver.findElement(By.name("licensetype")).clear();
				driver.findElement(By.name("licensetype")).sendKeys("Open Source");

				driver.findElement(By.name("purpose")).clear();
				driver.findElement(By.name("purpose")).sendKeys("Functional Testing");
				
				driver.findElement(By.name("btnAddInventory")).click();
				//driver.switchTo().frame("btnInventory");
				//String myWindowHandle = driver.getWindowHandle();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.switchTo().window(myWindowHandle );		
//				 WebElement myDynamicElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("btnHome")));
//				 myDynamicElement1.click();
				//driver.manage().window().maximize();
				
				driver.findElement(By.name("btnHome")).click();
				 WebElement myDynamicElement2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("DisplayInventory")));
				 myDynamicElement2.click();
			//driver.switchTo().frame("DisplayInventory");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.findElement(By.linkText("Display Inventory")).click();
					//driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a[2]/h3")).click();
				
				WebElement myDynamicElement3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
				 myDynamicElement3.clear();
				 myDynamicElement3.sendKeys("Coded UI");
			
				// driver.findElement(By.name("name")).clear();
				//driver.findElement(By.name("name")).sendKeys("Coded UI");
				 
				// WebElement myDynamicElement5 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("btnDisplayInventory")));
				// myDynamicElement5.click();
				driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td[1]/input")).click();
			
				//WebElement myDynamicElement4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("result")));
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				WebElement myDynamicElement4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/table[2]/tbody/tr[3]/td[1]")));
			
				Assert.assertTrue(myDynamicElement4.toString()!= null);
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				

		}
	
	}
