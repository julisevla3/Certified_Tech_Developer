const { multiplicacao } = require('../calc.js');

describe('Testes de Multiplicação', () =>{

    test('Multiplicação de dois numeros', () =>{
        expect(multiplicacao(5,3)).toBe(1);
    })

 

});
