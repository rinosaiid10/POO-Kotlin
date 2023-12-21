
fun main() {

val ui = UI("Louis")
val ui1 = UI(1000)
ui.afficher()
ui1.afficher()
}

//classe générique

class UI<T>(val donnee : T){

    fun afficher(){
        println("$donnee")
    }
}