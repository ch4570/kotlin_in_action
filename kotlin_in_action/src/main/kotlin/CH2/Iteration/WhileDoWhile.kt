package CH2.Iteration

class WhileDoWhile {

}

fun whileTest() {

    // 무한 반복문을 멈출 조건을 체크할 flag 변수
    var isStop = false

    var count = 1

    while(!isStop) {

        println("count = $count")

        count++

        if(count == 5) isStop = true
    }

    println("End WhileTest")
}

fun doWhileTest() {

    // 무한 반복문을 멈출 조건을 체크할 flag 변수
    var isStop = false

    var count = 1

    do {
        println("count = $count")
        count++

        if(count == 2) isStop = true

    } while(!isStop)

    println("End Do-While Test")
}

fun main() {

    whileTest()

    doWhileTest()
}