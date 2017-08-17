package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/4.
 * 封装点击 完成登记后 完成登记页面上的信息
 */
public class CompleteRegister {

    @FindBy(id = "com.gongzhidao.nobel:id/edit_cur_finish") //完成数量输入框
    public static WebElement cur_finish;

    @FindBy(id = "com.gongzhidao.nobel:id/btn_cancle") //取消按钮
    public static WebElement cancel_btn;

    @FindBy(id = "com.gongzhidao.nobel:id/btn_ok") //确定按钮
    public static WebElement ok_btn;
}
