package SmartCast

class RefactorFunEval {

}

fun refactorEval(e: Expr) : Int =

    // 연쇄 if문을 if ~ else if ~ else 문을 사용해 개선한 코드
    if(e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun refactorEvalWithWhen(e : Expr) : Int =
    // if ~ else if ~ else를 사용한 함수를 when을 이용해 간단히 분기처리한 코드
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(refactorEval(Sum(Num(1), Num(2))))

}