#language:pt


#  @Test
Funcionalidade: Testes da barra de pesquisa
#  Contexto:
@whip
Cenario: Pesquisar item em todas as categorias
  Dado que estou na página do Aliexpress
  E que digito no campo pesquisa
  Quando clico no botão de lupa
  Entao devo ser redirecionado para a página contendo os itens filtrados

@whip
Cenario: Pesquisar item em categoria específica
  Dado que estou na página do Aliexpress
  E que digito no campo pesquisa
  E que seleciono uma categoria específica
  Quando clico no botão de lupa
  Entao devo ser redirecionado para a página da categoria contendo itens filtrados pela pesquisa

@whip
Cenario: Pesquisar palavra inválida em todas as categorias
  Dado que estou na página do Aliexpress
  E digito um texto inválido no campo de pesquisa
  Quando clico no botão de lupa
  Entao devo ver uma mensagem de erro de pesquisa

@whip
Cenario: Pesquisar palavra inválida em categoria específica
  Dado que estou na página do Aliexpress
  E digito um texto inválido no campo pesquisa
  E seleciono uma categoria escífica
  Quando clico no botão de lupa
  Entao devo ver uma mensagem de erro de pesquisa