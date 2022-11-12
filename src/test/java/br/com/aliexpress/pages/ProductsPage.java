package br.com.aliexpress.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private static final By erroNenhumProdutoTexto =
            By.cssSelector(".query-help");
    public String retornarUrl(){
        return getPageUrl();
    }

    public boolean statusNenhumProdutoErro(){
        return checkElementDisplayStatus(erroNenhumProdutoTexto);
    }
}
