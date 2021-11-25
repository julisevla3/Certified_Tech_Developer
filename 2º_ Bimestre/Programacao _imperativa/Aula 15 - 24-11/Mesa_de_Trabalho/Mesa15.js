/*
SEGUINDO A MESA DE TRABALHO DA AULA 13. DESENVOLVA ESSE ALGORITMO 
1 - CRIE UMA FUNÇÃO CONSTRUTORA PARA O OBJETO CONTA BANCARIA COM AS SEGUINTES PROPRIEDADES:

● Número da conta (somente números)
● Tipo de conta (conta corrente ou poupança em $)
● Saldo em $ (valor apenas)
● Titular da conta (nome completo)

2 - MOLDE AS INFORMAÇÕES DO ARQUIVO https://drive.google.com/file/d/16L2NejZU49mCLbo6RTmSKtuElOTOYUXv/view
PARA O FORMATO JSON, E EXPORTE ESSE JSON COMO MODULO


3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS 
OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 


4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO 
PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.


5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM
NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO
OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.


*/
const dados = require("./dados.js");
const dadosJSON = dados.dados

function ContaBancaria(numero, tipo, saldo, titular) {
    this.numero = numero;
    this.tipo = tipo;
    this.saldo = saldo;
    this.titular = titular;
}

let listaUsuarios = []
for (var i = 0; i < dadosJSON.length; i++) {
    listaUsuarios.push(new ContaBancaria(dadosJSON[i].numero, dadosJSON[i].tipo, dadosJSON[i].saldo, dadosJSON[i].titular))
}

console.log(listaUsuarios[0]) 

banco = {
    clientes: listaUsuarios,
    consultarCliente: function(titular) {
        for (var i = 0; i < listaUsuarios.length; i++) {
            if (listaUsuarios[i].titular === titular) {
                return listaUsuarios[i];
            }
        }
        return undefined;
    }
}

console.log(banco.consultarCliente('Anderson Cardoso'));









