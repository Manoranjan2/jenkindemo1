package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Script8POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script8 {

	private WebDriver driver;
	private String baseUrl;
	private Script8POM Script8POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException, InterruptedException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script8POM = new Script8POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		Thread.sleep(3000);
		screenShot.captureScreenShot("S0");
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script8POM = new Script8POM(driver); 
		//baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		//driver.get(baseUrl);
	//}
	
	//@AfterMethod
	//public void tearDown() throws Exception {
	//	Thread.sleep(1000);
	//	driver.quit();
	//}
	@Test(priority=1)
  	public void validLoginTest() {
 		Script8POM.sendUserName("bchearful@gmail.com");
		Script8POM.sendPassword("newuser123#");
		Script8POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void blogTest() throws AWTException  {
		Script8POM.blog(); 
		screenShot.captureScreenShot("S1");
			
			
	}
			
			@Test(priority=3)
			public void readmoretest() throws AWTException, InterruptedException {
				Script8POM.readmore();
				screenShot.captureScreenShot("s2");
				
			}
			
			@Test(priority=4)
			public void commentTest() throws AWTException {
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				Script8POM.comment();
				screenShot.captureScreenShot("s3");

			}
												
						@Test(priority=5)
						public void submittest() {
							Script8POM.submitcoment();
							screenShot.captureScreenShot("s6");
							
						}
						@Test(priority=6)
						public void newwindow() throws IOException, InterruptedException {
							properties = new Properties();
							FileInputStream inStream = new FileInputStream("./resources/others.properties");
							properties.load(inStream);
							driver = DriverFactory.getDriver(DriverNames.CHROME);
							Script8POM = new Script8POM(driver); 
							baseUrl = properties.getProperty("baseURL");
							screenShot = new ScreenShot(driver); 
							// open the browser 
							driver.get(baseUrl);
							Thread.sleep(3000);
							screenShot.captureScreenShot("S7");
						}
						@Test(priority=7)
					  	public void validLoginnewTest() {
					 		Script8POM.sendUserName("admin");
							Script8POM.sendPassword("admin@123");
							Script8POM.signinBtn(); 
							screenShot.captureScreenShot("s8");  }
						
						@Test(priority=8)
						public void commenttabtest() {
							Script8POM.commenttab();
							screenShot.captureScreenShot("s9");  }
						
						@Test(priority=9)
						public void replytabtest() {
							Script8POM.replytab();
							screenShot.captureScreenShot("s10");  }
						
						@Test(priority=10)
						public void replyclicktest() {
							Script8POM.replytabclick();
							screenShot.captureScreenShot("s10");
						}
						
}
