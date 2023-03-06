package EnumAndWhen

enum class Color(

    // Kotlin에서의 Enum도 Java와 같이 프로퍼티와 메서드를 선언할 수 있다.

    val r: Int, val g: Int, val b: Int
) {
    RED(255,0,0), ORANGE(255,165,0),
    YELLOW(255,255,0), GREEN(0,255,0), BLUE(0,0,255),
    INDIGO(75,0,130), VIOLET(238,130,238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}