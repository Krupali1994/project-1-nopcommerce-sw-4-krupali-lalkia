package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    By paymentMethodText = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By totalPriceText = By.xpath("//span[@class='value-summary']/strong[text()='$2,950.00']");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By secondDayAirShippingMethod = By.cssSelector("li[class='shipping-method'] span[class='value']");

    public String verifyPaymentMethodName() {
        return getTextFromElement(paymentMethodText);
    }

    public String verifyShippingMethodName() {
        return getTextFromElement(shippingMethodText);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(totalPriceText);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String verifySecondDayShippingMethod() {
        return getTextFromElement(secondDayAirShippingMethod);
    }

    public String verifyTotalPriceText() {
        return getTextFromElement(totalPrice);
    }
}
