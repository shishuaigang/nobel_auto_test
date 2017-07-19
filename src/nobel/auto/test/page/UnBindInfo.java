package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/12.
 * 封装点击解绑设备后页面上的元素
 */
public class UnBindInfo {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'解除绑定')]") //解除绑定按钮
    public static WebElement unbind_btn;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[contains(@index,1)]/android.widget.TextView[contains(@index,0)]") //ext201设备
    public static WebElement ext_201;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'绑定本机')]") //绑定本机按钮
    public static WebElement bind_btn;
}
