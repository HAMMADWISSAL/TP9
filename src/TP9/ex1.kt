package TP9
fun main(){
    fun calcule(a: Int, b: Int) {
        println("Addition: ${a + b}")
        println("Soustraction: ${a - b}")
        println("Multiplication: ${a * b}")
        if (b != 0) {
            println("Division: ${a / b}")
        } else {
            println("Erreur : division par zéro")
        }
        println("Le premier est supérieur au second ? ${a > b}")
        println("La somme est ${if ((a + b) % 2 == 0) "paire" else "impaire"}")
    }
    calcule(10, 5)
}