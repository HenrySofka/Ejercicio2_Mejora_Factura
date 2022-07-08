package com.ejercicio.traits

import com.ejercicio.typealias.TypeAlias.Precio

trait ImpuestoIncluido {
  def valorDeImpuestos(impuesto: Precio): Precio
}
