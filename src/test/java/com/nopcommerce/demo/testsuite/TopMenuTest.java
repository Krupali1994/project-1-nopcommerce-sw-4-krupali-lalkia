package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation1() {
        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(homePage.getTitleOfPage(), "Gift Cards", "Page Navigated Successfully");

    }

}
