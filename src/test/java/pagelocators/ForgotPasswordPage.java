package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    private By forgotPasswordTitle = By.xpath(".//main/div/h2[text()='Восстановление пароля']");
    private By loginLink = By.xpath(".//a[@href='/login']");
}
