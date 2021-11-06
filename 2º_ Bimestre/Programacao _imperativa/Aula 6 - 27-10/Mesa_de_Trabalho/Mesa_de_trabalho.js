// Crie um arquivo calculadora.js que terá as diferentes operações  para realizar.
// Crie uma função adicionar, que deverá receber dois parâmetros e retornar a soma deles.

function somar (a,b){
    return (a+b)
}
console.log(somar (10,40))
// Crie uma função de subtração, que deverá receber dois parâmetros e retornar a subtração do primeiro menos o segundo.


function subtracao (a,b){
    return (a-b)
}
console.log(subtracao (10,40))

// Crie uma função de multiplicação, que deverá receber dois parâmetros e retornar o resultado de sua multiplicação.


function multiplicacao (a,b){
    return (a*b)
}
console.log(multiplicacao (10,40))

// Crie uma função de divisão, que receberá dois parâmetros e retornará o resultado da divisão do primeiro sobre o segundo.


function divisao (a,b){
    return (a/b)
}
console.log(divisao (10,40))

// Calculadora - Nível II
// Após passar o Nível I, adicionamos um pouco mais de dificuldade para testarmos nossas funções.
// No seu arquivo calculadora.js,  a partir das 4 funções feitas anteriormente, crie um console.log no qual você irá colocar uma string para indicar que abaixo dela você começará a testar as funções, por exemplo:
console.log ("-------------- Teste de Operações / Calculadora --------------")
console.log(soma (10,40))


// Execute a função que soma e a função que subtrai, passando quaisquer dois números como argumentos. Mostrar resultados no console.
console(somar(10,2), " ", subtracao(10,50))

// Execute a função que multiplica, passando quaisquer dois números como argumentos. Mostre o resultado no console.
console(multiplicacao(10,2))

// Execute a função que faz divisão, passando quaisquer dois números como argumentos. Mostre o resultado no console.

console(divisao(10,2))

// Execute a função que faz divisão, passando agora o número zero como um dos dois argumentos. Mostre o resultado no console.

console(divisao(10,0))

// Agora no ponto 5, vimos que éramos obrigados a executar a função de divisão, mas forçá-la causaria um erro. Não se preocupe! A ideia é se familiarizar com isso ao longo de sua carreira de programador e durante o processo de treinamento você vai encontrar erros,  então propomos aprender a lidar com essa frustração da maneira mais produtiva possível. Continue com determinação e siga em frente!



// Calculadora - Nível III - Funções Extras
// Se chegamos até aqui, podemos ficar tranquilos em relação ao que fizemos. 
// A partir deste momento, desenvolveremos funções extras para nossa Calculadora, a partir das funções que já criamos e efetuaremos testes após desenvolver cada uma  função.
// Crie uma função chamada quadradoDoNumero, que recebe um número como parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja, ao quadrado.

function quadrado(x){
    return (multiplicacao (x,x))
}
console.log(quadrado(7))

// Importante: quadradoDoNumero() deve usar a função multiplicação() para calcular o quadrado do parâmetro inserido em power().
// Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números, que serão inseridos por parâmetro.
// Importante: Em mediaDeTresNumeros() você precisará usar algumas funções criadas anteriormente em nossa calculadora.


function media(a,b,c){
    return (divisao((somar (a,b) + c),3))
}
console.log(media(10,5,9))


// Crie a função calculaPorcentagem, que receberá dois parâmetros: o número total e a porcentagem que deseja calcular, e que deverá retornar x% de totalPorcentagem.
// Exemplo: calculaPorcentagem(300, 15)  (deve retornar 45, pois é 15% de 300). 
// Importante: calculaPorcentagem() você precisará usar algumas funções criadas anteriormente em nossa calculadora.

function porcentagem(total,porcent){
    return (multiplicacao((divisao(porcent,100)), total)
}
console.log(porcentagem(300,5))

// Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá retornar a porcentagem do primeiro em relação ao segundo parâmetro.
// Exemplo: geradorDePorcentagem (2, 200) (deve retornar 1 já que 2 é 1% de 200).

function porcentagem2(x,y){
    return divisao(multiplicacao(x,100)),y)
}
console.log(porcentagem2(2,200))

// Parabéns, conseguimos aplicar e entender conceitos que vão nos servir ao longo de nossa carreira, agora temos que pensar em melhorias para nossa Calculadora com o conhecimento que iremos adquirir no futuro.
