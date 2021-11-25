function CLientes(numeroConta, tipoConta, saldo, titular ){
    this.numeroConta = numeroConta,
    this.tipoConta = tipoConta,
    this.saldo = saldo,
    this.titular = titular
}

let clientesArray = [];

clientesArray.push( new CLientes(5486273622,'Conta Corrente',27771,'Abigael Natte') )
clientesArray.push( new CLientes(1183971869,'Conta Poupança',8675,'Ramon Connell') )
clientesArray.push( new CLientes(9582019689,'Conta Poupança',27363,'Jarret Lafuente') )
clientesArray.push( new CLientes(1761924656,'Conta Poupança',32415,'Ansel Ardley') )
clientesArray.push( new CLientes(7401971607,'Conta Poupança',18789,'Jacki Shurmer') )
clientesArray.push( new CLientes(630841470,'Conta Corrente',28776,'Jobi Mawtus') )
clientesArray.push( new CLientes(4223508636,'Conta Corrente',2177,'Thomasin Latour') )
clientesArray.push( new CLientes(185979521,'Conta Poupança',25994,'Lonnie Verheijden') )
clientesArray.push( new CLientes(3151956165,'Conta Corrente',7601,'Alonso Wannan') )
clientesArray.push( new CLientes(2138105881,'Conta Poupança',33196,'Bendite Huggett') )


let Banco ={
    //5. Listar Pessoas
    pessoas: function(){
        return  clientesArray
    },
    //6. Consulta Cliente
    consultarCliente: function(nomePessoa){
        for (let index = 0; index < clientesArray.length; index++) {
            if (clientesArray[index].titular == nomePessoa) {
                return clientesArray[index]
            }else{
                 null
            }
        }
        console.log("não foi encontrado pessoa com o nome " + nomePessoa)
    },
    //7. Deposito
    depositar: function(titular, qtdDinheiro){
        for (let i = 0; i < clientesArray.length; i++) {
            if (clientesArray[i].titular == titular) {
                clientesArray[i].saldo += qtdDinheiro
                return 'Deposito efetuado com sucessor, o novo saldo agora é '+clientesArray[i].saldo + "R$"
                
            }
            
        }

        console.log("não foi encontrado pessoa com o nome " + nomePessoa)
    },
    //8.Saque
    saque: function(nome, valor){
        for (let i = 0; i < clientesArray.length; i++) {
            if (clientesArray[i].titular == nome && clientesArray[i].saldo - valor > 0) {
                clientesArray[i].saldo -= valor
                return 'Saque realizado com sucesso, seu novo saldo é '+clientesArray[i].saldo +'R$'
            }else{
                return "Fundos insuficientes"
            }
            
        }
        console.log("não foi encontrado pessoa com o nome " + nomePessoa)
    },
    //9. Extra Propriedade Única
    propriedadeUnica: function(arrayInserida, textoExtraido){
        let arrayResult = []
        for (let i = 0; i < arrayInserida.length; i++) {
                if (true) {
                    arrayResult.push(textoExtraido+': '+ arrayInserida[i][textoExtraido])
                }
        }
        return arrayResult
    }
}


//Execuções
console.log(Banco.consultarCliente("Ramon Connell"))
console.log(Banco.depositar("Ramon Connell",20000))
console.log(Banco.saque("Ansel Ardley",500000))

let arrayTeste = [{ nome: "Lean", idade: 27 }, { nome:"Eze", idade: 49}]
console.log(Banco.propriedadeUnica(clientesArray,'titular'))