package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;


import static stepDefs.Hooks.*;

public class FollowUsPageSteps {
    @Given("A user Navigates to  URL")
    public void aUserNavigatesToURL() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("A user click to facebook follow us links")
    public void aUserClickToFacebookFollowUsLinks() {

        homePage.OpenFaceBook();

    }

    @Then("the current facebook Url like {string}")
    public void theCurrentFacebookUrlLike(String expfacebookurl) {

        Assert.assertEquals(HomePage.y,expfacebookurl);
       softAssert.assertAll();
    }

    @When("A user click to twitter follow us links")
    public void aUserClickToTwitterFollowUsLinks() {

        homePage.OpenTwitter();

    }

    @Then("the current twitter Url like {string}")
    public void theCurrentTwitterUrlLike(String exptwitterurl) {

        Assert.assertEquals(HomePage.x,exptwitterurl,"failed");
        softAssert.assertAll();
    }

    @When("A user click to news follow us links")
    public void aUserClickToNewsFollowUsLinks() {

        homePage.OpenNews();

    }

    @Then("the current news Url like {string}")
    public void theCurrentNewsUrlLike(String expnewsurl) {
        Assert.assertEquals(HomePage.z,expnewsurl,"Failed");
        softAssert.assertAll();
    }

    @When("A user click to youtube follow us links")
    public void aUserClickToYoutubeFollowUsLinks() {

        homePage.OpenYouTube();

    }

    @Then("the current youtube Url like {string}")
    public void theCurrentYoutubeUrlLike(String expyoutubeurl) {
        Assert.assertEquals(HomePage.n,expyoutubeurl);
        softAssert.assertAll();
    }
}
