package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {

    By nextDayRadioButton = By.id("shippingoption_1");
    By continueButton = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By click2ndDayAirRadioButton = By.id("shippingoption_2");

    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayRadioButton);
    }

    public void clickOn2ndAirShippingMethod() {
        clickOnElement(click2ndDayAirRadioButton);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}

