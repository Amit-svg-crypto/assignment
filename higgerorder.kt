
fun operation(a: Int, b: Int, func: (Int, Int) -> Int): Int {
    return func(a, b)
}

fun main() {
    val sum = operation(5, 3) { x, y -> x + y }
    println("Sum: $sum")

    val product = operation(5, 3) { x, y -> x * y }
    println("Product: $product")

    val difference = operation(5, 3) { x, y -> x - y }
    println("Difference: $difference")
}
