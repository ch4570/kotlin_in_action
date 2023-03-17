package InheritanceRule


abstract class Animated {

    // 추상 함수 이므로, 하위 클래스에서는 이 함수를 반드시 오버라이딩 해야 한다.
    abstract fun animate()


    // 비추상 함수는 기본적으로 final 이지만 open 키워드를 사용해 오버라이딩을 허용할 수 있다.
    open fun stopAnimating() {

    }

    // 비추상 함수는 기본적으로 final이다.
    fun animateTwice() {

    }
}