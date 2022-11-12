#language:pt


#  @Test
Funcionalidade: Testes de registro
#  Contexto:
@whip
Cenario: Testar registro com todos os campos válidos
  Dado que estou na página da Aliexpress
  E que sobreponho o mouse no botão "Minha conta"
  E que clico no botão "Registrar"
  E que preencho todos os campos corretamente
  Quando clico em "Criar a minha conta"
  Entao devo ver uma mensagem de conta criada

@whip
Cenario: Testar registro com email inválido e senha válida
  Dado que estou na página da Aliexpress
  E que sobreponho o mouse no botão "Minha conta"
  E que clico no botão "Registrar"
  E que preencho um email inválido
  E que preencho uma senha válida
  Quando clico em "Criar a minha conta"
  Entao devo ver uma mensagem de email inválido


@whip
Cenario: Testar registro com senha inválida e email válido
  Dado que estou na página da aliexpress
  E que sobreponho o mouse no botão "Minha conta"
  E que clico no botão "Registrar"
  E que um email válido
  E que preencho uma senha inválida
  Quando clico em "Criar a minha conta"
  Entao devo ver uma mensagem senha inválida

@whip
Cenario: Testar registro com email já cadastrado
  Dado que estou na página da aliexpress
  E que sobreponho o mouse no botão "Minha conta"
  E que clico no botão "Registrar"
  E que digito um email já cadastrado
  E que digito um senha válida
  Quando clico em "Criar a minha conta"
  Entao devo ver uma mensagem de email já utilizado

