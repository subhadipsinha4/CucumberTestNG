package com.cucumber.pages;

import com.cucumber.BaseTest.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class cartPage extends baseTest {
    public cartPage() throws IOException {
        PageFactory.initElements( driver,this );
    }

 //   public static HashMap<String,String> productDetailsCartPage=new HashMap<>();
    @FindBy(xpath = "//a[@title='Remove item']")
    public WebElement deleteSingleItem;
    @FindBy(xpath = "//div[@class='page-title']//h1")
    public WebElement validateMessage;
    @FindBy(xpath = "//div[@id='shopping-cart-table']//a[@onclick]")
    public WebElement deleteButtonCartPage;
    public String deleteButtonCartPages="//div[@id='shopping-cart-table']//a[@onclick]";
    @FindBy(xpath = "//div[@class='page-title']//h1")
    public WebElement cartEmptyMessage;
    public String emptyCartMessage="Shopping Cart is Empty";
    public static String allProductPriceInCart="//span[@data-label='Price']//span[@class='price']";
    @FindBy(xpath = "//span[text()='Empty Cart']")
    public WebElement EmptyCartButton;
//    @FindBy(xpath = "//div[@class='cart-items table-body']//div[@class='col item-actions']//input")
//    public WebElement allProductSKUInCart;
    public static String allProductSKUInCart="//div[@class='cart-items table-body']//div[@class='col item-actions']//input";


//    public void clickOnDelete()
//    {
//        deleteSingleItem.click();
//    }
//    public void validateDeleteMessage()
//    {
//
//        System.out.println(">> "+validateMessage.getText());
//    }
//
//    public void deleteAllItemsCartPage()
//    {
//        List<WebElement> cartItems= driver.findElements(By.xpath( deleteButtonCartPages));
//        for(int i=0;i<cartItems.size();i++)
//        {
//            deleteButtonCartPage.click();
//        }
//    }
//
//    public void checkCartEmptyOrNot()
//    {
//        Assert.assertEquals( cartEmptyMessage.getText(),emptyCartMessage,"Cart is not empty" );
//    }

}
