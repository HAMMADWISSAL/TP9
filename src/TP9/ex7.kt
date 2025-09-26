package TP9

class DatabaseConnection {
    fun connecter() = println("Connexion établie avec la base de données.")
    fun requete(sql: String) = println("Exécution de la requête : $sql")
}

class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    fun initialiserConnexion() {
        connexion = DatabaseConnection()
        connexion.connecter()
    }

    fun executer(sql: String) {
        if (::connexion.isInitialized) {
            connexion.requete(sql)
        } else {
            println("Erreur : Connexion non initialisée")
        }
    }
}
fun main(){
    val db = DatabaseManager()
    db.executer("SELECT * FROM users")
    db.initialiserConnexion()
    db.executer("SELECT * FROM users")
}