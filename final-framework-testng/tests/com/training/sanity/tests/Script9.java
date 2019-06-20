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
import com.training.pom.Script9POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script9 {

	private WebDriver driver;
	private String baseUrl;
	private Script9POM Script9POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script9POM = new Script9POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script9POM = new Script9POM(driver); 
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
		Script9POM.sendUserName("admin");
		Script9POM.sendPassword("admin@123");
		Script9POM.signinBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test(priority=2)
	public void PropertiesTest() {
		Script9POM.Properties(); 
		screenShot.captureScreenShot("First1");
				
	}
												
							@Test(priority=3)
							public void addnewlinkclick() {
								Script9POM.addnewlink();
								screenShot.captureScreenShot("nine"); }
								
								@Test(priority=4)
								public void entertitle() {
									Script9POM.addnewlinktitle();
									screenShot.captureScreenShot("ten"); }
							
									@Test(priority=5)
									public void enterdes() {
										Script9POM.addnewlinkdescription();
										screenShot.captureScreenShot("t11"); }
									
										@Test(priority=6)
										public void addedfea() {
											Script9POM.addnewlinkfea();
											screenShot.captureScreenShot("t12"); }
											
											@Test(priority=7)
											public void addedfeaselect() {
												Script9POM.addnewlinkselectfea();
												screenShot.captureScreenShot("t13"); }
											
											@Test(priority=8)
											public void regiontest1() {
												Script9POM.regioncate();
												screenShot.captureScreenShot("t12"); }
												
												@Test(priority=9)
												public void regiontest2() {
													Script9POM.regeioncateselect();
													screenShot.captureScreenShot("t13"); }
												
												@Test(priority=10)
												public void submitclick() {
													Script9POM.addnlinksubmitclick();
													screenShot.captureScreenShot("t14"); }
												
												@Test(priority=11)
												public void submitenter() throws InterruptedException {
													Script9POM.addnlinksubmit();
													Thread.sleep(3000);
													screenShot.captureScreenShot("t15");
									
												 
	}
}
