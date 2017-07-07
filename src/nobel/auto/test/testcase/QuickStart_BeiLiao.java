package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.*;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.CompleteRegister.*;
import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.PreProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.*;
import static nobel.auto.test.page.OperatorInfo.*;


public class QuickStart_BeiLiao extends CommonCase{

    public QuickStart_BeiLiao(AndroidDriver d) {
        super(d);
    }

    public void quickStart() {
        produceProcess.click();  //生产工序
        pre_processOperator.click();  //前置工序操作台
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        beiLiao.click();
        //查看test001工单是否存在
        try {
            PreProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        quickStart.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PreProcessOperator.test001.click();
        completeRegister.click();
        cur_finish.sendKeys("300");
        ok_btn.click();
    }
}
