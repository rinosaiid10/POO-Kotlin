
fun main() {

  /* val cours1 = Cours()
    val cours2 = Cours()

    val (designation) = cours1
    println(designation)
    println(cours1==cours1)
    println(cours1)
    println(cours2)*/

    // Opération pour ajouter un cours en ligne

    val resultatOperation : EtatOperation = EtatOperation.Encours()

    when(resultatOperation){
        is EtatOperation.Encours -> println("L'opération est encours")
        is EtatOperation.Echec   -> println("L'opération a échoué")
        is EtatOperation.Succes  -> println("L'opération a réussi")
    }


}



data class  Cours(val designation : String = "Introduction à JAVA", val duree : Int = 3)

//classe hiérachie

sealed class EtatOperation {
    class Encours : EtatOperation()
    class Succes : EtatOperation()
    class Echec : EtatOperation()
}

