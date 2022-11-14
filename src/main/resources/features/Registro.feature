#language:pt


  @Test
    Funcionalidade: Testes de registro
    Contexto: O usuario deve ser capaz de realizar um cadastro utilizando email e senha validas

      @whip
      Cenario: Testar registro com todos os campos válidos
        Dado que passe o mouse sobre o icone de conta
        E clico no botao de registrar
        E que preencho um email de registro valido
        E que preencho uma senha de registro valida
        Quando clico em no botao de criar conta
        Entao devo ver uma mensagem de conta criada

      @whip
      Cenario: Testar registro com email inválido e senha válida
        Dado que passe o mouse sobre o icone de conta
        E clico no botao de registrar
        E que preencho um email de registro invalido
        E que preencho uma senha de registro valida
        Quando clico em no botao de criar conta
        Entao devo ver uma mensagem de email invalido

      @whip
      Cenario: Testar registro com senha inválida e email válido
        Dado que passe o mouse sobre o icone de conta
        E clico no botao de registrar
        E que preencho um email de registro valido
        E que preencho uma senha de registro invalida
        Quando clico em no botao de criar conta
        Entao o botao deve estar desabilitado

      @whip
      Cenario: Testar registro com email já cadastrado
        Dado que passe o mouse sobre o icone de conta
        E clico no botao de registrar
        E que digito um email ja cadastrado
        E que preencho uma senha de registro valida
        Quando clico em no botao de criar conta
        Entao devo ver uma mensagem de email ja utilizado
