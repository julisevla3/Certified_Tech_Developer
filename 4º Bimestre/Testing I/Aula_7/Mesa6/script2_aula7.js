function atributoDinamico (){

let listaImgFelinos = document.querySelectorAll('img');

console.log(listaImgFelinos);

for (let img of listaImgFelinos){

    console.log(img.hasAttribute('teste'));

    let atributoPego = img.getAttribute('src')
    console.log(atributoPego)

    img.setAttribute("teste", "atributo de teste");

    console.log(img)

    img.removeAttribute('src');
}

    console.log()(listaImgFelinos[5].parentElement)

let cardFelino = listaImgFelinos[5].parentElement;

let a = document.createElement ('a');
a.innerHTML = "Clique aqui para ver mais infomrações"
a.setAttribute("target", "_blank")
a.setAttribute("href", "https://")
cardFelino.appendChild(a)

}



/* 
Passo a passo para executar o desafio - Aula 7
1 - Criar a opção de escolha do felino 
2 - Verificar qual foi a escolha
3 - Definir uma url da internet
4 - Alteram o atributo "src"
*/
