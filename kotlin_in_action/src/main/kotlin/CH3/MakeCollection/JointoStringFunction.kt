// 패키지 선언 이전에 위치해야 한다.
@file: JvmName("StringFunctions")

package CH3.MakeCollection

@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
) : String {
    val result = StringBuilder(prefix)


    for((index, element) in collection.withIndex()) {
        // 첫 원소에는 구분자를 붙이면 안된다.
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

fun main() {

    val list = listOf<Int>(1, 2, 3)

    // 호출하는 함수의 인자에 이름을 붙여줄 수 있다.
    println("joinToString(list, '; ', '(', ')' => ${joinToString(list, separator = "; ", prefix = "(", postfix = ")")}")

    println("joinToString(list, ', ', '(', ')' => ${joinToString(list, ", ", "(", ")")}")

    // 호출하는 쪽에서 인자에 이름을 주고 인자의 순서와 상관없이 호출을 할 수 있다.
    println("joinToString(list, postfix = ';', prefix = '# ' => ${joinToString(list, postfix = ";", prefix = "# ")}")


}