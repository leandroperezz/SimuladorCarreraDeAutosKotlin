import kotlin.random.Random

open class vehiculoSkyline(
    var velocidad_maxima: Int,
    var aceleracion: Int,
    var frenado: Int,
    var combustible:Int,
    var capmaxcobustible: Int,
    var distanciaRecorrida: Int,


    ) {
    var velocidadActual:Int=0

        fun acelerar(){
        if (combustible>0){
            println("La velocidad actual es $velocidadActual")
            velocidadActual += aceleracion
            if (velocidadActual>velocidad_maxima){
                velocidadActual=velocidad_maxima
                combustible -= 1

            }
        }else{
            println("ERROR:DESTRUCCION INMINENTE")
        }
        }
        fun frenar(){
        if (velocidadActual>frenado){
            velocidadActual -= frenado

        }else{
            velocidadActual=0
        }
        }

        fun distancia_Recorrida(){
        distanciaRecorrida += velocidadActual
        }



        fun cambiarClima() {
        val tiposClima = listOf("soleado", "lluvia", "niebla", "normal")
        var clima = tiposClima[Random.nextInt(tiposClima.size)]

        }
        fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        val eventos = listOf("Pinchazo", "Fallo mecánico", "Encontrar combustible")
        val evento = eventos[Random.nextInt(eventos.size)]

        when (evento) {
            "Pinchazo" -> vehiculo.frenar()
            "Fallo mecánico" -> velocidadActual=0
            "Encontrar combustible" -> combustible=(capmaxcobustible*0.20).toInt()
        }
        }
}

