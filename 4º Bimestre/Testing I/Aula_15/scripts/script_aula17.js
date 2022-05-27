let quantidadeFormulario = document.getElementById('quantidadeFormulario');
let botaoPesquisar = document.getElementById('botaoPesquisar');
let exibeResultado = document.getElementById('exibeResultado');

botaoPesquisar.addEventListener('click', function (evento) {
    evento.preventDefault();

    if (quantidadeFormulario.value != "") {
        //Executar a busca a API...



        fetch(`https://dog.ceo/api/breeds/image/random3${quantidadeFormulario}`)
            .then(function (resultado) {

                if (resultado.status == 200) {
                    return resultado.jason();
                }

            })

            .then(function (resultado) {
                console.log(resultado)

                for (let img of resultado.message) {
                    let imgelemento = document.createElement('img');
                    imgelemento.src = img;
                    exibeResultado.appendChild(imgelemento)
                }

            })

            .catch(
                function (erro) {
                    console.log(erro)

                }
            )

    } else {
        alert("Você deve informar o número de imagens que deseja buscar")
    }
});

function atualizaPagina() {
    window.location.reload();


}

let loginUsuarioJson = JSON.stringify(loginUsuarioJson)

let configuer = {
    method: "POST",
    Headers:{
        "content-type": "aplication/json"
        "x-api-key": "dfdfg"

    }
     body: {
    "email": "string",
    "password": "string"
     }
    // JSON.stringify(data)
}

let endPointlogin = "/users/login"
fetch(endPointlogin, configuer)
.then(
resultado => {
    return resultado.json
    // console.log();
}
)

.then(resultado => {
    console.log(resultado);
}

)

.catch(
erro =>{
    console.log(error);
}
);