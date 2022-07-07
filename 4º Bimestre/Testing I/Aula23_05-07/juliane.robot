*** Settings ***
Library             SeleniumLibrary
Resource            ./juliane.resource
Test Teardown       Close Browser
                   
          


*** Test Case ***
Processo de compra na loja Souce Demo
    Acessar o site
    Fazer login
    Adiconar um produto ao carrinho
    Acessar ao carrinho
    Clicar em 'Checkout' 
    Preencher informações do usuário
    Clicar no botao 'finish'






#     ${ADICIONAR_CARRINHO}       css=#add-to-cart-sauce-labs-backpack
# ${CARRINHO}                 css=#shopping_cart_container > a
# ${BOTAO_CHECKOUT}           css=#checkout
# ${CAMPO_NOME}               css=#first-name
# ${NOME}                     Tiago
# ${CAMPO_SOBRENOME}          css=#last-name
# ${SOBRENOME}                Gomes
# ${CAMPO_CEP}                css=#postal-code
# ${CEP}                      123456
# ${BOTAO_CONTINUE}           css=#continue


#   Click Element     ${ADICIONAR_CARRINHO}

# Acessar o carrinho
#   Click Element     ${CARRINHO}

# Clicar em 'Checkout'
#   Click Element     ${BOTAO_CHECKOUT}

# Preencher informações do usuário
#   Input Text        ${CAMPO_NOME}           ${NOME}
#   Input Text        ${CAMPO_SOBRENOME}      ${SOBRENOME}
#   Input Text        ${CAMPO_CEP}            ${CEP}
#   Click Element     ${BOTAO_CONTINUE}

