package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newAndUsedCarPage;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement carModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement carLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyCarTab;






    public String verifyNavigateToNewAndUsedSearchCarPage(){

        log.info("Verifying New and Used Car Search page" + newAndUsedCarPage.toString());
        return getTextFromElement(newAndUsedCarPage);
    }

    public void selectCarMakeFromDropdown(String make){
        log.info("Selecting any make from drop down menu: " + carMake.toString());
        selectByValueFromDropDown(carMake,make);
    }
    public void selectCarModelFromDropdown(String model){
        log.info("Selecting any model from drop down menu: " + carModel.toString());
        selectByValueFromDropDown(carModel,model);
    }
    public void selectLocationFromDropdown(String location) {
        log.info("Selecting any location from drop down menu: " + carLocation.toString());
        selectByValueFromDropDown(carLocation,location);
    }
    public void selectPriceFromDropdown(String price){
        log.info("Selecting max price from drop down menu: " + carPrice.toString());
        selectByValueFromDropDown(carPrice,price);
    }

    public void clickOnFindMyNextCar(){

        log.info("Clicking on find my next car tab: " + findMyCarTab.toString());
        clickOnElement(findMyCarTab);
    }
}
