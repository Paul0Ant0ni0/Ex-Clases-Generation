import jdk.incubator.foreign.CLinker
import kotlinpack.Cliente
import java.lang.reflect.Constructor
import java.util.Objects

/*Cria uma Classe Cliente, contendo os atributos encapsulados,
um construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção,
com os atributos: nome (String), endereço (String), telefone (String),
listaDeCompras (mutableListOf<Strings>()).


A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
 Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

fun main() {

    try {
            var cliente = Cliente("ana", "pjdfisd", 0, "5252")
            print(" *** Seja bem vindo *** ")
            println("\n\n")

            println("\n=====================\n")

            //Cadastrar os dados do cliente
            println("Dados para cadastro do cliente")
            println("Digite o seu nome?")
            var nome = readln()
            println("Digite o seu cpf?")
            val cpf = readln()
            println("Digite a sua idade?")
            var idade = readln().toInt()

            cliente.cadastrar(nome, idade, cpf)

            println("\n=====================\n")

            //Cadastrar o usuário e senha
            println("Cadastrar um usuário e senha")
            println("Digite um usuário")
            val usua = readln()
            println("Digite uma senha")
            val sen = readln()

            cliente.cadUS(usua, sen)

            println("\n=====================\n")

            //Login e senha para acessar o sistema
            println("Bem vindo ao Covabra")
            println("Digite no seu login")
            val login = readln()
            println("Digite no seu login")
            val senha = readln()

            cliente.logar(login, senha)

            println("\n=====================\n")


    while(true) {
        //Acessando o sistema sistema
        print(" *** Seja bem vindo *** ")

                println ("O que você deseja fazer?")
                println ("Digite - 1 Adicionar item")
                println ("Digite - 2 Remover item(ns)")
                println ("Digite - 3 Listar item(ns)")
                println ("Digite - 4 Sair")
                print ("Digite aqui: ")
            var opc = readln().toInt()


            when (opc) {
                1 -> {
                    println("Informe o item que você deseja adicionar na lista?")
                    val itens = readln()
                    cliente.adicionar(itens)
                }
                2 -> {
                    println("Que intem você deseja remover na lista?")
                    val itens = readln()
                    cliente.remover(itens)
                }
                3 -> {
                    println("Os item(ns) na sua lista são")
                    cliente.listar()
                }
                4 -> break
                else ->{
                    println("Valor inválido")
                }
        }
    }

        } catch (e: Exception) {
            println(e.message)

        }
    }








