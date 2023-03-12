package StringExtensionFunction

fun parsePath(path: String) {

    // 문자열의 마지막 슬래시 전까지 파싱
    val directory = path.substringBeforeLast("/")

    // 문자열의 마지막 슬래시 이후의 내용을 파싱
    val fullName = path.substringAfterLast("/")

    // 문자열의 마지막 .(dot) 전까지 파싱
    val fileName = fullName.substringBeforeLast(".")

    // 문자열의 마지막 .(dot) 이후의 내용을 파싱
    val extension= fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, extension: $extension")
}

fun parsePathWithRegex(path: String) {

    // 정규식을 사용한 경로 문자열 파싱 함수
    val regex = """(.+)/(.+)\.(.+)""".toRegex()

    val matchResult = regex.matchEntire(path)

    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured

        println("Dir: $directory, name: $filename, extension: $extension")
    }
}

fun main() {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    parsePathWithRegex("/Users/yole/kotlin-book/chapter.adoc")
}