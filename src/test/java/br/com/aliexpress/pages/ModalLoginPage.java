package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ModalLoginPage extends BasePage{
    private static final By inputLoginEmail =
            By.id("fm-login-id");
    private static final By inputLoginSenha =
            By.id("fm-login-password");

    private static final By btnSubmitLogin =
            By.className("login-submit");

    private static final By alertErrorLogin =
            By.cssSelector("div.fm-login>.cosmos-alert-error");

    public void limparCampoLoginEmail(){
        click(inputLoginEmail);
        clearElement(inputLoginEmail);
    }
    public void limparCampoLoginSenha(){
        click(inputLoginSenha);
        clearElement(inputLoginSenha);
    }

    @Step
    public void escreverCampoLoginEmail(String email){
        limparCampoLoginEmail();
        sendKeys(inputLoginEmail,email);
    }
    @Step
    public void escreverCampoLoginSenha(String senha){
        limparCampoLoginSenha();
        sendKeys(inputLoginSenha,senha);
    }
    @Step
    public boolean statusEnlabledBtnSubmitLogin(){
        return element(btnSubmitLogin).isEnabled();
    }
    @Step
    public void clicarBtnSubmitLogin(){
        click(btnSubmitLogin);
    }
    @Step
    public boolean statusMensagemErro(){
        return checkElementDisplayStatus(alertErrorLogin);
    }
}
