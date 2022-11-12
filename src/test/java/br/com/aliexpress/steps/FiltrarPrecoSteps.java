package br.com.aliexpress.steps;

import br.com.aliexpress.pages.ProductsPage;
import cucumber.api.java.gl.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class FiltrarPrecoSteps {
    ProductsPage productsPage = new ProductsPage();

    @Dado("que estou na página do Aliexpress")
    public void abrirPaginaProduto() {
        productsPage.browserUp("https://pt.aliexpress.com/wholesale?trafficChannel=main&d=y&CatId=0&SearchText=tablet&ltype=wholesale&SortType=default&minPrice=50&maxPrice=100&page=1");
    }

    String precoMin = "50";
    @E("que digito um valor mínimo no campo \"Preço mínimo\"")
    public void digitarPrecoMinimo(){
        productsPage.digitarPrecoMinimo(precoMin);
    }
    @Quando("clico OK")
    public void clicarOk() {
        productsPage.clicarOkBtn();
    }
    @Entao("devo ver produtos com o valor superior ao digitado")
    public boolean checarPrecoMinimo(){
        Integer precoRetornado = Integer.valueOf(productsPage.preco());
        Integer precoMinEsperado = Integer.valueOf(precoMin) ;
        if (precoRetornado > precoMinEsperado) {
            return true;
        }
        else {
            return false;
        }
    }


    @E("que digito um valor máximo no campo \"Preço máximo\"")
    public void digitarPrecoMaximo() {
        productsPage.digitarPrecoMaximo("150");
    }
    @Quando("clico OK")
    public void clicarBtnOk(){
        productsPage.clicarOkBtn();
    }
    @Entao("devo ver produtos com o valor inferior ao digitado")
    public void checarPrecoMaximo() {

    }

}
