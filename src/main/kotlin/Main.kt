fun main(args: Array<String>) {
  val q1 = Quotient(4.0,2.0)
  val q2 = Quotient(100.0,5.0)
    q1.afficher()
    q2.afficher()
}


class Quotient(num : Double, den : Double) {

    var numerateur : Double = 12.0
    var denominateur : Double = 6.0

    init {
        
    }


    fun calculer ():Double{
        return numerateur/ denominateur
    }


    fun  afficher() {

        println("Le quotient est ${calculer()}")
    }

}