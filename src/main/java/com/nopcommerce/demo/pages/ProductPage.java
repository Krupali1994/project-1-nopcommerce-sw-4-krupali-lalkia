package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    /**
     * Computer
     * 2.5 Verify the Text "Build your own computer"
     * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
     * 2.7.Select "8GB [+$60.00]" using Select class.
     * 2.8 Select HDD radio "400 GB [+$100.00]"
     * 2.9 Select OS radio "Vista Premium [+$60.00]"
     * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
     * 2.11 Verify the price "$1,475.00"
     * 2.12 Click on "ADD TO CARD" Button.
     * 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
     * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
     */

    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorOfBuildYourOwnComputer = By.id("product_attribute_1");
    By ramOfBuildYourOwnComputer = By.id("product_attribute_2");
    By hddOfBuildYourOwnComputer = By.id("product_attribute_3_7");
    By osOfBuildYourOwnComputer = By.id("product_attribute_4_9");
    By softwareOfBuildYourOwnComputer = By.id("product_attribute_5_12");
    By priceOfTotalText = By.id("price-value-1");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddToCartMessage = By.xpath("//p[@class='content']");
    By closePopUp = By.xpath("//span[@title='Close']");
    By shoppingCartLinkAndGoTOCart = By.xpath("//span[@class='cart-label']");


    /**
     * Electronics
     * 2.6 Verify the text “Nokia Lumia 1020”
     * 2.7 Verify the price “$349.00”
     * 2.8 Change quantity to 2
     * 2.9 Click on “ADD TO CART” tab
     * 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
     * After that close the bar clicking on the cross button.
     * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
     */

    By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By priceTextOfNokiaLumia = By.xpath("//span[@id='price-value-20']");
    By qtyTextBox = By.id("product_enteredQuantity_20");
    By addToCartTab = By.xpath("//button[@id='add-to-cart-button-20']");
    By CartMassage = By.xpath("//p[@class='content']");
    By closeCrossButton = By.xpath("//span[@title='Close']");
    By shoppingCartLinkAndClickOnGoToCart = By.xpath("//span[@class='cart-label']");


    //Computer Test
    public String verifyTitleOfBuildYourOwnComputer() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessorOfBuildYourOwnComputer(String processor) {
        selectByVisibleTextFromDropDown(processorOfBuildYourOwnComputer, processor);
    }

    public void selectRamOfBuildYourOwnComputer(String ram) {
        selectByVisibleTextFromDropDown(ramOfBuildYourOwnComputer, ram);
    }

    public void clickOnHddOfBuildYourOwnComputer() {
        clickOnElement(hddOfBuildYourOwnComputer);
    }

    public void clickOnOsOfBuildYourOwnComputer() {
        clickOnElement(osOfBuildYourOwnComputer);
    }

    public void clickOnSoftwareOfBuildYourOwnComputer() {
        clickOnElement(softwareOfBuildYourOwnComputer);
    }

    public String verifyPriceOfBuildYourOwnComputer() {
        return getTextFromElement(priceOfTotalText);
    }

    public void pressAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String verifyMessageOfProductAddedToCart() {
        return getTextFromElement(productAddToCartMessage);
    }

    public void clickOnCloseBar() {
        clickOnElement(closePopUp);
    }

    public void mouseHoverOnShoppingCartLinkAndClickOnGoToCartButton() {
        mouseHoverToElementAndClick(shoppingCartLinkAndClickOnGoToCart);
    }

    //Electronics Test
    public String verifyNokiaLumia1020() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPriceOfNokiaLumia() {
        return getTextFromElement(priceTextOfNokiaLumia);
    }

    public void changeTheQty(String qty) {
        clearField(qtyTextBox);
        sendTextToElement(qtyTextBox, qty);
    }

    public void addToCartNokiaLumiaCellPhone() {
        clickOnElement(addToCartTab);
    }

    public String verifyTheCartMessage() {
        return getTextFromElement(CartMassage);
    }

    public void clickOnCrossButton() {
        clickOnElement(closeCrossButton);
    }

    public void mouseHoverOnShoppingCartLinkAndClick() {
        mouseHoverToElementAndClick(shoppingCartLinkAndClickOnGoToCart);
    }

}
