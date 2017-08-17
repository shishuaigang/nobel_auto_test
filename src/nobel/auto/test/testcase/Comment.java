package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.page.PreProcessOperator;
import org.openqa.selenium.NoSuchElementException;

import static nobel.auto.test.page.AbnormityInfo.ok;
import static nobel.auto.test.page.CommentDetails.*;
import static nobel.auto.test.page.Home.produceProcess;
import static nobel.auto.test.page.OperatorInfo.comment;
import static nobel.auto.test.page.OperatorInfo.commentHistory;
import static nobel.auto.test.page.OperatorInfo.details;
import static nobel.auto.test.page.PreProcessOperator.beiLiao;
import static nobel.auto.test.page.ProduceProcess.pre_processOperator;
import static nobel.auto.test.page.Unlock.unlock;

/**
 * Created by shishuaigang on 2017/7/6.
 * 添加备注记录，在备料快速开始后进行
 */
public class Comment extends CommonCase {

    public Comment(AndroidDriver d) {
        super(d);
    }

    public void comments() {
        produceProcess.click();  //生产工序
        pre_processOperator.click();  //前置工序操作台
        CommonCase.unlock();
        beiLiao.click();
        //查看test001工单是否存在
        try {
            PreProcessOperator.test001.click();
        } catch (NoSuchElementException e) {
            System.out.println("未找到test001测试工单，请检查");
        }
        comment.click();
        waitOP.click();
        ok.click();
        PreProcessOperator.test001.click();
        details.click();
        commentHistory.click();
    }
}
