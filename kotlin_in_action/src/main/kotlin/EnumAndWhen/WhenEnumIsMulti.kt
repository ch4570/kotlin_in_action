package EnumAndWhen

class WhenEnumIsMulti {


    // When 분기에 여러 값 사용을 할경우 콤마(,)로 구분한다.
    fun getWarmth(color: Color) = when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }

}

fun main() {

    val whenEnumIsMulti = WhenEnumIsMulti();

    println("EnumIsMulti = ${whenEnumIsMulti.getWarmth(Color.ORANGE)}")
}

