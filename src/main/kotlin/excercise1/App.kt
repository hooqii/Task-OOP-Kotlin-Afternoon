package excercise1

/**
Latihan 1 ✅
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Defri"
    val lastName: String = "Salwan"
    val age: Number = 19
    val single: Boolean = true
    println("""
        My name is ${firstName+' '+lastName}, Im $age years old
        My single status : $single
    """.trimIndent())
}

/**
 *  Latihan 2 ✅
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val detail = "Group Id = $groupId, groupMember = $groupMember, Session = $session"
    return detail
}

/**
 * Latihan 3 ✅
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val geekGenius = listOf("Diah", "Defri", "Ahmad", "Firyal", "Deni")
    return geekGenius
}

/**
 * Latihan 4 ✅
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kevin","Sania")
    val countOfGroup = myTeam().size + mentor.size
    return countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5 ✅
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    println(groupDetail("Geek Genius", myTeam, "Afternoon"))
}