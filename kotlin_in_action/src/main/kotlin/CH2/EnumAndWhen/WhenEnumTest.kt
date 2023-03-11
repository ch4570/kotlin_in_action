package CH2.EnumAndWhen

class WhenEnumTest {

    fun getMnemonic(color : CH2.EnumAndWhen.Color) =

        // ENUM 중 일치하는 값이 있으면 문자열을 반환한다.

        // Java의 Switch문과 비슷하지만, 구조가 약간 다르다. Kotiln 에서는 break를 일일히 넣어주지 않아도 된다.

        when (color) {
            CH2.EnumAndWhen.Color.RED -> "Richard"
            CH2.EnumAndWhen.Color.ORANGE -> "Of"
            CH2.EnumAndWhen.Color.YELLOW -> "York"
            CH2.EnumAndWhen.Color.GREEN -> "Gave"
            CH2.EnumAndWhen.Color.BLUE -> "Battle"
            CH2.EnumAndWhen.Color.INDIGO -> "In"
            CH2.EnumAndWhen.Color.VIOLET -> "Vain"
        }
}

fun main(args: Array<String>) {

    val enumTest = CH2.EnumAndWhen.WhenEnumTest();

    println("Enum Test = ${enumTest.getMnemonic(CH2.EnumAndWhen.Color.BLUE)}");
}