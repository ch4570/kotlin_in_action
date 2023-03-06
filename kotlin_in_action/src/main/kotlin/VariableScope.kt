class VariableScope {

    // Kotiln은 val과 var의 변수선언 키워드가 있다.
    // val = 변경 불가능한 참조를 저장
    // var = 변경 가능한 참조를 저장

    fun main(args: Array<String>) {
        // 변경 불가능한 참조 -> val
        val apple = "apple"

        // 변경 불가
//        apple = ""

        // 변경 가능한 참조 -> var
        var grape = "Grape"

        // 변경 가능
        grape = ""

        // 불변 참조로 선언
        val language = arrayListOf("Java")

        // 불변 참조로 선언하더라도 객체 내부의 변경은 가능하다.
        language.add("Kotlin")


        var answer = 42
        // 변경할 수 있도록 변수 선언이 되어도 변수의 타입은 초기화 시 고정되어, 변경이 불가능하다.
//        answer = "no answer"
    }

}