package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script7POM {
	private WebDriver driver; 
	
	public Script7POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[4]/a")
	private WebElement featuresbtn;
	
	@FindBy(xpath="//*[@id=\"tag-name\"]")
	private WebElement namebtn;
	
	@FindBy(xpath="//*[@id=\"tag-slug\"]")
	private WebElement slugbtn;
	
	@FindBy(xpath="//*[@id=\"tag-description\"]")
	private WebElement descriptionbtn;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	private WebElement addnewfeaturebtn;
	
	@FindBy(xpath="//*[@id=\"tag-search-input\"]")
	private WebElement entersearchbtn;
	
	@FindBy(id="search-submit")
	private WebElement subsearchbtn;
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[3]/a")
	private WebElement addnlinkbtn;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	private WebElement addnlinktitlebtn;
	
	@FindBy(xpath="//*[@id=\"content\"]")
	private WebElement addnlinkdescbtn;
	
	@FindBy(xpath="//*[@id=\"property_featurediv\"]/button")
	private WebElement addnlinkfeacbtn;
	
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
		public void features() {
			this.featuresbtn.click(); 
		}
		public void  sendname() {
			this.namebtn.clear();
			this.namebtn.sendKeys("Shantiniketan");
		}
			
			public void  slugname() {
				this.slugbtn.clear();
				this.slugbtn.sendKeys("Prestige");
			}
			public void  description() {
				this.descriptionbtn.clear();
				this.descriptionbtn.sendKeys("New Launches of Apartments");
			}
			public void addnewfeatures() {
				this.addnewfeaturebtn.click();
			}
				
				public void  searchname() throws InterruptedException, AWTException  {
					Robot robot= new Robot();
					Thread.sleep(3000);
					robot.keyPress(KeyEvent.VK_UP);
					this.entersearchbtn.clear();
					this.entersearchbtn.sendKeys("Prestige");
					
					
				}
					public void subsearch() throws AWTException  {
						Robot robot= new Robot();
						robot.keyPress(KeyEvent.VK_UP);
						this.subsearchbtn.click();
					}
					
					public void addnewlink()  {
						this.addnlinkbtn.click();
					}
					
					public void  addnewlinktitle() {
						this.addnlinktitlebtn.clear();
						this.addnlinktitlebtn.sendKeys("prestige");
					}
					
					public void  addnewlinkdescription() {
						this.addnlinkdescbtn.clear();
						this.addnlinkdescbtn.sendKeys("home town");  }
						
						public void addnewlinkfea()  {
							this.addnlinkfeacbtn.click();  }
						
						public void addnewlinkselectfea()  {
							this.addnlinkselfeacbtn.click();  }
						
						public void addnlinksubmitclick()  {
							this.addnlinksubbtn.click();}
						
						public void addnlinksubmit()  {
							this.addnlinksubenetrbtn.click();
						
						
	}
}
