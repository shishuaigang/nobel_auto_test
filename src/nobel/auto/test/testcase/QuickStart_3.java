package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.ProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.quickStart;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.unlock;

public class QuickStart_3 {
    private AndroidDriver driver;

    public QuickStart_3(AndroidDriver d) {
        this.driver = d;
    }

    public void quickStart() {
        produceProcess.click();
        processOperator.click();
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        //切换到挤出，查看test001工单是否存在
        ProcessOperator.jiChu.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        quickStart.click();
    }
}
