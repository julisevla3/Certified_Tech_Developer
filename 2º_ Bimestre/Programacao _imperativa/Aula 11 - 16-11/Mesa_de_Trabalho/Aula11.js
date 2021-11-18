

// 1. Começamos a partir de nossa variedade de filmes, que tínhamos o seguinte:
// e nos pediram para passar todos os elementos para letras maiúsculas, o que
// na época tínhamos feito de forma &quot;manual&quot;. Vamos movê-lo para uma maneira mais
// automática usando loops.

let peliculas = [ "star wars", "totoro",  "rocky", "pulp fiction", "la vida es bella"]
let filmesAnimados = [ "wally", "princesa e o sapo",  "procurando nemo", "toy store", "la vida es bella"]

function convertirAMayusculas(array) {
    for(let i = 0; i < array.length; i++){
    array[i] = array[i].toUpperCase()
}

    return array  
       
}
console.log(convertirAMayusculas(peliculas));





// 2. Agora precisamos modificar afunção de passagem de elemento() que nos permite
// adicionar o conteúdo de nossa matriz de filme animado à matriz de filme
// original.
                                                 
function pasajeDeElementos(array1, array2) {
    let qtd = array2.length;
    for(let i = 0; i < array2.length; i++) {
        array1.push(array2.pop(). toUpperCase())
    }

    return array1
}
pasajeDeElementos(peliculas,filmesAnimados);


// 3. Para este ponto se você decidiu trabalhar em um arquivo diferente em lugar
// para modificar o anterior, lembre-se que tivemos um infiltrado dentro de
// nossos filmes de animação que tivemos que tirar e salvar em outra variável
// antes de fazer a passagem de elementos de um array para outro!


function pasajeDeElementos(array1, array2) {
    let invalido = array2.pop()
    let qtd = array2.length;

    for(let i = 0; i < qtd.length; i++) {
        array1.push(array2.pop(). toUpperCase());

        return array1

    }

}
console.log( pasajeDeElementos(peliculas,filmesAnimados));




// 4. Finalmente, devemos modificar nossa função comparadora para os filmes
// como temos feito até agora.

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];


function compararCalificaciones(asia, europa) {
      let comparacionesAsiaEuropa = [];

      for (let i = 0; < asia.length; i++) {
          comparacionesAsiaEuropa[i] = asia[i] === europa[i]

        
    }
      return comparacionesAsiaEuropa;
}
    


console.log(comparacionesAsiaEuropa ())




// Bônus extra

// Se você chegou aqui você é mais do que bom! Parabéns!
// Para que você não fique com o desejo ou que você possa continuar praticando se
// quiser, propomos esse outro exercício mais, tenha em mente que daqui os exercícios
// podem subir em dificuldade; como sempre dizemos, paciência, ignore a
// complexidade e tente resolvê-la com as ferramentas que você tem à sua disposição,
// você também pode procurar informações extras no google ou documentaciones que
// você conhece!!

// Concurso.
// Um cliente nos pede para fazer um aplicativo que possa determinar os vencedores de
// um concurso que foi realizado no fim de semana.
// Para isso, precisaremos seguir as seguintes instruções e informações para poder
// desenvolver nosso aplicativo.
// Cada participante tem 5 notas, dos quais suas pontuações individuais serão
// formadas, os participantes com suas respectivas pontuações são:
// ● Participante A: 5, 8, 4, 9, 5
// ● Participante B: 8, 7, 8, 6, 8

// 5

// ● Participante C: 7, 5, 10, 8, 3
// O concurso consiste em 2 modalidades de seleção para um vencedor:
// ● Melhor média (a maior pontuação média entre os concorrentes)
// ● Maior e-tip(a maior pontuação entre as 5 notas de cada participante)
// Com essas informações, nosso líder de Tecnologia nos pergunta o seguinte:
// 1. Determine qual seria a maneira ideal de representar cada participante com
// suas pontuações.

// 2. Crie uma função pontuacaoMedia à qual receba um participante por parâmetro
// e deve calcular e devolver a pontuação média dele.

// 3. Crie uma função pontuacaoMaior que receba um participante por parâmetro e
// deve calcular e devolver a pontuação mais alta que o participante tem.

// 4. Logo nosso líder tecnológico nos pede para criar essas duas funções geramos
// uma nova funcionalidade chamada competição que receberá os 3 participantes
// por parâmetros, e executará as duas funções criadas anteriormente para
// calcular as médias e pontuações mais altas de cada uma, e deve anunciar
// (mostrar pelo console) o vencedor de cada modalidade de pontuação.