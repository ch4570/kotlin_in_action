class MaxFunction {

    // Kotlin 함수 정의 양식
    // fun 함수이름(파라미터: 타입, 파라미터: 타입) : 반환타입 {
    //  return if(a > b) a else b;
    //  }
    fun max(a: Int, b: Int) : Int {
        return if(a > b) a else b
    }

    // max 함수를 return 문을 제거하고 간결하게 줄일 수 있다.
    fun max2(a: Int, b: Int) : Int = if (a > b) a else b

}