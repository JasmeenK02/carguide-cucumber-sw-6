package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealersPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {
    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealersPage().verifyNavigateToCarDealersPage(),
                "Find a Car Dealership Near You", "Failed to navigate to correct page. ");
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(boolean dealers)  {
        new CarDealersPage().verifyDealersNameIsDisplayed(dealers);

    }

}
