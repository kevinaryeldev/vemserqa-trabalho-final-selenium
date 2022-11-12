package br.com.aliexpress.steps;

import br.com.aliexpress.pages.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Dado("que passe o mouse sobre o icone de conta")
    public void hoverBtnConta(){
        homePage.hoverBotaoModalAccount();
    }

    @E("clico no botao de entrar")
    public void clickBtnAbrirModalLogin(){
        homePage.clicarBotaoAbrirModalLogin();
    }

    @Entao("devo estar logado")
    public void checarLogin(){
        homePage.retornarChecarLogin();
    }

}
