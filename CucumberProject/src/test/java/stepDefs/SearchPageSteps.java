package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class SearchPageSteps {

    @Given("A user Navigates to The Search URL")
    public void aUserNavigatesToTheSearchURL() {
        driver.get("https://demo.nopcommerce.com/");
    }
    @When("A user searching to {string} successfully")
    public void Searcing(String ProductName) {
        searchPage.searching(ProductName);
    }

    @Then("The result of searching contains {string}")
    public void theResultOfSearchingContainsLap(String keyword) {
        Assert.assertTrue(searchPage.SearchingChecker(keyword));
    }

    @When("A user searching to a product using {string} successfully")
    public void aUserSearchingToAProductUsingSkutextSuccessfully(String skutext) {
            searchPage.skuSearch(skutext);
        }



    @Then("The result of searching contains that {string}")
    public void theResultOfSearchingContainsThatSkukeyword(String skukeyword) {
        Assert.assertTrue(searchPage.skuSearchingChecker(skukeyword));
        softAssert.assertAll();

    }
}

