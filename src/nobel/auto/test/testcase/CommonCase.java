package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.Unlock.unlock;

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

    public static void unlock(){
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
    }
}
