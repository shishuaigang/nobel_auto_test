package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/11.
 * 封装点击详情后页面上的元素
 * 封装点击加号后弹出的元素
 */
public class DetailInfo {

    @FindBy(id = "com.gongzhidao.nobel:id/tv_btn_change") //修改
    public static WebElement modify;

    @FindBy(id = "com.gongzhidao.nobel:id/edit_change_quanity") //数量
    public static WebElement modify_count;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'数量输入错误')]") //数量输入错误
    public static WebElement error_quantity;

    @FindBy(id = "com.gongzhidao.nobel:id/check_notdo") //待开始
    public static WebElement todo;

    @FindBy(id = "com.gongzhidao.nobel:id/check_extra") //添加特殊工单
    public static WebElement addspecialprocess;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'大清洗')]") //大清洗
    public static WebElement bigClean;
}
