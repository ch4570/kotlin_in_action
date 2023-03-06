class CustomModifier {

    fun main(args: Array<String>) {

        val rectangle = Rectangle(41, 43)

        println(rectangle.isSquare)
    }

}

class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean
    // 프로퍼티 Getter 선언
        get() {
            return height == width
        }

    // 한 줄로 표현 가능하다
    val isSquareTwo: Boolean = height == width
}