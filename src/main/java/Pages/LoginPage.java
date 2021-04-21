package Pages;

import Utility.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageUtility {
    private final By emailField = By.id("txtUserName");
    private final By passwordField = By.id("txtPassword");
    private final By loginBtn = By.id("btnLogin");

    public LoginPage(WebDriver driver) {

        super(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public HomePage login(String mail, String password) {
        setEmail(mail);
        setPassword(password);
        clickLoginBtn();
        return new HomePage(getWebdriver());
    }
    public void setEmail(String email) {

        sendKeys(emailField, email);
    }

    public void setPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }
}
