package EnumAndWhen

import EnumAndWhen.Color.*;

// 인자 없는 when 사용 -> 인자 없이 when을 사용하면 불필요한 객체 생성이 줄어들어 성능에 유리하다.

class NoArgumentWhen {

    fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) ||
                    (c1 == YELLOW && c2 == RED) ->
                ORANGE

            (c1 == YELLOW && c2 == BLUE) ||
                    (c1 == BLUE && c2 == YELLOW) ->
                GREEN

            (c1 == BLUE && c2 == VIOLET) ||
                    (c1 == VIOLET && c2 == BLUE) ->
                INDIGO

            else -> throw Exception("Dirty Color")
        }

}

fun main() {
    val mixOptimized = NoArgumentWhen()

    println("mixOptimized(BLUE, YELLOW) -> ${mixOptimized.mixOptimized(BLUE,YELLOW)}")

    println("mixOptimized(RED, RED) -> ${mixOptimized.mixOptimized(RED, RED)}")

}