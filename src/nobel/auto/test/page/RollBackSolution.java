package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/18.
 * 封装点击恢复后页面上的元素
 */

public class RollBackSolution {
    @FindBy(id = "com.gongzhidao.nobel:id/result_area") //恢复原因
    public static WebElement solution;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'换筛网')]") //换筛网
    public static WebElement changeWang;


}
