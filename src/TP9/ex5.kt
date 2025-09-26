package TP9

fun calculCouteux(): Int {
    println("Exécution d'un calcul coûteux...")
    return (1..1000000).sum()
}

val resultat by lazy { calculCouteux() }
fun main(){
    println("Résultat lazy = $resultat")
}