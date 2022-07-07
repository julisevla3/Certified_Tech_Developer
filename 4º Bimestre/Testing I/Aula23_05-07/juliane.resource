*** Variables ***
${SITE}                 https://www.saucedemo.com
${NAVEGADOR}            Chrome
${CAMPO_USUARIO}        css=#user-name
${USUARIO}              standard_user
${CAMPO_SENHA}          css=#password
${SENHA}                secret_sauce
${BOTAO_LOGIN}          css=#login-button  
${ADICONAR_CARRINHO}    css=#add-to-cart-sauce-labs-backpack
${ACESSAR_CARRINHO}     css=#shopping_cart_container > a 
${BOTAO_CHECKOUT}       css=#checkout
${CAMPO_NOME}           css=#first-name
${NOME}                 juliane
${CAMPO_SOBRENOME}      css=#last-name
${SOBRENOME}            Alves
${CAMPO_CEP}            css=#postal-code
${CEP}                  123456
${BOTAO_CONTINUE}       css=#continue
${BOTAO_FINISH}         css=#finish
${MENSAGEM_AGRADECIMENTO} THANK YOU FOR YOUR ORDER

*** Keywords ***
Acessar o site
    Open Browser        ${SITE}             ${NAVEGADOR}
    Maximize Browser Window


Fazer login

    Wait and Input Text         ${CAMPO_USUARIO}     ${USUARIO}
    Wait and Input Text          ${CAMPO_SENHA}       ${SENHA}
    Wait and Click        ${BOTAO_LOGIN} 




Fazer login Incorreto

    Wait and Input Text         ${CAMPO_USUARIO}     ${USUARIO}
    Wait and Input Text         ${CAMPO_SENHA}       ${SENHA}
    Wait and Click              ${BOTAO_LOGIN} 



Adiconar um produto ao carrinho
    Wait Until Elemnt is Visible   ${ADICONAR_CARRINHO} 
    Wait and Click                   ${ADICONAR_CARRINHO} 

Acessar ao carrinho

    Wait and Click         ${ACESSAR_CARRINHO} 

Clicar em 'Checkout'
    Wait and Click         ${BOTAO_CHECKOUT} 

Preencher informações do usuário
 speed 0.9
  Wait and Input Text              ${CAMPO_NOME}           ${NOME}
  Wait and Input Text              ${CAMPO_SOBRENOME}      ${SOBRENOME}
  Wait and Input Text              ${CAMPO_CEP}            ${CEP}
  Wait and Click            ${BOTAO_CONTINUE}


Clicar no botao 'finish'
    Wait and Click          ${BOTAO_FINISH}
    Page should Contaim     ${MENSAGEM_AGRADECIMENTO}


    ### Keywords Personalizadas ###

Wait and Click 
 [Arguments]                             ${ELEMENTO}    
  Wait Until Elemnt is Visible           ${ELEMENTO}   
  Click Element                          ${ELEMENTO}   

Wait and Input Text
 [Arguments]                             ${CAMPO}       ${TEXTO} 
 Wait Until Elemnt is Visible            ${CAMPO}        
 Input Text                              ${CAMPO}       ${TEXTO} 