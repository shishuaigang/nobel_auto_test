package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/6.
 * 封装点击备注记录后弹出页面上的元素
 */
public class CommentDetails {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'等操作员')]") //备注记录选择"等操作员"
    public static WebElement waitOP;

    @FindBy(id = "com.gongzhidao.nobel:id/text_cancle") //取消按钮
    public static WebElement cancel;

    @FindBy(id = "com.gongzhidao.nobel:id/text_ok") //确定按钮
    public static WebElement ok;
}
