// Em um parque de diversões nos pedem um programa para verificar se os passageiros da montanha-russa podem entrar no brinquedo.

// 1)	Crie uma função podeSubir() que receba dois parâmetros: 
// -	altura da pessoa;
// -	se está acompanhada.

// Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode subir ou não, baseado nas seguintes condições:
// a)	A pessoa deve medir mais de 1.40m e menos de 2 metros.
// b)	Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
// c)	Se a pessoa medir menos de 1.20m, não poderá subir, nem acompanhada.

// 2)	Modifique a função podeSubir(), de modo que ela exiba uma mensagem de autorização ou de impedimento no acesso ao brinquedo dependendo se a pessoa se enquadra ou não nas condições do exercício anterior. Por exemplo:
// a)	Em caso de autorização, exiba a mensagem: “Acesso autorizado” ou “Acesso autorizado somente com acompanhante”;
// b)	Em caso de impedimento, exiba a mensagem: “Acesso negado.”


function podeSubir (altura, acompanhada){
    return false;
}

let altura = " "
let acompanhada = true

let mensagem;

switch (altura){
    case "altura":
        mensagem = exibeMensagem (altura,acompanhada );
        break;


    }

    function exibeMensagem(alturaPessoa, acompanhadaPessoa){
        let mensagem;
    }
        if (alturaPessoa >= 1.40 ||  alturaPessoa <= 2){
            mensagem = "Acesso autorizado"
        }
    else if (alturaPessoa >= 1.20 && alturaPessoa <= 1.40 ){
    mensagem = "Deverá ir acompanhada";
}

    else if (alturaPessoa > 1.20 ){
    mensagem = "Não poderá subir, nem acompanhada."
}


console.log(podeSubir(1.40, true));