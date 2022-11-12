#language:pt

  @Test
  Funcionalidade: Login
    Contexto: O usuário deve fazer login após informar email e senha válidos
      @whip
      Cenario: Validar modal de login com campos vazios
      Dado que passe o mouse sobre o icone de conta
      E clico no botao de entrar
      Quando limpo os campos de email e senha
      Entao o botao de iniciar sessao esta desabilitado


      @whip
      Cenario: Validar modal de login preenchendo e removendo email e senha
      Dado que passe o mouse sobre o icone de conta
      E clico no botao de entrar
      E preencho email válido
      E preencho senha válida
      Quando  limpo os campos de email e senha
      Entao o botao de iniciar sessao esta desabilitado

      @whip
      Cenario: Validar login com email inválido e senha inválida
        Dado que passe o mouse sobre o icone de conta
        E clico no botao de entrar
        E preencho email inválido
        E preencho senha inválida
        Quando clico em iniciar sessao
        Entao devo receber uma mensagem de erro

      @whip
      Cenario: Validar login com email válido e senha inválida
        Dado que passe o mouse sobre o icone de conta
        E clico no botao entrar
        E preencho email válido
        E preencho senha inválida
        Quando clico em iniciar sessao
        Entao devo receber uma mensagem de erro

      @whip
      Cenario: Validar login com email válido e senha inválida
        Dado que passe o mouse sobre o icone de conta
        E clico no botao entrar
        E preencho email válido
        E preencho senha válida
        Quando clico em iniciar sessao
        Entao devo estar logado

