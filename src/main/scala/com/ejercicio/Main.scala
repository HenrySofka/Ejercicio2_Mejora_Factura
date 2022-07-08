package com.ejercicio

import com.ejercicio.caseclass.producto.{Producto, Producto2}
import com.ejercicio.clases.Producto3
import com.ejercicio.funciones.Calcular

object Main {

  def main(args: Array[String]): Unit = {

    val manzana = Producto("Manzana", 15.75, 7)


    val tuplaProducto: (String,Double,Int) = ("Pera", 13.48, 6)
    val producto2 = Producto2.tupled(tuplaProducto)
    val pera = new Producto(producto2.nombre, producto2.precio, producto2.cantidad)

    val banana = new Producto3("Banana", 14.89,8)


    println("------------------------------------------")
    manzana.calculoDelProduto()
    println("------------------------------------------")
    println()
    println("------------------------------------------")
    pera.calculoDelProduto()
    println("------------------------------------------")
    println()
    println("------------------------------------------")
    banana.totalGeneral()
    println("------------------------------------------")
    println()



    /*println("------------------------------------------")
    println("Total Bruto: " + Calcular.totalBruto())
    println("IVA: " + Calcular.valorDelIva())
    println("IMP Consumo: " + Calcular.valorDeImpuesto())
    println("El Valor Total es: " + Calcular.totalGeneral())
    println("------------------------------------------")*/

  }


}
