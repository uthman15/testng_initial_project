package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsSignInPage {

    public CarsSignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "header[class='sds-page-section__header']")
    public WebElement header1;

    @FindBy(css = "p[class='sds-page-section__title--sub signup-block']")
    public WebElement paragraphUnderHeader;

    @FindBy(css = "input[id='email']")
    public WebElement emailInputBox;

    @FindBy(css = ".sds-label")
    public WebElement emailLabel;

    @FindBy(css = "input[id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement passwordLabel;

    @FindBy(className = "sds-helper-text")
    public WebElement warningUnderPasswordInputBox;

    @FindBy(css = "a[href='/forgot_password/?email=']")
    public WebElement forgotPasswordLink;

    @FindBy(css = "div[class='sds-disclaimer ']")
    public WebElement privacyStatement;

    @FindBy(css = "button[class='sds-button']")
    public WebElement signInButton;

    @FindBy(tagName = "h3")
    public WebElement connectHeader;

    @FindBy(css = "a[href='/signin/fb_go/']")
    public WebElement facebookButton;

    @FindBy(css = "a[href='/signin/google_go/']")
    public WebElement googleButton;

    @FindBy(css = "a[href='/signin/apple_go/']")
    public WebElement appleButton;

    @FindBy(className = "sds-notification__title")
    public WebElement errorMessage;

    @FindBy(className = "sds-notification__desc")
    public WebElement errorMessageText;

}