// function print(mensagem){
//     console.log(mensagem)
//   }
   
//   print("Olá, bom dia")
   
// //  function soma(n1, n2){
// //   return n1 + n2
// //   }

// let soma = (n1, n2) => n1 + n2;
  
   
//   console.log(soma(10, 10))



// let bemVindo = () => 'Olá Mundo!';

// let dobro = numero => numero * 2;

// let soma = (a, b) => a + b;

// let horaAtual = () => {
// let data = new Date();

// return data.getHours() + ':' +

// data.getMinutes();
// }
// console.log(horaAtual());
// console.log(bemVindo());
// console.log(soma());




// CALLBACKS

//   Crie uma função acaoCarro(), que receberá uma callback como parâmetro.
//   Após isso, crie duas funções: andar() – deve exibir uma mensagem dizendo
//    que o carro está andando – e parar() – deve exibir uma mensagem dizendo que o carro parou.

// Execute ambas as ações utilizando a função acaoCarro(), passando suas ações como callbacks.


 function acaoCarro(callback) {
return callback();

    function andar() {
        console.log ('O carro está andando' )

    function parar() {
        console.log ('O carro está parado' );
   }

acaoCarro(andar);
acaoCarro(parar);

// andar()
// parar()



// function acaoCarro(callback) {
// //     return callback();
// }

// function andar() {
//     console.log('carro Andando');
// }

// function parar() {
//     console.log('carro parou');
}



// setTimeout( function(){
//     console.log('Olá Mundo!');
//    } , 1000);
//    setInterval


// function nomeCompleto(nome, sobrenome) {
//     return nome + ' ' + sobrenome;
//    };

//    console.log( nomeCompleto("Juliane", "Alves"));

//    function bomDia(nome,sobrenome,callback) {
//     return 'Olá '+callback(nome, sobrenome)
// }

//        console.log(bomDia("Anderson","Cardoso",nomeCompleto)) ;
  


//    function bomDia(nome, sobrenome, callback) {
//     return 'Olá, ' + callback(nome, sobrenome);
//    };
//    bomDia('Amanda', 'Ferreira', nomeCompleto)
//    // Olá, Amanda Ferreira