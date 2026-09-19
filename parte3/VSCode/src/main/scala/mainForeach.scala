object Main extends App {

    def bust(puntuacion: Int): Boolean = puntuacion > 21
    def estadoMano(puntuacion: Int): String = {
        if(puntuacion > 21){
            "BUST"
        }else{
            "VALIDA"
        }
    }
    def mejorMano(handA: Int, handB: Int): Int ={
        if( handA > 21 && handB > 21){
            0
        } else if( handA > 21){
            handB
        } else if ( handB > 21){
            handA
        }else{
            handA.max(handB)
        }
    }
    def manosValidas(jugadores: Array[Int]): Int ={
        var total = 0
        jugadores.foreach(j => if ( j < 22 ) total += 1)
        total
    }
    def mejorPuntuacionValida(puntuaciones: Array[Int]): Int={
        var mejor = 0
        puntuaciones.foreach(actual => {
            if(actual <= 21 && actual > mejor){
                mejor = actual
            }
        })
        mejor
    }

    val jugadores = List("Alex","Chen","Marta","Sindhu","Luis")
    val puntuaciones = Array(18,24,21,20,26)

    var i = 0 
    jugadores.indices.foreach(i => {
        println(jugadores(i) + " -> " + puntuaciones(i) + " -> " + estadoMano(puntuaciones(i)))
    })

    println("\n--- Resumen de la ronda ---")
    println("Numero total de jugadores: " + jugadores.length)
    println("Manos validas: " + manosValidas(puntuaciones))
    println("Bust: " + (puntuaciones.length - manosValidas(puntuaciones)))
    println("Mejor puntuacion valida: "+mejorPuntuacionValida(puntuaciones))

    val puntuacionesRonda2 = Array(22,19,20,21,17)

    println("\n--- Resumen de la ronda 2 ---")
    println("Numero total de jugadores: " + jugadores.length)
    println("Manos validas: " + manosValidas(puntuacionesRonda2))
    println("Bust: " + (puntuacionesRonda2.length - manosValidas(puntuacionesRonda2)))
    println("Mejor puntuacion valida: "+mejorPuntuacionValida(puntuacionesRonda2))


    println("\n--- Resumen de las partidas ---")
    println("Mejor puntuacion de la ronda 1: " + mejorPuntuacionValida(puntuaciones))
    println("Mejor puntuacion de la ronda 2: " + mejorPuntuacionValida(puntuacionesRonda2))
    println("Mejor puntuacion de todas las rondas: " + mejorMano(mejorPuntuacionValida(puntuaciones),mejorPuntuacionValida(puntuacionesRonda2)))
    println("Las dos rondas tuvieron la misma mejor puntuacion: " + (mejorPuntuacionValida(puntuaciones) == mejorPuntuacionValida(puntuacionesRonda2)))
}
