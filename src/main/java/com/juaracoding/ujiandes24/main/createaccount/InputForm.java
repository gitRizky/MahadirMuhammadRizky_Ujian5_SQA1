package com.juaracoding.ujiandes24.main.createaccount;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiandes24.main.driver.Chrome;

public class InputForm {
	private WebDriver driver;

	public InputForm() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "id_gender1")
	private WebElement gender;

	@FindBy(id = "customer_firstname")
	private WebElement fName;

	@FindBy(id = "customer_lastname")
	private WebElement lName;

	@FindBy(id = "passwd")
	private WebElement passCode;

	@FindBy(id = "days")
	private WebElement dobDay;

	@FindBy(id = "months")
	private WebElement dobMonths;

	@FindBy(id = "years")
	private WebElement dobYears;

	@FindBy(id = "company")
	private WebElement companyName;

	@FindBy(id = "address1")
	private WebElement address1;

	@FindBy(id = "address2")
	private WebElement address2;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_country")
	private WebElement id_country;

	@FindBy(id = "id_state")
	private WebElement id_state;

	@FindBy(id = "postcode")
	private WebElement postcode;

	@FindBy(id = "other")
	private WebElement _other;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "phone_mobile")
	private WebElement phone_mobile;

	@FindBy(id = "alias")
	private WebElement alias;
	
	@FindBy(id = "submitAccount")
	private WebElement submit;

	public void _inputForm(String fName, String lName, String passCode, String companyName, String address1,
			String address2, String city, String postCode, String _other, String phone, String phoneMobile,
			String alias) {
		this.gender.click();
		this.fName.sendKeys(fName);
		this.lName.sendKeys(lName);
		this.passCode.sendKeys(passCode);
		_key(dobDay);
		_key(dobMonths);
		_key(dobYears);
		this.companyName.sendKeys(companyName);
		this.address1.sendKeys(address1);
		this.address2.sendKeys(address2);
		this.city.sendKeys(city);
		_key(id_country);
		_key(id_state);
		this.postcode.sendKeys(postCode);
		this._other.sendKeys(_other);
		this.phone.sendKeys(phone);
		this.phone_mobile.sendKeys(phoneMobile);
		this.alias.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		this.alias.sendKeys(alias);
		this.submit.click();

	}

	private void _key(WebElement webElement) {
		webElement.click();
		webElement.sendKeys(Keys.ARROW_DOWN);
		webElement.sendKeys(Keys.ENTER);

	}

}
