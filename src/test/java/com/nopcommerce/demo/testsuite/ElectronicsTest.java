package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    GreetingMessagePage greetingMessagePage = new GreetingMessagePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTopMenuTab();

        //1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();

        //1.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.verifyCallPhonesText();
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid Text");

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        Thread.sleep(2000);

        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTopMenuTab();

        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();

        //2.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.verifyCallPhonesText();
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid Text");

        //2.4 Click on List View Tab
        cellPhonePage.clickOnListViewTab();
        Thread.sleep(2000);

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumiaCellPhone();

        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = productPage.verifyNokiaLumia1020();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Invalid Text");

        //2.7 Verify the price “$349.00”
        String expectedPrice = "$349.00";
        String actualPrice = productPage.verifyPriceOfNokiaLumia();
        Assert.assertEquals(actualPrice, expectedPrice, "Invalid Text");

        //2.8 Change quantity to 2
        productPage.changeTheQty("2");

        //2.9 Click on “ADD TO CART” tab
        productPage.addToCartNokiaLumiaCellPhone();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Topngreen Bar
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = productPage.verifyTheCartMessage();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Invalid Text");

        //After that close the bar clicking on the cross button
        productPage.clickOnCrossButton();
        Thread.sleep(2000);

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        productPage.mouseHoverOnShoppingCartLinkAndClick();
        Thread.sleep(2000);

        //2.12 Verify the message "Shopping cart"
        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = shoppingCartPage.verifyTitleOfShoppingCartPage();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Invalid Text");
        Thread.sleep(2000);

        //2.13 Verify the quantity is 2
        shoppingCartPage.changeTheQty("2");
        shoppingCartPage.clickOnCheckOutButton();
        Thread.sleep(2000);

        //2.14 Verify the Total $698.00
        String expectedPrice1 = "$698.00";
        String actualPrice1 = shoppingCartPage.verifyTotalPriceAmount();
        Assert.assertEquals(actualPrice1, expectedPrice1, "Price Not Match");
        Thread.sleep(2000);

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnUpdateShoppingCartButton();

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText = "Welcome, Please Sign In!";
        String actualText = signInPage.verifyTitleOfSignPage();
        Assert.assertEquals(actualText, expectedText, "Invalid Text");
        Thread.sleep(2000);

        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterButton();

        //2.19 Verify the text “Register”
        String expectedMessage5 = "Register";
        String actualMessage5 = registerPage.verifyRegisterTitle();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Invalid Text");
        Thread.sleep(2000);

        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Krupali");
        registerPage.enterLastName("Lalkia");
        registerPage.enterEmail("krupali@gmail.com");
        registerPage.enterPassword("Krupali123");
        registerPage.enterConfirmPassword("Krupali123");

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();

        //2.22 Verify the message “Your registration completed”
        String expectedResult = "Your registration completed";
        String actualResult = registerPage.verifyRegistrationMessage();
        Assert.assertEquals(actualResult, expectedResult, "Invalid Text");
        Thread.sleep(2000);

        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueToShoppingCart();

        //2.24 Verify the text “Shopping cart”
        String expectedMessage6 = "Shopping cart";
        String actualMessage6 = shoppingCartPage.verifyTitleOfShoppingCartPage();
        Assert.assertEquals(actualMessage6, expectedMessage6, "Invalid Text");
        Thread.sleep(5000);

        //Login again because cart is empty
        shoppingCartPage.clickOnLogInButton();
        signInPage.emailId("krupali@gmail.com");
        signInPage.password("Krupali123");
        signInPage.clickOnLogInButton();

        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();

        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

        //2.27 Fill the Mandatory fields
        checkOutPage.enterCompany("Apple");
        checkOutPage.selectCountryFromCountryField("UK");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress("15 Covent Gardens");
        checkOutPage.enterPostalCode("SL3 1LX");
        checkOutPage.enterNumber("07894561230");
        checkOutPage.clickOnContinueButtonToShippingMethod();

        //2.28 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueButton();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        shippingMethodPage.clickOn2ndAirShippingMethod();

        //2.30 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueButton();

        //2.31 Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCardRadioButton();
        Thread.sleep(2000);

        //2.32 Click on continue
        paymentMethodPage.clickOnContinueButton();

        //2.34 Fill all the details
        paymentInformationPage.selectCreditCardType("Visa");
        paymentInformationPage.enterCardholderName("Krupali Lalkia");
        paymentInformationPage.enterCardNumber("5634589632110255");
        paymentInformationPage.selectExpiryMonth("07");
        paymentInformationPage.selectExpiryYear("2024");
        paymentInformationPage.enterCardCode("123");

        //2.35 Click on “CONTINUE”
        paymentInformationPage.clickOnContinueToConfirmOrder();
        Thread.sleep(2000);

        //2.36 Verify “Payment Method” is “Credit Card”
        String expectedMessage7 = "Credit Card";
        String actualMessage7 = confirmOrderPage.verifyPaymentMethodName();
        Assert.assertEquals(actualMessage7, expectedMessage7, "Invalid Text");
        Thread.sleep(2000);

        //2.37 Verify “Shipping Method” is “2nd Day Air”
        String expectedMessage8 = "2nd Day Air";
        String actualMessage8 = confirmOrderPage.verifySecondDayShippingMethod();
        Assert.assertEquals(actualMessage8, expectedMessage8, "Invalid Text");
        Thread.sleep(2000);

        //2.38 Verify Total is “$698.00”
        String expectedMessage9 = "$698.00";
        String actualMessage9 = confirmOrderPage.verifyTotalPriceText();
        Assert.assertEquals(actualMessage9, expectedMessage9, "Invalid Text");
        Thread.sleep(2000);

        //2.39 Verify the Text “Thank You”
        confirmOrderPage.clickOnConfirmButton();
        String expectedMessage10 = "Thank you";
        String actualMessage10 = greetingMessagePage.verifyGreetingMessage();
        Assert.assertEquals(actualMessage10, expectedMessage10, "Invalid Text");
        Thread.sleep(2000);

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage11 = "Your order has been successfully processed!";
        String actualMessage11 = greetingMessagePage.verifyOrderSuccessMessage();
        Assert.assertEquals(actualMessage11, expectedMessage11, "Invalid Text");
        Thread.sleep(2000);

        //2.41 Click on “CONTINUE”
        greetingMessagePage.clickOnContinue();

        //2.42 Verify the text “Welcome to our store”
        String expectedMessage12 = "Welcome to our store";
        String actualMessage12 = loginPage.verifyWelcomeText();
        Assert.assertEquals(actualMessage12, expectedMessage12, "Invalid Text");
        Thread.sleep(2000);

        //2.43 Click on “Logout” link
        loginPage.clickOnLogoutLink();

        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://demo.nopcommerce.com/", "error");

    }

}
