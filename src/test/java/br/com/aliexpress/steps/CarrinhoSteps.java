package br.com.aliexpress.steps;

import br.com.aliexpress.pages.CarrinhoPage;
import br.com.aliexpress.pages.ProductsPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import static br.com.aliexpress.utils.Browser.driver;

public class CarrinhoSteps {
    ProductsPage productsPage = new ProductsPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Dado("que estou na pagina do produto")
    public void abrirPaginaProduto(){
        productsPage.irParaPagina("https://pt.aliexpress.com/item/32635855219.html?spm=a2g0o.productlist.0.0.19ec638e8DwVHb&pdp_ext_f=%7B%22sku_id%22%3A%2212000027512978006%22%7D&pdp_npi=2%40dis%21BRL%2192.17%2152.55%21%21%21%21%21%402101e9d316683043736975815e4e40%2112000027512978006%21sea&curPageLogUid=a2GlAmropovr");
    }
    @E("que adiciono itens ao carrinho")
    public void adicionarItemAoCarrinho() {
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        productsPage.setBtnAdicionarCarrinho();

    }

    @E("vou para o carrinho")
    public void irParaCarrinho(){
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        productsPage.clicarBotaoCarrinho();
        try{
            carrinhoPage.checarCarrinhoVazio();
            abrirPaginaProduto();
            adicionarItemAoCarrinho();
            clicarBotaoCarrinho();
        }
        catch (Exception NoSuchElementException){}
    }
    @Quando("clico no botão carrinho")
    public void clicarBotaoCarrinho() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        productsPage.clicarBotaoCarrinho();
        try{
            carrinhoPage.checarCarrinhoVazio();
            abrirPaginaProduto();
            adicionarItemAoCarrinho();
            clicarBotaoCarrinho();
        }
        catch (Exception NoSuchElementException){}
    }
    @Entao("devo ver os itens adicionados")
    public boolean verItemListado(){
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        if (!Objects.equals(carrinhoPage.verPrimeiroItemListado(), "")){
            driver.manage().deleteAllCookies();
            return true;
        }
        else {
        driver.manage().deleteAllCookies();
            return false;
        }
    }

    @Dado("que não adiciono itens ao carrinho")
    public void naoAdicionarItens() {
    }
    @Quando("vou para a pagina carrinho")
    public void irParaPaginaCarrinho(){
        driver.get("https://www.aliexpress.com/p/shoppingcart/index.html");
    }
    @Entao("devo ver uma mensagem de carrinho vazio")
    public void verificaCarrinhoVazio() {
        Assert.assertTrue(carrinhoPage.checarCarrinhoVazio());
    }

    @Quando("clico no botão MAIS")
    public void clicarMais() {
        carrinhoPage.clicarBotaoMais();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    }
    @Entao("devo ver a quantidade de itens aumentar em 1")
    public void verQuantidadeItens() throws InterruptedException {
        String quantidade = carrinhoPage.checarQuantidadeItens();
        Assert.assertEquals(quantidade, "2");
    }
    @E("clico no botão REMOVER")
    public void removerItemDoCarrinho(){
        carrinhoPage.removerItemCarrinho();
    }
    @Quando("clico no botão 'confirmar'")
    public void confirmarRemoverItem(){
        carrinhoPage.confirmarRemocao();
    }

    @Entao("devo ver o item ser removido do carrinho")
    public void confirmarItemFoiRemovido() {
        carrinhoPage.checarCarrinhoVazio();
    }

}
