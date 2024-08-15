package setupclasses;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.restassured.RestAssured.given;

public class BeforeAfterSteps {
    protected WebDriver driver;

    protected UserSerials user;
    protected LinkSerials link = new LinkSerials();
    protected String email;
    protected String password;
    protected String name;
    protected String token = "";

    @Before
    public void openLinkInBrowser() {
        Faker faker = new Faker();
        email = faker.internet().emailAddress();
        password = faker.internet().password();
        name = faker.name().firstName();
        RestAssured.baseURI = link.getHomePage();

        //Выбор драйвера браузера и переход по ссылке
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get(link.getHomePage());
    }

    @After
    public void teardown() {
        driver.quit();

        try {
            token = getToken(email, password).replaceFirst("Bearer ", "");
            //System.out.println(token);
            given()
                    .auth().oauth2(token)
                    .delete(link.getChangeUser());
        } catch (Exception exception) {
            token = "";
        }
    }

    //@Step("Send POST registration request")
    public void sendRegistrationRequest(String email, String password, String name) {
        user = new UserSerials(email, password, name);
        given()
                .header("Content-type", "application/json")
                .body(user)
                .when()
                .post(link.getCreateUser());
    }

    //@Step("Get token")
    public String getToken(String email, String password){
        user = new UserSerials(email, password);
        return given()
                .header("Content-type", "application/json")
                .body(user)
                .when()
                .post(link.getLoginUser())
                .then().extract().body().path("accessToken");
    }
}
