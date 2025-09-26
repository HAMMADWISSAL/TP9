package TP9

fun main(){
    fun traitement(notes: List<Double>) {
        val moyenne = notes.average()
        println("Moyenne = $moyenne")
        when {
            moyenne >= 80 -> println("Réussi avec mention excellente")
            moyenne >= 50 -> println("Réussi")
            else -> println("Échoué")
        }
    }
    traitement(listOf(49.0, 70.0, 91.0))
}