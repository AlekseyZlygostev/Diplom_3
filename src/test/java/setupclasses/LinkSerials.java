package setupclasses;

public class LinkSerials {
    private String driverPath;
    private String browserPath;
    private String homePage;
    private String createUser;
    private String loginUser;
    private String changeUser;

    public LinkSerials() {
        this.driverPath = "C:/Users/slltllnll/WebDriver/bin/yandexdriver.exe";
        this.browserPath = "C:/Users/slltllnll/AppData/Local/Yandex/YandexBrowser/Application/browser.exe";
        this.homePage = "https://stellarburgers.nomoreparties.site/";
        this.createUser = "/api/auth/register";
        this.loginUser = "/api/auth/login";
        this.changeUser = "/api/auth/user";
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getChangeUser() {
        return changeUser;
    }

    public void setChangeUser(String changeUser) {
        this.changeUser = changeUser;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getDriverPath() {
        return driverPath;
    }

    public void setDriverPath(String driverPath) {
        this.driverPath = driverPath;
    }

    public String getBrowserPath() {
        return browserPath;
    }

    public void setBrowserPath(String browserPath) {
        this.browserPath = browserPath;
    }
}
