import component.Body
import component.Engine
import component.Frame
import component.Wheel

/**
 * Aplikasi untuk membuat mobil dengan component yang ada.
 * Lalu mencetak spesifikasi mobil yang sudah dibuat.
 */
fun main(args: Array<String>) {

    // Menerapkan Setter disini
    val engine = Engine(cubicCapacity = 4000, cylinderCount = 4)
    val frame = Frame(type = "Tubular", wheelBase = 3000)
    val wheel = Wheel(size = 14, brand = "OZ Racing")
    val body = Body(type = "Sedan", weight = 1500)

    // Membuat sebuah mobil dengan komponen yang ada
    val car = makeCar(body, engine, frame, wheel)

    // Setelah mobil selesai dibuat, lalu cetak spesifikasinya
    printSpecification(car)
}

private fun makeCar(
    body: Body,
    engine: Engine,
    frame: Frame,
    wheel: Wheel
): Car = Car(engine, frame, wheel, body)

// Menerapkan Getter disini
private fun printSpecification(car: Car) {
    println("**************************")
    println("Car Brand: HEROCYN 4.0")
    println("---------Engine-----------")
    println("Cubic Capacity: ${car.engine.cubicCapacity}cc")
    println("Cylinder Count: ${car.engine.cylinderCount}")
    println("---------Frame------------")
    println("Frame Type: ${car.frame.type}")
    println("Frame Wheelbase: ${car.frame.wheelBase} meters")
    println("---------Wheel------------")
    println("Wheel Size: ${car.wheel.size} inch")
    println("Wheel Brand: ${car.wheel.brand}")
    println("----------Body------------")
    println("Body Type: ${car.body.type}")
    println("Body Weight: ${car.body.weight} pounds")
    println("**************************")
}
