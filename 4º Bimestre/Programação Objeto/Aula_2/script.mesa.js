let jogada;
let pontosJogador = 0;
let pontosComputador = 0;
const array = [0,1,2]
while (jogada < 3){
    jogada++
    var jogador = parseInt(prompt("Escolha uma opção: 0: Pedra, 1: Pedra ou 2: Tesoura"));
    var computador = array[Math.floor(Math.random() * 2) + 1];
    console.log("Computador :" + computador);
    console.log("Jogador :" + jogador);
    switch (jogador) { 
        case 0:
            if (computador = 2) {
                alert("Computador Ganhou");
                pontosJogador++;

            } else if ("computador ganhou!" = 1){
                alert("Computador Ganhou");
                pontosComputador++;
            } else {
                alert("Empate!");
            }
            break

            case 1:
                if (computador = 0) {
                    alert("Computador Ganhou");
                    pontosJogador++;
    
                } else if ("computador ganhou!" = 2){
                    alert("Computador Ganhou");
                    pontosComputador++;
                } else {
                    alert("Empate!");
                }
                break

                case 2:
                    if (computador = 1) {
                        alert("Jogador Ganhou");
                        pontosJogador++;
        
                    } else if ("computador ganhou!" = 0){
                        alert("Computador Ganhou");
                        pontosComputador++;
                    } else {
                        alert("Empate!");
                    }
                    break


        }
}
                alert("Jogador: " + pontosJogador + " Computador: " + pontosComputador);
                if (pontosJogador > pontosComputador) {
                    alert("Jogador Ganhou!");

                }
                
                if (pontosJogador < pontosComputador) {
                    alert("Computador Ganhou!");
                    
                }
                if (pontosJogador = pontosComputador) {
                    alert("Empate")
                }   
