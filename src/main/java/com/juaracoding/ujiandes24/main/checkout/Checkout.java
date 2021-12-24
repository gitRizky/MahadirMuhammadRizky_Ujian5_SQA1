package com.juaracoding.ujiandes24.main.checkout;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiandes24.main.driver.Chrome;

public class Checkout {
	private WebDriver driver;

	public Checkout() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement checkOut;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement summary;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/div/p/a")
	private WebElement newAddress;

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

	@FindBy(id = "submitAddress")
	private WebElement submitAddress;
	
	@FindBy(id = "id_address_delivery")
	private WebElement changeAddress;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement confirmAddress;
	
	@FindBy(id = "cgv")
	private WebElement checkBox;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement shipping;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	private WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement confirmData;

	public void checkout() {
		checkOut.click();
		summary.click();
		confirmAddress.click();
		checkBox.click();
		shipping.click();
		payment.click();
		confirmData.click();
		
	}
	
	public void checkout(String address1, String address2, String city, String postCode, String _other, String phone,
			String phoneMobile) {
		checkOut.click();
		summary.click();
		_inputForm(address1, address2, city, postCode, _other, phone, phoneMobile);
		confirmAddress.click();
		checkBox.click();
		shipping.click();
		payment.click();
		confirmData.click();
		
	}
	
	public void _inputForm(String address1, String address2, String city, String postCode, String _other, String phone,
			String phoneMobile) {
		this.newAddress.click();
		this.address1.sendKeys(address1);
		this.address2.sendKeys(address2);
		this.city.sendKeys(city);
		_key(this.id_country);
		_key(this.id_state);
		this.postcode.sendKeys(postCode);
		this._other.sendKeys(_other);
		this.phone.sendKeys(phone);
		this.phone_mobile.sendKeys(phoneMobile);
		this.submitAddress.click();
		this.changeAddress.click();
		this.changeAddress.sendKeys(Keys.ARROW_DOWN);
		this.changeAddress.sendKeys(Keys.ARROW_DOWN);
		this.changeAddress.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	private void _key(WebElement webElement) {
		webElement.click();
		webElement.sendKeys(Keys.ARROW_DOWN);
		webElement.sendKeys(Keys.ENTER);

	}

}
