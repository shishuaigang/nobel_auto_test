package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装仓储页面的元素
 */
public class WareHouse {

    @FindBy(id = "com.gongzhidao.nobel:id/iv_top_back") //后退
    public static WebElement back;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'待运输成品')]") //待运输成品
    public static WebElement pre_transfer;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'待入库成品')]") //待入库成品
    public static WebElement pre_inner;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'库位登记')]") //库位登记
    public static WebElement libRegister;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'记录查询')]") //记录查询
    public static WebElement recordSearch;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'库位登记记录')]") //库位登记记录
    public static WebElement libRegisterRecord;
}
