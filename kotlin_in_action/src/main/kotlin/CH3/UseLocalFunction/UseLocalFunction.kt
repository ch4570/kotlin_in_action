package UseLocalFunction

fun saveUserRefactor(user: User) {

    fun validate(user: User,
                 value: String,
                    filedName: String) {

        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $filedName"
            )
        }

    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // user를 데이터베이스에 저장한다.
}

fun saveUserFinalVersion(user: User) {

    // saveUser 함수의 user 파라미터를 중복 사용하지 않아도, 바깥 함수의 파라미터에 직접 접근이 가능하다.
    fun validateRefactor(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName"
            )
        }
    }

    validateRefactor(user.name, "Name")
    validateRefactor(user.address, "Address")
}