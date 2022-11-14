package br.com.aliexpress.steps;
import br.com.aliexpress.pages.ProductsPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class ProductsSteps {
    ProductsPage products = new ProductsPage();

    @Entao("devo estar na pagina de produtos filtrados pela pesquisa")
    public void checarEstarNaPaginaComPesquisa(){
        Assert.assertTrue(products.retornarUrl().contains("SearchText"));
    }

    @Entao("devo estar na pagina de produtos filtrados pela categoria e pela pesquisa")
    public void checarEstarNaPaginaComCategoriaEPesquisa(){
        Assert.assertTrue(products.retornarUrl().contains("catId"));
        Assert.assertTrue(products.retornarUrl().contains("SearchText"));
    }

    @Entao ("devo ser redirecionado para a página da categoria")
    public void checarEstarNaPaginaComCategoria() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(products.retornarUrl().contains("category"));
    }
    @Entao ("devo ser redirecionado para a página da subcategoria")
    public void checarEstarNaPaginaComSubcategoria() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(products.retornarUrl().contains("category"));
    }
    @Entao("devo ser redirecionado para a página da segunda subcategoria escolhida")
    public void checarEstarNaPaginaDaSegundaSubcategoria() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(products.retornarUrl().contains("category"));
    }
    @E("nenhum produto e mostrado")
    public void checarMensagemErro(){
        Assert.assertTrue(products.statusNenhumProdutoErro());
    }
}
