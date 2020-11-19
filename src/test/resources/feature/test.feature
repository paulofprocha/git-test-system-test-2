@testeEspecializacao
Feature: Funcionalidade de pesquisar uma especialização no site do Cesar School

  Background:
  Given É necessário que o usuário esteja na páginda inical do Cesar School

  Scenario: Esse é o test accessPageEspecializacao
  Then ele clica em saiba mais
  #Esse é o test validatePageEspecializacao
  Given que o usuário vai clicar no campo de pesquisa
  Then o usuário vai digitar a especialização desejada
  Then ele vai clicar no botão de pesquisar
  Then ele vai clicar na especialização resultante da pesquisa
  Then ele vai verificar se a página está de acordo com que ele procura

