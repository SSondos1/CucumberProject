package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import static stepDefs.Hooks.*;

public class SlidersPageSteps {
        @Given("A user Navigates to nopcommerce URL")
    public void AUserNavigatesToNopcommerceURL(){
            driver.get("https://demo.nopcommerce.com/");
    }

    @When("A user open Nokia Slider Url")
    public void aUserOpenNokiaSliderUrl() {
        homePage.FirstSlider();
    }

    @Then("the expected nokia Url like {string}")
    public void theExpectedNokiaUrlLike(String nokiaUrl) {
        Assert.assertEquals(HomePage.p,nokiaUrl);
        softAssert.assertAll();
    }

    @When("A user open IPhone Slider Url")
    public void aUserOpenIPhoneSliderUrl() {
            homePage.SecondSlider();
    }

    @Then("the expected iphone  Url like {string}")
    public void theExpectedIphoneUrlLike(String iphoneUrl) {
            Assert.assertEquals(HomePage.v,iphoneUrl);
            softAssert.assertAll();
    }
}
