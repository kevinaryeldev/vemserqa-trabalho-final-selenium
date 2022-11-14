#language:pt

  @Test
  Funcionalidade: Testes do filtro de preco
  Contexto: Devem aparecer produtos apenas com preco entre o minimo e o maximo selecionado
    @whip
    Cenario: Testar filtrar elementos com valor mínimo
      Dado que estou na página de pesquisa de produtos
      E que digito um valor no campo preco minimo
      Quando clico OK
      Entao devo ver produtos com o valor superior ao digitado

    @whip
    Cenario: Testar filtrar elementos com valor máximo
      Dado que estou na página de pesquisa de produtos
      E que digito um valor no campo preco maximo
      Quando clico OK
      Entao devo ver produtos com o valor inferior ao digitado

    @whip
    Cenario: Testar filtrar elementos com valor mínimo e máximo
      Dado que estou na página de pesquisa de produtos
      E que digito um valor no campo preco minimo
      E que digito um valor no campo preco maximo
      Quando clico OK
      Entao devo ver produtos com o valor superior ao minimo e inferior ao maximo

    @whip
    Cenario: Testar filtrar elementos com o valor máximo inferior ao valor mínimo
      Dado que estou na página de pesquisa de produtos
      E que digito um valor no campo preco minimo
      E que digito um valor menor que o anterior no campo preco maximo
      Quando clico OK
      Entao os valores devem se ajustar corretamente