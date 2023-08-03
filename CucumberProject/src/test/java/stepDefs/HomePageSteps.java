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

        @Then("A Success Message is Displayed and it is green")
        public void AProductNameIsAppeared(){
            softAssert.assertTrue(homePage.successMsgDisplayed());
            softAssert.assertEquals(homePage.getMsgColoration(),"#4bb07a");
            softAssert.assertAll();
        }

    @When("A green message is dis appeared to click on washlist card")
    public void aGreenMessageIsDisAppearedToClickOnWashlistCard() {
        homePage.AddToWishlist();
        homePage.WishlistCart();

    }
        @Then("A Qty value is bigger than zero")
        public void aQtyValueIsBiggerThanZero() {

            softAssert.assertTrue(homePage.checkQtyValue().equals("1"));
            softAssert.assertAll();
        }
}



