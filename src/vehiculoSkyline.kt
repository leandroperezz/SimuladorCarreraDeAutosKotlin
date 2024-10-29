import kotlin.random.Random

open class vehiculoSkyline(
    var velocidad: Int,
    var velocidad_maxima: Int,
    var aceleracion: Int,
    var frenado: Int,
    var combustible: Int,
    var distanciaRecorrida: Int,


) {
    var velocidadActual:Int=0

    open fun acelerar(){
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
    open fun frenar(){
        if (velocidadActual>frenado){
            velocidadActual -= frenado

        }else{
            velocidadActual=0
        }
    }

    open fun distancia_Recorrida(){
        distanciaRecorrida += velocidadActual
    }
    class Vehiculo(var velocidadActual:Int, var combustible: Int, val capacidadTanque: Int) {
        fun frenar() {

        }

        fun detener() {
            velocidadActual = 0
        }

        fun aumentarCombustible(cantidad: Double) {
            combustible =

        }
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
            "Fallo mecánico" -> vehiculo.detener()
            "Encontrar combustible" -> vehiculo.aumentarCombustible(vehiculo.capacidadTanque * 0.2)
        }

    }
}










}