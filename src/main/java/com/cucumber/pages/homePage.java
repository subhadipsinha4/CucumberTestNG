package com.cucumber.pages;

import com.cucumber.BaseTest.baseTest;
//import io.cucumber.java.bs.A;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class homePage extends baseTest {

    @FindBy (xpath="//h1[@class='logo']//a[@title]")
    public WebElement homePageLogo;
    @FindBy(xpath = "//a[text()='Wishlist']")
    public WebElement homeWishListTitle;
    @FindBy(xpath = "//a[text()='Cart']")
    public static WebElement homePageCart;
    @FindBy(xpath = "//h2[@class='block-title']")
    public WebElement homePageNewArrival;
    public String homePageNewAr="New Arrivals";
    @FindBy(xpath="//a[@title='Account']")
    public static WebElement checkAccountTab;

    @FindBy (xpath = "//input[@id='search']")
    public WebElement searchBoxMM;
    @FindBy(xpath = "//button[@title='Search']")
    public WebElement searchButtonMM;
    public String searchQuery="*";
    @FindBy(xpath = "//li[@class='tab active']//div[@class='block-title']//p")
    public WebElement loginPageTitle;
    @FindBy(xpath = "//div[@unbxdattr='product']")
    public WebElement homePageProductClick;
    @FindBy(xpath = "//li[@class='product current']//span")
    public WebElement productTitlePDP;
    @FindBy(xpath = "//div[@unbxdattr]//a[@title='Add to Cart']")
    public WebElement addToCartHomePage;
    @FindBy(xpath = "//div[@unbxdattr]")
    public WebElement clickProductTitle;
    @FindBy (xpath = "//p[@class='product-name']//a")
    public WebElement addToCartProductTite;
    public String productTitle="";
    @FindBy(xpath = "//div[@class='row']//input[@name='login[username]']")
    public WebElement userEmail;

    @FindBy(xpath = "//div[@class='row']//input[@name='login[password]']")
    public WebElement userPassward;
    @FindBy(xpath = "//div[@class='row']//button[text()='Login']")
    public WebElement loginClick;

    @FindBy(xpath = "//aside[@class='right-off-canvas-menu hide-for-large-up']//div[@class='block block-account-nav']//div//div[@class='left greeting']")
    public WebElement checkUserName;
    @FindBy(xpath = "//aside[@class='right-off-canvas-menu hide-for-large-up']//a[@title='Log out']")
    public WebElement logoutButton;

    public homePage() throws IOException {
        PageFactory.initElements(driver, this);
    }


}
