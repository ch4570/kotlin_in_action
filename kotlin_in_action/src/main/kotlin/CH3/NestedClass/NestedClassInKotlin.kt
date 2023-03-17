package CH3.NestedClass



class Button : View {
    override fun getCurrentState(): State = ButtonState()


    override fun restoreState(state: State) {}


    // 이 클래스는 자바의 정적 주첩 클래스와 대응한다.
    class ButtonState: State {}
}