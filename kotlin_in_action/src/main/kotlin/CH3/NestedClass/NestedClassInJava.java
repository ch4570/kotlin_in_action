package CH3.NestedClass;

// Java에서의 중첩클래스 사용예제
public class NestedClassInJava implements View {


    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {}

    public class ButtonState implements State {}
}
