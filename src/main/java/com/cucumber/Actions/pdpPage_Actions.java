package com.cucumber.Actions;

import com.cucumber.pages.cartPage;
import com.cucumber.pages.pdpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class pdpPage_Actions extends pdpPage {

    public pdpPage_Actions() throws IOException {

    }

    public void checkProductDescription()
    {
        Assert.assertTrue(productDescriptions.isDisplayed());
    }

    public void increaseProductQty()
    {
        producttitlePDP=productTitlePDP.getText();
        Select allQty= new Select( driver.findElement( By.xpath("//select[@name='qty']") ) );
        allQty.selectByValue( "4" );
        productQty=4;
    }

    public void clickADDtoCartPDP() {
        addToCartPDP.click();
    }

    public void pdpCartProductCheck()
    {
        String addproductOnCart=productTitleCart.getText();
        try{
            Assert.assertEquals( addproductOnCart,producttitlePDP ); }
        finally {
            Assert.assertEquals(productQty,Integer.parseInt(productQtyCart.getAttribute( "value" )) ); }

    }

    public static cartPage_Actions clickCartPageButton() throws IOException {
        clickCartPageButton.click();
        return new cartPage_Actions();
    }
}
