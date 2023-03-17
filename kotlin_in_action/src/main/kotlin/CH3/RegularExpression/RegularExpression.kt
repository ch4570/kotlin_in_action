package RegularExpression


fun main() {

    // 분해할 문장
    val sentence = "12.345-6.A"

    // 정규표현식을 생성
    val regex = "\\.|-".toRegex()

    println("12.345-6.A.split(\\.|-.toRegex()) => ${sentence.split(regex)}")
}