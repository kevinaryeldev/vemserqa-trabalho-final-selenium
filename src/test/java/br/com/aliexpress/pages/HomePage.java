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

    private static final By inputPesquisa =
            By.id("search-key");

    private static final By dropdownPesquisa =
            By.cssSelector("#form-searchbar > div.searchbar-operate-box");
    private static final By btnPesquisa =
            By.className("search-button");

    private static final By btnFecharModalNewsletter =
            By.className("_24EHh");

    @Step
    public void hoverBotaoModalAccount(){
        moveToElement(btnModalAccount);
    }

    @Step
    public void verificarFecharModalNewsletter(){
        if (checkElementDisplayStatus(btnFecharModalNewsletter)){
            click(btnFecharModalNewsletter);
        }
    }
    @Step
    public void clicarBotaoAbrirModalLogin(){
        moveToElementAndClick(btnSignin);
    }
    @Step
    public boolean retornarChecarLogin(){
        return checkElementDisplayStatus(welcomeText);
    }
    @Step
    public void preencherCampoPesquisa(String text){
        sendKeys(inputPesquisa,text);
    }
    private By optionCategoria(int numero){
        return By.cssSelector("#search-dropdown-box>option:nth-child("+numero+")");
    }
    @Step
    public void abrirDropdownPesquisa(){
        moveToElementAndClick(dropdownPesquisa);
    }

    @Step
    public String selecionarDropdownItemRetornarCatId(int num){
        By optionCategoriaSelecionada = optionCategoria(num);
        String catId = getElementValue(optionCategoriaSelecionada);
        click(optionCategoriaSelecionada);
        return catId;
    }
    @Step
    public void pesquisar(){
        click(btnPesquisa);
    }
}
