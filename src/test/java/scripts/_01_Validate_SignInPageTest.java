package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Validate_SignInPageTest extends Base {

    @Test(priority = 1, description = "TC1: Validate Cars.com Sign in page form")
    public void validateCarsSignInPage() {
        driver.get("https://www.cars.com/");

        carsHomePage.SignInButton.click();
        Assert.assertTrue(carsSignInPage.signInButton.isDisplayed() && carsSignInPage.signInButton.getText().equals("Sign in"));
        Assert.assertTrue(carsSignInPage.paragraphUnderHeader.isDisplayed() && carsSignInPage.paragraphUnderHeader.getText().equals("New to Cars.com? Sign up. Are you a dealer?"));
        Assert.assertTrue(carsSignInPage.emailInputBox.isDisplayed() && carsSignInPage.emailInputBox.isEnabled());
        Assert.assertEquals(carsSignInPage.emailLabel.getText(), "Email");
        Assert.assertTrue(carsSignInPage.passwordInputBox.isDisplayed() && carsSignInPage.passwordInputBox.isEnabled());
        Assert.assertEquals(carsSignInPage.passwordLabel.getText(), "Password");
        Assert.assertEquals(carsSignInPage.warningUnderPasswordInputBox.getText(), "Minimum of eight characters");
        Assert.assertTrue(carsSignInPage.forgotPasswordLink.isDisplayed() && carsSignInPage.forgotPasswordLink.getText().equals("Forgot password?"));
        Assert.assertTrue(carsSignInPage.privacyStatement.isDisplayed() && carsSignInPage.privacyStatement.getText().equals("By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service."));
        Assert.assertTrue(carsSignInPage.signInButton.isDisplayed() && carsSignInPage.signInButton.isEnabled() &&
                carsSignInPage.signInButton.getText().equals("Sign in"));

    }

    @Test(priority = 2, description = "TC2: Validate Cars.com Sign in page social media section")
    public void validateCarsSignInPageSocialMediaSection() {
        driver.get("https://www.cars.com/");
        carsHomePage.SignInButton.click();
        Assert.assertTrue(carsSignInPage.connectHeader.isDisplayed() && carsSignInPage.connectHeader.getText().equals("Connect with social"));
        Assert.assertTrue(carsSignInPage.facebookButton.isDisplayed() && carsSignInPage.facebookButton.isEnabled() &&
                carsSignInPage.facebookButton.getText().equals("Sign in with Facebook"));
        Assert.assertTrue(carsSignInPage.googleButton.isDisplayed() && carsSignInPage.googleButton.isEnabled() &&
                carsSignInPage.googleButton.getText().equals("Sign in with Google"));
        Assert.assertTrue(carsSignInPage.appleButton.isDisplayed() && carsSignInPage.appleButton.isEnabled() &&
                carsSignInPage.appleButton.getText().equals("Sign in with Apple"));
    }

    @Test(priority = 3, description = "TC 3: Validate user cannot sign in to Cars.com with invalid credentials")
    public void validateUserCantSignIn() {
        driver.get("https://www.cars.com/");
        carsHomePage.SignInButton.click();
        carsSignInPage.emailInputBox.sendKeys("johndoe@gmail.com");
        carsSignInPage.passwordInputBox.sendKeys("abcd1234");
        carsSignInPage.signInButton.click();
        Assert.assertTrue(carsSignInPage.errorMessage.isDisplayed() && carsSignInPage.errorMessage.getText().equals("We were unable to sign you in."));
        Assert.assertTrue(carsSignInPage.errorMessageText.isDisplayed() && carsSignInPage.errorMessageText.getText().equals("Your email or password was not recognized. Try again soon."));
    }


}