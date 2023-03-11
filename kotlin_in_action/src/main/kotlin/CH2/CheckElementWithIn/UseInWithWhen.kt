package CH2.CheckElementWithIn

class UseInWithWhen {

}

// in을 when과 함께 사용할 수 있다.
fun recognize(c: Char) = when (c) {

    // 주어진 문자가 숫자일때 반환
    in '0'..'9' -> "It's a digit!"

    // 주어진 문자가 알파벳일때 반환
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"

    // 숫자나 알파벳이 아닐때 반환
    else -> "I don't know.."
}

fun main(args : Array<String>) {

    // 숫자가 인식되는지 확인
    println("recognize('0') => ${CH2.CheckElementWithIn.recognize('0')}")

    // 알파벳이 인식되는지 확인
    println("recognize('C') => ${CH2.CheckElementWithIn.recognize('C')}")

    // 아무것도 아닐때 인식되는지 확인
    println("recognize('ㅁ') = > ${CH2.CheckElementWithIn.recognize('ㅁ')}")
}