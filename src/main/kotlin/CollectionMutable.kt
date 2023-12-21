


// deux type de collection Immutable  et mutable

// collection immutable : List , Set,Map , on peut ni ajouter ni modifier

// la difference entre  List et set ; set ne peux pas prendre les doublons

// avec les collections mutables on pzux ajouter modifier supprimer des élements

fun main() {

     val listePersonnes : MutableList<String> = mutableListOf()
     listePersonnes.add("Rino")
     listePersonnes.add("Louis ")
     listePersonnes.add("Rino")

     println(listePersonnes)




}