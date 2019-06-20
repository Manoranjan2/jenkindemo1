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
import com.training.pom.Script6POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script6 {

	private WebDriver driver;
	private String baseUrl;
	private Script6POM Script6POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script6POM = new Script6POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script6POM = new Script6POM(driver); 
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
		Script6POM.sendUserName("admin");
		Script6POM.sendPassword("admin@123");
		Script6POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void postTest() {
		Script6POM.post(); 
		screenShot.captureScreenShot("First1");
			
			
	}
			
			@Test(priority=3)
			public void addnewposttest() {
				Script6POM.addnewpost();
                screenShot.captureScreenShot("second"); 
			}
			
			@Test(priority=4)
			public void newtitleTest() {
				Script6POM.newtitle();
				screenShot.captureScreenShot("third");

			}
			
			@Test(priority=5)
			public void bodyest()  {
				Script6POM.body();
				screenShot.captureScreenShot("fourth");
			}
					@Test(priority=6)
					public void categorytest() {
						Script6POM.categories();
						screenShot.captureScreenShot("fifth");
					}
						
					@Test(priority=7)
					public void allcategoriestest() {
						Script6POM.allcategories();
						screenShot.captureScreenShot("sixth");		
					}
					@Test(priority=8)
					public void newlaunchtest() {
						Script6POM.newlaunch();
						screenShot.captureScreenShot("seventh");	
					}
					@Test(priority=9)
					public void publishexpandtest() {
						Script6POM.publishexpand();
						screenShot.captureScreenShot("eight");	
					}
						@Test(priority=10)
						public void publishtest() {
							Script6POM.publish();
							screenShot.captureScreenShot("ninth");
						}
						@Test(priority=11)
						public void dashboardtest() {
							Script6POM.dashboard();
							screenShot.captureScreenShot("tenth");
						}
						@Test(priority=12)
						public void activatetest() {
							Script6POM.activate();
							screenShot.captureScreenShot("eleventh");
						
							
			
		
	}
}
