package nobel.auto.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/7/4.
 * 封装点击工单后弹出页面上的元素
 */

public class OperatorInfo {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'快速开始')]") //快速开始
    public static WebElement quickStart;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工单中止')]") //工单中止
    public static WebElement orderBreak;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'完成登记')]") //完成登记
    public static WebElement completeRegister;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工序完成')]") //工序完成
    public static WebElement completeProcedure;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'异常处理')]") //异常处理
    public static WebElement abnormity;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工单待处理')]") //工单待处理
    public static WebElement orderToDo;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'备注记录')]") //备注记录
    public static WebElement comment;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'开始时间调整')]") //开始时间调整
    public static WebElement changeStartTime;
}
