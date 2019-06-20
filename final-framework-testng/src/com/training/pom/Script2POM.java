package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script2POM {
	private WebDriver driver; 
	
	public Script2POM(WebDriver driver) {
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
			this.namebtn.sendKeys("abcd123");
		}
			
			public void  slugname() {
				this.slugbtn.clear();
				this.slugbtn.sendKeys("abcd1234");
			}
			public void  description() {
				this.descriptionbtn.clear();
				this.descriptionbtn.sendKeys("xyz1234");
			}
			public void addnewfeatures() {
				this.addnewfeaturebtn.click();
			}
				
				public void  searchname() throws InterruptedException  {
					this.entersearchbtn.clear();
					this.entersearchbtn.sendKeys("abcd123");
					Thread.sleep(3000);
					
				}
					public void subsearch()  {
						this.subsearchbtn.click();
			
	}
}
