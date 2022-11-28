package Pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidDriverUtil;

public class HomePage {

    //AndroidDriver<AndroidElement> driver;

    public HomePage(AndroidDriver<AndroidElement> driver){
        //this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.higi.main:id/icon")
    public AndroidElement homeIcon;


}
