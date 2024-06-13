fun calculateArea(length: Double, breadth: Double): Double {
    return length * breadth
}

fun calculateArea(radius: Double): Double {
    return 3.14 * radius * radius
}

fun main() {
    val rectangleArea = calculateArea(5.0, 3.0)
    println("Area of the rectangle: $rectangleArea")

    val circleArea = calculateArea(4.0)
    println("Area of the circle: $circleArea")
}
