package CH2.EnumAndWhen

class WhenEnumIsMulti {


    // When 분기에 여러 값 사용을 할경우 콤마(,)로 구분한다.
    fun getWarmth(color: CH2.EnumAndWhen.Color) = when(color) {
        CH2.EnumAndWhen.Color.RED, CH2.EnumAndWhen.Color.ORANGE, CH2.EnumAndWhen.Color.YELLOW -> "warm"
        CH2.EnumAndWhen.Color.GREEN -> "neutral"
        CH2.EnumAndWhen.Color.BLUE, CH2.EnumAndWhen.Color.INDIGO, CH2.EnumAndWhen.Color.VIOLET -> "cold"
    }

}

fun main() {

    val whenEnumIsMulti = CH2.EnumAndWhen.WhenEnumIsMulti();

    println("EnumIsMulti = ${whenEnumIsMulti.getWarmth(CH2.EnumAndWhen.Color.ORANGE)}")
}

