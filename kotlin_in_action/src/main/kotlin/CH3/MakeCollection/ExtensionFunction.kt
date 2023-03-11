package CH3.MakeCollection

// String 클래스의 확장함수이다.
// 확장함수란 어떤 클래스의 멤버 메서드인것처럼 호출할 수 있지만, 그 클래스의 밖에 선언된 함수이다.
fun String.lastChar() : Char = this.get(this.length - 1)

// this 생략도 가능하다.
fun String.lastChar2() : Char = get(length - 1)


fun main() {

    val keyWord = "Kotlin"

    // 문자열의 마지막 글자를 반환한다.
    println("$keyWord.lastChar() => ${keyWord.lastChar()}")

    println("$keyWord.lastChar2() => ${keyWord.lastChar2()}")
}