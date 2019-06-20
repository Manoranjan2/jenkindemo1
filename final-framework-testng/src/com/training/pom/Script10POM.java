package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script10POM {
	private WebDriver driver; 
	
	public Script10POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement signinBtn; 
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/a/div[3]")
	private WebElement Propertiesbtn;
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[3]/a")
	private WebElement addnlinkbtn;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	private WebElement addnlinktitlebtn;
	
	@FindBy(xpath="//*[@id=\"content\"]")
	private WebElement addnlinkdescbtn;
	
	@FindBy(xpath="//*[@id=\"property_featurediv\"]/button/span[2]")
	private WebElement addnlinkfeacbtn;
	
	@FindBy(xpath="//*[@id=\"regiondiv\"]/button/span[2]")
	private WebElement regioncategorybtn;
	
	@FindBy(xpath="//*[@id=\"in-region-42\"]")
	private WebElement regioncateselectbtn;
	
	@FindBy(xpath="//*[@id=\"in-property_feature-256\"]")
	private WebElement addnlinkselfeacbtn;
	
	@FindBy(xpath="//*[@id=\"submitdiv\"]/button/span[2]")
	private WebElement addnlinksubbtn;
	
	@FindBy(xpath="//*[@id=\"publish\"]")
	private WebElement addnlinksubenetrbtn;
	
	@FindBy(xpath="//*[@id=\"ui-id-1\"]")
	private WebElement priceheretabbtn;
	@FindBy(xpath="//*[@id=\"_price\"]")
	private WebElement pricevaluebtn;
	@FindBy(xpath="//*[@id=\"_price_per\"]")
	private WebElement pricepersquarebtn;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]")
	
	private WebElement maindetailstabbtn;
	@FindBy(xpath="//*[@id=\"_status\"]")
	private WebElement statusbtn;
	@FindBy(xpath="//*[@id=\"_location\"]")
	private WebElement locationbtn;
	@FindBy(xpath="//*[@id=\"_possession\"]")
	private WebElement possesionbtn;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]")
	
	private WebElement locationtabbtn;
	@FindBy(xpath="//*[@id=\"_friendly_address\"]")
	private WebElement addressbtn;
	@FindBy(xpath="//*[@id=\"_address\"]")
	private WebElement googlemapaddresbtn;
	@FindBy(xpath="//*[@id=\"_geolocation_lat\"]")
	private WebElement latitudebtn;
	@FindBy(xpath="//*[@id=\"_geolocation_long\"]")
	private WebElement longitudebtn;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]")
	private WebElement detailstabbtn;
	@FindBy(xpath="//*[@id=\"_storage_room\"]")
	private WebElement storageroombtn;
	@FindBy(xpath="//*[@id=\"acf-group_5aa6786492979\"]/div/div/div[2]/div/div[2]/ul/li[1]/ul/li[1]/label/input")
	private WebElement centralbngcheckboxbtn;

	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void signinBtn() {
		this.signinBtn.click(); 
	}
	public void Properties() {
		this.Propertiesbtn.click(); 
	}
			
					public void addnewlink()  {
						this.addnlinkbtn.click();
					}
					
					public void  addnewlinktitle() {
						this.addnlinktitlebtn.clear();
						this.addnlinktitlebtn.sendKeys("new launch");
					}
					
					public void  addnewlinkdescription() {
						this.addnlinkdescbtn.clear();
						this.addnlinkdescbtn.sendKeys("new launch");  }
						
					public void  priceheretab() {
						this.priceheretabbtn.click(); }
						public void  pricevalue() {
							this.pricevaluebtn.clear();	
						this.pricevaluebtn.sendKeys("50000");  }
					public void  pricepersquaremt() {
						this.pricepersquarebtn.clear();
						this.pricepersquarebtn.sendKeys("200");  }
					
					public void maindetailstab()  {
						this.maindetailstabbtn.click(); }
					public void  stautus() {
						this.statusbtn.clear();
						this.statusbtn.sendKeys("New");  }
					public void  location() {
						this.locationbtn.clear();
						this.locationbtn.sendKeys("Electronic city");  }	
					public void  possesion() {
						this.possesionbtn.clear();
						this.possesionbtn.sendKeys("immediate");  }	
					
					public void locationtab()  {
						this.locationtabbtn.click(); }
					public void  addresslocation() {
						this.addressbtn.clear();
						this.addressbtn.sendKeys("yeshwanthapur");  }
					public void  googlemapaddress() {
						this.googlemapaddresbtn.clear();
						this.googlemapaddresbtn.sendKeys("yeshwanthapur");  }
					public void  latitude() {
						this.latitudebtn.clear();
						this.latitudebtn.sendKeys("120");  }
					public void  longitude() {
						this.longitudebtn.clear();
						this.longitudebtn.sendKeys("56");  }
					
					public void detailstab()  {
						this.detailstabbtn.click(); }
					public void  storageroom() {
						this.storageroombtn.clear();
						this.storageroombtn.sendKeys("2");  }
					
					public void centralbenglore()  {
						this.centralbngcheckboxbtn.click(); }
					
								
					
						public void addnewlinkfea()  {
							this.addnlinkfeacbtn.click();  }
						
						public void addnewlinkselectfea()  {
							this.addnlinkselfeacbtn.click();  }
						
						public void regioncate()  {
							this.regioncategorybtn.click();  }
						
						public void regeioncateselect()  {
							this.regioncateselectbtn.click();  }
						
						public void addnlinksubmitclick()  {
							this.addnlinksubbtn.click();}
						
						public void addnlinksubmit()  {
							this.addnlinksubenetrbtn.click();
						
						
	}
}
