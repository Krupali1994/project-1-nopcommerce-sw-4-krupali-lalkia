package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputerTest extends BaseTest {

    HomePage homepage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    GreetingMessagePage greetingMessagePage = new GreetingMessagePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        //1.1 Click on Computer Menu
        homepage.mouseHoverToComputerTopManu();

        //1.2 Click on desktop
        homepage.clickOnDesktopDropDownLinkOfComputers();
        Thread.sleep(2000);

        //1.3 Select Sort By position "Name: Z to A"
        List<String> actual = desktopsPage.clickOnSortByPosition("Name: Z to A");
        List<String> expected = desktopsPage.productArrangeInReverseOrder();
        Assert.assertEquals(actual, expected, "Products are not arranged in Descending order");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        //1.1 Click on Computer Menu
        homepage.mouseHoverToComputerTopManu();

        //1.2 Click on desktop
        homepage.clickOnDesktopDropDownLinkOfComputers();

        //2.3 Select Sort By position "Name: A to Z"
        desktopsPage.selectSortPositionNameAscendingOrder("Name: A to Z");
        Thread.sleep(2000);

        //2.4 Add to cart
        desktopsPage.addOnBuildYourOwnComputerAddCart();
        Thread.sleep(2000);

        //2.5 Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        String actualMessage = productPage.verifyTitleOfBuildYourOwnComputer();
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid Text");
        Thread.sleep(2000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPage.selectProcessorOfBuildYourOwnComputer("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(2000);

        //2.7.Select "8GB [+$60.00]" using Select class
        productPage.selectRamOfBuildYourOwnComputer("8GB [+$60.00]");
        Thread.sleep(2000);

        // 2.8 Select HDD radio "400 GB [+$100.00]"
        productPage.clickOnHddOfBuildYourOwnComputer();
        Thread.sleep(2000);

        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        productPage.clickOnOsOfBuildYourOwnComputer();
        Thread.sleep(2000);

        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        productPage.clickOnSoftwareOfBuildYourOwnComputer();
        Thread.sleep(2000);

        //2.11 Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        String actualPrice = productPage.verifyPriceOfBuildYourOwnComputer();
        Assert.assertEquals(actualPrice, expectedPrice, "Price Not Match");
        Thread.sleep(2000);

        //2.12 Click on "ADD TO CARD" Button
        productPage.pressAddToCart();
        Thread.sleep(2000);

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText = "The product has been added to your shopping cart";
        String actualText = productPage.verifyMessageOfProductAddedToCart();
        Assert.assertEquals(actualText, expectedText, "Invalid Text");
        Thread.sleep(2000);

        //close popup
        productPage.clickOnCloseBar();
        Thread.sleep(2000);

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        productPage.mouseHoverOnShoppingCartLinkAndClickOnGoToCartButton();

        // 2.15 Verify the message "Shopping cart"
        String expectedMessage1 = "Shopping cart";
        String actualMessage1 = shoppingCartPage.verifyTitleOfShoppingCartPage();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Invalid Text");
        Thread.sleep(2000);

        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeTheQty("2");
        shoppingCartPage.clickOnUpdateShoppingCartButton();

        // 2.17 Verify the Total"$2,950.00"
        String expectedPrice1 = "$2,950.00";
        String actualPrice1 = shoppingCartPage.verifyTotalPriceOfProduct();
        Assert.assertEquals(actualPrice1, expectedPrice1, "Price Not Match");
        Thread.sleep(2000);

        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();
        Thread.sleep(2000);

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        Thread.sleep(2000);

        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage2 = "Welcome, Please Sign In!";
        String actualMessage2 = signInPage.verifyTitleOfSignPage();
        Assert.assertEquals(actualMessage2, expectedMessage2, "Invalid Text");
        Thread.sleep(2000);

        //2.21 Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckoutAsGuestButton();
        Thread.sleep(2000);

        // 2.22 Fill the all mandatory field
        checkOutPage.enterFirstName("Krupali");
        checkOutPage.enterLastName("Lalkia");
        checkOutPage.enterEmail("krupali@gmail.com");
        checkOutPage.enterCompany("Apple");
        checkOutPage.selectCountryFromCountryField("UK");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress("15 Covent Garden");
        checkOutPage.enterPostalCode("Sl8 2TX");
        checkOutPage.enterNumber("07894561230");

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonToShippingMethod();

        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        shippingMethodPage.clickOnNextDayRadioButton();

        //2.25 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueButton();
        Thread.sleep(2000);

        //2.26 Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCardRadioButton();
        Thread.sleep(2000);

        //2.27 Select “Master card” From Select credit card dropdown
        paymentMethodPage.clickOnContinueButton();
        Thread.sleep(2000);

        //2.28 Fill all the details
        paymentInformationPage.selectCreditCardType("Master card");
        paymentInformationPage.enterCardholderName("Krupali Lalkia");
        paymentInformationPage.enterCardNumber("5431 5555 5555 5555");
        paymentInformationPage.selectExpiryMonth("04");
        paymentInformationPage.selectExpiryYear("2024");
        paymentInformationPage.enterCardCode("123");

        //2.29 Click on “CONTINUE”
        paymentInformationPage.clickOnContinueToConfirmOrder();
        Thread.sleep(2000);

        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMessage3 = "Credit Card";
        String actualMessage3 = confirmOrderPage.verifyPaymentMethodName();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Invalid Text");
        Thread.sleep(2000);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedMessage4 = "Next Day Air";
        String actualMessage4 = confirmOrderPage.verifyShippingMethodName();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Invalid Text");
        Thread.sleep(2000);

        //2.33 Verify Total is “$2,950.00”
        String expectedPrice3 = "$2,950.00";
        String actualPrice3 = confirmOrderPage.verifyTotalPrice();
        Assert.assertEquals(actualPrice3, expectedPrice3, "Invalid Text");
        Thread.sleep(2000);

        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmButton();
        Thread.sleep(2000);

        //2.35 Verify the Text “Thank You”
        String expectedMessage5 = "Thank you";
        String actualMessage5 = greetingMessagePage.verifyGreetingMessage();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Invalid Text");
        Thread.sleep(2000);

        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage6 = "Your order has been successfully processed!";
        String actualMessage6 = greetingMessagePage.verifyOrderSuccessMessage();
        Assert.assertEquals(actualMessage6, expectedMessage6, "Invalid Text");
        Thread.sleep(2000);

        //2.37 Click on “CONTINUE”
        greetingMessagePage.clickOnContinue();

        //2.38 Verify the text “Welcome to our store”
        String expectedMessage7 = "Welcome to our store";
        String actualMessage7 = loginPage.verifyWelcomeText();
        Assert.assertEquals(actualMessage7, expectedMessage7, "Invalid Text");
        Thread.sleep(2000);

    }
}
