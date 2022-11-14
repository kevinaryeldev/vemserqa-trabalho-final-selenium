package br.com.aliexpress.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void browserUp(String url){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void browserDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
