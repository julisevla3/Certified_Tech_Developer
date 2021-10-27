
// O que cada função retorna?
// Neste exercício, você terá que pensar sobre o que cada função retornará, sem executá-la no console.

function teste1 (x,y) {
    return y -x
}


console.log(teste1(10,40));

//Retorna 30

function teste2 (x,y) {
    return x * 2

    console.log(x)
    return x / 2
}

console.log(teste2(10))
// Só ira executaro X * 2, pois depois do primeiro return ele finaliza 



// Funções Simples

// Crie uma função que converta polegadas em centímetros. 
// Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.
function polegada(num){
    const conv = 2.54
    return num * conv
}
console.log(polegada(10));


// Crie uma função que receba uma string e a converta em um URL.
// ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"
function convString(texto){
       return "http://www." + texto + ".com.br"
}
console.log(convString("azul"));



// Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).

function string(texto){
    return texto + "!"
}

console.log(string ("Olá, seja bem vindo"));


// Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function idadecao(num){
    return num * 7
}

console.log(idadecao (10));


// Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
// PS: considere que você trabalhe 160 horas no mês.

function horatrabalho(num){
    return num * 30
}

console.log(horatrabalho (8));


// Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. Em seguida, execute a função, testando diferentes valores. 
// *IMC, significa Índice de Massa Corporal e é um parâmetro utilizado para saber se o peso está de acordo com a altura.

function imc(kilos,altura){
    altura=altura /100
    return Math.round (kilos/(altura*altura))
}

console.log(imc (64,160));


// Se chegarmos a este ponto, ficaremos muito satisfeitos. 
// Agora, deixamos alguns exercícios com uma dificuldade extra: você terá que buscar alguns conceitos extras para poder resolver estes exercícios. É uma prática que os programadores fazem todos os dias. Como sempre dizemos, uma parte importante do aprendizado em programação, é ignorar a complexidade e ir estritamente ao que precisamos, sabemos que não é uma prática fácil de fazer, mas com o tempo se tornará mais fácil e divertida.
// Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne. 
// Investigue o que o método de .toUpperCase() faz.


function maiusculas(texto){
      return maiusculas = texto.toUpperCase();
}
console.log(maiusculas("Você é uma vencedora!"))



// Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.
// Dica: Isso te ajudará a entender o que o operador typeof faz.

function tipodado(object){
    return typeof object;
}
console.log(tipodado("10"))
console.log(tipodado(10))
// Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.
// Dica: Investigue se o objeto Math tem entre suas propriedades o número Pi.


function raio(num){

return  comprimento = Math.round (2 * Math.PI * num );

}
console.log(raio(5));
