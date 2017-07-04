package nobel.auto.test.testcase;

import io.appium.java_client.android.AndroidDriver;
import nobel.auto.test.driver.Driver;


public class test {
    public static void main(String args[]){
        Driver driver = new Driver();
        AndroidDriver d = driver.driver();
        QuickStart_1 qs = new QuickStart_1(d);
        qs.quickStart();
    }
}
