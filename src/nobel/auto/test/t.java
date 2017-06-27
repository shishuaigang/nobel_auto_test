package nobel.auto.test;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.driver.Driver;
import nobel.auto.test.page.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.LoginWithAccount.*;
import static nobel.auto.test.page.LoginWithCard.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.unlock;

/**
 * Created by shishuaigang on 2017/6/23.
 */
public class t {
    public static void main(String args[]) {
        AndroidDriver d = new Driver().driver();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginWithAccount p1 = PageFactory.initElements(d, LoginWithAccount.class);
        LoginWithCard p2 = PageFactory.initElements(d, LoginWithCard.class);
        ProduceProcess p3 = PageFactory.initElements(d, ProduceProcess.class);
        Home p4 = PageFactory.initElements(d, Home.class);
        Unlock p5 = PageFactory.initElements(d, Unlock.class);
        try {
            loginWithAccount.click();
            username.sendKeys("18121225109");
            password.sendKeys("123456");
            loginButton.click();
        }catch (NoSuchElementException e){
            System.out.println("处于已登录状态");
        }
        produceProcess.click();
        pre_processOperator.click();
        try{
            unlock.click();
        }catch (NoSuchElementException e){
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        d.quit();
    }
}
