let validacao = false;

let minhaPromisse = new Promisse(function (resolve, reject) {

    setTimeout() => {
        if (validacao) {
            resolve("Promisse ok");
    
            }else {
                reject("Promisse não ok")
            }
        
    }, 4000);

    

})

minhaPromisse.then(
    function (resultado) {
        console.log(resultado);
    }
).catch(
    Function(erro){
    console.log(erro);
 }
)
