package ComNopCommerce;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepDefs {
WebDriver driver;
    @Given("^User is on Home page$")
    public void user_is_on_Home_page()  {

    }
    @When("^User click on Category_List$")
    public void user_click_on_Category_List()  {
        HomePagaLinks home=new HomePagaLinks();
        home.homePageLinks();
    }

    @Then("^User should navigate successfully on Category_Url$")
    public void user_should_navigate_successfully_on_Category_Url()  {
        ValidateHomePage url=new ValidateHomePage();
        url.validateHomePage("https://demo.nopcommerce.com/");

    }



}




