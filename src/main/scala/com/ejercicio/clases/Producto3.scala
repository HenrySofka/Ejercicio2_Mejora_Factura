package com.ejercicio.clases

import com.ejercicio.traits.{CalcularTotalValor, ImpuestoIncluido, IvaIncluido}
import com.ejercicio.typealias.TypeAlias.{Cantidad, Nombre, Precio}


class Producto3(nombre: Nombre, precio: Precio, cantidad: Cantidad)
  extends IvaIncluido with ImpuestoIncluido with CalcularTotalValor {


  def valorBruto(): Precio = {
    val resulrado = precio * cantidad
    resulrado
  }

  override def valorDelIva(iva: Precio = 19D): Precio = {
    val resulrado = precio * (iva / 100)
    resulrado
  }

  override def valorDeImpuestos(impuesto: Precio = 16D): Precio = {
    val resulrado = precio * (impuesto / 100)
    resulrado
  }

  override def totalGeneral(iva: Precio = 19D, impuesto: Precio = 16D): Unit = {
    val valorBruto = this.valorBruto()
    val valorDelIva = this.valorDelIva(iva)
    val valorDeImpuestos = this.valorDeImpuestos(impuesto)
    val resultado = valorDelIva + valorBruto + valorDeImpuestos

    println(s"El valor Bruto de ${nombre} es de: €$valorBruto")
    println(s"El IVA del Producto [${nombre}] es de: €$valorDelIva")
    println(s"El IMP del Producto [${nombre}] es de: €$valorDeImpuestos")
    println(s"El Valor Total del Producto [${nombre}] es de: €$resultado")
  }

}
