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
import com.training.pom.Script4POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script4 {

	private WebDriver driver;
	private String baseUrl;
	private Script4POM Script4POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script4POM = new Script4POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script4POM = new Script4POM(driver); 
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
		Script4POM.sendUserName("admin");
		Script4POM.sendPassword("admin@123");
		Script4POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void PropertiesTest() {
		Script4POM.Properties(); 
		screenShot.captureScreenShot("First1");
			
			
	}
			
			@Test(priority=3)
			public void Featuretest() {
				Script4POM.region();
				screenShot.captureScreenShot("second");
			}
			
			@Test(priority=4)
			public void nameboxTest() {
				Script4POM.sendname();
				screenShot.captureScreenShot("third");

			}
			
			@Test(priority=5)
			public void slugtest() {
				Script4POM.slugname();
				screenShot.captureScreenShot("fourth");
			}
					@Test(priority=6)
					public void descriptiontest() {
						Script4POM.description();
						screenShot.captureScreenShot("fifth");
					}
						
						@Test(priority=7)
						public void addnewtest() {
							Script4POM.addnewfeatures();
							screenShot.captureScreenShot("sixth");
						}
						@Test(priority=8)
						public void searchtest() throws InterruptedException {
						Script4POM.searchname();
						screenShot.captureScreenShot("seventh");
						
						}
						@Test(priority=9)
						public void subsearchtest(){
							Script4POM.subsearch();
							screenShot.captureScreenShot("eight");
							
			
		
	}
}
