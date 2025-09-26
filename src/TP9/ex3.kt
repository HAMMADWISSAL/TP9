package TP9
import kotlin.concurrent.thread
class MyRunnable : Runnable {
    override fun run() {
        while (true) {
            println("Thread actif : ${Thread.currentThread().name}")
            Thread.sleep(1000)
        }
    }
}
fun main(){
    repeat(2) { i ->
        thread(start = true, name = "Thread-$i") { MyRunnable().run() }
    }
    Thread.sleep(3000)
    println("Arrêt test Ex3")
}