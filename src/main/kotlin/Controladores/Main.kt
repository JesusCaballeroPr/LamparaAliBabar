package org.example.Controladores
import Lampara
import readInt
import java.util.*

fun main() {
    val colores= arrayOf("blanco","ocre","naranja","amarillo","verde","rojo","fucsia","cyan")
    val intensidades= arrayOf(1,2,3,4,5)
    val SCAN=Scanner(System.`in`)
    var lampara1=Lampara()
    var dato=false
    var contadorLuz1=0
    var contadorIntensidadLuz1=0
    println("Bienvenido a la lámpara mágica de Ali-Babar ^_^")
    do {
        var posibilidadSalir=readInt("Por favor, si desea salir, pulse 0. " +
                "En caso contrario, presione cualquer número"
            ,"No es un número")
        if (posibilidadSalir==0){
            dato=true
        }
        else {
            //LÁMPARA 1
            lampara1.setUbicacion()
            println( lampara1.getUbicacion())
            lampara1.presentacion()
            lampara1.setEstado()
            println(lampara1.getEstado())
            var pulsaciones=readInt("Ingrese la cantidad de pulsaciones para establecer el color"
                    , "No es un número")
            lampara1.setCambioColor(colores, pulsaciones)
            println( lampara1.getCanbioColor())
            var pulsacionesIntensidad=readInt("Ingrese la cantidad de pulsaciones para establelcer la intensidad"
                , "No es un número")
            lampara1.setCambiarIntensidad(intensidades,pulsacionesIntensidad)
            println( lampara1.getCambioIntensidad())
            println(lampara1)
            // LÁMPARA 2
            var lampara2=Lampara(true,"rojo",9,"Comedor")
            /*lampara2.setUbicacion()
            lampara2.presentacion()
            lampara2.setEstado()
            var pulsaciones2=readInt("Ingrese la cantidad de pulsaciones para establecer el color"
                , "No es un número")
            lampara2.setCambioColor(colores, pulsaciones2)
            var pulsacionesIntensidad2=readInt("Ingrese la cantidad de pulsaciones para establelcer la intensidad"
                , "No es un número")
            lampara2.setCambiarIntensidad(intensidades,pulsacionesIntensidad2)*/
/*
            println(lampara2)
*/
        }

    }while (!dato)
}
