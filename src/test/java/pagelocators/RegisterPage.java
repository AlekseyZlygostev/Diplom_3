package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By registerTitle = By.xpath(".//main/div/h2[text()='Регистрация']");
    private By nameField = By.xpath(".//label[text()='Имя']/parent::div/input[@name='name']");
    private By emailField = By.xpath(".//label[text()='Email']/parent::div/input[@name='name']");
    private By passwordField = By.xpath(".//input[@name='Пароль']");
    private By incorrectPasswordText = By.xpath(".//p[contains(@class,'error')]");
    private By registerButton = By.xpath(".//button[text()='Зарегистрироваться']");
    private By loginLink = By.xpath(".//a[@href='/login']");
}
