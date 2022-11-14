package br.com.aliexpress.pages;

import io.qameta.allure.Step;

import org.openqa.selenium.By;



import java.util.concurrent.TimeUnit;


public class CarrinhoPage extends BasePage{

    public static final By primeiroItemListado =
            By.cssSelector("#root > div.cart-wrap > div.cart-body > div.cart-main > div.cart-list > div > div > div:nth-child(1) > div.cart-product-wrap > div > div.cart-product-info > div.cart-product-name > a");

    private static final By carrinhoVazio =
            By.cssSelector("div.cart-empty");

    private static final By botaoMais =
            By.cssSelector("span.comet-icon-add");


    private static final By quantidadeItens =
            By.cssSelector(".comet-input-number-input");

    private static final By removerItem =
            By.cssSelector(".comet-icon-delete");

    private static final By confirmarRemover =
            By.cssSelector("body > div:nth-child(36) > div.comet-modal-wrap > div > div.comet-modal-content.comet-modal-no-header > div.comet-modal-footer.comet-modal-footer-vertical > button.comet-btn.comet-btn-primary");




    @Step
    public String verPrimeiroItemListado() {
        String nomePrimeiroItem = getText(primeiroItemListado);
        return nomePrimeiroItem;
    }

    @Step
    public boolean checarCarrinhoVazio(){
        return checkElementDisplayStatus(carrinhoVazio);
    }

    @Step
    public void clicarBotaoMais(){
        click(botaoMais);
    }

    @Step
    public String checarQuantidadeItens() throws InterruptedException {
        Thread.sleep(3000);
        return element(quantidadeItens).getAttribute("value");
    }

    @Step
    public void removerItemCarrinho(){
        click(removerItem);
    }
    @Step
    public void confirmarRemocao(){
        click(confirmarRemover);
    }

}
