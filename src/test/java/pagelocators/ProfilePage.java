package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProfilePage {
    private WebDriver driver;

    //Кнопка "Выход"
    private By exitButton = By.xpath(".//button[text()='Выход']");
    //Лого "Stellar Burger"
    private By stellarBurgerLogo = By.xpath(".//div/a[@href='/']");
    //Кнопка "Конструктор"
    private By constructorButton = By.xpath(".//li/a[@href='/']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    //Проверка доступности и получение текста кнопки "Выход"
    public String exitButtonGetText(){
        //new WebDriverWait(driver, Duration.ofSeconds(3))
        //        .until(ExpectedConditions.visibilityOf(driver.findElement(exitButton)));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(exitButton).getText();
    }

    //Проверка доступности и клик по кнопке "Выход"
    public void exitButtonClick(){
        //new WebDriverWait(driver, Duration.ofSeconds(3))
        //        .until(ExpectedConditions.visibilityOf(driver.findElement(exitButton)));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(exitButton).click();
    }

    //Проверка доступности и клик по лого "Stellar Burger""
    public void stellarBurgerLogoClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(stellarBurgerLogo)));
        driver.findElement(stellarBurgerLogo).click();
    }

    //Проверка доступности и клик по кнопке "Конструктор"
    public void constructorButtonClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(constructorButton)));
        driver.findElement(constructorButton).click();
    }
}
