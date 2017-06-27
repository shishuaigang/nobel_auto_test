package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/27.
 * 封装请刷卡界面上的close按钮
 */
public class Unlock {

    @FindBy(id = "com.gongzhidao.nobel:id/close") //叉叉按钮
    public static WebElement unlock;
}
