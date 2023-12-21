
/*fun main() {

   // val listePersonnes : List<String> = listOf("Louis","rino","Alain","Saiid")
    val listePersonnes : Set<String> = setOf("Louis","rino","Alain","Saiid")

    println(listePersonnes.elementAt(2))
    for(personne in listePersonnes){

        println("Nom : $personne")
    }

}*/

// deux type de collection Immutable  et mutable

// collection immutable : List , Set,Map , on peut ni ajouter ni modifier

// la difference entre  List et set ; set ne peux pas prendre les doublons

fun main() {

    // val listePersonnes : List<String> = listOf("Louis","rino","Alain","Saiid")
    val listePersonnes : Map<String, String> = mapOf("nom 1" to "rino","nom 2" to "Saiid")

    println(listePersonnes["nom 1"])
    for((cle, valeur) in listePersonnes){

        println("$cle : $valeur")
    }
}