##language:pt
#
#
#@Test
#Funcionalidade: Testes no carrinho
###  Contexto:
#@whip
#Cenario: Testar listar os itens do carrinho
#  Dado que estou na pagina do produto
#  E que adiciono itens ao carrinho
#  Quando clico no botão carrinho
#  Entao devo ver os itens adicionados
#
#@whip
#Cenario: Testar listar carrinho vazio
#  Dado que não adiciono itens ao carrinho
#  Quando vou para a pagina carrinho
#  Entao devo ver uma mensagem de carrinho vazio
#
#@whip
#Cenario: Testar Aumentar a quantidade de itens no carrinho
#  Dado que estou na pagina do produto
#  E que adiciono itens ao carrinho
#  E vou para o carrinho
#  Quando clico no botão MAIS
#  Entao devo ver a quantidade de itens aumentar em 1
#
#@whip
#Cenario: Testar remover itens do carrinho
#  Dado que estou na pagina do produto
#  E que adiciono itens ao carrinho
#  E vou para o carrinho
#  E clico no botão REMOVER
#  Quando clico no botão 'confirmar'
#  Entao devo ver o item ser removido do carrinho
