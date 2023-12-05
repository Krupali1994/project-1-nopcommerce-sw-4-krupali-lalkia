package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By signInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerButton = By.xpath("//button[normalize-space()='Register']");
    By emailId = By.id("Email");
    By passwordField = By.id("Password");
    By logInButton = By.xpath("//button[normalize-space()='Log in']");

    public String verifyTitleOfSignPage() {
        return getTextFromElement(signInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkOutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void emailId(String email) {
        sendTextToElement(emailId, email);
    }

    public void password(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLogInButton() {
        clickOnElement(logInButton);
    }
}
