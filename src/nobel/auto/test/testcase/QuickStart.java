package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.ProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.*;

/**
 * Created by shishuaigang on 2017/7/4.
 * 快速开始
 * 1,登录
 * 2,工序操作台
 * 3,挤出
 * 4,test001快速开始
 */

public class QuickStart {
    private AndroidDriver driver;

    public QuickStart(AndroidDriver d) {
        this.driver = d;
    }

    public void quickStart() {
        //初始化页面元素
        Home p0 = PageFactory.initElements(driver, Home.class);
        ProduceProcess p1 = PageFactory.initElements(driver, ProduceProcess.class);
        Unlock p2 = PageFactory.initElements(driver, Unlock.class);
        PreProcessOperator p3 = PageFactory.initElements(driver, PreProcessOperator.class);
        //登录
        Login lo = new Login(driver);
        lo.login();

        produceProcess.click();
        pre_processOperator.click();

        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }

        try{
            p3.test001.click();
        }catch (NoSuchElementException e){
            System.out.println("未找到test001测试工单，请检查");
        }

    }

}
