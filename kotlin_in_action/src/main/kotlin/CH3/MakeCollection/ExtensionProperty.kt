package CH3.MakeCollection


// 확장 프로퍼티 선언 
val String.lastChar: Char
    get() = get(length - 1)


// 변경 가능한 확장 프로퍼티 선언
var StringBuilder.lastChar: Char
    // 프로퍼티 게터
    get() = get(length - 1)

    // 프로퍼티 세터
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {

    // 확장 프로퍼티 사용 - String
    val keyword = "Kotlin"
    println("Kotlin.lastChar() => ${keyword.lastChar}")

    // 변경 가능한 확장 프로퍼티 사용
    val sb = StringBuilder("Kotlin?")

    // Getter 호출
    println("sb.lastChar = > ${sb.lastChar}")

    // Setter 호출하여 변경 후 호출
    sb.lastChar = '!'
    println("sb.lastChar = > ${sb.lastChar}")

    // 전체 출력
    println("sb => $sb")
}