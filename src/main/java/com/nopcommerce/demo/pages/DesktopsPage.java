package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    By sortByDropDown = By.xpath("//select[@id='products-orderby']");
    By listOfProducts = By.xpath("//div[@class='item-grid']//div[@class='details']//a");
    By sortPositionNameAscendingOrder = By.name("products-orderby");
    By PressOnBuildYourOwnComputerAddCart = By.xpath("//button[@type='button' and  @class='button-2 product-box-add-to-cart-button']");

    public List<String> clickOnSortByPosition(String option) throws InterruptedException {
        selectByVisibleTextFromDropDown(sortByDropDown, option);

        Thread.sleep(2000);
        List<WebElement> afterApplyingZToA = driver.findElements(listOfProducts);
        List<String> inDescendingOrder = new ArrayList<>();
        for (WebElement productAfterSort : afterApplyingZToA) {
            inDescendingOrder.add(productAfterSort.getText());
        }
        System.out.println(inDescendingOrder);
        return inDescendingOrder;
    }

    public List<String> productArrangeInReverseOrder() {
        List<WebElement> productElements = driver.findElements(listOfProducts);
        List<String> reverseProductNames = new ArrayList<>();
        for (WebElement e : productElements) {
            reverseProductNames.add(e.getText());
        }
        System.out.println(reverseProductNames);
        Collections.sort(reverseProductNames, Collections.reverseOrder());
        System.out.println(reverseProductNames);
        return reverseProductNames;
    }

    //1.3 Select Sort By position "Name: Z to A"
    public void selectSortPositionNameDescendingOrder(String text) {
        selectByVisibleTextFromDropDown(sortByDropDown, text);
    }

    //1.4 Verify the Product will arrange in Descending order
    public void verifyByAllProductInDescendingOrder(String sortName) {
        sendTextToElement(listOfProducts, sortName);
    }

    //2.3 Select Sort By position "Name: A to Z"
    public void selectSortPositionNameAscendingOrder(String text) {
        selectByVisibleTextFromDropDown(sortPositionNameAscendingOrder, text);
    }

    //2.4 Click on "Add To Cart" of in build your own computer
    public void addOnBuildYourOwnComputerAddCart() {
        clickOnElement(PressOnBuildYourOwnComputerAddCart);
    }
}
