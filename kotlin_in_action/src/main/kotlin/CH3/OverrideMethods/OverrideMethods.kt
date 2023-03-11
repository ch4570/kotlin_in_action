package CH3.OverrideMethods

open class View {
    open fun click() = println("View Clicked!")
}

class Button: View() {

    // View의 click 함수를 오버라이딩
    override fun click() = println("Button Clicked!")

    // View의 click 함수 호출
    fun parentClick() = println(super.click())
}

fun View.showOff() = println("I'm a view!")

fun Button.showOff() = println("I'm a button!")

fun main() {

    val view1 = Button()

    val view2: View = Button()

    val view3: View = View()

    // 오버라이딩한 메서드 호출
    view1.click()

    // 오버라이딩 한 메서드 호출
    view2.click()

    // 부모 메서드 호출
    view1.parentClick()

    // View의 메서드 호출
    view3.click()

    // 확장함수 호출
    // 확장함수는 정적으로 결정되므로 View의 확장함수가 실행된다.
    // View가 가리키는 객체의 실제타입이 Button이지만, view의 타입이 View이므로 View의 확장함수가 실행된다.
    view2.showOff()
}