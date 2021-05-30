package com.cucumber.Actions;

import com.cucumber.pages.cartPage;
import com.cucumber.pages.pdpPage;
import com.cucumber.pages.searchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class  searchPage_Actions extends searchPage {
    public searchPage_Actions() throws IOException {

    }

    public static HashMap<String,String> productDetails=new HashMap<String, String>();


    public String checkSearchMessage()
    {
        return searchResultMessage.getText();
    }

    public pdpPage_Actions clickProductOnSRP() throws IOException {
        productClickOnSRP.click();
        return new pdpPage_Actions();
    }

    public void addedMoreThanOneProduct() throws InterruptedException {
        List<WebElement> addToCartButtons=driver.findElements( By.xpath(addToCartList) );
        List<WebElement> productSKU=driver.findElements( By.xpath( products ) );
        List<WebElement> productSalePrice=driver.findElements( By.xpath( productSalePriceSRP ) );
        for(int i=0;i<3;i++)
        {
            addToCartButtons.get( i ).click();
            Thread.sleep( 3000 );
            productDetails.put( productSKU.get( i ).getAttribute( "unbxdparam_sku" ),productSalePrice.get( i ).getText() );
        }
        System.out.println(">>");
        System.out.println(productDetails);

    }


    public static cartPage_Actions clickCartPageButton() throws IOException {
        clickCartPageButton.click();
        return new cartPage_Actions();
    }




}
