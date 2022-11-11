package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
    //MAPEAMENTO
    private static final By accountHover =
            By.cssSelector("#nav-user-account > span");

    @Step
    public void mouseHoverMinhaConta() {

    }
}
