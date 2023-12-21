
fun main () {
    val enseignant1 = Enseignant("tacite", 21)

    enseignant1.marcher()
    enseignant1.enseigner()

    val  eleve1 = Eleve("Alain",17)
    eleve1.payerFraisScolaire()
    eleve1.marcher()




}

// une interface c'est aussi une class abstraite
interface  ActionsPersonne{
 fun manger()
 fun marcher()

}

class Enseignant(val nom : String, age : Int) : ActionsPersonne{

    fun enseigner(){
        println("Entrain d'enseigner")
    }

    override fun manger() {
        println("Entrain de manger")
    }

    override fun marcher() {
        println("Entrain de marcher")
    }
    //on redefinir  la fonction marcher  dans class Enseignant qui herite de celui ci



}

class Eleve(val nom : String, age : Int) : ActionsPersonne{

    fun payerFraisScolaire(){
        println("Entrain de payer les frais scolaire ")
    }

    override fun manger() {
        println("Entrain de manger")
    }

    override fun marcher() {
        println("Entrain de marcher")
    }

}