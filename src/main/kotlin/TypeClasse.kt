
fun main() {

    val bd = BD()
    val uiAfficher = UIAfficher(bd =bd)
    val uiAjouter = UIAjouter(bd = bd)

    uiAfficher.rendreUI()

    uiAjouter.rendreUI()

    uiAfficher.rendreUI()

}



class BD {
    val TYPEBD = "Base de données des chaines de caractère"

    var donnes = "Amani,Tacite,Alain,Louis"
    fun ajouterDonne(nouveau : String){

        donnes += ", $nouveau"

    }

}

class UIAfficher (val titre : String ="AFFICHER DONNEES", val bd : BD){

    fun rendreUI(){
        println( """
            ===============================================================
            $titre
            ----------------------------
            ${bd.TYPEBD}
            ${bd.donnes}
            ===============================================================
            """.trimIndent()

        )
    }

}

class UIAjouter(val titre: String = "AJOUTER DONNEE", val bd: BD){

    fun rendreUI(){

        println( """
            ===============================================================
            $titre
            ----------------------------
            ${bd.TYPEBD}
            veillez saisir la nouvelle donnée :
            
            """.trimIndent())

         val nouvelledonne = readln()
         bd.ajouterDonne(nouvelledonne)
    }
}