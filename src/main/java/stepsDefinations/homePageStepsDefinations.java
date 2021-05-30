package stepsDefinations;

import com.cucumber.Actions.cartPage_Actions;
import com.cucumber.Actions.homePage_Actions;
import com.cucumber.Actions.pdpPage_Actions;
import com.cucumber.Actions.searchPage_Actions;
import com.cucumber.BaseTest.baseTest;
import com.cucumber.pages.cartPage;
import com.cucumber.pages.homePage;
import com.cucumber.pages.pdpPage;
import com.cucumber.pages.searchPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;



import java.io.IOException;

public class homePageStepsDefinations extends baseTest {
    public homePageStepsDefinations() throws IOException {
        super();
    }
    //homePage homepage;
    homePage_Actions homeAction;
    //searchPage searchpage;
    searchPage_Actions searchAction;
    //pdpPage pdppage;
    pdpPage_Actions pdpAction;
    //cartPage cartpage;
    cartPage_Actions cartAction;

    @Before
    public void setUp() throws IOException {
        initializ();
        //homepage=new homePage();
        homeAction=new homePage_Actions();
        searchAction= new searchPage_Actions();
        pdpAction=new pdpPage_Actions();
        cartAction=new cartPage_Actions();
    }
    @Given("Home page check logo")
    public void home_page_check_logo() {
        homeAction.pageLogo();
    }
    @When("home page all elements are plesent")
    public void home_page_all_elements_are_plesent() {
        homeAction.checkWishList();

    }

    @When("Enter query in search box and press enter key")
    public void enter_query_in_search_box_and_press_enter_key() throws IOException {
        searchAction=homeAction.checkSearchHomePage();
    }
    @Then("check the search result page")
    public void check_the_search_result_page() {
            System.out.println(searchAction.checkSearchMessage());
    }

    @Given("Home page url \"(.*)\"")
    public void home_page_url(String url) {
        String currentPageUrl=driver.getCurrentUrl();
        Assert.assertEquals(currentPageUrl,url) ;
    }
    @When("Click add to cart button from product")
    public void click_add_to_cart_button_from_product() throws InterruptedException {
        homeAction.addToCartInHomePage();
    }
    @Then("Click on cart")
    public void click_on_cart() {
        homeAction.cartClick();
    }
    @And("validate the product from cart")
    public void validate_the_product() {
        homeAction.validateCartProductTitle();

    }
    @When("click product in Home page")
    public void click_product_in_home_page() throws IOException {
        pdpAction=homeAction.clickProductInHomepage();
    }
    @Then("validate the PDP page")
    public void validate_the_PDP_page() {
        pdpAction.checkProductDescription();
    }
    @When("Click on account tab")
    public void click_on_account_tab() throws InterruptedException {
        homeAction.accountClick();
    }
    @Then("Enter user and pass and click on login")
    public void enter_user_and_pass_and_click_on_login() throws IOException, InterruptedException {
        homeAction.loginUser();
    }
//    @And("validate the user name")
//    public void validate_the_user_name() throws InterruptedException {
//            homepage.checkUserProfile();
//    }
//
//    @When("Search query and go to the SRP")
//    public void search_query_and_go_to_the_srp() throws IOException {
//           searchpage=homepage.checkSearchHomePage();
//    }
    @Then("Click any product from SRP and go to the PDP")
    public void click_any_product_from_srp_and_go_to_the_pdp() throws IOException {
        pdpAction=searchAction.clickProductOnSRP();
    }
    @Then("Increase the qty of the product")
    public void increase_the_qty_of_the_product() {
        pdpAction.increaseProductQty();
    }
    @Then("Click add to card")
    public void click_add_to_card() throws InterruptedException {
        pdpAction.clickADDtoCartPDP();
    }

    @Then("^validate the product$")
    public void validateProduct() {
        pdpAction.pdpCartProductCheck();
    }
    @Then("go to the cart page")
    public void go_to_the_cart_page() throws IOException {
        cartAction=pdpAction.clickCartPageButton();
    }
    @Then("click on delete icon form cart list")
    public void click_on_delete_icon_form_cart_list() {
        cartAction.clickOnDelete();
    }
    @Then("validate product is deleted or not")
    public void validate_product_is_deleted_or_not() {
        cartAction.validateDeleteMessage();
    }

    @Then("Click add to cart button from SRP for more that one product")
    public void click_add_to_cart_button_from_srp_for_more_that_one_product() throws InterruptedException {
        searchAction.addedMoreThanOneProduct();
    }

    @Then("Click on view shipping cart button")
    public void test_click_on_view_shipping_cart_button() throws Exception {
        cartAction=searchAction.clickCartPageButton();
    }
    @Then("^Validate the cart page products$")
    public void validate_the_cart_page_products() {
            cartAction.cartPageProductDetails();
    }

    @Then("delete all product one by one form cart list")
    public void delete_all_product_one_by_one_form_cart_list() {
        cartAction.deleteAllItemsCartPage();
    }
    @Then("^Click on delete All button$")
    public void click_on_delete_All_button()  {
        cartAction.testDeleteAllButton();

    }
    @Then("validate all products are deleted or not")
    public void validate_all_products_are_deleted_or_not() {
        cartAction.checkCartEmptyOrNot();
    }
    @After
    public void tearDown()
    { driver.close(); }
}
