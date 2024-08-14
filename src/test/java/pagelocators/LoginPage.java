package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By enterTitle = By.xpath(".//main/div/h2[text()='Вход']");
    private By emailField = By.xpath(".//input[@name='name']");
    private By passwordField = By.xpath(".//input[@name='Пароль']");
    private By loginButton = By.xpath(".//button[text()='Войти']");
    private By registerLink = By.xpath(".//a[@href='/register']");
    private By forgotPasswordLink = By.xpath(".//a[@href='/forgot-password']");
}
