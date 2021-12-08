const Aluno = require("./aluno.js");
const Curso = require("./curso.js");
const estudantes = require("./estudantes.js");

let alunos = [];
alunos.push(new Aluno("Juliane", 10, [7, 8, 9]));
// console.log(alunos);

// console.log(alunos[0].calcularMedia());

let curso = new Curso("nomeCurso", 7, 5, estudantes);
// curso.adicionaAluno("Juliane", 10, [7, 8, 9]); 
// console.log(curso);

// console.log(curso.ehAlunoAprovado(curso.alunos[0]));
console.log(curso.resultadoAlunos());
