package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.Home.zhijian;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouseRegisterInfo.badness;
import static nobel.auto.test.page.WareHouseRegisterInfo.modifyReason;
import static nobel.auto.test.page.ZhiJian.innerHistory;

public class ModifyReason extends CommonCase {
    public ModifyReason(AndroidDriver d) {
        super(d);
    }

    public void modifyReason() {
        zhijian.click();
        innerHistory.click();
        CommonCase.unlock();
        modifyReason.click();
        badness.click();
        ok.click();
    }
}
