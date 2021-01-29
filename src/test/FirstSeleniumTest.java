package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
    setBrowser();
    setBrowserConfig();
    runTest();
    }

    //setBrowser
    //setBrowserConfig
    //runTest

    public static void setBrowser(){
        browser = "Chrome";

    }

    public static void setBrowserConfig(){
        System.setProperty("webdriver.chrome.driver","C:\\Shang Shi Software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void runTest() {
        driver.get("https://www.selenium.dev/");
        driver.quit();
    }

}
