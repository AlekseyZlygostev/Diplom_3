package testscenarios;

import org.junit.Test;
import pagelocators.HomePage;
import pagelocators.LoginPage;
import pagelocators.RegisterPage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

public class RegistrationTest extends BeforeAfterSteps {

    @Test
    public void successfulRegistration() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.loginAccountButtonClick();

        LoginPage objLoginPage1 = new LoginPage(driver);
        objLoginPage1.registerLinkClick();

        RegisterPage objRegisterPage = new RegisterPage(driver);
        objRegisterPage.registration(name, email, password);

        LoginPage objLoginPage2 = new LoginPage(driver);
        String actualTitleText = objLoginPage2.loginTitleGetText();
        assertEquals("Вход", actualTitleText);
    }

    @Test
    public void incorrectPasswordRegistration() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.loginAccountButtonClick();

        LoginPage objLoginPage1 = new LoginPage(driver);
        objLoginPage1.registerLinkClick();

        RegisterPage objRegisterPage = new RegisterPage(driver);
        objRegisterPage.registration(name, email, "12345");
        String actualErrorText = objRegisterPage.incorrectPasswordGetText();
        assertEquals("Некорректный пароль", actualErrorText);
    }
}
