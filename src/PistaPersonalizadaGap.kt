

open class PistaPersonalizadaGap(
    longitud:Int,
    clima:String,
):Pista(longitud,clima)
{
    fun aplicarCondiciones(vehiculo: Vehiculo){
        when (clima){
            "lloviendo" -> velocidadActual= (velocidadActual-(velocidadActual*0.5)).toInt()
            "niebla" -> velocidadActual= (velocidadActual-(velocidadActual*0.8)).toInt()
            "soleado" -> combustible *= (0.95).toInt()

        }
    }

}

