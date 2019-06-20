package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Script1POM {
	private WebDriver driver; 
	
	public Script1POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/ul/li[2]/a")
	private WebElement Allpropertiesbtn;
	
	@FindBy(xpath="//*[@id=\"cb-select-all-1\"]")
	private WebElement Checkboxbtn;
	
	@FindBy(xpath="//*[@id=\"bulk-action-selector-top\"]")
	private WebElement bulkactionbtn;
	
	
	
	@FindBy(xpath="//*[@id=\"doaction\"]")
	private WebElement applybtn;
	
	@FindBy(xpath="//*[@id=\"cb-select-3756\"]")
	private WebElement propertyformovetothrash;
	
	@FindBy(xpath="//*[@id=\"message\"]/p/a")
	private WebElement undobtn;
	
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
			public void Allproperties() {
				this.Allpropertiesbtn.click(); 
			}
			public void Checkbox() {
				this.Checkboxbtn.click();
			}
				public void bulkaction() {
					this.bulkactionbtn.click();
				}
				
				public void apply() {
					this.applybtn.click();
					
				}
					
					public void movetothrash() {
						
						Select bulkactionbtn= new Select(this.bulkactionbtn);
						bulkactionbtn.selectByVisibleText("Move to Trash");
					}
						public void propertyselectformovetothrash() {
							this.propertyformovetothrash.click();
							
						}
							
							public void undo() {
								this.undobtn.click();
	}
}
