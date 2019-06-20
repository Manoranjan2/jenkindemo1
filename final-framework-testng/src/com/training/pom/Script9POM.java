package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script9POM {
	private WebDriver driver; 
	
	public Script9POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"property_featurediv\"]/button")
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
						this.addnlinktitlebtn.sendKeys("Brigade");
					}
					
					public void  addnewlinkdescription() {
						this.addnlinkdescbtn.clear();
						this.addnlinkdescbtn.sendKeys("Gateway");  }
						
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
