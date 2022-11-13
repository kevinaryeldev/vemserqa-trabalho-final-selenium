#language:pt
#
#
#  @Test
Funcionalidade: Testes no carrinho
##  Contexto:
@whip
Cenario: Testar listar os itens do carrinho
  Dado que estou na página do produto
  E que adiciono itens ao carrinho
  Quando clico no botão carrinho
  Entao devo ver os itens adicionados

#@whip
#Cenario: Testar listar carrinho vazio
#  Dado que estou na página do aliexpress
#  E que não adiciono itens ao carrinho
#  Quando clico no botão carrinho
#  Entao devo ver uma mensagem de carrinho vazio
#
#@whip
#Cenario: Testar Aumentar a quantidade de itens no carrinho
#  Dado que estou na página do Aliexpress
#  E que adiciono itens ao carrinho
#  E clico no botão carrinho
#  E visualizo o item adicionado
#  Quando clicno no botão "+"
#  Entao devo ver a quantidade de itens aumentar em 1
#
#@whip
#Cenario: Testar diminuir a quantidade de itens no carrinho
#  Dado que estou na página do Aliexpress
#  E que adiciono itens ao carrinho
#  E clico no botão carrinho
#  E visualizo o item adicionado
#  Quando clico no botão "-"
#  Entao devo ver a quantidade de itens diminuir em 1
#
#@whip
#Cenario: Testar remover itens do carrinho
#  Dado que estou na página do Aliexpress
#  E que adiciono itens ao carrinho
#  E que clico no botão carrinho
#  E visualizo o item adicionado
#  E clico no botão 'remover'
#  Quando clico no botão 'confirmar'
#  Entao devo ver o item ser removido do carrinho
#
#@whip
#Cenario: Testar selecionar todos os itens do carrinho
#  Dado que estou na página do Aliexpress
#  E que adiciono ao menos 2 itens diferentes no carrinho
#  E clico no botão carrinho
#  E que visualizo todos os itens adicionados
#  Quando clico em "Selecionar todos os itens"
#  Entao devo ver todos os itens selecionados
