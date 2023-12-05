package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {

    By creditCardRadioButton = By.id("paymentmethod_1");
    By continueButton = By.xpath("//div[@id='payment-method-buttons-container']/descendant::a/following::button[1]");

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}
