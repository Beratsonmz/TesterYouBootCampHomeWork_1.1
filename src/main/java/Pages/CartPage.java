package Pages;

import Utility.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class CartPage extends PageUtility {
    private final By products = By.className("product_name_3Lh3t");

    public CartPage(WebDriver driver){
        super(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public boolean checkProduct(String expected, int index){
        String actual = findElements(products).get(index).getText();
        System.out.println(actual);
        return expected.equals(actual);
    }
}
