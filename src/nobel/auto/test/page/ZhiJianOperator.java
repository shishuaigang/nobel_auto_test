package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/17.
 * 封装质检操作台页面内的元素
 */

public class ZhiJianOperator {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'取走样品')]") //取走样品
    public static WebElement takeSample;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'取走全部样品')]") //取走全部样品
    public static WebElement takeAllSample;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'检验登记')]") //检验登记
    public static WebElement checkAndRegister;

    @FindBy(id = "com.gongzhidao.nobel:id/item_edit_result") //修改按钮
    public static WebElement modifyresult;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'冲击不过')]") //冲击不过
    public static WebElement chongjiBuGuo;
}
