package Steps;

import Factory.DriverFactory;
import Pages.CartPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPageSteps {
    private final CartPage cartPage = new CartPage(DriverFactory.getDriver());

    @Then("Shopping cart should contain {string}")
    public void shoppingCartShouldContainAddedProduct(String expected) {
        Assert.assertTrue(cartPage.checkProduct(expected,0));
    }
}
