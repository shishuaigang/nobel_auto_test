package nobel.auto.test.testcase;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.ProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.UnBindInfo.*;
import static nobel.auto.test.page.Unlock.unlock;

public class UnBind extends CommonCase {
    public UnBind(AndroidDriver d) {
        super(d);
    }

    public void unBindEquip() {
        produceProcess.click();  //生产工序
        unbundledEquip.click();  //解绑设备
        //解锁
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        jiChu.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ext_201.click();
        unbind_btn.click();
        backBtn.click();
        processOperator.click();
        jiChu.click();
    }
}
