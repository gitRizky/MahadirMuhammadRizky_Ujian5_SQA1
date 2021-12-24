package com.juaracoding.ujiandes24.main.addtocart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiandes24.main.driver.Chrome;

public class TShirt {
	private WebDriver driver;
	private JavascriptExecutor js;

	public TShirt() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
		
	}

	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement tShirt;
	
	@FindBy(css = "#center_column > ul > li > div")
	private WebElement lookTShirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement addToCart;
	
	public void chooseTShirt() {
		tShirt.click();
		js.executeScript("arguments[0].scrollIntoView()", lookTShirt);
		lookTShirt.click();
		addToCart.click();
		
	}
	
}
