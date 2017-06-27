package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装排班页面上的元素
 */

public class PaiBan {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'订单处理')]") //订单处理
    public static WebElement handlOrder;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'排班一览')]") //排班一览
    public static WebElement paibanOverview;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'交期一览')]") //交期一览
    public static WebElement jiaoqiOverview;

    @FindBy(id = "com.gongzhidao.nobel:id/iv_top_back") //后退
    public static WebElement back;
}
