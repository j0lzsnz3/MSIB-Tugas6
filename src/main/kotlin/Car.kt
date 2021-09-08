import component.Body
import component.Engine
import component.Frame
import component.Wheel

/**
 * Untuk membuat sebuah mobil, membutuhkan:
 *  #1 Engine
 *  #2 Frame
 *  #3 Wheel
 *  #4 Body
 *  yang nantinya setelah diproses oleh mesin, akan menghasilkan sebuah Mobil
 */
data class Car (
    val engine: Engine,
    val frame: Frame,
    val wheel: Wheel,
    val body: Body
)