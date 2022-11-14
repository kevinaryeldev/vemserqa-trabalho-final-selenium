package br.com.aliexpress.steps;

import br.com.aliexpress.pages.ProductsPage;
import br.com.aliexpress.pages.SearchPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;

import static java.lang.Integer.parseInt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class FiltrarPrecoSteps {
    ProductsPage productsPage = new ProductsPage();
    SearchPage searchPage = new SearchPage();

    @E("que digito um valor mínimo no campo Preço mínimo")
    public void digitarPrecoMinimo(){
        searchPage.inserirValorMinimo("50");
    }
    @Quando("clico OK")
    public void clicarBotaoOk(){
        searchPage.clicarBotaoOkCampoPreco();
    }
    @Entao("devo ver produtos com o valor superior ao digitado")
    public void checarValorPrimeiroItem(){
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
       assertTrue(valorInt > 50);
    }


    @E("que digito um valor máximo no campo Preço máximo")
    public void digitarPrecoMaximo(){
        searchPage.inserirValorMaximo("150");
    }
    @Entao("devo ver produtos com o valor inferior ao digitado")
    public void verValorDoPrimeiroItem(){
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        assertTrue(valorInt < 150);
    }

    @Entao("devo ver produtos com o valor superior ao mínimo e inferior ao máximo")
    public void verValorDentroDoFiltro() {
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        if ((valorInt > 50) && (valorInt < 150)) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Entao("que digito um valor máximo no campo Preço máximo que seja inferior ao mínimo")
        public void valorMaximoIncorreto(){
        searchPage.inserirValorMaximo("40");
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        assertTrue(valorInt < 150);

        }


}
