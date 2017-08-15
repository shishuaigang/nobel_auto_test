package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.LoginWithAccount;
import nobel.auto.test.page.LoginWithCard;
import nobel.auto.test.page.ServerInfo;
import nobel.auto.test.page.SetUp;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.Home.setup;
import static nobel.auto.test.page.LoginWithAccount.*;
import static nobel.auto.test.page.LoginWithCard.loginWithAccount;
import static nobel.auto.test.page.ServerInfo.QianChaoKun;
import static nobel.auto.test.page.SetUp.quit;

/**
 * Modified by shishuaigang on 2017/08/15.
 * 通用函数login
 * 添加登录前选择服务器功能.
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
        ServerInfo p3 = PageFactory.initElements(driver, ServerInfo.class);
        SetUp p4 = PageFactory.initElements(driver, SetUp.class);
        try {
            loginWithAccount.click();
            setting.click();
            QianChaoKun.click();
            username.sendKeys("18121225109");
            password.sendKeys("123456");
            loginButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("-------登出重新选择服务器-----------");
            setup.click();
            quit.click();
            loginWithAccount.click();
            setting.click();
            QianChaoKun.click();
            username.sendKeys("18121225109");
            password.sendKeys("123456");
            loginButton.click();
        }
    }
}
