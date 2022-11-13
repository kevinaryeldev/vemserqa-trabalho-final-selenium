package br.com.aliexpress.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static br.com.aliexpress.utils.Browser.driver;

public class CarrinhoPage extends BasePage{
    public void irParaPagina(String url){
        driver.get(url);
    }

    private static final By primeiroItemListado =
            By.cssSelector("#root > div.cart-wrap > div.cart-body > div.cart-main > div.cart-list > div > div > div:nth-child(1) > div.cart-product-wrap > div > div.cart-product-info > div.cart-product-name > a");


    @Step
    public String verPrimeiroItemListado() {
        String nomePrimeiroItem = getText(primeiroItemListado);
        return nomePrimeiroItem;
    }
}
