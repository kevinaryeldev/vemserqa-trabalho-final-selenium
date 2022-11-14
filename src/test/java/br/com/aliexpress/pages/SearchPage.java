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
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.popmode.ltr > span.next-input.next-small.min-price > input");

    private static final By valorMaximo =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.ltr > span:nth-child(3) > input");


    private static final By precoPrimeiroItem =
            By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[2]/div/div[2]/a[1]/div[2]/div[3]/span[2]");


    private static final By botaoOkPreco =
            By.cssSelector("span.price-input.popmode.ltr > a");

    @Step
    public void inserirValorMinimo(String valor) {
        click(campoPreco);
        click(valorMinimo);
        sendKeys(valorMinimo, valor);
    }
    @Step
    public void inserirValorMaximo(String valor) {
        click(campoPreco);
        click(valorMinimo);
        sendKeys(valorMinimo, valor);
    }

    @Step
    public void clicarBotaoOkCampoPreco(){
        click(botaoOkPreco);
    }

    @Step
    public String valorPrimeiroItem(){
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        return getElementValue(precoPrimeiroItem);
    }


}
