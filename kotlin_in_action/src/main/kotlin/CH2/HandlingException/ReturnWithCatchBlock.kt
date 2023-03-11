package CH2.HandlingException

import java.io.BufferedReader
import java.io.StringReader

class ReturnWithCatchBlock {

}

fun readNumberWithCatch(reader: BufferedReader) {


    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e : NumberFormatException) {

        // 예외 발생시 null이 number에 저장된다.
        null
    }

    println(number)
}

fun main() {

    // 222 출력
    val reader1 = BufferedReader(StringReader("222"))

    // null 출력
    val reader2 = BufferedReader(StringReader("aaa"))

    CH2.HandlingException.readNumberWithCatch(reader1)

    CH2.HandlingException.readNumberWithCatch(reader2)
}