package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class RegisterPageSteps {
        @Given("A user Navigates to registration URL")
        public void AUserNavigatesToRegistrationURL(){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
        @When("A user inserts valid Data")
        public void AUserInsertsValidData(){
            registerPage.chooseGender("female");
            registerPage.personalData("Sondos","Nasser","mahmoudNasser11@gmail.com");
            registerPage.dateOfBirth("1","1","2000");
            registerPage.companyName("Vois");
            registerPage.passwords("27863686","27863686");
    }
        @Then("A registration Msg is appeared")
        public void ARegistrationMsgIsAppeared(){
            Assert.assertEquals(openPage.getRegritionPassMsg(),"Your registration completed");
            softAssert.assertEquals(openPage.getMsgColor(),"#4cb17c","message color isn't green");

            softAssert.assertAll();
    }

}
