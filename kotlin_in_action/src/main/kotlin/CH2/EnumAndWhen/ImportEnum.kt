package CH2.EnumAndWhen

import CH2.EnumAndWhen.Color.*

class ImportEnum {

    // Enum 상수 값을 import 해서 수식자 없이 enum 사용이 가능하다.

    fun getWarmth(color: CH2.EnumAndWhen.Color) = when(color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

}