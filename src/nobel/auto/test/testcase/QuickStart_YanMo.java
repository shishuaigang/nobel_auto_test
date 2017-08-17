package nobel.auto.test.testcase;


import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.ProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.CompleteRegister.cur_finish;
import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.completeRegister;
import static nobel.auto.test.page.OperatorInfo.quickStart;
import static nobel.auto.test.page.ProcessOperator.yanMo;
import static nobel.auto.test.page.ProduceProcess.processOperator;
import static nobel.auto.test.page.Unlock.unlock;

public class QuickStart_YanMo extends CommonCase {

    public QuickStart_YanMo(AndroidDriver d) {
        super(d);
    }

    private void cOMMON() {
        produceProcess.click();
        processOperator.click();
        CommonCase.unlock();
        ProcessOperator.yanMo.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
    }

    public void quick_start() {
        cOMMON();
        quickStart.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
    }

    public void completeRegister() {
        cOMMON();
        completeRegister.click();
        cur_finish.sendKeys("300");
        ok_btn.click();
    }
}
