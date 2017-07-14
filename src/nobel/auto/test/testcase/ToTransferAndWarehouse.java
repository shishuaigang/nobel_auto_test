package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.Home.warehouse;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouse.*;
import static nobel.auto.test.page.toTransferWarehouseInfo.*;

public class ToTransferAndWarehouse extends CommonCase{
    public ToTransferAndWarehouse(AndroidDriver d){
        super(d);
    }

    public void toTranfer(){
        warehouse.click();
        pre_transfer.click();
        //解锁
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        transferThisOrder.click();
        transfer.click();
    }

    public void toWarehouse(){
        warehouse.click();
        pre_inner.click();
        //解锁
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        innerThisOrder.click();
        inner.click();
    }
}
