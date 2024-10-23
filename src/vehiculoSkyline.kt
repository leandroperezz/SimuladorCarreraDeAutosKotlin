open class vehiculoSkyline(
    var velocidad: Int,
    var velocidad_maxima: Int,
    var aceleracion: Int,
    var frenado: Int,
    var combustible: Int,
    var avanzar: Int,


) {
    var velocidad_actual:Int=0

    open fun acelerar{
        if (combustible>0){
            println("La velocidad actual es $velocidad_actual")
            velocidad_actual += aceleracion
            if (velocidad_actual>velocidad_maxima){
                velocidad_actual=velocidad_maxima
                combustible -= 1

            }
        }else{
            println("ERROR:DESTRUCCION INMINENTE")
        }
    }
    open fun frenar{
        if (velocidad_actual>frenado){
            velocidad_actual -= frenado

        }else{
            velocidad_actual=0
        }
    }

    open fun avanzar{
        avanzar += velocidad_actual
    }









}