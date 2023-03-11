package CH2.HandlingException

import java.io.BufferedReader
import java.io.StringReader

class TryCatchFinally {

}

fun readNumber(reader: BufferedReader) : Int? {

    try {
        // 문자열 한줄을 입력받는다 -> Java의 BufferedReader 사용
        val line = reader.readLine()

        return Integer.parseInt(line)

        // 예외가 발생할경우, NumberFormatException 을 Catch 한다.
    } catch (e : NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main() {


    val reader1 = BufferedReader(StringReader("239"))

    val reader2 = BufferedReader(StringReader("ABQX"))


    // 정상적인 숫자 입력 후 실행
    println("readNumber 239 => ${CH2.HandlingException.readNumber(reader1)}")

    // 비정상적인 문자열 입력 후 실행 -> null 반환
    println("readNumber ABQX => ${CH2.HandlingException.readNumber(reader2)}")
}

