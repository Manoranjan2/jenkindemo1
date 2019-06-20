package com.training.sanity.tests;

import java.awt.AWTException;
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
import com.training.pom.Script7POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script7 {

	private WebDriver driver;
	private String baseUrl;
	private Script7POM Script7POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script7POM = new Script7POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script7POM = new Script7POM(driver); 
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
		Script7POM.sendUserName("admin");
		Script7POM.sendPassword("admin@123");
		Script7POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void PropertiesTest() {
		Script7POM.Properties(); 
		screenShot.captureScreenShot("First1");
			
			
	}
			
			@Test(priority=3)
			public void Featuretest() {
				Script7POM.features();
				screenShot.captureScreenShot("second");
			}
			
			@Test(priority=4)
			public void nameboxTest() {
				Script7POM.sendname();
				screenShot.captureScreenShot("third");

			}
			
			@Test(priority=5)
			public void slugtest() {
				Script7POM.slugname();
				screenShot.captureScreenShot("fourth");
			}
					@Test(priority=6)
					public void descriptiontest() {
						Script7POM.description();
						screenShot.captureScreenShot("fifth");
					}
						
						@Test(priority=7)
						public void addnewtest() {
							Script7POM.addnewfeatures();
							screenShot.captureScreenShot("sixth");
						}
						@Test(priority=8)
						public void searchtest() throws InterruptedException, AWTException {
						Script7POM.searchname();
						screenShot.captureScreenShot("seventh");
						
						}
						@Test(priority=9)
						public void subsearchtest() throws InterruptedException, AWTException{
							Thread.sleep(50000);
							Script7POM.subsearch();
							screenShot.captureScreenShot("eight");
							Thread.sleep(50000);}
							
							@Test(priority=10)
							public void addnewlinkclick() {
								Script7POM.addnewlink();
								screenShot.captureScreenShot("nine"); }
								
								@Test(priority=11)
								public void entertitle() {
									Script7POM.addnewlinktitle();
									screenShot.captureScreenShot("ten"); }
							
									@Test(priority=12)
									public void enterdes() {
										Script7POM.addnewlinkdescription();
										screenShot.captureScreenShot("t11"); }
									
										@Test(priority=13)
										public void addedfea() {
											Script7POM.addnewlinkfea();
											screenShot.captureScreenShot("t12"); }
											
											@Test(priority=14)
											public void addedfeaselect() {
												Script7POM.addnewlinkselectfea();
												screenShot.captureScreenShot("t13"); }
												
												@Test(priority=15)
												public void submitclick() {
													Script7POM.addnlinksubmitclick();
													screenShot.captureScreenShot("t14"); }
												
												@Test(priority=16)
												public void submitenter() {
													Script7POM.addnlinksubmit();
													screenShot.captureScreenShot("t15");
												
												 
	}
}
