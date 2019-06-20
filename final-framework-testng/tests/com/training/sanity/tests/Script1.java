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
import com.training.pom.Script1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script1 {

	private WebDriver driver;
	private String baseUrl;
	private Script1POM Script1POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script1POM = new Script1POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script1POM = new Script1POM(driver); 
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
		Script1POM.sendUserName("admin");
		Script1POM.sendPassword("admin@123");
		Script1POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority=2)
	public void PropertiesTest() {
		Script1POM.Properties();
		screenShot.captureScreenShot("Second");
				
	}
			
			@Test(priority=3)
			public void AllpropertiesTest() {
				Script1POM.Allproperties();
				screenShot.captureScreenShot("Third");
			}
			
			@Test(priority=4)
			public void CheckboxTest() {
					Script1POM.Checkbox();
					screenShot.captureScreenShot("forth");

			}
			
			@Test(priority=5)
			public void bulkaction() {
					Script1POM.Checkbox();
					Script1POM.bulkaction();
					screenShot.captureScreenShot("fifth");
			}
					@Test(priority=6)
					public void movetotrash() {
						Script1POM.movetothrash();
						screenShot.captureScreenShot("Sixth");
						Script1POM.propertyselectformovetothrash();
						Script1POM.apply();
						screenShot.captureScreenShot("Seventh");
						Script1POM.undo();
						screenShot.captureScreenShot("eight");
											
								
				
		
	}
}
