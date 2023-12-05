package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GreetingMessagePage extends Utility {

    By greetingMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    public String verifyGreetingMessage() {
        return getTextFromElement(greetingMessage);
    }

    public String verifyOrderSuccessMessage() {
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }
}
