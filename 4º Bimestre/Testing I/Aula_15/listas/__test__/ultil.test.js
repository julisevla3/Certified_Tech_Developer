const { generateText } = require('../util');

describe('Validação de texto de saida', () => {
    test ('Saida de nome e idade', () =>{
        const text = generateText('Juliane Alves', 32)
        expect (text).toBe('Juliane Alves (32 anos)');


        
    })

})