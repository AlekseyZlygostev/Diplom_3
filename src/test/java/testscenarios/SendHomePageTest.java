package testscenarios;

import org.junit.Test;
import pagelocators.HomePage;
import pagelocators.LoginPage;
import pagelocators.ProfilePage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

public class SendHomePageTest extends BeforeAfterSteps {
    @Test
    public void byConstructorButton() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.loginAccountButtonClick();

        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        objHomePage2.personalAccountButtonClick();

        ProfilePage objProfilePage = new ProfilePage(driver);
        objProfilePage.constructorButtonClick();

        HomePage objHomePage3 = new HomePage(driver);
        String actualTitleText = objHomePage3.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }

    @Test
    public void byStellarBurgerLogo() {
        sendRegistrationRequest(email, password, name);

        HomePage objHomePage1 = new HomePage(driver);
        objHomePage1.loginAccountButtonClick();

        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);

        HomePage objHomePage2 = new HomePage(driver);
        objHomePage2.personalAccountButtonClick();

        ProfilePage objProfilePage = new ProfilePage(driver);
        objProfilePage.stellarBurgerLogoClick();

        HomePage objHomePage3 = new HomePage(driver);
        String actualTitleText = objHomePage3.assembleBurgerTitleGetText();
        assertEquals("Соберите бургер", actualTitleText);
    }
}
