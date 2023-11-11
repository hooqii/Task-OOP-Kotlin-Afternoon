package excercise4

/**✅
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 */
// Buat di bawah sini
class ValidateException(message: String) : Throwable(message)

fun validateUserName(userName: String) {
    if (userName.isBlank()) {
        throw ValidateException("Username Is Blank")
    } else {
        println("Hello $userName")
    }
}

fun main() {
    try {
        validateUserName("Defri")
        validateUserName("")
    } catch (error: ValidateException) {
        println("Error with message ${error.message}")
    }
}

