package nobel.auto.test.testcase;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.ProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.UnBindInfo.*;
import static nobel.auto.test.page.Unlock.unlock;

public class Bind extends CommonCase {
    public Bind(AndroidDriver d) {
        super(d);
    }

    public void bindEquip() {
        produceProcess.click();  //生产工序
        bindEquip.click();  //绑定设备
        //解锁
        CommonCase.unlock();
        jiChu.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ext_201.click();
        bind_btn.click();
        backBtn.click();
        processOperator.click();
        jiChu.click();
    }
}

