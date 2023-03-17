package CH3.NestedClass

import java.io.Serializable


// java.io.Serializable 인터페이스를 구현한 State 인터페이스를 정의
interface State: Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state: State) {}
}



