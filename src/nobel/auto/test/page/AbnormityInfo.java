package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/7.
 * 封装异常处理页面上的元素
 */

public class AbnormityInfo {

    @FindBy(id = "com.gongzhidao.nobel:id/result_area") //处理方案按钮
    public static WebElement solution;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'重粉碎')]") //重粉碎
    public static WebElement oneReason;

    @FindBy(id = "com.gongzhidao.nobel:id/text_cancle") //取消按钮
    public static WebElement cancel;

    @FindBy(id = "com.gongzhidao.nobel:id/text_ok") //确定按钮
    public static WebElement ok;

    @FindBy(id = "com.gongzhidao.nobel:id/next_flow") //打回工序选择
    public static WebElement backFlow;

    @FindBy(id = "com.gongzhidao.nobel:id/edit_cur_finish") //登记数量输入框
    public static WebElement backCount;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工序完成')]") //工序完成按钮
    public static WebElement gongXuEnd;

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@index,2)]/android.widget.TextView[contains(@index,0)]") //挤出
    public static WebElement jiCHU;
}