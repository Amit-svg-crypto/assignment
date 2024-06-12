//5. duck no


fun main() {
    val number = "5600"

    var hasZero = false

   
    for (i in 1 until number.length) { 
        if (number[i] == '0') {
            hasZero = true
            break
        }
    }
    if (hasZero) {
        println("$number is a duck number")
    } else {
        println("$number is not a duck number")
    }
}

  


