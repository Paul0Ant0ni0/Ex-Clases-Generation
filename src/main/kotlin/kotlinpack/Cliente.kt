package kotlinpack

data class Cliente (private var nome: String, var email:String, private var idade:Int, private var cpf: String){

    init {
        if(nome == ""){
            throw Exception("Precisa adicionar um nome para inicializar o sistema!!")
        }else{
            println("Seja Bem vindo")
        }
    }
    private var usuario = ""
    private var senha = ""
    private var telefone = ""
    private var endereco =""
    private var listaDeCompras = mutableListOf<String>()

        constructor(nome: String, email: String, idade: Int, cpf: String, usuario:String
                    )
                    :this(nome, email, idade, cpf){
                    this.usuario = usuario

        }
        constructor(nome: String, email: String, idade: Int, cpf: String, usuario:String, senha: String)
                    :this(nome, email, idade, cpf, usuario){
                    this.senha = senha
        }

        constructor(nome: String, email: String, idade: Int, cpf: String, usuario:String, senha: String,
                    telefone: String)
                    :this(nome, email, idade, cpf, usuario, senha){
                    this.telefone = telefone
        }


        constructor(nome: String, email: String, idade: Int, cpf: String, usuario:String, senha: String,
                    telefone: String, endereco: String)
                    :this(nome, email, idade, cpf, usuario, senha){
                    this.endereco = endereco
        }






    //Cadastro do cliente para acessar o sistema
    fun cadastrar(name: String, age: Int, cadpf: String){
        if (age in 15..95){
            idade = age
        }else{
            println("Idade inválida")
        }

        if (cadpf.length ==12){
            cpf = cadpf
        }else{
            println("Cpf inválida")
        }

        if(name != "" && name.length <= 15){
            nome = name
        }else{
            println("Dados inválidos inválido")
        }
        println("Dados alterado com sucesso\n" +
                "Nome: $nome;\n" +
                "Idade: $idade\n" +
                "CPF: $cpf")
    }

    //Cadastro de usuário e senha

    fun cadUS(usuario: String, senha: String){

        if (usuario != senha && usuario != "" && senha != ""){
            println("Seus dados de logins são:\n" +
                    "Usuário: $usuario\n" +
                    "Senha: $senha\n" +
                    "Criados com sucesso")
        }else{
            println("Usuário ou senha inválidos")
        }
    }
    //Login no sistema com o usuário e senha
    fun logar(usuario: String, senha: String){
        if (usuario == this.usuario && senha == this.senha){
            println("Usuário logado com sucesso.")
        }else{
            println("Usuário ou Senha inválida")
        }
    }


    //Dados da Lista de Compras
    //Adicionar itens
    fun adicionar(valor: String){
        if(valor != "" && valor.length <= 15){
            listaDeCompras.add(valor)
            println("Voce tem ${listaDeCompras.size} item(ns) na lista")
            println("Item adicionado a lista")
        }else{
            println("Item Inválida")
        }
    }

    //Remover itens

    fun remover(valor: String){
        if (valor !="") {
            if (listaDeCompras.contains(valor)) {
                listaDeCompras.remove(valor)
                println("Item: $valor removido com sucesso")
            } else {
                println("Item não localizado")
            }
        }else{
            println("Digite algum item")
        }
    }
    //Listar os itens
    fun listar(){
        listaDeCompras.forEach{
            println(it)
        }
    }







    }



