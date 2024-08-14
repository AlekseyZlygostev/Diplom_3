package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage {
    private WebDriver driver;

    //Ссылка "Войти"
    private By loginLink = By.xpath(".//a[@href='/login']");

    //Проверка доступности и клик по ссылке "Войти"
    public void loginLinkClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(loginLink)));
        driver.findElement(loginLink).click();
    }
}
