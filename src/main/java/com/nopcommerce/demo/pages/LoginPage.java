package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeToStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");

    public String verifyWelcomeText() {
        return getTextFromElement(welcomeToStoreText);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
    }
}
