package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装登录成功后首页的元素
 */

public class Home {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'排班')]") //排班
    public static WebElement paiban;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'生产工序')]") //生产工序
    public static WebElement produceProcess;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'质检')]") //质检
    public static WebElement zhijian;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'仓储')]") //仓储
    public static WebElement warehouse;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'查询统计')]") //查询统计
    public static WebElement queryandcount;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'设置')]") //设置
    public static WebElement setup;
}
