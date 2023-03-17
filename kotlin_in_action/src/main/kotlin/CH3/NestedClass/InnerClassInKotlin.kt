package CH3.NestedClass



class Outer {

    inner class Inner {

        // Inner 클래스에서 외부 클래스인 Outer 클래스에 접근하려면 this@외부클래스 형식으로 접근해야한다.
        fun getOuterReference(): Outer = this@Outer
    }
}