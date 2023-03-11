class StringTemplate {

    fun main(args: Array<String>) {
        // 문자열을 반환하는 함수를 선언
        val name = if (args.size > 0) args[0] else "Kotlin"

        // 문자열 결합 연산자를 사용하지 않고 문자열 템플릿을 사용해서 출력
        println("Hello, $name!")
    }

     fun korean() {
         val name = "Kotlin"

         // 에러 발생 -> unresolved reference
//         println("$name님 반가워요")

         // ${} 괄호로 감싸줘야 에러 발생하지 않음
         println("${name}님 반가워요")
     }

    fun statement(args: Array<String>) {
        // println 함수에 식을 사용가능
        println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
    }
}
