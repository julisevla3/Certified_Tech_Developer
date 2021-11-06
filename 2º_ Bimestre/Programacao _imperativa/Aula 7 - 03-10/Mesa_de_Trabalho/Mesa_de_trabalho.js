// Ex1. O que cada expressão retorna?
// Dê uma olhada nestes exemplos e pense sobre o que cada um retorna:
!true
!false
!!false
!!true
!1
!!1
!0
!!0
!!"" 
let x = 5 ;
let y = 9;
x < 10 && x!==5
x>9 || x===5
!(x===y)


// Ex2. O que cada expressão retorna?
// Sem testar no console, o que você acha que cada uma destas expressões irá retornar? Elas são true ou false?

let x=10
let y ="a"
y==="b" || x >= 10

//  True

let x=3
let y=8
!(x == "3" || x === y) && !(y !== 8 && x <= y)

//True

let str = ""
let msg = "haha!"
let eBonito = "false"
!((str || msg) && eBonito)

// False
