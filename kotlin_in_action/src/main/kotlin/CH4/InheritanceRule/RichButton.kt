package InheritanceRule

import MakeInterface.Clickable

// open 키워드로 시작하는 클래스는 다른 클래스에서 상속받을 수 있다 -> Kotlin의 클래스는 기본적으로 final(상속불가)이다.
open class RichButton : Clickable {

    // 이 함수는 final 이므로 오버라이딩이 불가능하다.
    fun disable() {}

    // 이 함수는 오버라이딩이 가능하다.
    open fun animate() {}

    // 오버라이딩한 메서드는 기본적으로 열려있다 -> 하위 클래스에서 오버라이딩이 가능하다.
    override fun click() {}
}