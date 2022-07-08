package com.ejercicio.traits

import com.ejercicio.typealias.TypeAlias.Precio

trait CalcularTotalValor {
 def totalGeneral(iva: Precio, impuesto: Precio): Unit
}
