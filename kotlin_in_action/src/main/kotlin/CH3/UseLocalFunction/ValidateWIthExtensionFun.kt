package UseLocalFunction


// validateBeforeSave 함수를 User 객체의 확장 함수로 정의한다.
fun User.validateBeforeSave() {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName"
            )
        }
    }

    validate(name, "Name")
    validate(address, "Address")

}

fun saveUserExtension(user: User) {

    //  확장 함수를 호출한다.
    user.validateBeforeSave()
}