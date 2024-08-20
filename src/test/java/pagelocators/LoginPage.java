package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    //Заголовок страницы "Соберите бургер"
    private By loginTitle = By.xpath(".//main/div/h2[text()='Вход']");
    //Поле "Email"
    private By emailField = By.xpath(".//input[@name='name']");
    //Поле "Пароль"
    private By passwordField = By.xpath(".//input[@name='Пароль']");
    //Кнопка "Войти"
    private By loginButton = By.xpath(".//button[text()='Войти']");
    //Ссылка "Зарегистрироваться"
    private By registerLink = By.xpath(".//a[@href='/register']");
    //Ссылка "Восстановить пароль"
    private By forgotPasswordLink = By.xpath(".//a[@href='/forgot-password']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Проверка доступности и получение заголовка страницы
    public String loginTitleGetText(){
        //new WebDriverWait(driver, Duration.ofSeconds(3))
        //        .until(ExpectedConditions.visibilityOf(driver.findElement(loginTitle)));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(loginTitle).getText();
    }

    //Проверка доступности и заполнение поля "Email"
    public void emailFieldSendText(String email){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(emailField)));
        driver.findElement(emailField).sendKeys(email);
    }

    //Проверка доступности и заполнение поля "Пароль"
    public void passwordFieldSendText(String password){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(passwordField)));
        driver.findElement(passwordField).sendKeys(password);
    }

    //Проверка доступности и клик по кнопке "Войти"
    public void loginButtonClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(loginButton)));
        driver.findElement(loginButton).click();
    }

    //Шаги авторизации
    public void login(String email, String password){
        emailFieldSendText(email);
        passwordFieldSendText(password);
        loginButtonClick();
    }

    //Проверка доступности и клик по ссылке "Зарегистрироваться"
    public void registerLinkClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(registerLink)));
        driver.findElement(registerLink).click();
    }

    //Проверка доступности и клик по ссылке "Восстановить пароль"
    public void forgotPasswordLinkClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(forgotPasswordLink)));
        driver.findElement(forgotPasswordLink).click();
    }
}
