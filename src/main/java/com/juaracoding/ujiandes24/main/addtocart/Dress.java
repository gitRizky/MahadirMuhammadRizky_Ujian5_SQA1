package com.juaracoding.ujiandes24.main.addtocart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiandes24.main.driver.Chrome;

public class Dress {
	private WebDriver driver;
	private JavascriptExecutor js;

	public Dress() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
		
	}

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div")
	private WebElement lookDress;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement addToCart;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement continueShop;
	
	public void chooseDress() {
		dress.click();
		js.executeScript("arguments[0].scrollIntoView()", lookDress);
		lookDress.click();
		addToCart.click();
		continueShop.click();
		
	}
	
}
