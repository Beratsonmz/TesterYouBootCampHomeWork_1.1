package Steps;

import Factory.DriverFactory;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {
    private final HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("User on homepage")
    public void userOnHomepage() {
        homePage.validateLogin();
    }

    @And("User search for {string}")
    public void userSearchFor(String key) {
        homePage.search(key);

    }
}
