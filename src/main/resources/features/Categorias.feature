#language:pt


#  @Test
  Funcionalidade: Teste de categorias
  Contexto:
    @whip
    Cenario: Testar listar produtos de uma categoria
      Quando clico em qualquer link da barra de categorias
      Entao devo ser redirecionado para a página da categoria

   @whip
   Cenario: Testar entrar na subcategoria pelo menu inicial
     Dado que seguro o mouse em cima de qualquer link da barra de categoria
     Quando clico em qualquer subcategoria do menu
     Entao devo ser redirecionado para a página da subcategoria

   @whip
   Cenario: Testar entrar na segunda subcatergoria pelo menu inicial
     Dado que seguro o mouse em cima de qualquer link da barra de categoria
     Quando clico em qualquer segunda subcategoria do menu
     Entao devo ser redirecionado para a página da segunda subcategoria escolhida

   @whip
   Cenario: Testar navegar pelas subcategorias pela página da categoria
     Dado que seguro o mouse em cima de qualquer link da barra de categoria
     Quando clico em qualquer subcategoria dentro da página de categorias
     Entao devo ser redirecionado a subcategoria escolhida

