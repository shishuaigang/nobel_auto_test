package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.ProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.DetailInfo.*;
import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.OperatorInfo.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.*;

/**
 * Created by shishuaigang on 2017/7/11.
 * 添加特殊工单
 */

public class ModifyQuantity extends CommonCase{

    public ModifyQuantity(AndroidDriver d){
        super(d);
    }

    public void modifyQuantity(){
        produceProcess.click();
        processOperator.click();
        //查看解锁界面
        try {
            unlock.click();
        } catch (NoSuchElementException e) {
            System.out.println("已解锁，不需要使用刷卡解锁");
        }
        ProcessOperator.jiChu.click();
        try {
            ProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        details.click();
        modify.click();
        modify_count.sendKeys("400");
        error_quantity.click();
        ok.click();
    }
}
