// Crie um array de números pares, e utilizando a 
// função .map() nesse array, crie um novo array com apenas números ímpares.

// Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

// Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.

// Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”


// Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.


// let numeroPares = [2,4,6];

// let numeroImpares = numeroPares.map(function (item) {
//     console.log(item);
//     return item +1 ;
// });
// console.log(numeroImpares);



// let numeroPares = [2,4,6];

// let numeroImpares = numeroPares.map(function (item) {
//     console.log(item);
//     return item +1 ;
// });
// console.log(numeroImpares);


let nome = ["Juliane","Maria","fernanda"]

let nomeMaria = nome.filter(function(callcack) {
      return callcack == 'Maria'
});

// console.log(nomeMaria);

let numeros = [1,2,4,5,6];

let numerosFormatado = numeros.reduce(function (acumulador,item) {
    return  acumulador + " - " + item  
})
// console.log(numerosFormatado)



let animais=["Cavalo","Cobra","Carneiro","Ovelha"]

animais.forEach(function (item) {
    console.log("O animal é NOME_DO_ANIMAL " + item)
    
// });
console.log(animais);

// Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce().
// Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())
// Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. (Analise qual método seria apropriado para este caso. Recomendamos que você consulte a documentação do MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)



