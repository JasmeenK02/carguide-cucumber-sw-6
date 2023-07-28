package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement carDealershipText;

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> nameOfDealer;


    public String verifyNavigateToCarDealersPage(){
        log.info("Verifying navigate to Car dealers page" + carDealershipText.toString());
        return getTextFromElement(carDealershipText);


    }
    public void verifyDealersNameIsDisplayed(boolean list) {
        log.info("Verifying dealers name is displayed on page: " + nameOfDealer.toString());
        for (WebElement dealersName : nameOfDealer) {
            if (list = dealersName.isDisplayed()) {
                break;
            } else {
                System.out.println("Dealers name not in list");
            }

        }
    }
}
