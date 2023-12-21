//
//fun main () {
//    val enseignant1 = Enseignant("tacite", 21)
//
//    enseignant1.marcher()
//    enseignant1.enseigner()
//
//    val  eleve1 = Eleve("Alain",17)
//    eleve1.payerFraisScolaire()
//    eleve1.marcher()
//
//
//
//
//}
//// open pour redefinir  une classe mère ou une fonction
//abstract class Personne(nom : String, age : Int) {
//
//    init {
//        println("Nom: $nom  \nage : $age ")
//    }
//   abstract fun marcher()
//  protected fun manger(){
//     println("Entrain de marcher")
// }
//
//}
//
//class Enseignant(val nom : String, age : Int): Personne(nom , age ){
//
//    fun enseigner(){
//        println("Entrain d'enseigner")
//    }
//    //on redefinir  la fonction marcher  dans class Enseignant qui herite de celui ci
//
//    override fun marcher() {
//        println("L'enseigant $nom marche")
//    }
//
//}
//
//class Eleve(val nom : String, age : Int): Personne(nom , age ){
//
//    fun payerFraisScolaire(){
//        println("Entrain de payer les frais scolaire ")
//    }
//
//    override fun marcher() {
//        println("L'Eleve  $nom marche")
//    }
//}