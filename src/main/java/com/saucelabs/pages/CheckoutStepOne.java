package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.saucelabs.base.BasePage.driver;

public class CheckoutStepOne {

    @FindBy(id="first-name")
    private static WebElement firstName;

    @FindBy(id="last-name")
    private static WebElement lastName;

    @FindBy(id="postal-code")
    private static WebElement postalCode;


    @FindBy(xpath="//input[@value='CONTINUE']")
    private static WebElement continueBtn;

    public CheckoutStepOne(){

        PageFactory.initElements(driver,this);

    }
    public static void sendOrderInformation(String name, String lName, String zipCode) {
        HelperMethods.sendText(firstName, name);
       HelperMethods.sendText(lastName, lName);
       HelperMethods.sendText(postalCode, zipCode);
    }
    public static void clickContinue() {
    HelperMethods.doClick(continueBtn);
    }

}
