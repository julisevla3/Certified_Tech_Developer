// let body =document.querySelector('body');
//     body.style.background = "black"


// // Criar elemento
// let titulo = document.createElement('titulo');
// titulo.innerText = "Formulario"
// titulo.style.color = "#FFF"
// titulo.style.fontSize = "28px"
// titulo.style.fontWeight = "500"



let body = document.querySelector('body')
body.style.background = "black"


let titulo = document.createElement('titulo')
titulo.innertext = "formulario"
titulo.style.color = "#fff"
titulo.style.fontSize = "30px"




let p = document.createElement('p');

// Criar o nó de texto
let texto = document.createTextNode("Insira o seu nome")


//@@ Buscar elemento pai
let elemento_pai = document.body;



// Inserir (anexar) o elemento filho (titulo) ao elemento pai (body)
elemento_pai.appendChild(titulo);
// Anexar o nó de texto ao elemento h1
titulo.appendChild(texto);








