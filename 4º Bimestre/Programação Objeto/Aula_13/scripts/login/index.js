let campoEmaillogin = document.getElementById('inputEmail')
let inputSenhaLogin = document.getElementById('inputPassword')
let botaoAcessar = document.getElementById('botaoAcessar')

botaoAcessar.addEventListener('click', function(evento){
if (campoEmaillogin.value != "" && inputSenhaLogin != ""){
    console.log("Campos Ok");
} else{
    alert("Ambos os campos devem ser informados")
    evento.preventDefault()
}

})