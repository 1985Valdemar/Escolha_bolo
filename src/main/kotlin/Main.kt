
                                       //controle de Fluxo
//fun main() {
  //  val cakes = listOf("Ezao", "Frank")

   // for (Muito in cakes){                        //1 Loop executa 2X automatico
       // println("Eu Amo Voce $Muito Muito!")
       //println("Desculpe $Muito")
  //  }

   /* fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    fun main(args: Array<String>) {
        var cakesEaten = 0                          // bolo comido
        var cakesBaked = 0                          // Assar bolo

        while (cakesEaten < 5) {                    // 1 Enquanto não for comido 5 realizar Loop
            eatACake()
            cakesEaten ++
        }

        do {                                        // 2 Passa para "do" após 5X para dai assar o bolo
            bakeACake()
            cakesBaked++
        } while (cakesBaked < cakesEaten)

    }*/

                                // Intervalo Range com Numeros e tambem letras

/*fun main() {

    for (i in 0..3) {             // 1 Range in = inclusive do 0 ao 3
        print(i)
    }
    print(" ")

    for (i in 0 until 3) {        // 2 Range until  = não incluindo o ultimo numero
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {      // 3 Range de 2 a 8 pulando step = pulando 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4 Range decaindo do 3 in = inclusive ate 0
        print(i)
    }
    print(" ")
}*/
                                    // Intervalo Range em Letras
/*fun main() {

    for (c in 'a'..'d') {              // 1 Range de "a" in = inclusive ate d
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2 Range de z ate s com etep = pulando 2 em 2
        print(c)
    }
    print(" ")

}*/

fun main() {


    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1 comparacao instrutural e não na ordem
    println(authors === writers)  // 2 Comparacao de referencia de objtos se sao igual

}

