package CH3.SealedClass


// 기반 클래스를 봉인된 클래스(Sealed Class)로 정의한다.
sealed class Expr {

    // 기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =

    // When 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
    when(e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }
