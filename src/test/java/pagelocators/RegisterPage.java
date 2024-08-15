package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    private WebDriver driver;

    //Поле "Имя"
    private By nameField = By.xpath(".//label[text()='Имя']/parent::div/input[@name='name']");
    //Поле "Email"
    private By emailField = By.xpath(".//label[text()='Email']/parent::div/input[@name='name']");
    //Поле "Пароль"
    private By passwordField = By.xpath(".//input[@name='Пароль']");
    //Сообщение "Некорректный пароль"
    private By incorrectPasswordText = By.xpath(".//p[contains(@class,'error')]");
    //Кнопка "Зарегистрироваться"
    private By registerButton = By.xpath(".//button[text()='Зарегистрироваться']");
    //Ссылка "Войти"
    private By loginLink = By.xpath(".//a[@href='/login']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Проверка доступности и заполнение поля "Имя"
    public void nameFieldSendText(String name){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(nameField)));
        driver.findElement(nameField).sendKeys(name);
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
    public void registerButtonClick(){
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(registerButton));
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(registerButton)));
        driver.findElement(registerButton).click();
    }

    //Шаги регистрации
    public void registration(String name, String email, String password){
        nameFieldSendText(name);
        emailFieldSendText(email);
        passwordFieldSendText(password);
        registerButtonClick();
    }

    //Проверка доступности и получение текста сообщения
    public String incorrectPasswordGetText(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(incorrectPasswordText)));
        return driver.findElement(incorrectPasswordText).getText();
    }

    //Проверка доступности и клик по ссылке "Войти"
    public void loginLinkClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(loginLink)));
        driver.findElement(loginLink).click();
    }
}
