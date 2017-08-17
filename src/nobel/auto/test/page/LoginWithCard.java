package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装读卡登录页面的元素
 */

public class LoginWithCard {

    @FindBy(id = "com.gongzhidao.nobel:id/iv_superuserlogin") //账号登陆按钮
    public static WebElement loginWithAccount;

    @FindBy(id = "com.gongzhidao.nobel:id/iv_setting") //设置按钮，选择服务器
    public static WebElement setting;

}
