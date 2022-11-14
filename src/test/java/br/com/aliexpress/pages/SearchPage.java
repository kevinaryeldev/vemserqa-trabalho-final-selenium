package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

public class SearchPage extends BasePage{
    public void irParaPagina(String url){
        driver.navigate().to(url);
    }
    private static final By campoPreco =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.ltr");
    private static final By valorMinimo =
            By.cssSelector(".min-price>input");

    private static final By valorMaximo =
            By.cssSelector(".price-input>span:nth-child(3)>input");
    private static final By precoPrimeiroItem =
            By.cssSelector(".product-container>div:nth-child(2)>a>div:nth-child(2)>div:nth-child(2)>span:nth-child(2)");
    private static final By botaoOkPreco =
            By.cssSelector("a.ui-button");

    @Step
    public void inserirValorMinimo(String valor) {
//        click(campoPreco);
        click(valorMinimo);
        sendKeys(valorMinimo, valor);
    }
    @Step
    public void inserirValorMaximo(String valor) {
//        click(campoPreco);
        click(valorMaximo);
        sendKeys(valorMaximo, valor);
    }

    @Step
    public void clicarBotaoOkCampoPreco(){
        click(botaoOkPreco);
    }

    @Step
    public String valorPrimeiroItem(){
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        return getText(precoPrimeiroItem);
    }

    @Step
    public String retornarValorMinimoFiltro(){
        return getElementValue(valorMinimo);
    }
    @Step
    public String retornarValorMaximoFiltro(){
        return getElementValue(valorMaximo);
    }
}
