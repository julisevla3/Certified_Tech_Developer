const { divisao } = require('../calc.js');

describe('Testes de divisão', () =>{

    test('divisão de dois numeros', () =>{
        expect(divisao(5,3)).toBe(15);
    })

 

});