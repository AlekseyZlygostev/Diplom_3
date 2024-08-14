package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;

    private By exitButton = By.xpath(".//button[text()='Выход']");
    private By stellarBurgerLogo = By.xpath(".//div/a[@href='/']");
    private By constructorButton = By.xpath(".//li/a[@href='/']");
}
