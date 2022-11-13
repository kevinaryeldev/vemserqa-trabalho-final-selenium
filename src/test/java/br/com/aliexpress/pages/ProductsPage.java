package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    public void irParaPagina(String url){
        driver.get(url);
        //driver.navigate().to(url);
    }


    private static final By precoMinCampo =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.popmode.ltr > span.next-input.next-small.min-price > input");

    private static final By precoMaxCampo =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.popmode.ltr > span:nth-child(3) > input");

    private static final By botaoOk =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.top-container > div.top-refine > div.first > span.price-input.popmode.ltr > a");

    private static final By preco =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.JIIxO > a:nth-child(1) > div._3GR-w > div.mGXnE._37W_B > span:nth-child(2)");
    private static final By btnAdicionarCarrinho =
            By.cssSelector("#root > div > div.product-main > div > div.product-info > div.product-action > span.addcart-wrap > button");

    private static final By botaoCarrinho =
            By.cssSelector("#header > div > div.hm-right > div > div > a > i");



    @Step
    public void digitarPrecoMinimo(String precoMin) {
        sendKeys(precoMinCampo, precoMin);
    }

    @Step
    public void digitarPrecoMaximo(String precoMax){
        sendKeys(precoMaxCampo, precoMax);
    }
    @Step
    public void clicarOkBtn() {
        click(botaoOk);
    }

    @Step
    public String preco(){
        return preco();
    }

    @Step
    public void setBtnAdicionarCarrinho() {
        click(btnAdicionarCarrinho);
    }
    @Step
    public void clicarBotaoCarrinho(){
        click(botaoCarrinho);
    }



}
