package com.ejercicio.caseclass.producto

import com.ejercicio.typealias.TypeAlias.{Cantidad, Nombre, Precio}

case class Producto(nombre: Nombre, precio: Precio, cantidad: Cantidad) {

  def calculoDelProduto(iva: Precio = 19, impuesto: Precio = 16): Unit = {
    Producto.totalGeneral(this,iva,impuesto)
  }

}

object Producto {
  def apply(nombre: Nombre, precio: Precio, cantidad: Cantidad): Producto =
    new Producto(nombre, precio, cantidad)

  def valorBruto(producto: Producto): Precio = {
    val resulrado = producto.precio * producto.cantidad
    resulrado
  }

  def valorDelIva(producto: Producto, iva: Precio): Precio = {
    val resulrado = producto.precio * (iva/100)
    resulrado
  }

  def valorDeImpuestos(producto: Producto, impuesto: Double): Double = {
    val resulrado = producto.precio * (impuesto/100)
    resulrado
  }

  def totalGeneral(producto: Producto, iva: Double, impuesto: Double): Unit ={
    val valorBruto = Producto.valorBruto(producto)
    val valorDelIva = Producto.valorDelIva(producto, iva)
    val valorDeImpuestos = Producto.valorDeImpuestos(producto, impuesto)
    val resultado = valorDelIva + valorBruto + valorDeImpuestos

    println(s"El valor Bruto de ${producto.nombre} es de: €$valorBruto")
    println(s"El IVA del Producto [${producto.nombre}] es de: €$valorDelIva")
    println(s"El IMP del Producto [${producto.nombre}] es de: €$valorDeImpuestos")
    println(s"El Valor Total del Producto [${producto.nombre}] es de: €$resultado")



  }
}
