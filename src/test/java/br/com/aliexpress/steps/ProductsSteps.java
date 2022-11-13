package br.com.aliexpress.steps;

import br.com.aliexpress.pages.ProductsPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class ProductsSteps {
    ProductsPage products = new ProductsPage();

    @Entao("devo estar na pagina de produtos filtrados pela pesquisa")
    public void checarEstarNaPagina(){
        Assert.assertTrue(products.retornarUrl().contains("SearchText"));
    }
    @Entao("devo estar na pagina de produtos filtrados pela categoria e pela pesquisa")
    public void checarEstarNaPaginaComCategoria(){
        Assert.assertTrue(products.retornarUrl().contains("catId"));
    }

    @E("nenhum produto e mostrado")
    public void checarMensagemErro(){
        Assert.assertTrue(products.statusNenhumProdutoErro());
    }
}
