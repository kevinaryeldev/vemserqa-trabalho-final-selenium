package br.com.aliexpress.steps;

import br.com.aliexpress.pages.ModalLoginPage;
import com.github.javafaker.Faker;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class ModalLoginSteps {
    Faker faker = new Faker();
    ModalLoginPage modalLogin = new ModalLoginPage();

    @E("preencho email válido")
    public void preencherEmailValido(){
        modalLogin.escreverCampoLoginEmail("kevinqatester@proton.me");
    }

    @E ("preencho senha válida")
    public void preencherSenhaValida(){
        modalLogin.escreverCampoLoginSenha("teste12345");
    }

    @E("preencho email inválido")
    public void preencherEmailInvalido(){
        modalLogin.escreverCampoLoginEmail(faker.internet().emailAddress());
    }

    @E("preencho senha inválida")
    public void preencherSenhaInvalida(){
        modalLogin.escreverCampoLoginSenha(faker
                .internet()
                .password(9,14,true));
    }

    @Quando ("nao preencho mais nada")
    public void naoPreencher(){
    }

    @Quando("clico em iniciar sessao")
    public void iniciarSessao(){
        modalLogin.clicarBtnSubmitLogin();
    }

    @Entao("o botao de iniciar sessao esta desabilitado")
    public void checarBtnLogin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(modalLogin.statusEnlabledBtnSubmitLogin());
    }

    @Entao("devo receber uma mensagem de erro")
    public void assertErrorMessageLogin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(modalLogin.statusMensagemErro());
    }
}
