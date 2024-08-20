package testscenarios;

import org.junit.Test;
import pagelocators.HomePage;
import pagelocators.LoginPage;
import pagelocators.ProfilePage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

public class LogoutTest extends BeforeAfterSteps {
    @Test
    public void byExitButton() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.loginAccountButtonClick();

        LoginPage objLoginPage1 = new LoginPage(driver);
        objLoginPage1.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        objHomePage2.personalAccountButtonClick();

        ProfilePage objProfilePage = new ProfilePage(driver);
        objProfilePage.exitButtonClick();

        LoginPage objLoginPage2 = new LoginPage(driver);
        String actualTitleText = objLoginPage2.loginTitleGetText();
        assertEquals("Вход", actualTitleText);
    }
}
