package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.ProcessOperator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.AbnormityInfo.*;
import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.abnormity;
import static nobel.auto.test.page.ProduceProcess.processOperator;
import static nobel.auto.test.page.Unlock.unlock;

public class ExceptionalHandling extends CommonCase {

    public ExceptionalHandling(AndroidDriver d) {
        super(d);
    }

    public void cOmmon(){
        produceProcess.click();
        processOperator.click();
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        ProcessOperator.yanMo.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        abnormity.click();
        solution.click();
        oneReason.click();
        ok.click();
        backFlow.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jiCHU.click();
        backCount.sendKeys("166");
    }

    public void withGongxuComplete(){
        cOmmon();
        gongXuEnd.click();
        ok_btn.click();
        ok_btn.click();
        try {
            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'已超出总量，是否提交')]")).isDisplayed();
            ok_btn.click();
        } catch (NoSuchElementException e) {
        }
    }

    public void withoutGongxuComplete(){
        cOmmon();
        ok_btn.click();
        ProcessOperator.jiChu.click();
    }
}
