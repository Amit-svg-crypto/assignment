//1. pattern

fun main() {
    var n= 5
    var ch= '*'

    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (j in 1..(i * 2 - 1)) {
            print(ch)
        }
        println()
    }
 var i = n - 1
    while (i > 0) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (j in 1..(i * 2 - 1)) {
            print(ch)
        }
        println()
        i--
    }
}
  
