package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.AndroidDriverUtil;
import java.net.MalformedURLException;


public class LoginSteps {

    LoginPage loginPage;
    public AndroidDriver<AndroidElement> driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = AndroidDriverUtil.setupDesiredCapabilities("higi");
        driver = AndroidDriverUtil.getAndroidDriver(desiredCapabilities);
    }


    @Given("user launches higi app")
    public void user_launches_higi_app() {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.higiLogo.isDisplayed());
    }

    @Then("user login with {string} and {string}")
    public void user_login_with_and(String username, String password) {
        loginPage.loginBar.sendKeys(username);
        loginPage.nextButton.click();
        loginPage.passwordBar.sendKeys(password);
        loginPage.loginButton.click();
    }

    @And("user is on the higi home page")
    public void user_is_on_the_higi_home_page() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(5000);
        Assert.assertTrue(homePage.homeIcon.getAttribute("selected").equals("true"));
    }

}
