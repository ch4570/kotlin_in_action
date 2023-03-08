package SmartCast

interface LayeredClass {

}

// Expr 인터페이스를 선언
interface Expr

// class 클래스 이름(프로퍼티 들 정의) : 구현한 인터페이스 이름으로 인터페이스 구현이 가능하다.
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// if 연쇄를 이용해 식을 계산
fun eval(e: Expr) : Int {

    if (e is Num) {
        // e를 Num으로 타입변환 한다. 이는 불필요한 중복이다.
        val n = e as Num
        return n.value
    }

    if(e is Sum) {
        // 변수 e에대해 스마트 캐스트를 사용한다.
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}