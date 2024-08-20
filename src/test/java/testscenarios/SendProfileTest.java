package testscenarios;

import org.junit.Test;
import pagelocators.HomePage;
import pagelocators.LoginPage;
import pagelocators.ProfilePage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

public class SendProfileTest extends BeforeAfterSteps {
    @Test
    public void byLoginAccountButton() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.loginAccountButtonClick();

        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        objHomePage2.personalAccountButtonClick();

        ProfilePage objProfilePage = new ProfilePage(driver);
        String actualButtonText = objProfilePage.exitButtonGetText();
        assertEquals("Выход", actualButtonText);
    }
}
