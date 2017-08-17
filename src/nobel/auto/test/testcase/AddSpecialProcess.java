package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.DetailInfo.*;
import static nobel.auto.test.page.Home.*;
import static nobel.auto.test.page.ProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.*;
import static nobel.auto.test.page.Unlock.*;

public class AddSpecialProcess extends CommonCase {
    public AddSpecialProcess(AndroidDriver d) {
        super(d);
    }

    public void addSpecialProcess() {
        produceProcess.click();
        processOperator.click();
        CommonCase.unlock();
        addpic.click();
        addspecialprocess.click();
        bigClean.click();
        ok_btn.click();
    }
}
