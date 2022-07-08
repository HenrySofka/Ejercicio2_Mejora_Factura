package com.ejercicio.traits

import com.ejercicio.typealias.TypeAlias.Precio


trait IvaIncluido {
  def valorDelIva(iva: Precio): Precio
}
