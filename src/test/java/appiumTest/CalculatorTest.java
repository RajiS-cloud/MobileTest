package appiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import java.lang.String;

import java.net.URL;

public class CalculatorTest {

   // WebDriver driver;  // use this if you have to use webbrowser and mobile tetsing
     static AppiumDriver<MobileElement> driver;

   // static AndroidDriver<MobileElement> driver;

   // AndroidDriver driver;

    public static void main(String[] args){

        try{
            openCalculator();
        }catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
           exp.printStackTrace();
        }

    }


    public static void openCalculator() throws Exception{
       //  Set the Device Capabilities as below

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Samsung Galaxy S7" );
        cap.setCapability("udId","ad0517022c34d53326");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","8.0.0");

        // Set the capability for Application i.e app package and app activity
        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivities","com.sec.android.app.popupcalculator.calculator");
        URL url =  new URL("http://127.0.0.1:4723/wd/hub");
        //URL url =  new URL("http://localhost:4723/wd/hub/");
          driver = new AppiumDriver<MobileElement>(cap);
       // driver = new AndroidDriver<MobileElement>(cap);

        System.out.println("Application Started ....");
    }



}
