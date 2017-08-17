package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.PreProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.CompleteRegister.cur_finish;
import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.completeRegister;
import static nobel.auto.test.page.OperatorInfo.quickStart;
import static nobel.auto.test.page.ProduceProcess.pre_processOperator;
import static nobel.auto.test.page.Unlock.unlock;


public class QuickStart_YuHun extends CommonCase {

    public QuickStart_YuHun(AndroidDriver d) {
        super(d);
    }

    public void quickStart() {
        produceProcess.click();
        pre_processOperator.click();
        CommonCase.unlock();
        //切换到预混，查看test001工单是否存在
        PreProcessOperator.yuHun.click();
        try {
            PreProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        quickStart.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PreProcessOperator.test001.click();
        completeRegister.click();
        cur_finish.sendKeys("450");
        ok_btn.click();
    }
}
