package MakeInterface


// click 이라는 추상 메서드가 있는 인터페이스 정의
interface Clickable {
    fun click()

    // 디폴트 구현 제공이 가능하다.
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable")
}

// Clickable 인터페이스를 구현한 클래스 정의
class Button : Clickable,Focusable {

    // Clickable 인터페이스를 구현하며, click() 메서드를 오버라이딩
    override fun click() = println("I was clicked")

    override fun showOff() {

        // super<상위 타입> 으로 어떤 상위 타입의 멤버 메서드를 호출할지 결정할 수 있다.
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    Button().click()

    Button().showOff()
}