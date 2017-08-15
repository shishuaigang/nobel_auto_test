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

import static nobel.auto.test.page.CompleteRegister.ok_btn;


/**
 * Created by shishuaigang on 2017/7/4.
 */

public class NobelAutoTest {

    private AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        driver = new Driver().driver();
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
        toTransferWarehouseInfo p56780 = PageFactory.initElements(driver, toTransferWarehouseInfo.class);
        ZhiJianOperator p56721 = PageFactory.initElements(driver, ZhiJianOperator.class);
        RollBackSolution p34323 = PageFactory.initElements(driver, RollBackSolution.class);
        //登录
        Login lo = new Login(driver);
        lo.login();
    }

    @Test(groups = {"test001"})
    public void UnBindEquip() {
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

    @Test(dependsOnMethods = "UnBindEquip", groups = {"test001"})
    public void BindEquip() {
        new Bind(driver).bindEquip();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'EXT-201')]")).isDisplayed())
        ;
        System.out.println("绑定设备完成");
        System.out.println("下一测试项目：快速开始--备料--完成登记");
    }

    @Test(dependsOnMethods = "BindEquip", groups = {"test001"})
    public void QuickStart_Beiliao() {
        new QuickStart_BeiLiao(driver).quickStart();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'登记结果')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'已送往：')]")).isDisplayed());
        System.out.println("快速开始--备料--完成登记");
        System.out.println("下一测试项目：添加备注");
    }

    @Test(dependsOnMethods = "QuickStart_Beiliao", groups = {"test001"})
    public void Comment() {
        new Comment(driver).comments();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'等操作员')]")).isDisplayed());
        System.out.println("添加备注完成");
        System.out.println("下一测试项目：快速开始--预混--完成登记");
    }

    @Test(dependsOnMethods = "Comment", groups = {"test001"})
    public void QuickStart_Yuhun() {
        new QuickStart_YuHun(driver).quickStart();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'登记结果')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'已送往：')]")).isDisplayed());
        System.out.println("快速开始--预混完成");
        System.out.println("下一测试项目：更改排班数量");
    }

    @Test(dependsOnMethods = "QuickStart_Yuhun", groups = {"test001"})
    public void Modify_quantity() {
        new ModifyQuantity(driver).modifyQuantity();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'400 kg')]")).isDisplayed());
        System.out.println("更改排班数量 完成");
        System.out.println("下一测试项目：添加特殊工序");
    }

    @Test(dependsOnMethods = "Modify_quantity", groups = {"test001"})
    public void AddSpecialProcess() {
        new AddSpecialProcess(driver).addSpecialProcess();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'大清洗')]")).isDisplayed());
        System.out.println("添加特殊工序 完成");
        System.out.println("下一测试项目：快速开始--挤出");
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'大清洗')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'工序完成')]")).click();
    }

    @Test(dependsOnMethods = "AddSpecialProcess", groups = {"test001"})
    public void QuickStart_Jichu() {
        new QuickStart_JiChu(driver).quick_start();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'异常处理')]")).isDisplayed());
        System.out.println("快速开始--挤出 完成");
        System.out.println("下一测试项目：挤出-->质检");
    }

    @Test(dependsOnMethods = "QuickStart_Jichu", groups = {"test001"})
    public void ZhiJian_Jichu() {
        new ToCheck(driver).SongJian();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'挤出/')]")).isDisplayed());
        System.out.println("挤出质检完成");
        System.out.println("下一测试项目：挤出--完成登记");
    }

    @Test(dependsOnMethods = "ZhiJian_Jichu", groups = {"test001"})
    public void QuickStart_Jichu_compReg() {
        new QuickStart_JiChu(driver).completeRegister();
        Assert.assertEquals
                (true, driver.findElement
                        (By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed(), "研磨中出现test001工单,pass");
        System.out.println("挤出--完成登记 完成");
        System.out.println("下一测试项目：快速开始--研磨");
    }

    @Test(dependsOnMethods = "QuickStart_Jichu_compReg", groups = {"test001"})
    public void QuickStart_YanMo() {
        new QuickStart_YanMo(driver).quick_start();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'异常处理')]")).isDisplayed());
        System.out.println("快速开始--研磨 完成");
        System.out.println("下一测试项目：入库登记");
    }

    @Test(dependsOnMethods = "QuickStart_YanMo", groups = {"test001"})
    public void WareHouseRegister() {
        new WareHouseRegister(driver).wareHouseRegister();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'研磨入库')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'合格品:200kg')]")).isDisplayed());
        System.out.println("入库登记 完成");
        System.out.println("下一测试项目：拒收入库处理");
    }

    @Test(dependsOnMethods = "WareHouseRegister", groups = {"test001"})
    public void WareHouseReject() {
        new Reject(driver).rejectwarehouse();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'——  拒收信息  ——')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'不良品：50kg')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'合格品：200kg')]")).isDisplayed());
        System.out.println("拒收入库处理 完成");
        System.out.println("下一测试项目：待运输");
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'重新入库')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'数量修正')]")).click();
        ok_btn.click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'重新入库')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'数量修正')]")).click();
        ok_btn.click();
    }

    @Test(dependsOnMethods = "WareHouseReject", groups = {"test001"})
    public void ToTransfer() {
        new ToTransferAndWarehouse(driver).toTranfer();
        boolean zhi;
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed();
            zhi = true;
        } catch (NoSuchElementException e) {
            zhi = false;
        }
        Assert.assertEquals(false, zhi);
        System.out.println("待运输完成");
        System.out.println("下一测试项目：待入库");
    }

    @Test(dependsOnMethods = "ToTransfer", groups = {"test001"})
    public void ToWarehouse() {
        new ToTransferAndWarehouse(driver).toWarehouse();
        boolean zhi;
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed();
            zhi = true;
        } catch (NoSuchElementException e) {
            zhi = false;
        }
        Assert.assertEquals(false, zhi);
        System.out.println("待入库完成");
        System.out.println("下一测试项目：库位登记正常");
    }

    @Test(dependsOnMethods = "ToWarehouse", groups = {"test001"})
    public void RegisterLocation() {
        new RegisterLocation(driver).registerLoc();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'F201 : 200 kg')]")).isDisplayed());
        System.out.println("库位登记完成");
        System.out.println("下一测试项目：入库记录查询");
    }

    @Test(dependsOnMethods = "RegisterLocation", groups = {"test001"})
    public void RecordSearch() {
        new SearchInnerHistory(driver).searchHis();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'合格品库        入库')]")).isDisplayed());
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'合格品')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'不良品')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'查询')]")).click();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'不良品库        入库')]")).isDisplayed());
        System.out.println("入库记录查询");
        System.out.println("下一测试项目：入库记录查询");
    }

    @Test(dependsOnMethods = "RecordSearch", groups = {"test001"})
    public void ModifyReason() {
        new ModifyReason(driver).modifyReason();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'产品不良')]")).isDisplayed());
        System.out.println("修改不良品入库原因完成");
        System.out.println("下一测试项目：取样并填写质检结果");
    }

    @Test(dependsOnMethods = "ModifyReason", groups = {"test001"})
    public void QuYang() {
        new QAResult(driver).qaResult();
        boolean zhi;
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed();
            zhi = true;
        } catch (NoSuchElementException e) {
            zhi = false;
        }
        Assert.assertEquals(false, zhi);
        System.out.println("取样并填写质检结果完成");
        System.out.println("下一测试项目：修改质检结果");
    }

    @Test(dependsOnMethods = "QuYang", groups = {"test001"})
    public void ModifyResult() {
        new ModifyQAResult(driver).modifyResult();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'不合格：冲击不过 ')]")).isDisplayed());
        System.out.println("修改质检结果完成");
        System.out.println("下一测试项目：研磨质检");
    }

    @Test(dependsOnMethods = "ModifyResult", groups = {"test001"})
    public void orderGuaQi() {
        new ToDoGuaQi(driver).guaQi();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).click();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'工单恢复')]")).isDisplayed());
        System.out.println("工单挂起完成");
        System.out.println("下一测试项目：研磨质检");
        new ToDoGuaQi(driver).huiFu();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'异常处理')]")).isDisplayed());
    }

    @Test(dependsOnMethods = "orderGuaQi", groups = {"test001"})
    public void ZhiJian_Yanmo() {
        new ToCheck(driver).SongJian();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'研磨/')]")).isDisplayed());
        System.out.println("研磨质检完成");
        System.out.println("下一测试项目：异常处理-打回挤出，分2种情况");
        System.out.println("1：不勾选工序完成，打回重量为166kg，研磨中test001还存在，挤出工序中test001会出现166这个数字");
        System.out.println("2：勾选工序完成，打回重量为166kg，研磨中test001消失");
    }

    @Test(dependsOnMethods = "ZhiJian_Yanmo", groups = {"test001"})
    public void ExceptionHandle_1() {
        new ExceptionalHandling(driver).withoutGongxuComplete();
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'test001')]")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'166 kg')]")).isDisplayed());
        System.out.println("异常处理，不勾选工序完成");
    }

    @Test(dependsOnMethods = "ExceptionHandle_1", groups = {"test001"})
    public void ExceptionHandle_2() {
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
