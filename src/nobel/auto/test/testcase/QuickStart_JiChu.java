package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.ProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.CompleteRegister.*;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.*;
import static nobel.auto.test.page.ProcessOperator.yanMo;
import static nobel.auto.test.page.ProduceProcess.processOperator;
import static nobel.auto.test.page.Unlock.unlock;

public class QuickStart_JiChu extends CommonCase{

    public QuickStart_JiChu(AndroidDriver d) {
        super(d);
    }

    private void cOMMON(){
        produceProcess.click();
        processOperator.click();
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        ProcessOperator.jiChu.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
    }

    public void quick_start(){
        cOMMON();
        quickStart.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
    }

    public void completeRegister(){
        cOMMON();
        completeRegister.click();
        cur_finish.sendKeys("400");
        ok_btn.click();
        yanMo.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
