package com.ejercicio.funciones

object Calcular {

  def totalBruto(valor: Double = 500, cantidad: Int = 5): Double = valor * cantidad

  def valorDelIva(valor: Double = 500, iva: Double = 19): Double = valor * (iva / 100)

  def valorDeImpuesto(valor: Double = 500, impuesto: Double = 16): Double = valor * (impuesto / 100)

  def totalGeneral(valor: Double = 500, cantidad: Int = 5): Double = {
    totalBruto(valor, cantidad) + valorDelIva(valor) + valorDeImpuesto(valor)
  }

}
