package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class HomePage {
    private WebDriver driver;

    private String bookmarkPath = ".//span[text()='";
    private String ingredientPath = ".//img[@src='";

    //Заголовок страницы "Соберите бургер"
    private By assembleBurgerTitle = By.xpath(".//h1[text()='Соберите бургер']");
    //Кнопка "Личный Кабинет"
    private By personalAccountButton = By.xpath(".//a[@href='/account']");
    //Кнопка "Войти в аккаунт"
    private By loginAccountButton = By.xpath(".//button[text()='Войти в аккаунт']");
    //Закладки разделов
    private By bookmark = By.xpath(bookmarkPath);
    //Ингредиенты
    private By ingredient = By.xpath(ingredientPath);

    //Проверка доступности и получение заголовка страницы
    public String assembleBurgerTitleGetText(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(assembleBurgerTitle)));
        return driver.findElement(assembleBurgerTitle).getText();
    }

    //Проверка доступности и клик по кнопке "Личный Кабинет"
    public void personalAccountButtonButtonClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(personalAccountButton)));
        driver.findElement(personalAccountButton).click();
    }

    //Проверка доступности и клик по кнопке "Войти в аккаунт"
    public void loginAccountButtonClick(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(loginAccountButton)));
        driver.findElement(loginAccountButton).click();
    }

    //Уточнение локатора закладки раздела, проверка доступности и клик
    public void bookmarkClick(String bookmarkName){
        bookmarkPath = bookmarkPath + bookmarkName + "']";
        bookmark = By.xpath(bookmarkPath);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(bookmark)));
        driver.findElement(bookmark).click();
    }

    //Проверка видимости и получение текста ингредиента
    public String ingredientGetText(String imagePath){
        ingredientPath = ingredientPath + imagePath + "']";
        ingredient = By.xpath(ingredientPath);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(ingredient)));
        return driver.findElement(ingredient).getAttribute("alt");
    }

    //Шаги проверки перехода к разделам
    public String checkSectionChange(String bookmarkName, String imagePath){
        bookmarkClick(bookmarkName);
        return ingredientGetText(imagePath);
    }
}
