package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private String bookmarkPath = ".//span[text()='";
    private String ingredientPath = ".//p[text()='";

    private By assembleBurgerTitle = By.xpath(".//h1[text()='Соберите бургер']");
    private By personalAccountButton = By.xpath(".//a[@href='/account']");
    private By loginAccountButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private By bookmark = By.xpath(bookmarkPath);
    private By ingredient = By.xpath(ingredientPath);

}
