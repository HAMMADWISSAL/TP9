package TP9

class Configuration {
    init {
        println("Chargement de la configuration complexe...")
    }
}

class App {
    val config: Configuration by lazy { Configuration() }
}
fun main(){

    val app = App()
    println("App créée")
    app.config
}