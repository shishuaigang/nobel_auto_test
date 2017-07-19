package nobel.auto.test.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shishuaigang on 2017/6/23.
 * 获取driver
 */

public class Driver {
    private AndroidDriver driver;

    public AndroidDriver driver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName","192.168.10.101:5555"); //windows
        capabilities.setCapability("deviceName","192.168.56.101:5555");  //mac
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","6.0");
        capabilities.setCapability("appPackage","com.gongzhidao.nobel");
        capabilities.setCapability("appActivity",".login.SplashActivity");
        capabilities.setCapability("unicodeKeyboard","True");
        capabilities.setCapability("resetKeyboard","True");
        capabilities.setCapability("noReset","True");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
}
