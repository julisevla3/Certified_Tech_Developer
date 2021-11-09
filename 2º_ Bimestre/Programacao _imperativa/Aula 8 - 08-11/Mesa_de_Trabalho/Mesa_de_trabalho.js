// Exercício“ Pode Subir”
// Objetivo
// Vamos determinar em que momento usar uma estrutura condicional.
// Microdesafios

// Em um parque de diversões nos pedem um programa para verificar se os passageiros da montanha - russa podem entrar no brinquedo.

// 1) Crie uma função podeSubir() que receba dois parâmetros:
//     -altura da pessoa; -
// se está acompanhada.

// Deve retornar um valor booleano(TRUE, FALSE) que indique se a pessoa pode subir ou não, baseado nas seguintes condições:
// a) A pessoa deve medir mais de 1.40 m e menos de 2 metros.
// b) Se a pessoa medir menos de 1.40 m, deverá ir acompanhada.
// c) Se a pessoa medir menos de 1.20 m, não poderá subir, nem acompanhada.

// 2) Modifique a função podeSubir(), de modo que ela exiba uma mensagem de autorização ou de impedimento no acesso ao brinquedo dependendo se a pessoa se enquadra ou não nas condições do exercício anterior.Por exemplo:
// a) Em caso de autorização, exiba a mensagem: “Acesso autorizado” ou“ Acesso autorizado somente com acompanhante”;
// b) Em caso de impedimento, exiba a mensagem: “Acesso negado.”


// function podesubir(altura, acompanhada) {
//     let podesubir = false;


//     if (altura > 1.40 || altura < 2); {

//         podesubir = true;
//         console.log("pode subir")
//     }
// }



//  else if (pessoa) {

// } else :{

function podesubir(altura, acompanhada) {
    let podesubir = false;
    // a) A pessoa deve medir mais de 1.40 m e menos de 2 metros.
    // b) Se a pessoa medir menos de 1.40 m, deverá ir acompanhada.
    // c) Se a pessoa medir menos de 1.20 m, não poderá subir, nem acompanhada.



    if (altura <= 1.40 && altura >= 1.20) {
        console.log("Devera ir acompanhada");
        if (acompanhada) {
            console.log('Esta acompanhada, pode subir')
            podesubir = true
        } else {

            console.log('nao esta acompanhada, nao pode subir')
        }
    } else if (altura >= 1.40 && altura <= 2.00) {
        console.log("Pode subir");
        podesubir = true
    }
    console.log(podesubir)
    return podesubir;
}
podesubir(1.40, false)