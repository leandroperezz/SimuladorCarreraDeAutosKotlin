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









}