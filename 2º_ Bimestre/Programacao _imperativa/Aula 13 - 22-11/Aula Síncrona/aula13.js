let tenista = {
    nome: 'Juliane',

    sobrenome: 'Alves',

    saudacao: function() {return 'Olá, me chamo ' + this.nome; }

};

console.log(tenista.saudacao());

function Carro(marca, modelo){

    this.marca = marca;
    this.modelo = modelo;
    
};