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
    private static final By btnFecharPropagandaLateral =
            By.cssSelector(".close-btn");
    private static final By subCategoria =
            By.cssSelector(".cl-item-unfold>.sub-cate>.sub-cate-main>.sub-cate-content>.sub-cate-row>dl>dt");
    private static final By segundaSubCategoria =
            By.cssSelector(".cl-item-unfold>.sub-cate>.sub-cate-main>.sub-cate-content>.sub-cate-row>dl>dd>a");
    private By optionCategoria(int numero){
        return By.cssSelector("#search-dropdown-box>option:nth-child("+numero+")");
    }
    private By categoriaListItemSelector(int numero){
        return By.cssSelector(".categories-list-box>dl:nth-child("+numero+")>dt>span>a");
    }

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
    @Step
    public void abrirDropdownPesquisa(){
        moveToElementAndClick(dropdownPesquisa);
    }

    public void clicarSubcategoriaBarraLateral(){
        moveToElementAndClick(subCategoria);
    }

    @Step
    public void clicarSegundaSubcategoriaListaLateral(){
        moveToElementAndClick(segundaSubCategoria);
    }
    @Step
    public void fecharPropagandaScrollar(){
        click(btnFecharPropagandaLateral);
        scrollBy("200");
    }
    @Step
    public String selecionarDropdownItemRetornarCatId(int num){
        By optionCategoriaSelecionada = optionCategoria(num);
        String catId = getElementValue(optionCategoriaSelecionada);
        click(optionCategoriaSelecionada);
        return catId;
    }
    @Step
    public void clicarCategoriaListaLateral(int num){
        By categoriaSelecionada = categoriaListItemSelector(num);
        moveToElementAndClick(categoriaSelecionada);
    }
    @Step
    public void hoverCategoriaListaLateral(int num){
        By categoriaSelecionada = categoriaListItemSelector(num);
        moveToElement(categoriaSelecionada);
    }
    @Step
    public void pesquisar(){
        click(btnPesquisa);
    }
}
