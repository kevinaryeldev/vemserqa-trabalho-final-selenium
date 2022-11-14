package br.com.aliexpress.pages;

import org.openqa.selenium.By;

public class ModalRegisterPage extends BasePage {
    private static final By mensagemConfirmacao =
            By.className("batman-verify-title");
    private static final By inputRegistroEmail =
            By.cssSelector("[label=\"Insira seu email\"]");

    private static final By inputRegistroSenha =
            By.cssSelector("[label=\"Senha\"]");

    private static final By btnSubmitRegistro =
            By.className("create-submit");

    private static final By mensagemErroRegistroEmail =
            By.className("fm-error-tip");

    public void limparCampoRegistroEmail(){
        click(inputRegistroEmail);
        clearElement(inputRegistroEmail);
    }

    public void escreverCampoRegistroEmail(String email){
        limparCampoRegistroEmail();
        sendKeys(inputRegistroEmail,email);
    }

    public void escreverCampoRegistroSenha(String senha){
        sendKeys(inputRegistroSenha,senha);
    }

    public boolean statusEnlabledBtnSubmitRegistro(){
        return checkElementIsEnable(btnSubmitRegistro);
    }

    public void clicarBtnSubmitRegistro(){
        click(btnSubmitRegistro);
    }

    public String pegarMensagemErroRegistro(){
        return getText(mensagemErroRegistroEmail);
    }

    public boolean checarContaCriada(){
        return checkElementDisplayStatus(mensagemConfirmacao);
    }
}
