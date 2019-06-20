package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script8POM {
	private WebDriver driver; 
	
	public Script8POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement signinBtn; 
	
	@FindBy(xpath="//*[@id=\"menu-item-617\"]/a")
	private WebElement blogbtn;
	
	@FindBy(xpath="//p[contains(text(),'prestige')]//following-sibling::a")
	private WebElement readmorebtn;
	
	@FindBy(xpath="//*[@id=\"comment\"]")
	private WebElement commentbtn;
			
	@FindBy(xpath="//*[@id=\"submit\"]")
	private WebElement submitcommentbtn;
	
	@FindBy(xpath="//*[@id=\"menu-comments\"]/a/div[3]")
	private WebElement commenttabbtn;
	
	@FindBy(xpath="//*[@id=\"comment-1761\"]/td[2]/div[3]/span[3]/a")
	private WebElement replytabbtn;
	
	@FindBy(xpath="//*[@id=\"comment-1761\"]/td[2]/div[3]/span[3]/a")
	private WebElement replycommentbtn;
	
	@FindBy(xpath="//*[@id=\"replybtn\"]")
	private WebElement replybtn;
		
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
	public void blog() throws AWTException  {
		this.blogbtn.click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
	}
		public void readmore() throws AWTException, InterruptedException {
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",readmorebtn );
			//this.readmorebtn.click();
		}
		public void  comment() {
			this.commentbtn.clear();
			this.commentbtn.sendKeys("good mano");
		}
						
			public void submitcoment() {
				this.submitcommentbtn.click();
			}
			public void commenttab() {
				this.commenttabbtn.click();
			}
			public void replytab() {
				Actions action=new Actions(driver);
				action.moveToElement(this.replytabbtn).perform(); }
				
				public void replytabclick() {
					this.replytabbtn.click();
					this.replycommentbtn.clear();
					this.replycommentbtn.sendKeys("good one");
					this.replybtn.click();
					
												
	}
}
