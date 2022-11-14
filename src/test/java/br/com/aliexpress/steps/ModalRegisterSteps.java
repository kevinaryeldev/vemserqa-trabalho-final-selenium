package br.com.aliexpress.steps;
import br.com.aliexpress.pages.ModalRegisterPage;
import com.github.javafaker.Faker;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class ModalRegisterSteps {
    Faker faker = new Faker();
    ModalRegisterPage modalRegister = new ModalRegisterPage();

    @E("que preencho um email de registro invalido")
    public void preencherEmailInvalidoRegistro(){
        modalRegister.escreverCampoRegistroEmail(faker.name().firstName());
    }
    @E("que preencho um email de registro valido")
    public void preencherEmailValidoRegistro(){
        modalRegister.escreverCampoRegistroEmail(faker.internet().emailAddress());
    }
    @E ("que preencho uma senha de registro valida")
    public void preencherSenhaValidaRegistro(){
        modalRegister.escreverCampoRegistroSenha(faker.internet().password(6,15));
    }
    @E ("que preencho uma senha de registro invalida")
    public void preencherSenhaInvalidaRegistro(){
        modalRegister.escreverCampoRegistroSenha(faker.internet().password(1,5));
    }
    @E ("que digito um email ja cadastrado")
    public void preencgerEmailJaCadastrado(){
        modalRegister.escreverCampoRegistroEmail("kevinqatester@proton.me");
    }
    @Quando ("clico em no botao de criar conta")
    public void clicarBotaoRegistrar(){
        modalRegister.clicarBtnSubmitRegistro();
    }
    @Entao ("devo ver uma mensagem de conta criada")
    public void validarMensagemContaCriada(){

    }
    @Entao ("devo ver uma mensagem de email invalido")
    public void validarMensagemEmailInvalido(){
        String mensagem = modalRegister.pegarMensagemErroRegistro();
        Assert.assertTrue(mensagem.contains("email válido"));
    }
    @Entao ("o botao deve estar desabilitado")
    public void validarBotaoRegistroDesabilitado(){
        Assert.assertFalse(modalRegister.statusEnlabledBtnSubmitRegistro());
    }
    @Entao ("devo ver uma mensagem de email ja utilizado")
    public void validarMensagemEmailJaUtilizado(){
        String mensagem = modalRegister.pegarMensagemErroRegistro();
        Assert.assertTrue(mensagem.contains("e-mail já existe"));
    }
}
