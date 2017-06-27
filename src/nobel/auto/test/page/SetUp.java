package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装设置页面的元素
 */
public class SetUp {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'排班')]") //排班
    public static WebElement paiban;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'退出')]") //退出
    public static WebElement quit;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'绑卡')]") //绑卡
    public static WebElement bindCard;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'设备信息管理')]") //设备信息管理
    public static WebElement equipInfoManager;
}
