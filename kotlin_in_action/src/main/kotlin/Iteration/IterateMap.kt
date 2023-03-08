package Iteration

import java.util.TreeMap

class IterateMap {

}


fun main() {

// Key에 대해 정렬하기 위해 TreeMap을 사용한다.
    val binaryReps = TreeMap<Char, String>()

    // A부터 F까지 문자의 범위를이용해 이터레이션한다.
    for(c in 'A'.. 'F') {

        // ASCII 코드를 2진 표현으로 바꾼다.
        val binary = Integer.toBinaryString(c.toInt())

        // map[key] = value의 형식으로 값을 넣어줄 수 있다.
        binaryReps[c] = binary

    }

    // Map에 대해 이터레이션한다. 맵의 Key와 Value가 두 변수에 각각 대입된다.
    for((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    // List를 생성
    val list = arrayListOf("10", "11", "1001")

    // 구조분해 구문으로 원소의 현재 인덱스를 유지하면서 컬렉션을 이터레이션
    for((index, element) in list.withIndex()) {
        println("$index = $element")
    }
}

