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
import com.training.pom.Script10POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Script10 {

	private WebDriver driver;
	private String baseUrl;
	private Script10POM Script10POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Script10POM = new Script10POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//@BeforeMethod
	//public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//Script10POM = new Script10POM(driver); 
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
		Script10POM.sendUserName("admin");
		Script10POM.sendPassword("admin@123");
		Script10POM.signinBtn(); 
		screenShot.captureScreenShot("s1");
	}
	@Test(priority=2)
	public void PropertiesTest() {
		Script10POM.Properties(); 
		screenShot.captureScreenShot("s2");
				
	}
												
							@Test(priority=3)
							public void addnewlinkclick() {
								Script10POM.addnewlink();
								screenShot.captureScreenShot("s3"); }
								
								@Test(priority=4)
								public void entertitle() {
									Script10POM.addnewlinktitle();
									screenShot.captureScreenShot("s4"); }
							
									@Test(priority=5)
									public void enterdes() {
										Script10POM.addnewlinkdescription();
										screenShot.captureScreenShot("s5"); }
									
									@Test(priority=6)
									public void priceheretab() {
										Script10POM.priceheretab();
										Script10POM.pricevalue();
										Script10POM.pricepersquaremt();
										screenShot.captureScreenShot("s6"); }	
									
									@Test(priority=7)
									public void maindetailstab() {
										Script10POM.maindetailstab();
										Script10POM.stautus();
										Script10POM.location();
										Script10POM.possesion();
										screenShot.captureScreenShot("s7"); }
									
									@Test(priority=8)
									public void locationtab() {
										Script10POM.locationtab();
										Script10POM.addresslocation();
										Script10POM.googlemapaddress();
										Script10POM.latitude();
										Script10POM.longitude();
										screenShot.captureScreenShot("s8"); }
									
									@Test(priority=9)
									public void detailstab() {
										Script10POM.detailstab();
										Script10POM.storageroom();
										screenShot.captureScreenShot("s9"); }
									
									@Test(priority=10)
									public void centralbenglore() {
										Script10POM.centralbenglore();
										screenShot.captureScreenShot("s10"); }
																							
									
									@Test(priority=11)
										public void pageup() throws AWTException {
										Robot robot=new Robot();
										robot.keyPress(KeyEvent.VK_UP);
										robot.keyPress(KeyEvent.VK_UP);
										robot.keyPress(KeyEvent.VK_UP);
										robot.keyPress(KeyEvent.VK_UP);
										screenShot.captureScreenShot("t11"); }
											
																						
											@Test(priority=12)
											public void regiontest1() {
												Script10POM.regioncate();
												screenShot.captureScreenShot("t12"); }
												
												@Test(priority=13)
												public void regiontest2() {
													Script10POM.regeioncateselect();
													screenShot.captureScreenShot("t13"); }
												
												@Test(priority=14)
												public void addedfeature() throws AWTException {
													Robot robot=new Robot();
													robot.keyPress(KeyEvent.VK_UP);
													robot.keyPress(KeyEvent.VK_UP);
													Script10POM.addnewlinkfea();
													screenShot.captureScreenShot("t14"); }
												
												@Test(priority=15)
												public void addedfeaselect() {
													Script10POM.addnewlinkselectfea();
													screenShot.captureScreenShot("t15"); }
												
												@Test(priority=16)
												public void submitclick() {
													Script10POM.addnlinksubmitclick();
													screenShot.captureScreenShot("t16"); }
												
												@Test(priority=17)
												public void submitenter() throws InterruptedException {
													Script10POM.addnlinksubmit();
													Thread.sleep(3000);
													screenShot.captureScreenShot("t17");
									
												 
	}
}
