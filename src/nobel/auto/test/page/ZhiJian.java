package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装质检页面的元素
 */

public class ZhiJian {

    @FindBy(id = "com.gongzhidao.nobel:id/iv_top_back") //后退
    public static WebElement back;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'送检窗口动态')]") //送检窗口动态
    public static WebElement QCwindowStatus;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'待检侦测')]") //待检侦测
    public static WebElement preQCscan;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'质检操作台')]") //质检操作台
    public static WebElement QCoperator;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'QC上班刷卡')]") //QC上班刷卡
    public static WebElement QCworkCard;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'入库记录')]") //入库记录
    public static WebElement innerHistory;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'质检记录')]") //质检记录
    public static WebElement QChistory;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工单质检')]") //工单质检
    public static WebElement QCworkSheet;
}
