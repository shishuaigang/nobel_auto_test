package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装用户名密码登录页面的元素
 */

public class LoginWithAccount {

    @FindBy(id="com.gongzhidao.nobel:id/iv_superuserlogin") //读卡登录按钮
    public static WebElement loginWithCard;

    @FindBy(id="com.gongzhidao.nobel:id/iv_setting") //设置按钮，选择服务器
    public static WebElement setting;

    @FindBy(id="com.gongzhidao.nobel:id/edit_name") //用户名输入框
    public static WebElement username;

    @FindBy(id="com.gongzhidao.nobel:id/edit_password") //密码输入框
    public static WebElement password;

    @FindBy(id="com.gongzhidao.nobel:id/tv_login") //登录按钮
    public static WebElement loginButton;
}
