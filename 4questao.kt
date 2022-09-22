fun main() {
    var MeusDadosAndre = Dados()
    MeusDadosAndre.nome = "Andre"
    MeusDadosAndre.altura = 1.87
    MeusDadosAndre.nascimento = 2001
    println(MeusDadosAndre.nome)
    println(MeusDadosAndre.calculaIdade(0))
    println(MeusDadosAndre.altura)


}

class Dados {
    var nome = ""
    var idade = 0
    var altura = 0.0
    var nascimento = 0

    fun calculaIdade(idade: Int):Int  {
        this.idade = 2022 - nascimento
        return this.idade
    }
}