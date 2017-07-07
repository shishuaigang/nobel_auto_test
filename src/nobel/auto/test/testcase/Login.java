package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.driver.Driver;
import nobel.auto.test.page.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.LoginWithAccount.*;
import static nobel.auto.test.page.LoginWithCard.*;

/**
 * Created by shishuaigang on 2017/7/4.
 * 通用函数login
 */

public class Login {

    private AndroidDriver driver;

    public Login(AndroidDriver d) {
        this.driver = d;
    }

    public void login() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginWithAccount p1 = PageFactory.initElements(driver, LoginWithAccount.class);
        LoginWithCard p2 = PageFactory.initElements(driver, LoginWithCard.class);
        try {
            loginWithAccount.click();
            username.sendKeys("18121225109");
            password.sendKeys("123456");
            loginButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("已登录");
        }
    }
}
