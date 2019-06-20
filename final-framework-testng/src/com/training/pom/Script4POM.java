package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script4POM {
	private WebDriver driver; 
	
	public Script4POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[5]/a")
	private WebElement regionbtn;
	
	@FindBy(xpath="//*[@id=\"tag-name\"]")
	private WebElement namebtn;
	
	@FindBy(xpath="//*[@id=\"tag-slug\"]")
	private WebElement slugbtn;
	
	@FindBy(xpath="//*[@id=\"tag-description\"]")
	private WebElement descriptionbtn;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	private WebElement addnewregionbtn;
	
	@FindBy(xpath="//*[@id=\"tag-search-input\"]")
	private WebElement entersearchbtn;
	
	@FindBy(xpath="//*[@id=\"search-submit\"]")
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
		public void region() {
			this.regionbtn.click(); 
		}
		public void  sendname() {
			this.namebtn.clear();
			this.namebtn.sendKeys("Rabcd123");
		}
			
			public void  slugname() {
				this.slugbtn.clear();
				this.slugbtn.sendKeys("Rabcd1234");
			}
			public void  description() {
				this.descriptionbtn.clear();
				this.descriptionbtn.sendKeys("Rxyz1234");
			}
			public void addnewfeatures() {
				this.addnewregionbtn.click();
			}
				
				public void  searchname() throws InterruptedException  {
					this.entersearchbtn.clear();
					this.entersearchbtn.sendKeys("Rabcd123");
					Thread.sleep(5000);
					
				}
					public void subsearch()  {
						this.subsearchbtn.click();
			
	}
}
