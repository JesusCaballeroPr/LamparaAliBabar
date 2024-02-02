class Lampara (){
    private var estado:Boolean=false
    private var cambioColor:String=""
    private var cambiarIntensidad:Int=0
    private var ubicacion:String=""

    constructor(estado:Boolean,cambioColor:String,cambiarIntensidad: Int,ubicacion:String):this(){
        this.estado=estado
        this.cambioColor=cambioColor
        this.cambiarIntensidad=cambiarIntensidad
        this.ubicacion=ubicacion
    }
    fun setEstado() {
        var opcion=readInt(
            "Marque 1 si quiere encender la lámpara o 0 si quiere apagarla",
            "No es un número",
            "Fuera del rango permitido",
            0,
            1
        )

        if (opcion == 1) {
            this.estado = true
        } else {
            this.estado = false
        }
    }
    fun getEstado():String{
        return if(this.estado==true){
            "encendida"
        }else{
            "apagada"
        }
    }
    fun setCambioColor(colores: Array<String>, pulsaciones: Int) {
        var colorElegido = ""
        for (i in 1..pulsaciones) {
            val indiceColor = (i - 1) % colores.size
            colorElegido = colores[indiceColor]
        }
        this.cambioColor = colorElegido
    }
    fun getCanbioColor():String{
        return this.cambioColor
    }
    fun setCambiarIntensidad(intensidades: Array<Int>, pulsacionesIntensidad: Int) {
        var intensidadElegida = 0
        for (i in 1..pulsacionesIntensidad) {
            var indiceIntensidad= (i-1) % intensidades.size
            intensidadElegida=intensidades[indiceIntensidad]
        }
        this.cambiarIntensidad = intensidadElegida
    }
    fun getCambioIntensidad():Int{
        return this.cambiarIntensidad
    }
    fun setUbicacion(){
        var dondeEstoy=readLine(
            "¿Que lámpara es la que quiere usar?", "Esa no es una ubicación válida"
        )
        this.ubicacion=dondeEstoy
    }

    fun  getUbicacion():String{
        return this.ubicacion
    }
    fun queEstadoTiene():String {
        return if(estado){
            "encendida "
        }else{
            "apagada "
        }
    }
    fun presentacion(){
        println("Hola! soy la lámpara ubicada en: $ubicacion")
    }
    override fun toString(): String {
        return "La lámpara que se encuentra en $ubicacion, se encuentra ${queEstadoTiene()}" +
                "con un color  $cambioColor y una intensidad $cambiarIntensidad"
    }

}