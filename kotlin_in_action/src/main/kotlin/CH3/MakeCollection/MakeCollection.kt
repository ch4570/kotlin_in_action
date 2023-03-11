package CH3.MakeCollection

class MakeCollection {

}

fun main() {


    // HashSet을 만들때 사용하는 함수
    val set = hashSetOf(1, 7, 53)

    // ArrayList를 사용할때 사용하는 함수
    val list = arrayListOf(1, 7, 53)

    // HashMap을 사용할때 사용하는 함수
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    // javaClass는 자바의 getClass()와 동일하다
    println(set.javaClass)

    println(list.javaClass)

    println(map.javaClass)

    val strings = listOf<String>("first", "second", "fourteenth")

    println("Strings의 최대값 찾기 ? => ${strings.last()}")

    val numbers = setOf<Int>(1, 14, 2)

    println("numbers의 최대값 찾기 ? => ${numbers.stream().max(Comparator { num1, num2 -> num1 - num2 }).get()}")




}