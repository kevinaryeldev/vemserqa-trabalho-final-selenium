package br.com.aliexpress.steps;
import br.com.aliexpress.pages.SearchPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

public class FiltrarPrecoSteps {
    SearchPage searchPage = new SearchPage();
    @E("que digito um valor no campo preco minimo")
    public void digitarPrecoMinimo(){
        searchPage.inserirValorMinimo("50");
    }
    @Quando("clico OK")
    public void clicarBotaoOk(){
        searchPage.clicarBotaoOkCampoPreco();
    }
    @Entao("devo ver produtos com o valor superior ao digitado")
    public void checarValorPrimeiroItem() throws InterruptedException {
        Thread.sleep(5000);
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        System.out.println(valorInt);
        assertTrue(valorInt > 50);
    }
    @E("que digito um valor no campo preco maximo")
    public void digitarPrecoMaximo(){
        searchPage.inserirValorMaximo("150");
    }
    @Entao("devo ver produtos com o valor inferior ao digitado")
    public void verValorDoPrimeiroItem() throws InterruptedException {
        Thread.sleep(5000);
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        assertTrue(valorInt < 150);
    }
    @Entao("devo ver produtos com o valor superior ao minimo e inferior ao maximo")
    public void verValorDentroDoFiltro() {
        Thread.sleep(5000);
        String valorLido = searchPage.valorPrimeiroItem();
        int valorInt = parseInt(valorLido);
        if ((valorInt > 50) && (valorInt < 150)) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @E("que digito um valor menor que o anterior no campo preco maximo")
    public void valorMaximoIncorreto(){
        searchPage.inserirValorMaximo("40");
    }
    @Entao("os valores devem se ajustar corretamente")
    public void checarValoresAjuste() throws InterruptedException {
        Thread.sleep(5000);
        String valMin = searchPage.retornarValorMinimoFiltro();
        String valMax = searchPage.retornarValorMaximoFiltro();
        assertTrue(valMin.contains("40"));
        assertTrue(valMax.contains("50"));
    }
}
