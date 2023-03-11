import java.util.Random

class ImportPackage {

}


class Triangle(val height: Int, val width: Int) {

    val isSquare: Boolean
        get() = height == width

    // toString Overriding
    @Override
    override fun toString(): String = "width = $width height = $height"
}

fun createRandomTriangle() : Triangle {

    // java.util.Random 사용
    val random = Random()

    return Triangle(random.nextInt(), random.nextInt())

}

fun main(args: Array<String>) {

    println(createRandomTriangle().toString())

}