package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.ProduceProcess.rejectsoultion;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouse.back;
import static nobel.auto.test.page.WareHouse.pre_transfer;
import static nobel.auto.test.page.toTransferWarehouseInfo.*;

public class Reject extends CommonCase {

    public Reject(AndroidDriver d) {
        super(d);
    }

    public void rejectwarehouse() {
        warehouse.click();
        pre_transfer.click();
        CommonCase.unlock();
        rej_btn.click();
        rej_reason.click();
        ok_btn.click();
        rej_btn.click();
        rej_reason.click();
        ok_btn.click();
        back.click();
        back.click();
        produceProcess.click();
        rejectsoultion.click();
    }
}
