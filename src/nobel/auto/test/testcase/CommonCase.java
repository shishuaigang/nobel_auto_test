package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shishuaigang on 2017/7/6.
 */

public class CommonCase {

    protected AndroidDriver driver;

    public CommonCase(AndroidDriver d) {
        this.driver = d;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
