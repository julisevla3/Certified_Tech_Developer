// Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas.
//  Faça um programa que calcule e escreva:



// A maior e a menor altura do grupo;
function maiorAltura(pessoas) {
    pessoas.sort(function (a, b) {
        return b.altura - a.altura;
    });

    return pessoas[0].altura;
}

function menorAltura(pessoas) {
    pessoas.sort(function (a, b) {
        return a.altura - b.altura;
    });

    return pessoas[0].altura;
}

// A média de altura das mulheres;
function mediaMulheres(pessoas) {
    let quantidadeMulheres = 0;
    let somaAltura = 0;
    for (i = 0; i < pessoas.length; i++) {
        if (pessoas[i].sexo === "F") {
            somaAltura += pessoas[i].altura
            quantidadeMulheres++
        }
    }
    return somaAltura / quantidadeMulheres;

}

// O número de homens.
function quantidadeHomens(pessoas) {
    let quantidadeHomens = 0;
    let somaAltura = 0;
    for (i = 0; i < pessoas.length; i++) {
        if (pessoas[i].sexo === "M") {
            somaAltura += pessoas[i].altura
            quantidadeHomens++
        }
    }
    return quantidadeHomens;

}

const arquivos = [
    {
        "sexo": "F",
        "nome": "Abigael Natte",
        "altura": 1.61,
        "idade": 49,
        "opiniao": "3"

    },
    {

        "sexo": "M",
        "nome": "Ramon Connell",
        "altura": 1.75,
        "idade": 60,
        "opiniao": "3"
    },
    {

        "sexo": "M",
        "nome": "Jarret Lafuente",
        "altura": 1.55,
        "idade": 30,
        "opiniao": "3",

    },
    {

        "sexo": "F",
        "nome": "Ansel Ardley",
        "altura": 1.67,
        "idade": 35,
        "opiniao": "1"
    },
    {

        "sexo": "F",
        "nome": "Jacki Shurmer",
        "altura": 1.75,
        "idade": 30,
        "opiniao": "3"


    },
    {

        "sexo": "M",
        "nome": "Jobi Mawtus",
        "altura": 1.88,
        "idade": 25,
        "opiniao": "2"
    },
    {

        "sexo": "M",
        "nome": "Thomasin Latour",
        "altura": 1.67,
        "idade": 30,
        "opiniao": "1"
    },
    {

        "sexo": "F",
        "nome": "Lonnie Verheijden",
        "altura": 1.63,
        "idade": 45,
        "opiniao": "3"
    },
    {

        "sexo": "M",
        "nome": "Alonso Wannan",
        "altura": 1.92,
        "idade": 50,
        "opiniao": "1"
    },
    {
        "sexo": "F",
        "nome": "Bendite Huggett",
        "altura": 1.80,
        "opiniao": "1"
    }
]


// console.log(maiorAltura(arquivos));
// console.log(menorAltura(arquivos));
// console.log(mediaMulheres(arquivos));
// console.log(quantidadeHomens(arquivos));





// Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a 
// sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.
// Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:


// a média das idades das pessoas que responderam ótimo;

function mediaQuestionario(pessoas) {
    let quantidadeBom = 0;
    let somaBom = 0;



    for (i = 0; i < pessoas.length; i++) {
        if (pessoas[i].opiniao === "3") {
            somaBom += pessoas[i].idade
            quantidadeBom++

        }
    }
    return somaBom / quantidadeBom;

}

console.log(mediaQuestionario(arquivos));


// a quantidade de pessoas que responderam regular;

function quantidadeRegular(pessoas) {
    let quantidadeRegular = 0;
    for (i = 0; i < pessoas.length; i++) {
        if (pessoas[i].opiniao === "1") {

            quantidadeRegular++
        }
    }
    return quantidadeRegular;

}

console.log(quantidadeRegular(arquivos));



// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.

function porcentagemBom(pessoas) {
    let quantidadeBom = 0;
    let quantidadePessoas = 0;
    for (i = 0; i < pessoas.length; i++) {
        quantidadePessoas++

        if (pessoas[i].opiniao === "2") {
            quantidadeBom++
        }
    }
    return (quantidadeBom / quantidadePessoas) * 100;

}

console.log(porcentagemBom(arquivos) +"%");

