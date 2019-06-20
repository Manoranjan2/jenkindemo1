package com.training.sanity.tests;

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
import com.training.pom.Script3POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script3 {

	private WebDriver driver;
	private String baseUrl;
	private Script3POM Script3POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script3POM = new Script3POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script3POM = new Script3POM(driver); 
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
		Script3POM.sendUserName("admin");
		Script3POM.sendPassword("admin@123");
		Script3POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void PropertiesTest() {
		Script3POM.Properties(); 
		screenShot.captureScreenShot("First1");
			
			
	}
			
			@Test(priority=3)
			public void Featuretest() {
				Script3POM.features();
				screenShot.captureScreenShot("second");
			}
			
			@Test(priority=4)
			public void deleteitemTest() {
				Script3POM.deletefeature();
				screenShot.captureScreenShot("third");

			}
			
			@Test(priority=5)
			public void bulkactiontest() throws InterruptedException {
				Script3POM.bulckaction();
				Thread.sleep(30000);
				screenShot.captureScreenShot("fourth");
			}
					@Test(priority=6)
					public void bulckactionselecttest() throws InterruptedException {
						Script3POM.bulckactionselect();
						Thread.sleep(50000);
						screenShot.captureScreenShot("fifth");
					}
						
					@Test(priority=7)
					public void applytest() throws InterruptedException {
						Thread.sleep(30000);
						Script3POM.applysub();
						screenShot.captureScreenShot("sixth");		
							
			
		
	}
}
