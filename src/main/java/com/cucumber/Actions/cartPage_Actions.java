package com.cucumber.Actions;

import com.cucumber.pages.cartPage;
import com.cucumber.pages.searchPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

import static com.cucumber.Actions.searchPage_Actions.productDetails;

public class cartPage_Actions extends cartPage {

    public cartPage_Actions() throws IOException {
    }
    public static HashMap<String,String> productDetailsCartPage=new HashMap<>();

    public void clickOnDelete()
    {
        deleteSingleItem.click();
    }
    public void validateDeleteMessage()
    {

        System.out.println(">> "+validateMessage.getText());
    }

    public void cartPageProductDetails()
    {
        int flag=0;
            List<WebElement> productPrices=driver.findElements( By.xpath( allProductPriceInCart ) );
            List<WebElement> productSKU=driver.findElements( By.xpath( allProductSKUInCart ) );
            for(int i=0;i<productPrices.size();i++)
            {
                productDetailsCartPage.put( productSKU.get(i).getAttribute( "value" ),productPrices.get( i ).getText() );
            }
        System.out.println("Product In CartPage: "+productDetailsCartPage);
        System.out.println("Product in SRP: "+productDetails);
        Assert.assertEquals( productDetailsCartPage,productDetails);
    }

    public void deleteAllItemsCartPage()
    {
        List<WebElement> cartItems= driver.findElements( By.xpath( deleteButtonCartPages));
        for(int i=0;i<cartItems.size();i++)
        {
            deleteButtonCartPage.click();
        }
    }

    public void testDeleteAllButton()
    {
        EmptyCartButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    public void checkCartEmptyOrNot()
    {
        Assert.assertEquals( cartEmptyMessage.getText(),emptyCartMessage,"Cart is not empty" );
    }
}
