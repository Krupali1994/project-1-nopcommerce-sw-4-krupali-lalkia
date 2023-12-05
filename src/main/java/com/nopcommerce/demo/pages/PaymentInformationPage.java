package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility {

    By creditCardField = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expirationMonthDate = By.id("ExpireMonth");
    By expirationYearDate = By.id("ExpireYear");
    By cardCodeField = By.id("CardCode");
    By continueButton = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");

    public void selectCreditCardType(String creditCardType) {
        selectByVisibleTextFromDropDown(creditCardField, creditCardType);
    }

    public void enterCardholderName(String cardHolderName) {
        sendTextToElement(cardHolderNameField, cardHolderName);
    }

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    public void selectExpiryMonth(String expiredMonth) {
        selectByVisibleTextFromDropDown(expirationMonthDate, expiredMonth);
    }

    public void selectExpiryYear(String expiredYear) {
        selectByVisibleTextFromDropDown(expirationYearDate, expiredYear);
    }

    public void enterCardCode(String cardCode) {
        sendTextToElement(cardCodeField, cardCode);
    }

    public void clickOnContinueToConfirmOrder() {
        clickOnElement(continueButton);
    }

}
