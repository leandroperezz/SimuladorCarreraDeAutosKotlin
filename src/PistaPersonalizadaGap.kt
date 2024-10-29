import kotlin.math.roundToInt

class PistaPersonalizadaGap(
    var clima: String,
    velocidad: Int,
    distanciaRecorrida: Int,
    combustible: Int

):vehiculoSkyline(velocidad,combustible)
{
    open fun aplicarCondiciones(vehiculo: Vehiculo){
        when (clima){
            "lloviendo" -> velocidadActual= (velocidadActual-(velocidadActual*0.5)).roundToInt()
            "niebla" -> velocidadActual= (velocidadActual-(velocidadActual*0.8)).roundToInt()
            "soleado" -> combustible *= 0.95
            "normal"  -> {}

        }
    }

}

