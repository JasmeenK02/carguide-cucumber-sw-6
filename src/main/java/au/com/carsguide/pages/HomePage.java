package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buySell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
@CacheLookup
    @FindBy(linkText = "Used")
    WebElement usedLink;

@CacheLookup
@FindBy(linkText = "Find a Dealer")
WebElement findADealer;



    public void mouseHooverOnBuySell(){
        mouseHoverToElement(buySell);
        log.info("Mouse Hoovering on Buy+Sell" + buySell.toString());
    }

    public void clickOnSearchCarsLink(){
        clickOnElement(searchCars);
        log.info("Clicking on Search Cars" + searchCars.toString());
    }
    public void clickOnUsedLink(){
        clickOnElement(usedLink);
        log.info("Clicking on Used Cars link" + usedLink.toString());
    }
    public void clickOnFindADealer(){
        clickOnElement(findADealer);
        log.info("Clicking on Find a Dealer link" + findADealer.toString());
    }
}
