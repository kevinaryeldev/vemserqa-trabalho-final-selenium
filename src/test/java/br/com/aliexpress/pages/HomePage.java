package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private static final By btnModalAccount =
            By.cssSelector("[data-role=myaliexpress-link]");

    private static final By btnSignin =
            By.className("sign-btn");

    private static final By welcomeText =
            By.className("welcome-name");

    @Step
    public void hoverBotaoModalAccount(){
        moveToElement(btnModalAccount);
    }

    @Step
    public void clicarBotaoAbrirModalLogin(){
        moveToElementAndClick(btnSignin);
    }
    @Step
    public boolean retornarChecarLogin(){
        return checkElementDisplayStatus(welcomeText);
    }
}
