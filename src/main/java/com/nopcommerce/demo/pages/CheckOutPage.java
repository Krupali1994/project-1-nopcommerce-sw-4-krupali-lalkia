package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By companyField = By.id("BillingNewAddress_Company");
    By countryField = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By numberField = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);

    }

    public void enterCompany(String companyName) {
        sendTextToElement(companyField, companyName);
    }

    public void selectCountryFromCountryField(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterPostalCode(String postcode) {
        sendTextToElement(postalCodeField, postcode);
    }

    public void enterNumber(String number) {
        sendTextToElement(numberField, number);
    }

    public void clickOnContinueButtonToShippingMethod() {
        clickOnElement(continueButton);
    }

}
