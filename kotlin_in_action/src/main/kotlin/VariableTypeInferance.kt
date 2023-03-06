abstract class VariableTypeInferance {

    // Kotlin은 타입 추론을 지원하기 때문에, 타입을 표기하지 않아도 된다.

    val question = "삶, 우주 그리고 모든 것에 대한 궁극적인 질문"

    val answer = 42

    // 원한다면 타입을 명시해도 된다.
    val answerTwo: Int = 42

    // 부동소수점 상수를 사용한다면 변수 타입은 Double이 된다.
    val yearsToCompute = 7.52e6



}