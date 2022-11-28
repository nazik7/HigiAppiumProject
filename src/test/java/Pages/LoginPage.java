package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

   // AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver<AndroidElement> driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.higi.main:id/higiLogo")
    public AndroidElement higiLogo;

    @AndroidFindBy(id = "com.higi.main:id/username")
    public AndroidElement loginBar;

    @AndroidFindBy(uiAutomator = "text(\"NEXT\")")
    public AndroidElement nextButton;

    @AndroidFindBy(id = "com.higi.main:id/password")
    public AndroidElement passwordBar;

    @AndroidFindBy(uiAutomator = "text(\"LOG IN\")")
    public AndroidElement loginButton;



}
