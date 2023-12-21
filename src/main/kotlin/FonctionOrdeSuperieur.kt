
fun main(){
   /* println(somme(4, 9))
    println(somme(14, 9))*/

    val personne1 = Personne()
   // println(personne1.getNomComplet().uppercase())
    /*dePersonne(personne1){
        val nomMajuscule = it.uppercase()
        println(nomMajuscule)
    }*/

    personne1.getNomComplet {
        println(it.uppercase())
    }

}

/*fun somme (nb1 : Int, nb2 : Int) : Int{

    return nb1+nb2

}*/



// une fonction orde superieur est une fonction qui accepte une fonction en parametre

data class Personne (val nom: String = "Louis", val postnom : String = "Musole")

fun dePersonne(personne : Personne, fn : (String)->Unit){
    fn(personne.nom)
}
 // fonction extension
/*fun Personne.getNomComplet() : String{
    return " ${this.nom} ${this.postnom}"
}*/
fun Personne.getNomComplet(fn: (String) -> Unit){
   fn ("${this.nom} ${this.postnom}")
}