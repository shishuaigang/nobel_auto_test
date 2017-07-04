package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/4.
 * 封装工序操作台下页面上的元素
 */

public class ProcessOperator {

    @FindBy(id = "com.gongzhidao.nobel:id/iv_top_back") //返回按钮
    public static WebElement backBtn;

    @FindBy(id = "com.gongzhidao.nobel:id/iv_manualrefresh") //手工刷新按钮
    public static WebElement refresh;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'预混')]") //预混
    public static WebElement yuHun;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'挤出')]") //挤出
    public static WebElement jiChu;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'研磨')]") //研磨
    public static WebElement yanMo;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'test001')]") //测试工单test001
    public static WebElement test001;
}
