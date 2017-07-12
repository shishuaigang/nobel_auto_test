package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/12.
 * 封装仓库拒收页面上的信息
 */
public class WareHouseRejectInfo {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'拒收')]") //拒收按钮
    public static WebElement rej_btn;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'成品损坏，数量减少')]") //成品损坏，数量减少
    public static WebElement rej_reason;
}
