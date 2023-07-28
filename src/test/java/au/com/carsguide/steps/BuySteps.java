package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }
    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHooverOnBuySell();
    }


    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarPage().verifyNavigateToNewAndUsedSearchCarPage(),
                "New & Used Car Search - carsguide","Failed to navigate to correct page ");

    }
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarPage().selectCarMakeFromDropdown(make);
    }
    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarPage().selectCarModelFromDropdown(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarPage().selectLocationFromDropdown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new NewAndUsedCarPage().selectPriceFromDropdown(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\"$")
    public void iShouldSeeTheMake(String result)  {
        Assert.assertEquals(new ResultPage().verifyResult(), result);

    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        new UsedCarSearchPage().verifyNavigateToUsedCarPage();
    }


}
