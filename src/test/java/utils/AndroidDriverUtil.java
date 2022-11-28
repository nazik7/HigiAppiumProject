package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverUtil {

    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver getAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        //setting the URL to connnect to
        URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

        //instantiating driver
        driver = new AndroidDriver<AndroidElement>( appiumServerUrl ,caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//synchronize the automation tool with the web page
        return driver;
    }

    public static DesiredCapabilities setupDesiredCapabilities(String appName){
        //src/test/resources/ecommerceApp.apk
        File apkFile = new File("src/test/resources/"+appName+".apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //device name to connect
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2_API_28");
        //platform to use
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        //automation name
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        //Android application to test
        desiredCapabilities.setCapability(MobileCapabilityType.APP,apkFile.getAbsolutePath());
        return desiredCapabilities;

    }

    public static AndroidDriver getDriver(){
        return driver;
    }



}
