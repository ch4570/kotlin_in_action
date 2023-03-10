package CH2.SmartCast

class WhenIfUsingBlocks {

}

fun evalWithLogging(e: Expr) : Int =

    when (e) {
        is Num -> {
            println("num : ${e.value}")
            e.value
        }

        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }

        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun main() {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}