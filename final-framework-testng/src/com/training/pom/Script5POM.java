package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Script5POM {
	private WebDriver driver; 
	
	public Script5POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"cb-select-39\"]")
	private WebElement deleteitembtn;
	
	@FindBy(xpath="//*[@id=\"bulk-action-selector-top\"]")
	private WebElement bulkactionbtn;
	
	@FindBy(xpath="//*[@id=\"doaction\"]")
	private WebElement applybtn;
	
	
	
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
		public void  deletefeature() {
			this.deleteitembtn.click();
		
			}
				
				public void  bulckaction()   {
					this.bulkactionbtn.click();
				}
					public void  bulckactionselect()   {
						Select bulkactionbtn= new Select(this.bulkactionbtn);
						bulkactionbtn.selectByVisibleText("Delete");
					
				}
					public void applysub()  {
						this.applybtn.click();
			
	}
}
