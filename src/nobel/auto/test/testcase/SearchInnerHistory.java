package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.Home.warehouse;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.WareHouse.recordSearch;

public class SearchInnerHistory extends CommonCase{
    public SearchInnerHistory(AndroidDriver d){
        super(d);
    }

    public void searchHis(){
        warehouse.click();
        recordSearch.click();
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }

    }
}
