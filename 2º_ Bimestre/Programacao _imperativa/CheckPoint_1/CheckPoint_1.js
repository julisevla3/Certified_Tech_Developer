function microondas(comida, tempo) {
    let pipocaPadrao = 10;
    let macarraoPadrao = 8;
    let carnePadrao = 15;
    let feijaoPadrao = 12;
    let brigadeiroPadrao = 8;

    let mensagem;
    switch (comida) {
        case "pipoca":
            mensagem = exibeMensagem(tempo, pipocaPadrao);
            break;
        case "macarrao":
            mensagem = exibeMensagem(tempo, macarraoPadrao);
            break;
        case "carne":
            mensagem = exibeMensagem(tempo, carnePadrao);

            break;
        case "feijao":
            mensagem = exibeMensagem(tempo, feijaoPadrao);
            break;

        case "brigadeiro":
            mensagem = exibeMensagem(tempo, brigadeiroPadrao);
            break;
        default:
            mensagem = "Prato inexistente";
            break;
    }
    return mensagem;
}

function exibeMensagem(tempoUsuario, tempoPadrao) {
    let mensagem;
    if (tempoUsuario < tempoPadrao) {
        mensagem = "Tempo insuficiente";
    } else if (tempoUsuario >= tempoPadrao && tempoUsuario <= (tempoPadrao * 2)) {
        mensagem = "Prato pronto, bom apetite!!!";
    } else if (tempoUsuario > (tempoPadrao * 2) && tempoUsuario < (tempoPadrao * 3)) {
        mensagem = "Comida queimou";
    } else {
        mensagem = "kabumm!";
    }
    return mensagem;
}

console.log(microondas("macarrao", 30));