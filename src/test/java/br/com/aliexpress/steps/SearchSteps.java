package br.com.aliexpress.steps;
import br.com.aliexpress.pages.SearchPage;
import cucumber.api.java.pt.Dado;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();
    @Dado("que estou na página de pesquisa de produtos")
    public void pesquisarUmProduto() {
        searchPage.irParaPagina("https://pt.aliexpress.com/wholesale?catId=0&initiative_id=AS_20221113160520&SearchText=smartwatch&spm=a2g0o.productlist.1000002.0");
    }
}
