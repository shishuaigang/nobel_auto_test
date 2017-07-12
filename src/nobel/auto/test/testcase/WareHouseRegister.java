package nobel.auto.test.testcase;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.produceProcess;
import nobel.auto.test.page.ProcessOperator;

import static nobel.auto.test.page.OperatorInfo.innerRegister;
import static nobel.auto.test.page.ProduceProcess.processOperator;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouseRegisterInfo.*;

public class WareHouseRegister extends CommonCase {
    public WareHouseRegister(AndroidDriver d) {
        super(d);
    }

    public void wareHouseRegister() {
        produceProcess.click();
        processOperator.click();
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        ProcessOperator.yanMo.click();
        ProcessOperator.test001.click();
        innerRegister.click();
        acceptable.click();
        acceptable.sendKeys("200");
        rejects.click();
        rejects.sendKeys("50");
        choose_reason.click();
        damp.click();
        ok.click();
        ok_btn.click();
        ProcessOperator.test001.click();
        innerRegister.click();
    }
}
