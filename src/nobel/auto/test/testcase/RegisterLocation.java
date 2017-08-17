package nobel.auto.test.testcase;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.Home.warehouse;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouse.libRegister;
import static nobel.auto.test.page.WareHouseRegisterInfo.*;

public class RegisterLocation extends CommonCase {
    public RegisterLocation(AndroidDriver d) {
        super(d);
    }

    public void registerLoc() {
        warehouse.click();
        libRegister.click();
        CommonCase.unlock();
        register_btn.click();
        add_btn.click();
        register_num.click();
        register_num.sendKeys("200");
        warehouse_loc.click();
        warehouse_loc.sendKeys("F201");
        ok_btn.click();
    }
}
