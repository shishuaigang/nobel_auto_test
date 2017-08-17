package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.RollBackSolution;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.AbnormityInfo.solution;
import static nobel.auto.test.page.CompleteRegister.ok_btn;
import static nobel.auto.test.page.DetailInfo.wenliDifference;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.orderRollBack;
import static nobel.auto.test.page.OperatorInfo.orderToDo;
import static nobel.auto.test.page.OperatorInfo.quickStart;
import static nobel.auto.test.page.ProcessOperator.*;
import static nobel.auto.test.page.ProduceProcess.processOperator;
import static nobel.auto.test.page.RollBackSolution.changeWang;
import static nobel.auto.test.page.Unlock.unlock;

public class ToDoGuaQi extends CommonCase {
    public ToDoGuaQi(AndroidDriver d) {
        super(d);
    }

    public void guaQi() {
        produceProcess.click();
        processOperator.click();
        CommonCase.unlock();
        yanMo.click();
        test001.click();
        orderToDo.click();
        wenliDifference.click();
        ok.click();
    }

    public void huiFu() {
        orderRollBack.click();
        RollBackSolution.solution.click();
        changeWang.click();
        ok.click();
        ok_btn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ok_btn.click();
        test001.click();
        quickStart.click();
        test001.click();
    }
}
