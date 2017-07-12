package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/12.
 * 封装点击入库登记后弹出页面上的信息
 */

public class WareHouseRegisterInfo {

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[0]/android.widget.EditText") //合格品
    public static WebElement acceptable;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText") //不良品
    public static WebElement rejects;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText") //半成品
    public static WebElement semi_manufactures;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.EditText") //过筛品
    public static WebElement sifting;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.EditText") //废粉
    public static WebElement scrap;

    @FindBy(id = "com.gongzhidao.nobel:id/add_result") //选择理由
    public static WebElement choose_reason;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'潮湿损坏')]") //潮湿损坏
    public static WebElement damp;

}
