package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.Home.warehouse;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouse.*;
import static nobel.auto.test.page.toTransferWarehouseInfo.*;

public class ToTransferAndWarehouse extends CommonCase {
    public ToTransferAndWarehouse(AndroidDriver d) {
        super(d);
    }

    public void toTranfer() {
        warehouse.click();
        pre_transfer.click();
        //解锁
        CommonCase.unlock();
        transferThisOrder.click();
        transfer.click();
    }

    public void toWarehouse() {
        warehouse.click();
        pre_inner.click();
        CommonCase.unlock();
        innerThisOrder.click();
        inner.click();
    }
}
