package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utility.PageUtility;

import java.time.Duration;


public class HomePage extends PageUtility {

    private final By accountBtn = By.xpath("//span[contains(text(),'Hesabım')]");
    private final  By searchBar = By.className("desktopOldAutosuggestTheme-input");
    private final By searchBtn = By.className("SearchBoxOld-buttonContainer");

    public HomePage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean validateLogin() {
        return isElementDisplayed(accountBtn);
    }
    public void search(String key){
        sendKeys(searchBar,key);
        click(searchBtn);
    }
}
