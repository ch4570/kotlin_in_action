package CH3.MakeCollection


// Collection<T>에 대한 확장 함수 선언
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()

}

// 문자열의 컬렉션에 대해서만 호출 가능한 join 함수
fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {

    val list = listOf<Int>(1, 2, 3)

    // Collection<T>의 확장함수로 사용
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))

    // 문자열의 컬렉션에 대해서만 호출가능한 join 함수 사용
    println(listOf<String>("one", "two", "eight").join(" "))

    // 정수로 이루어진 List는 함수 사용 불가
//    println(listOf<Int>(1, 2, 3, 4).join())
}