package nobel.auto.test;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.driver.Driver;
import nobel.auto.test.page.*;
import nobel.auto.test.testcase.Login;
import nobel.auto.test.testcase.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    public void beforeMethod() {
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
        CommentDetails p17 = PageFactory.initElements(driver, CommentDetails.class);
        ZhiJian p18 = PageFactory.initElements(driver, ZhiJian.class);
        AbnormityInfo p19 = PageFactory.initElements(driver, AbnormityInfo.class);
        DetailInfo p110 = PageFactory.initElements(driver, DetailInfo.class);
        UnBindInfo p53 = PageFactory.initElements(driver, UnBindInfo.class);
        WareHouseRegisterInfo p345 = PageFactory.initElements(driver, WareHouseRegisterInfo.class);
        WareHouse p5678 = PageFactory.initElements(driver, WareHouse.class);
    }

    @Test(groups = {"test001"})
    public void TestNgUnBindEquip() {
        new UnBind(driver).unBindEquip();
        boolean zhi;
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'EXT-201')]")).isDisplayed();
            zhi = true;
        } catch (NoSuchElementException e) {
            zhi = false;
        }
        Assert.assertEquals(false, zhi);
        System.out.println("解绑设备完成");
        System.out.println("下一测试项目：绑定设备");
    }

    @Test(dependsOnMethods = "TestNgUnBindEquip", groups = {"test001"})
    public void TestNgBindEquip() {
        new Bind(driver).bindEquip();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'EXT-201')]")).isDisplayed())
        ;
        System.out.println("绑定设备完成");
        System.out.println("下一测试项目：快速开始--备料--完成登记");
    }

    @Test(dependsOnMethods = "TestNgBindEquip", groups = {"test001"})
    public void TestNgQuickStart_Beiliao() {
        new QuickStart_BeiLiao(driver).quickStart();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'登记结果')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'已送往：')]")).isDisplayed());
        System.out.println("快速开始--备料--完成登记");
        System.out.println("下一测试项目：添加备注");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Beiliao", groups = {"test001"})
    public void TestNgComment() {
        new Comment(driver).comments();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'等操作员')]")).isDisplayed());
        System.out.println("添加备注完成");
        System.out.println("下一测试项目：快速开始--预混--完成登记");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Beiliao", groups = {"test001"})
    public void TestNgQuickStart_Yuhun() {
        new QuickStart_YuHun(driver).quickStart();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'登记结果')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'已送往：')]")).isDisplayed());
        System.out.println("快速开始--预混完成");
        System.out.println("下一测试项目：更改排班数量");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Yuhun", groups = {"test001"})
    public void TestNgModify_quantity() {
        new ModifyQuantity(driver).modifyQuantity();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'400 kg')]")).isDisplayed());
        System.out.println("更改排班数量 完成");
        System.out.println("下一测试项目：添加特殊工序");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Yuhun", groups = {"test001"})
    public void TestNgAddSpecialProcess() {
        new AddSpecialProcess(driver).addSpecialProcess();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'大清洗')]")).isDisplayed());
        System.out.println("添加特殊工序 完成");
        System.out.println("下一测试项目：快速开始--挤出");
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'大清洗')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'工序完成')]")).click();
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Yuhun", groups = {"test001"})
    public void TestNgQuickStart_Jichu() {
        new QuickStart_JiChu(driver).quick_start();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'异常处理')]")).isDisplayed());
        System.out.println("快速开始--挤出 完成");
        System.out.println("下一测试项目：挤出-->质检");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Jichu", groups = {"test001"})
    public void TestNgToCheck_Jichu() {
        new ToCheck(driver).SongJian();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'挤出/')]")).isDisplayed());
        System.out.println("挤出质检完成");
        System.out.println("下一测试项目：挤出--完成登记");
    }

    @Test(dependsOnMethods = "TestNgToCheck_Jichu", groups = {"test001"})
    public void TestNgQuickStart_Jichu_compReg() {
        new QuickStart_JiChu(driver).completeRegister();
        Assert.assertEquals
                (true, driver.findElement
                        (By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed(), "研磨中出现test001工单,pass");
        System.out.println("挤出--完成登记 完成");
        System.out.println("下一测试项目：快速开始--研磨");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_Jichu_compReg", groups = {"test001"})
    public void TestNgQuickStart_YanMo() {
        new QuickStart_YanMo(driver).quick_start();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'异常处理')]")).isDisplayed());
        System.out.println("快速开始--研磨 完成");
        System.out.println("下一测试项目：入库登记");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_YanMo", groups = {"test001"})
    public void TestNgWareHouseRegister() {
        new WareHouseRegister(driver).wareHouseRegister();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'研磨入库')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'合格品:200kg')]")).isDisplayed());
        System.out.println("入库登记 完成");
        System.out.println("下一测试项目：拒收入库处理");
    }

    @Test(dependsOnMethods = "TestNgQuickStart_YanMo", groups = {"test001"})
    public void TestNgToCheck_Yanmo() {
        new ToCheck(driver).SongJian();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'研磨/')]")).isDisplayed());
        System.out.println("研磨质检完成");
        System.out.println("下一测试项目：异常处理-打回挤出，分2种情况");
        System.out.println("1：不勾选工序完成，打回重量为166kg，研磨中test001还存在，挤出工序中test001会出现166这个数字");
        System.out.println("2：勾选工序完成，打回重量为166kg，研磨中test001消失");
    }

    @Test(dependsOnMethods = "TestNgToCheck_Yanmo", groups = {"test001"})
    public void TestNgExceptionHandle_1() {
        new ExceptionalHandling(driver).withoutGongxuComplete();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'166 kg')]")).isDisplayed());
        System.out.println("异常处理，不勾选工序完成");
    }

    @Test(dependsOnMethods = "TestNgToCheck_Yanmo", groups = {"test001"})
    public void TestNgExceptionHandle_2() {
        new ExceptionalHandling(driver).withGongxuComplete();
        boolean zhi;
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed();
            zhi = true;
        } catch (NoSuchElementException e) {
            zhi = false;
        }
        Assert.assertEquals(false, zhi);
        System.out.println("异常处理，勾选工序完成");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }
}
