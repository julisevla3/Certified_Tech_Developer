var x = 7 // Atribuição 

//console.log(x);


const y = 6; // Variavel que não pode ser alterado.

//console.log(y);

let z = 2; // EH O NOVO VAR
z = 3;

//let soma = x + y + z;
//console.log(soma);

//let subtracao = x - y - z;
//console.log(subtracao);


//let divisao = x / y / z;
//console.log(divisao);

//let multiplicacao = x * y * z;
//console.log(multiplicacao);   

// Para comentar um texto utilizar */ */
// CTRL + * 

let nome = "Juliane";
console.log(nome);
let idade = 31;
console.log(nome,idade);
console.log(nome + " - "+ idade);


/*Praticar o uso de operadores aritméticos

1) Em um novo arquivo chamado ex3.js, exiba na tela a soma de dois números.

2) Repita o processo anterior, mas utilizando outro operador.

3) Declare e atribua 2 variáveis ​​numéricas independentes. Exiba a soma de ambas na tela.

4) Atribua a soma das duas variáveis ​​anteriores a uma outra variável e exiba-a na tela.

5) Re-atribua à variável anterior "1" +1, e exiba na tela. (O que  aconteceu?)
 
6) Re-atribua "olá" + 23, e exiba na tela. (O que aconteceu?)

7) Crie mensagens concatenadas com valores diferentes.
   */


// Exercício:
// Um nutricionista enviou a seguinte tabela com os dados de seus clientes e, você será responsável por calcular o Índice de Massa Corporal de cada registro:

// Nome
// Sobrenome
// Idade
// Peso (KG)
// Altura
// Plano
// José
// da Silva
// 27
// 83.5
// 1.70
// Ouro
// Carlos
// de Souza
// 28
// 80.1
// 1.76
// Diamante
// Aline
// Ferreira
// 33
// 63.7
// 1.53
// Não Possui
// Ana
// Paula
// 26
// 55.0
// 1.62
// Prata


// Quais são as variáveis? Quais são as constantes? De que tipo são? Qual variável poderia armazenar o valor null segundo estes dados?

// O Índice de Massa Corporal (IMC) se calcula dividindo o peso pela altura2  (a altura deve estar em metros e o peso em quilogramas). 
//Por exemplo, no caso de Carlos de Souza, a altura ao quadrado é 3,09. 

// Você deverá criar 6 variáveis:
// Nome
// Idade
// Peso
// Altura
// Plano (só nos interessa saber se TEM ou NÃO TEM)
// Índice de Massa Corporal (IMC)


let nome, sobrenome, idade, peso,altura, imc, plano;
nome = "José";
sobrenome = "da Silva"
idade = 27; 
peso = 83.5;
altura = 1.70;

imc = peso /(altura * altura)
console.log(nome + "tem o imc de:" + imc)



let nome = "Carlos";
let sobrenome = "de Souza"
let idade = 28; 
let peso = 80.1;
let altura = 1.76;

imc = peso /(altura * altura)
console.log(nome + "tem o imc de:" + imc)




let nome = "Aline";
let sobrenome = "Ferreira"
let idade = 33; 
let peso = 63.7;
let altura = 1.53;

imc = peso /(altura * altura)
console.log(nome + "tem o imc de:" + imc)




let nome = "Ana";
let sobrenome = "Paula"
let idade = 26; 
let peso = 55.0;
let altura = 1.62;

imc = peso /(altura * altura)
console.log(nome + "tem o imc de:" + imc)