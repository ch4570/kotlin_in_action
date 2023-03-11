package CH2.CheckElementWithIn

class CheckElementWithIn {

}

// 주어진 문자(Character)가 알파벳(a-z, A-Z)에 해당하는지 확인하는 함수
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

// 주어진 문자가 숫자가 아닌지 확인하는 함수
fun isNotDigit(c: Char) = c !in '0'..'9'



fun main() {

    // 'q'가 문자인지 확인
    println("isLetter('q') = ${CH2.CheckElementWithIn.isLetter('q')}")

    // 'x'가 숫자인지 확인
    println("isNotDigit('x') = ${CH2.CheckElementWithIn.isNotDigit('x')}")

    // '8'이 숫자인지 확인
    println("isNotDigit('8') = ${CH2.CheckElementWithIn.isNotDigit('8')}")
}