package CH2.Iteration

class FizzbuzzGameWithWhen {


}

fun fizzBuzz(i : Int) = when {

    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun main() {

    // 범위 Range를 변수에 담을 수 있다.
    // ex) 1..100 : 1 부터 100 까지
    val range = 1..100

    // for(변수명 in 범위)로 반복문을 선언할 수 있다.
    for (i in range) {
        print(CH2.Iteration.fizzBuzz(i))
    }

    // 역방향 수열로 for문 사용도 가능하다.
    for(i in 100 downTo 1 step 2) {
        print(CH2.Iteration.fizzBuzz(i))
    }
}