package br.com.aliexpress.pages;

import br.com.aliexpress.utils.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends Elements {

    public static void click(By by){
        waitElement(by);
        element(by).click();
    }

    public static void sendKeys(By by, String texto){
        waitElement(by);
        element(by).sendKeys(texto);
    }

    public static String getText(By by){
        waitElement(by);
        return element(by).getText();
    }

<<<<<<< HEAD
    public static void moveToElement(By by){
        Actions action = new Actions(driver);
        action.moveToElement(element(by));
        action.build().perform();
    }

    public static void moveToElementAndClick(By by){
        Actions action = new Actions(driver);
        action.moveToElement(element(by));
        action.click().build().perform();
    }

    public static void clearElement(By by){
        element(by).clear();
    }

    public static boolean checkElementDisplayStatus(By by){
        return element(by).isDisplayed();
    }

=======
    public static void mouseHover(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(element(by)).perform();
    }
>>>>>>> develop
}

