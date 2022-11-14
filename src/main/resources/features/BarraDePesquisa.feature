##language:pt
#
#@Test
#Funcionalidade: Barra de Pesquisa
#
#  Contexto: O usuário deve poder pesquisar itens por palavras-chave, sendo redirecionado
#  para uma página com os resultados
#
#    @whip
#    Cenario: Validar pesquisa em todas categorias com texto valido
#      Dado que eu digite um texto valido no campo de pesquisa
#      Quando clico no botao de pesquisar
#      Entao devo estar na pagina de produtos filtrados pela pesquisa
#
#    @whip
#    Cenario: Validar pesquisa em todas categorias com texto invalido
#      Dado que eu digite um texto invalido no campo de pesquisa
#      Quando clico no botao de pesquisar
#      Entao devo estar na pagina de produtos filtrados pela pesquisa
#      E nenhum produto e mostrado
#
#    @whip
#    Cenario: Validar pesquisa em categoria especifica com texto valido
#      Dado que eu digite um texto valido no campo de pesquisa
#      E abro o dropdown de categoria
#      E seleciono uma categoria especifica
#      Quando clico no botao de pesquisar
#      Entao devo estar na pagina de produtos filtrados pela categoria e pela pesquisa
#
#    @whip
#    Cenario: Validar pesquisa em categoria especifica com texto invalido
#      Dado que eu digite um texto valido no campo de pesquisa
#      E abro o dropdown de categoria
#      E seleciono uma categoria especifica
#      Quando clico no botao de pesquisar
#      Entao devo estar na pagina de produtos filtrados pela categoria e pela pesquisa
#      E nenhum produto e mostrado