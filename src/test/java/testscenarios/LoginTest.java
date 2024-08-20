package testscenarios;

import org.junit.Test;
import pagelocators.ForgotPasswordPage;
import pagelocators.HomePage;
import pagelocators.LoginPage;
import pagelocators.RegisterPage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BeforeAfterSteps {

    @Test
    public void byLoginAccountButton() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.loginAccountButtonClick();

        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        String actualTitleText = objHomePage2.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }

    @Test
    public void byPersonalAccountButton() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.personalAccountButtonClick();

        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        String actualTitleText = objHomePage2.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }

    @Test
    public void byLoginLinkInRegister() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.personalAccountButtonClick();

        LoginPage objLoginPage1 = new LoginPage(driver);
        objLoginPage1.registerLinkClick();

        RegisterPage objRegisterPage = new RegisterPage(driver);
        objRegisterPage.loginLinkClick();

        LoginPage objLoginPage2 = new LoginPage(driver);
        objLoginPage2.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        String actualTitleText = objHomePage2.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }

    @Test
    public void byLoginLinkInForgotPassword() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.personalAccountButtonClick();

        LoginPage objLoginPage1 = new LoginPage(driver);
        objLoginPage1.registerLinkClick();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.loginLinkClick();

        LoginPage objLoginPage2 = new LoginPage(driver);
        objLoginPage2.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        String actualTitleText = objHomePage2.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }
}
