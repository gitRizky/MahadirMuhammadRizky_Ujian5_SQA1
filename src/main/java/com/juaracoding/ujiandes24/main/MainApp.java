package com.juaracoding.ujiandes24.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujiandes24.main.addtocart.Dress;
import com.juaracoding.ujiandes24.main.addtocart.TShirt;
import com.juaracoding.ujiandes24.main.checkout.Checkout;
import com.juaracoding.ujiandes24.main.createaccount.InputForm;
import com.juaracoding.ujiandes24.main.createaccount.SignIn;
import com.juaracoding.ujiandes24.main.driver.Chrome;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = Chrome.getDriver();
		driver.get("http://automationpractice.com/index.php");

		// Create Account
		SignIn sign = new SignIn();
		sign.createAccount("biyakic805@ztymm.com"); // email harus diganti jika sudah didaftarkan

		// Input Form
		InputForm input = new InputForm();
		input._inputForm("John", "Smith", "12345", "Test Company", "My Address", "2nd Home", "Aurora City", "16617",
				"Full Information", "8888888", "88888888888", "Ask Me");
		
		// Add to Cart
		Dress dress = new Dress();
		dress.chooseDress();
		
		TShirt tShirt = new TShirt();
		tShirt.chooseTShirt();
		
		// Checkout
		Checkout checkout = new Checkout();
		checkout.checkout();

		// Checkout with New Change Address
//		checkout.checkout("test", "test", "wano", "11111", "test", "8888888", "888888888");

	}

}
