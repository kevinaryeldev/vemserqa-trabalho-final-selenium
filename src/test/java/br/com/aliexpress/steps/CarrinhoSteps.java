package br.com.aliexpress.steps;

import br.com.aliexpress.pages.CarrinhoPage;
import br.com.aliexpress.pages.ProductsPage;
import cucumber.api.java.gl.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.util.Objects;


public class CarrinhoSteps {
    ProductsPage productsPage = new ProductsPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Dado("que estou na página do produto")
    public void abrirPaginaProduto(){
        productsPage.irParaPagina("https://pt.aliexpress.com/item/32635855219.html?spm=a2g0o.productlist.0.0.19ec638e8DwVHb&pdp_ext_f=%7B%22sku_id%22%3A%2212000027512978006%22%7D&pdp_npi=2%40dis%21BRL%2192.17%2152.55%21%21%21%21%21%402101e9d316683043736975815e4e40%2112000027512978006%21sea&curPageLogUid=a2GlAmropovr");
    }
    @E("que adiciono itens ao carrinho")
    public void adicionarItemAoCarrinho() {
        productsPage.setBtnAdicionarCarrinho();
    }

    @Quando("clico no botão carrinho")
    public void clicarBotaoCarrinho() {
        productsPage.clicarBotaoCarrinho();
    }
    @Entao("devo ver o item listado")
    public boolean verItemListado(){
        if (!Objects.equals(carrinhoPage.verPrimeiroItemListado(), "")){
            return true;
        }
        else {
            return false;
        }
    }
}
