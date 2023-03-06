package EnumAndWhen

import EnumAndWhen.Color.*

class ChangeEnumTest {

    fun mix(c1: Color, c2: Color) =

        when(setOf(c1, c2)) {

            // setOf()는 여러 객체를 포함하는 집합인 Set 객체로 만드는 역할을한다.
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO

            // 매칭되는 분기 조건이 없으면 예외 발생
            else -> throw Exception("Dirty color")
        }
}

fun main() {
    // 정상 작동
    println("Let's Mix! => ${ChangeEnumTest().mix(BLUE, YELLOW)}")

    // 예외 발생
    println("Let's Mix! => ${ChangeEnumTest().mix(INDIGO,RED)}")
}