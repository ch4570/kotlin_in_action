
// Kotlin 에서의 클래스 정의

/*
*   데이터만 저장하는 클래스를 값 객체(value - object)라고 부른다.
*   코틀린의 기본 접근 제어자는 public 이므로 접근 제어자를 생략해도 된다.
* */

class Person (

    // val 키워드로 선언된 프로퍼티는 읽기 전용으로, Getter를 만들어낸다.
    val name: String,

    // var 키워드로 선언된 프로퍼티는, 쓰기가 가능하고 Getter 와 Setter를 가진다.
    var isMarried: Boolean

    )

class Test {

    fun main(args: Array<String>) {

        // Kotlin 에서는 new 키워드를 사용하지 않고 생성자를 호출한다.
        val person = Person("Bob", true)

        // 프로퍼티 이름을 직접 사용해도 코틀린이 자동으로 Getter를 호출해준다.
        println(person.name)

        println(person.isMarried)
    }
}