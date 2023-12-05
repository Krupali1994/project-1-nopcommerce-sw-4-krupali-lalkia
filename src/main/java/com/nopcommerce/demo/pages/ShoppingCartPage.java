package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By qtyTextBox = By.className("qty-input");
    By updateShoppingCartButton = By.id("updatecart");
    By totalPriceText = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
    By totalPriceAmount = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By agreementCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By clickOnLogIn = By.xpath("//a[normalize-space()='Log in']");
    By agreementCheckBoxButton = By.id("termsofservice");
    By clickCheckOutButton = By.id("checkout");

    public String verifyTitleOfShoppingCartPage() {
        return getTextFromElement(shoppingCartText);
    }

    public void changeTheQty(String qty) {
        clearField(qtyTextBox);
        sendTextToElement(qtyTextBox, qty);
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateShoppingCartButton);
    }

    public String verifyTotalPriceOfProduct() {
        return getTextFromElement(totalPriceAmount);
    }

    public String verifyTotalPriceAmount() {
        return getTextFromElement(totalPriceAmount);
    }

    public void clickOnAgreeWithTermsOfServiceBox() {
        clickOnElement(agreementCheckBox);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkOutButton);
    }

    public void clickOnLogInButton() {
        clickOnElement(clickOnLogIn);
    }

    public void clickOnAgreementCheckBoxButton() {
        clickOnElement(agreementCheckBoxButton);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(clickCheckOutButton);
    }
}
