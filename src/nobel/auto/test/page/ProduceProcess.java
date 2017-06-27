package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/23.
 * 封装生产工序页面的元素
 */

public class ProduceProcess {

    @FindBy(id = "com.gongzhidao.nobel:id/iv_top_back") //后退
    public static WebElement back;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工序操作台')]") //工序操作台
    public static WebElement processOperator;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'前置工序操作台')]") //前置工序操作台
    public static WebElement pre_processOperator;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'待处理解决方案')]") //待处理解决方案
    public static WebElement nonSolution;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'拒收入库处理')]") //拒收入库处理
    public static WebElement rejectsoultion;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工序上班刷卡')]") //工序上班刷卡
    public static WebElement wordCard;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工序一览')]") //工序一览
    public static WebElement processOverview;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'绑定设备')]") //绑定设备
    public static WebElement bindEquip;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'解绑设备')]") //解绑设备
    public static WebElement unbundledEquip;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'人员设备绑定')]") //人员设备绑定
    public static WebElement binEquipAndPeople;
}
