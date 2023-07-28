package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(className = "makeFilter")
    WebElement verifyResult;


    public String verifyResult(){
        log.info("Verifying the 'make' result" + verifyResult.toString());
        return getTextFromElement(verifyResult);

    }
}

