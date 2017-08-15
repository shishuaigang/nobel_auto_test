package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServerInfo {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'内网测试-常州')]") //内网测试-常州
    public static WebElement ChangZhou;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'内网测试-苏州')]") //内网测试-苏州
    public static WebElement Suzhou;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'内网测试-钱朝坤')]") //内网测试-钱朝坤
    public static WebElement QianChaoKun;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'阿克苏诺贝尔-常州')]") //阿克苏诺贝尔-常州
    public static WebElement Nobel_ChangZhou;

}
