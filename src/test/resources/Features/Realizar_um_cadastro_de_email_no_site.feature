#language: pt
#Autor: joao.luca@osite.com.br
@web
Funcionalidade: Cadastro de email no site

  Cenario: Realizar um cadstro com envio de email
    Dado que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"
    Quando eu realizar o preenchimento dos formularios
    E seleciono o preco
    E efetuo o envio das informacoes
    Entao eu recebo a mensagem "Sending e-mail success!"
