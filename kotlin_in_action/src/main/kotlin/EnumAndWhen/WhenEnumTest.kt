package EnumAndWhen

class WhenEnumTest {

    fun getMnemonic(color : Color) =

        // ENUM 중 일치하는 값이 있으면 문자열을 반환한다.

        // Java의 Switch문과 비슷하지만, 구조가 약간 다르다. Kotiln 에서는 break를 일일히 넣어주지 않아도 된다.

        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }
}

fun main(args: Array<String>) {

    val enumTest = WhenEnumTest();

    println("Enum Test = ${enumTest.getMnemonic(Color.BLUE)}");
}