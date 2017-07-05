package nobel.auto.test;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.driver.Driver;
import nobel.auto.test.page.*;
import nobel.auto.test.testcase.Login;
import nobel.auto.test.testcase.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by shishuaigang on 2017/7/4.
 * testng测试
 */

public class testQuickStart {

    private AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        driver = new Driver().driver();
        //登录
        Login lo = new Login(driver);
        lo.login();
        //初始化页面元素
        Home p10 = PageFactory.initElements(driver, Home.class);
        ProduceProcess p11 = PageFactory.initElements(driver, ProduceProcess.class);
        Unlock p12 = PageFactory.initElements(driver, Unlock.class);
        PreProcessOperator p13 = PageFactory.initElements(driver, PreProcessOperator.class);
        OperatorInfo p14 = PageFactory.initElements(driver, OperatorInfo.class);
        CompleteRegister p15 = PageFactory.initElements(driver, CompleteRegister.class);
        ProcessOperator p16 = PageFactory.initElements(driver, ProcessOperator.class);
    }

    @Test(groups = {"qucikstart"})
    public void TestNgQuickStart_1() {
        new QuickStart_1(driver).quickStart();
        Assert.assertEquals("登记结果",driver.findElement(By.id("com.gongzhidao.nobel:id/dialog_title")).getText().trim());
    }

    @Test(dependsOnMethods = "TestNgQuickStart_1",groups = {"qucikstart"})
    public void TestNgQuickStart_2() {
        new QuickStart_2(driver).quickStart();
        Assert.assertEquals("登记结果",driver.findElement(By.id("com.gongzhidao.nobel:id/dialog_title")).getText().trim());
    }

    @Test(dependsOnMethods = "TestNgQuickStart_2",groups = {"qucikstart"})
    public void TestNgQuickStart_3() {
        new QuickStart_3(driver).quickStart();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }
}
