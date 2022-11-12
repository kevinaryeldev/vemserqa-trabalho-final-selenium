package br.com.aliexpress.pages;

import org.openqa.selenium.By;

public class ModalLoginPage extends BasePage{
    private static final By inputLoginEmail =
            By.id("fm-login-id");
    private static final By inputLoginSenha =
            By.id("fm-login-password");

    private static final By btnSubmitLogin =
            By.className("login-submit");

    private static final By alertErrorLogin =
            By.className("cosmos-alert-error");

    public void limparCampoLoginEmail(){
        click(inputLoginEmail);
        clearElement(inputLoginEmail);
    }
    public void limparCampoLoginSenha(){
        click(inputLoginSenha);
        clearElement(inputLoginSenha);
    }

    public void escreverCampoLoginEmail(String email){
        limparCampoLoginEmail();
        sendKeys(inputLoginEmail,email);
    }

    public void escreverCampoLoginSenha(String senha){
        limparCampoLoginEmail();
        sendKeys(inputLoginSenha,senha);
    }

    public boolean statusEnlabledBtnSubmitLogin(){
        return element(btnSubmitLogin).isEnabled();
    }
    public void clicarBtnSubmitLogin(){
        click(btnSubmitLogin);
    }
    public boolean statusMensagemErro(){
        return checkElementDisplayStatus(alertErrorLogin);
    }
}
