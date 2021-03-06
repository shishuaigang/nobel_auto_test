package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.ZhiJian.QCwindowStatus;
import static nobel.auto.test.page.ZhiJian.preQCscan;

/**
 * Created by shishuaigang on 2017/7/6.
 * 送检case
 */

public class ToCheck extends CommonCase {

    public ToCheck(AndroidDriver d) {
        super(d);
    }

    public void SongJian() {
        zhijian.click();
        preQCscan.click();
        CommonCase.unlock();
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'400kg')]")).click();
            ok_btn.click();
        } catch (NoSuchElementException e) {
            System.out.println("挤出送检");
        }
        ok_btn.click();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        QCwindowStatus.click();
    }
}
