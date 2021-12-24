package com.juaracoding.ujiandes24.main.createaccount;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiandes24.main.driver.Chrome;

public class SignIn {
	private WebDriver driver;
	private JavascriptExecutor js;

	public SignIn() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email_create")
	private WebElement email;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement btnCrtAcc;
	
	public void createAccount(String email) {
		btnSignIn.click();
		js.executeScript("arguments[0].scrollIntoView()", this.email);
		this.email.sendKeys(email);
		btnCrtAcc.submit();
		
	}

}