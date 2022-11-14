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
        homePage.verificarFecharModalNewsletter();
        homePage.preencherCampoPesquisa(faker.color().name());
    }
    @Dado ("que eu digite um texto invalido no campo de pesquisa")
    public void digitarTextoInvalido(){
        homePage.verificarFecharModalNewsletter();
        homePage.preencherCampoPesquisa("jasljfasjdnhawhdioqjiqojwioqwjiojakjkjklajkljsioaj");
    }
    @Dado ("que seguro o mouse em cima de qualquer link da barra de categoria")
    public void hoverCategoriaListaLateral(){
        homePage.fecharPropagandaScrollar();
        homePage.hoverCategoriaListaLateral(faker.number().numberBetween(1,13));
    }
    @E("clico no botao de entrar")
    public void clickBtnAbrirModalLogin(){
        homePage.clicarBotaoAbrirModalLogin();
    }
    @E ("clico no botao de registrar")
    public void clickBtnAbrirModalRegistro(){
        homePage.clicarBotaoAbrirModalRegistro();
    }
    @E("abro o dropdown de categoria")
    public void abrirDropdowCategoriasPesquisa(){
        homePage.abrirDropdownPesquisa();
    }
    @E("seleciono uma categoria especifica")
    public void selecionarCategoria(){
        homePage.selecionarDropdownItemRetornarCatId(
                faker
                    .number()
                    .numberBetween(2,10)
        );
    }
    @Quando("clico em qualquer link da barra de categorias")
    public void selecionarCategoriaBarraLateral(){
        homePage.fecharPropagandaScrollar();
        homePage.clicarCategoriaListaLateral(faker.number().numberBetween(1,13));
    }
    @Quando("clico no botao de pesquisar")
    public void fazerPesquisa(){
        homePage.pesquisar();
    }
    @Quando ("clico em qualquer subcategoria do menu")
    public void clicarSubcategoria(){
        homePage.clicarSubcategoriaBarraLateral();
    }
    @Quando ("clico em qualquer segunda subcategoria do menu")
    public void clicarSegundaSubcategoria(){
        homePage.clicarSegundaSubcategoriaListaLateral();
    }
    @Entao("devo estar logado")
    public void checarLogin() throws InterruptedException {
        Thread.sleep(2000);
        homePage.retornarChecarLogin();
    }
}
