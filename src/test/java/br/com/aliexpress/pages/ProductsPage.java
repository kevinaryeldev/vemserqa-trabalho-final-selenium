package br.com.aliexpress.pages;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage{
    private static final By erroNenhumProdutoTexto =
            By.cssSelector(".query-help");
    public String retornarUrl(){
        return getPageUrl();
    }

    public boolean statusNenhumProdutoErro(){
        return checkElementDisplayStatus(erroNenhumProdutoTexto);
    }

    public void irParaPagina(String url){
//        driver.get(url);
        driver.navigate().to(url);
    }


    private static final By preco =
            By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > div > div.JIIxO > a:nth-child(1) > div._3GR-w > div.mGXnE._37W_B > span:nth-child(2)");
    private static final By btnAdicionarCarrinho =
            By.cssSelector("#root > div > div.product-main > div > div.product-info > div.product-action > span.addcart-wrap > button");

    private static final By botaoVerCarrinho =
            By.cssSelector("body > div.next-overlay-wrapper.opened > div.next-dialog.next-closeable.next-overlay-inner > div > div > div > div.addcart-result-action > a");




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
        click(botaoVerCarrinho);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }





}
