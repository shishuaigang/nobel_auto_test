package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.Home.zhijian;
import static nobel.auto.test.page.Unlock.unlock;
import static nobel.auto.test.page.ZhiJian.QChistory;
import static nobel.auto.test.page.ZhiJianOperator.*;

public class ModifyQAResult extends CommonCase{
    public ModifyQAResult(AndroidDriver d){
        super(d);
    }

    public void modifyResult(){
        zhijian.click();
        QChistory.click();
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        modifyresult.click();
        chongjiBuGuo.click();
        ok.click();
    }
}
