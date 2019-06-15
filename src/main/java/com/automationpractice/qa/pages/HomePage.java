package com.automationpractice.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.util.TestUtil;

public class HomePage extends TestBase{


	
	//Page Factory or Object Repository
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement womentab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dressesTab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement T_shirtTab;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	WebElement newsletter_input;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	WebElement submitNewsletterbtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement alert_success;
	
	@FindBy(xpath="//p[@class='alert alert-danger']")
	WebElement alert_emailRegisteredAlready;
	
	

	//initializing the page objects
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);		
	}
	
	//
	
	public String validateHomepageTitle(){
		
		System.out.println(driver.getTitle());
		return driver.getTitle();
			
	}
	
	public boolean validateWomenTAb(){
		
		return womentab.isDisplayed();
	}
	
	public boolean validateDressesTab(){
		
		return dressesTab.isDisplayed();
		
	}
	/*
	public boolean validateT_shirtTab(){
		return T_shirtTab.isDisplayed();
		
	}*/
	
	public WebElement validateT_shirtTab(){
		return T_shirtTab;
	}
	
	public WomenSectionPage navitageWomensLink() throws IOException{
		 womentab.click();
		 return new WomenSectionPage();
	}
	
	public DressesSectionPage navitageDressLink() throws IOException{
		dressesTab.click();
		return new DressesSectionPage();
	}
	
	public T_ShirtSectionPage navigateT_shirtlink() throws IOException{
		T_shirtTab.click();
		
		return new T_ShirtSectionPage();	
	}
		
	public void setNewsLetter(String email){	
		setText(newsletter_input,email);
		submitNewsletterbtn.click();
	}
	
	public String getText(){			
		return alert_success.getText();	
		
	}
	
	
	
	/*
	public void ValidateNewsletter_input_with_MailId(){
		
		newsletter_input.click();
		newsletter_input.clear();
		newsletter_input.sendKeys(prop.getProperty("mailid"));
		submitNewsletter.click();
		alert_success.isDisplayed();
			
		}*/
}
	
