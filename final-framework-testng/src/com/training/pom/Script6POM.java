package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Script6POM {
	private WebDriver driver; 
	
	public Script6POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement signinBtn; 
	
	@FindBy(xpath="//*[@id=\"menu-posts\"]/a/div[3]")
	private WebElement Postbtn;
	
	@FindBy(xpath="//*[@id=\"menu-posts\"]/ul/li[3]/a")
	private WebElement addnewpostbtn;
		
	@FindBy(xpath="//*[@id=\"title\"]")
	private WebElement newtitlebtn;
	
	@FindBy(xpath="//*[@id=\"content\"]")
	private WebElement bodybtn;
	
	@FindBy(xpath="//*[@id=\"categorydiv\"]/button/span[2]")
	private WebElement categoriesbtn;
	
	@FindBy(xpath="//*[@id=\"category-tabs\"]/li[1]/a")
	private WebElement allcategoriesbtn;
	
	@FindBy(xpath="//*[@id=\"in-category-349\"]")
	private WebElement newlaunchbtn;
	
	@FindBy(xpath="//*[@id=\"submitdiv\"]/button/span[2]")
	private WebElement publishexpandbtn;
	
	@FindBy(xpath="//*[@id=\"publish\"]")
	private WebElement publishbtn;
	
	@FindBy(xpath="//*[@id=\"menu-dashboard\"]/a/div[3]")
	private WebElement dashbordbtn;
	
	@FindBy(xpath="//*[@id=\"vc_license-activation-notice\"]/p/a")
	private WebElement activatebtn;
	
	
	
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
	public void post() {
		this.Postbtn.click(); 
	}
		public void addnewpost() {
			this.addnewpostbtn.click(); 
		}
		public void  newtitle() {
			this.newtitlebtn.clear();
			this.newtitlebtn.sendKeys("abcd123");
		
			}
				
				public void  body()   {
					this.bodybtn.clear();
					this.bodybtn.sendKeys("xyz123");
				}
					public void  categories()   {
						this.categoriesbtn.click();
					
				}
					public void allcategories()  {
						this.allcategoriesbtn.click();
					}
					public void newlaunch()  {
						this.newlaunchbtn.click();
					}
						
						public void publishexpand()  {
						this.publishexpandbtn.click();
							
						}
						
							public void publish()  {
								this.publishbtn.click();
							}
							
							public void dashboard()  {
								this.dashbordbtn.click();
							}
								
								public void activate()  {
									this.activatebtn.click();
			
	}
}
