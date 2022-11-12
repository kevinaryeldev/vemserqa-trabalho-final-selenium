package br.com.aliexpress.steps;

import br.com.aliexpress.pages.HomePage;
import com.github.javafaker.Faker;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeSteps {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();

    @Dado("que passe o mouse sobre o icone de conta")
    public void hoverBtnConta(){
        homePage.hoverBotaoModalAccount();
    }
    @Dado("que eu digite um texto valido no campo de pesquisa")
    public void digitarTexto(){
        homePage.preencherCampoPesquisa(faker.color().name());
    }
    @E("clico no botao de entrar")
    public void clickBtnAbrirModalLogin(){
        homePage.clicarBotaoAbrirModalLogin();
    }
    @E("abro o dropdown de categoria")
    public void abrirDropdowCategoriasPesquisa(){
        homePage.verificarFecharModalNewsletter();
        homePage.abrirDropdownPesquisa();
    }
    @E("seleciono uma categoria especifica")
    public void selecionarCategoria(){
        homePage.selecionarDropdownItemRetornarCatId(
                faker
                    .number()
                    .numberBetween(2,20)
        );
    }

    @Quando("clico no botao de pesquisar")
    public void fazerPesquisa(){
        homePage.pesquisar();
    }

    @Entao("devo estar logado")
    public void checarLogin(){
        homePage.retornarChecarLogin();
    }


}
