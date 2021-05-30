package com.cucumber.Actions;

import com.cucumber.pages.homePage;
import com.cucumber.pages.pdpPage;
import com.cucumber.pages.searchPage;
import org.testng.Assert;

import java.io.IOException;

public class homePage_Actions extends homePage {
    public homePage_Actions() throws IOException {
    }

    public void pageLogo()
    {
        Assert.assertTrue( homePageLogo.isDisplayed() );
    }

    public void checkWishList()
    {
        Assert.assertTrue( homeWishListTitle.isDisplayed() );
    }

    public void checkHomePageCart()
    {
        Assert.assertTrue( homePageCart.isDisplayed() );
    }

    public searchPage_Actions checkSearchHomePage() throws IOException {
        searchBoxMM.sendKeys( searchQuery );
        searchButtonMM.click();
        return new searchPage_Actions();
    }

    public pdpPage_Actions clickProductInHomepage() throws IOException {
        homePageProductClick.click();
        return new pdpPage_Actions();
    }

    public void chechProductTitlePDP(String productTitle) {
    }

    public void addToCartInHomePage() throws InterruptedException {
        addToCartHomePage.click();
        productTitle=clickProductTitle.getAttribute( "unbxdparam_title" );
        Thread.sleep( 3000 );

    }
    public void cartClick()
    { homePageCart.click(); }

    public void accountClick() throws InterruptedException {
        checkAccountTab.click();
        Thread.sleep(3000);
        System.out.println(loginPageTitle.getText());
        Assert.assertEquals(loginPageTitle.getText(),"Login or Create an Account" );

    }

    public homePage loginUser() throws InterruptedException, IOException {
        userEmail.sendKeys("subhadipsinha4@yahoo.com");
        userPassward.sendKeys("A@123456");
        loginClick.click();
        return this;

    }


    public void checkUserProfile() throws InterruptedException {
        checkAccountTab.click();
        Thread.sleep( 3000 );
        System.out.println("> "+checkUserName.getText());
        Assert.assertEquals("Hello, QA!",checkUserName.getText()  );

        //Assert.assertTrue("User name is not getting displayed",checkUserName.isDisplayed());
        //logoutButton.click();


    }
    public void validateCartProductTitle()
    {
        Assert.assertEquals( productTitle,addToCartProductTite.getText() );
        System.out.println("> "+productTitle+"> "+addToCartProductTite.getText());
    }


}
