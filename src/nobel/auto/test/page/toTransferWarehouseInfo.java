package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/12.
 * 封装带运输和待入库页面上的信息
 */
public class toTransferWarehouseInfo {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'拒收')]") //拒收按钮
    public static WebElement rej_btn;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'成品损坏，数量减少')]") //成品损坏，数量减少
    public static WebElement rej_reason;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'运输本单')]") //运输本单按钮
    public static WebElement transferThisOrder;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'全部运输')]") //全部运输
    public static WebElement transferAll;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'运送')]") //运送
    public static WebElement transfer;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'入库本单')]") //入库本单按钮
    public static WebElement innerThisOrder;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'全部入库')]") //全部运输
    public static WebElement innerAll;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'运送')]") //入库
    public static WebElement inner;
}
