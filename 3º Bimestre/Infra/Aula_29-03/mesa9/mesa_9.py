# encoding:UTF-8
import random
from turtle import clear

userScore = 0
pcScore = 0
totalScore = 0

WinUser = 0
pcWin = 0


def percent():
    if totalScore > 0:
        x = ((totalScore - pcScore) / totalScore) * 100
        return x
    elif totalScore == 0:
            x = 0
            return x



while True:
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lagarto")
    print("5)Spock")
    print("6) Show Scores")
    print("6)Sair do Programa")
    opcao = int(input("O que você escolhe: "))

    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lagarto"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")
        continue

    print("Tua escolha: ", escolhaUsuario)
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lagarto"
    elif aleatorio == 4:
        escolhaPc = "spock"

    print("PC escolheu: ", escolhaPc)
    print("...")


    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Você ganhou, papel embrulha pedra" )
        winUser = 1
    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Ganhou, papel cobre pedra") 
        winUser = 1
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
        winUser = 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
        winUser = 1
    elif escolhaPc == "pedra" and escolhaUsuario == "spock":
        print("Ganhou, Spock vaporiza pedra")
        winUser = 1
    elif escolhaPc == "spock" and escolhaUsuario == "lagarto":
        print("Ganhou, Lagarto envenena Spock")
        winUser = 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "pedra":
        print("Ganhou, Pedra esmaga Lagarto")
        winUser = 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura decapita lagarto")
        winUser = 1
    elif escolhaPc == "papel" and escolhaUsuario == "lagarto":
        print("Ganhou, lagarto come papel")
        winUser = 1

    elif escolhaPc == "spock" and escolhaUsuario == "papel":
        print("Ganhou, papel refuta Spock")
        winUser = 1

    elif escolhaPc == "tesoura" and escolhaUsuario == "spock":
        print("Ganhou, Spock quebra tesoura")
        winUser = 1

    elif escolhaPc == "lagarto" and escolhaUsuario == "pedra":
        print("Ganhou, Pedra esmaga lagarto")
        winUser = 1


    if escolhaUsuario == "pedra" and escolhaPc == "papel":
        print("Perdeu, papel cobre pedra")
        pcWin = 1

    elif escolhaUsuario == "pedra" and escolhaPc == "spock":
        print("Perdeu, Spock vaporiza pedra")
        pcWin = 1

    elif escolhaUsuario == "papel" and escolhaPc == "tesoura":
        print("Perdeu, tesoura corta papel")
        pcWin = 1

    elif escolhaUsuario == "tesoura" and escolhaPc == "spock":
        print("Perdeu, Spock quebra tesoura")
        pcWin = 1

    elif escolhaUsuario == "Spock" and escolhaPc == " pedra":
        print("Perdeu, lagarto envenena spock")
        pcWin = 1
    elif escolhaUsuario == "Spock" and escolhaPc == " lagarto":
        print("Perdeu, lagarto envenena spock")
        pcWin = 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra":
        print("Perdeu, pedra amassa tesoura")
        pcWin = 1
    elif escolhaPc == escolhaUsuario:
        print("Empate")
        pcWin = 0
        WinUser = 0

    userScore = userScore + WinUser
    pcScore = pcScore + pcWin
    totalScore = userScore + pcScore
    print ("Pontuações: ")
    print ("Usuário: ", userScore)
    print ("Pc: ", pcScore)
    print ("Porcentagem de vitórias: ", percent(), "% " )
   
    again = input("Jogar novamente? s/n: ")
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")
