package CH2.HandlingException

import java.io.BufferedReader
import java.io.StringReader

class UseTryBlockStatement {

}

fun readNumberWithStatement(reader: BufferedReader) {

    val number = try {

        // 이 식의 값이 "try" 식의 값이 된다.
        Integer.parseInt(reader.readLine())
    } catch (e : NumberFormatException) {
        // 주어진 문자열이 숫자로만 이루어지지 않는다면 예외가 발생한다.
        throw RuntimeException(e)
    }

    println(number)
}

fun main() {

    val reader1 = BufferedReader(StringReader("not a number"))

    val reader2 = BufferedReader(StringReader("222"))

    // 숫자로 이루어진 문자열을 인자로 제공 -> 222 출력
    CH2.HandlingException.readNumberWithStatement(reader2)

    // 문자열을 인자로 제공 -> 예외 발생
    CH2.HandlingException.readNumberWithStatement(reader1)


}