package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By cellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listViewTab = By.xpath("//a[normalize-space()='List']");
    By productNokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public String verifyCallPhonesText() {
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaCellPhone() {
        clickOnElement(productNokiaLumia);
    }
}
