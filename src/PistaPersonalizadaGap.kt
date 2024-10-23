import kotlin.math.roundToInt

class PistaPersonalizadaGap(
    var clima: String,
    velocidad: Int,
    distanciaRecorrida: Int

):vehiculoSkyline(velocidad, velocidad_maxima=180, aceleracion=20, frenado=15, combustible=60,distanciaRecorrida)
{
    open fun aplicarCondiciones(vehiculo: Vehiculo){
        when (clima){
            "lloviendo" -> velocidadActual= (velocidadActual-(velocidadActual*0.5)).roundToInt()
            "Niebla" -> velocidadActual= (velocidadActual-(velocidadActual*0.8)).roundToInt()
            "Soleado" ->

        }
    }

}
