package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static stepDefs.Hooks.*;

public class HomePageSteps {
        @Given("A user Navigates to homepage URL")
        public void AUserNavigatesToHomepageURL(){
            driver.get("https://demo.nopcommerce.com/");

        }
       @When("A user click to add to washlist")
        public void AUserClickToAddToWashlist(){
           homePage.AddToWishlist();
       }

        @Then("A Success Message is Displayed and it is green {string}")
        public void AProductNameIsAppeared(String color){
            softAssert.assertTrue(homePage.successMsgDisplayed());
            softAssert.assertEquals(homePage.getMsgColoration(),color);
            softAssert.assertAll();
        }

    @When("A green message is dis appeared to click on washlist card")
    public void aGreenMessageIsDisAppearedToClickOnWashlistCard() {
        homePage.AddToWishlist();
        homePage.WishlistCart();

    }
        @Then("A Qty value is bigger than {string}")
        public void aQtyValueIsBiggerThanZero(String num) {

            softAssert.assertTrue(homePage.checkQtyValue().equals(num));
            softAssert.assertAll();
        }
}



