#language:pt


#  @Test
Funcionalidade: Testes do filtro de preco
#  Contexto:
@whip
Cenario: Testar filtrar elementos com valor mínimo
  Dado que estou na página de produtos do Aliexpress
  E que digito um valor mínimo no campo "Preço mínimo"
  Quando clico OK
  Entao devo ver produtos com o valor superior ao digitado

@whip
Cenario: Testar filtrar elementos com valor máximo
  Dado que estou na página de produtos do Aliexpress
  E que digito um valor máximo no campo "Preço máximo"
  Quando clico OK
  Entao devo ver produtos com o valor inferior ao digitado

@whip
Cenario: Testar filtrar elementos com valor mínimo e máximo
  Dado que estou na página de produtos do Aliexpress
  E que digito um valor mínimo no campo "Preço mínimo"
  E que digito um valor máximo no campo "Preço máximo"
  Quando clico OK
  Entao devo ver produtos com o valor superior ao mínimo e inferior ao máximo

@whip
Cenario: Testar filtrar elementos com o valor máximo inferior ao valor mínimo
  Dado que estou na página de produtos do Aliexpress
  E que digito um valor mínimo no campo "Preço mínimo"
  E que digito um valor máximo no campo "Preço máximo" que seja inferior ao mínimo
  Quando clico OK
  Entao devo ver uma mensgem de erro