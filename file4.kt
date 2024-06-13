  4.

 fun main() 
{
    val input = "amit"
    val frequency = IntArray(26)
    for (i in 0 until input.length) {
        val char = input[i]
        if (char in 'a'..'z' || char in 'A'..'Z') {
            val lowerChar = if (char in 'A'..'Z') char + ('a' - 'A') else char
            val index = lowerChar - 'a'
            frequency[index]++
        }
    }

    for (i in 0 until frequency.size) {
        if (frequency[i] > 0) {
            val char = 'a' + i
            println("$char: ${frequency[i]}")
        }
    }
}
 
