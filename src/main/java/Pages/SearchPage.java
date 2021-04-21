package Pages;

import Utility.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class SearchPage extends PageUtility {
    private final By searchProduct= By.className("product-detail");
    private final By addToCartButtons = By.className("add-to-basket");
    private final By cartButton = By.id("shoppingCart");
    private final By addedPopup = By.className("hb-toast-notifier-container");

    public SearchPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void addToCart(int index) {

        action.moveToElement(findElements(searchProduct).get(index));
        findElements(addToCartButtons).get(index).click();
        waitUntilElementVisible(addedPopup);
        Assert.assertTrue(isElementDisplayed(addedPopup));

    }

    public void goToCart() {
        click(cartButton);
    }
}
