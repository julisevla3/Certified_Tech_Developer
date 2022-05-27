let nomeUsuario = "paulo";
// console.log("Olá, usuarrio " + nomeUsuario);
console.log(`Olá, usuarrio  ${ nomeUsuario}`);

function nomeUsuarioExibe(){
    return nomeUsuario;
}

let h1 = document.querySelector('h1');
console.log(h1.childNodes[0].data)


let body = document.querySelector('body');

body.style.backgroundColor = "#888E690";
h1.style.color = "#5422ca";
h1.style.textAlign = "center";

let listaElementosli = document.querySelectorAll('li');
console.log(listaElementosli);

listaElementosli.forEach(li => {
    console.log(li.innerHTML)
    li.
});

listaElementosli.forEach(li => {
    li.classList.add('novo-li')
)};

listaElementosli[3].classList.remove('novo-li')