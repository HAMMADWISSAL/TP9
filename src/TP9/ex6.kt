package TP9

class UtilisateurService {
    fun afficherMessage() = println("Service Utilisateur prêt à être utilisé")
}

class Application {
    lateinit var utilisateurService: UtilisateurService

    fun initialiserService() {
        utilisateurService = UtilisateurService()
        println("Service initialisé")
    }

    fun utiliserService() {
        if (::utilisateurService.isInitialized) {
            utilisateurService.afficherMessage()
        } else {
            println("Erreur : Service non initialisé")
        }
    }
}
fun main(){
    val application = Application()
    application.utiliserService()
    application.initialiserService()
    application.utiliserService()
}